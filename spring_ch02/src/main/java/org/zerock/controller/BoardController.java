package org.zerock.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.PageMaker;
import org.zerock.domain.SearchCriteria;
import org.zerock.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService service;
	
	//입력
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(BoardVO board, Model model) throws Exception {
		logger.info("register get");
	}
	
	//글쓰기
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPOST(BoardVO board, RedirectAttributes rttr) throws Exception {
		logger.info("register post");
		logger.info(board.toString());
		
		service.regist(board);
		
		//addFlashAttribute 는 브라우저까지 전송되긴 하지만, uri상에는 보이지 않는 숨겨진 데이터 형태로 전달
		rttr.addFlashAttribute("msg","success"); //
		
	//	RedirectAttributes 로 데이터를 전송, redirect는 새로고침할대 중복작성을 방지하기 위한것.- 한번만 사용되는 데이터를 전송
		return "redirect:/board/listAll";
	}
	
	//리스트목록
	@RequestMapping(value = "/listAll", method=RequestMethod.GET)
	public void listAll(Model model) throws Exception{
		logger.info("show all list");
		
		model.addAttribute("list", service.listAll());
	}
	
	//조회
	@RequestMapping(value="/read", method=RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, Model model) throws Exception{
		model.addAttribute(service.read(bno));
	}
	
	//삭제
	@RequestMapping(value="/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception{
		service.remove(bno);
		
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/board/listAll";
	}
	
	//수정
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public void modifyGET(int bno, Model model) throws Exception {
		model.addAttribute(service.read(bno));
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modifyPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		service.modify(board);
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/board/listAll";
	}
	
	//페이징처리
	@RequestMapping(value="/listCri", method = RequestMethod.GET)
	public void listAll(Criteria cri, Model model) throws Exception{
		logger.info("show page with criteria");
		
		model.addAttribute("list", service.listCriteria(cri));
	}
	
	@RequestMapping(value="/listPage", method = RequestMethod.GET)
	public void listPage(@ModelAttribute("cri") Criteria cri, Model model) throws Exception{
		model.addAttribute("list", service.listCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		//pageMaker.setTotalCount(18);
		
		pageMaker.setTotalCount(service.listCountCriteria(cri)); //전체페이지를 출력
		
		model.addAttribute("pageMaker", pageMaker);
	}
	
	//정보수정후 뒤로가기 페이지 처리
	@RequestMapping(value="/readPage", method=RequestMethod.GET)
	public void read(@RequestParam("bno") int bno,@ModelAttribute("cri") Criteria cri, Model model) throws Exception{
		model.addAttribute(service.read(bno));
	}
	
	//삭제처리
	@RequestMapping(value="/removePage", method=RequestMethod.POST)
	public String remove(@RequestParam("bno") int bno, Criteria cri, RedirectAttributes rttr) throws Exception{
		service.remove(bno);
		
		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum", cri.getPerPageNum());
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/board/listPage";
	}
	
	//수정처리
	@RequestMapping(value="/modifyPage", method=RequestMethod.GET)
	public void modifyPagingGET(@RequestParam("bno") int bno, @ModelAttribute("cri") Criteria cri, Model model) throws Exception{
		model.addAttribute(service.read(bno));
	}
	
	@RequestMapping(value="/modifyPage", method=RequestMethod.POST)
	public String modifyPagingPOST(BoardVO board, Criteria cri, RedirectAttributes rttr) throws Exception{
		service.modify(board);
		
		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum",cri.getPerPageNum());
		rttr.addFlashAttribute("msg","SUCCESS");
		
		return "redirect:/board/listPage";
	}
	

	

}
