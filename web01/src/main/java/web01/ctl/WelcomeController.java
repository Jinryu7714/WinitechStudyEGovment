package web01.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("welcome.do")
	public ModelAndView welcome()throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/jsp/welcome.jsp");
		mav.addObject("msg", "WELCOME!!!!");
		return mav;
	}
	
	
	

}
