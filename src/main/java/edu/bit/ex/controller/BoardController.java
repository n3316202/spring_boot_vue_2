package edu.bit.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.bit.ex.service.BoardService;
import edu.bit.ex.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

//@CrossOrigin(origins = "http://localhost:8081")
@Slf4j
@Controller
@AllArgsConstructor
@NoArgsConstructor
public class BoardController {

	@Autowired
	private BoardService boardService;

	@GetMapping("/list")
	public String list(Model model) {
		log.info("list");
		model.addAttribute("lists", boardService.getList());
		return "list";
	}
	
	@ResponseBody
	@GetMapping("/axios/list")
	public List<BoardVO> axios_list(Model model) {
		log.info("list");
		
		model.addAttribute("lists", boardService.getList());
		
		return boardService.getList();
	}


}
