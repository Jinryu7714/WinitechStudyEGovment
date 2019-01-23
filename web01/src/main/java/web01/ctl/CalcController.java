package web01.ctl;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {
	
	
	@RequestMapping(value = "/calc.do", method= RequestMethod.GET)
	public String calc()throws Exception{
		String url = "/WEB-INF/jsp/calc_form.jsp";
		return url;
	}
	@RequestMapping(value = "/calc.do", method= RequestMethod.POST)
	public String calc_action(@RequestParam("n1") int num1,@RequestParam("n2") int num2,@RequestParam("opr")String opr,Map<String, Object> m)throws Exception{
		if(opr.equals("+")){
			m.put("result" , num1+num2);
		}else if(opr.equals("-")){
			m.put("result" , num1-num2);			
		}else if(opr.equals("*")){
			m.put("result" , num1*num2);
		}else if(opr.equals("/")){
			m.put("result" , 1.0*num1/num2);
		}else{
		}
		
		String url = "/WEB-INF/jsp/calc_action.jsp";
		return url;
	}

}
