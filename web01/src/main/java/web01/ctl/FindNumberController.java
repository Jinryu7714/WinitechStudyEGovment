package web01.ctl;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FindNumberController {
	
	private int com_num = 0;
	
	@RequestMapping(value = "/find_number.do", method = RequestMethod.GET)
	public String findNumber()throws Exception{
		if( com_num == 0 ){
			com_num = new java.util.Random().nextInt(100)+1;
		}
		return "/WEB-INF/jsp/find_number.jsp";
	}
	@RequestMapping(value = "/find_number.do", method = RequestMethod.POST)
	public String findNumberPOST(@RequestParam(value="num", required=false, defaultValue="0") int num, Map<String, String> m)throws Exception{
		if(num == 0){
			m.put("msg", "숫자를 입력해주세요.");
		}
		if( com_num == num ){
			m.put("msg", "정답입니다. <br> 새로운 숫자를 정했습니다.");
			com_num = new java.util.Random().nextInt(100)+1;
		}else if(com_num < num){
			m.put("msg", num + " 보다 작습니다.");
		}else{
			m.put("msg", num + " 보다 큽니다.");
			
		}
		
		return "/WEB-INF/jsp/find_number.jsp";
	}
	
	

}
