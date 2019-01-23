package web02.ctl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import web02.dao.BoardDAOImpl;
import web02.vo.BoardVO;


@RequestMapping("/board")
@Controller
public class BoardController {
	
	@Autowired
	private BoardDAOImpl boardDAO;
	
	@RequestMapping("/list.do")
	public String boardlist(Model model)throws Exception{
		List<BoardVO> boardVOs = boardDAO.boardlist();
		model.addAttribute("boardVOs", boardVOs);
		return "/board/list";
	}
	@RequestMapping(value = "/insert.do", method = RequestMethod.GET)
	public String boardinsert()throws Exception{
		
		return "/board/insert_form";
	}
	
	
	
	
	@RequestMapping(value = "/insert.do", method= RequestMethod.POST)
	public String boardinsertPOST(@ModelAttribute("BoardVO") BoardVO vo, Model m)throws Exception{
		
		boardDAO.insert(vo);
		m.addAttribute("vo", vo);
		return "redirect:/board/list.do";
//		return "/board/insert_action";
	}
	@RequestMapping(value = "/boardJoin.do", method=RequestMethod.GET)
	public String boardJoin(@RequestParam("no")Integer no)throws Exception{
		
		boardDAO.boardjoin(no);
		return "/board/insert_form";
	}
}
