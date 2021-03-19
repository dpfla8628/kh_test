package com.example.demo.controller;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.JSPBoard;

@Controller
@RequestMapping("/boards")
public class BoardController {
	private final static Logger log = LoggerFactory.getLogger(BoardController.class);

	//Controller에서 Json형식으로 보낼 때? ResponseEntity 사용
	// PathVariable은 가변적인 데이터를 다루기 위해 사용한다고 보면 되겠다.
	@GetMapping(value="/{boardNo}")
	public ResponseEntity<JSPBoard>read(@PathVariable("boardNo") int boardNo){
		log.info("read()");
		JSPBoard board = new JSPBoard();
		
		board.setBoardNo(boardNo);
		board.setTitle("제목");
		board.setContent("내용");
		board.setWriter("작성자");
		board.setRegDate(LocalDateTime.now());
		
		ResponseEntity<JSPBoard> entity =
				new ResponseEntity<JSPBoard>(board,HttpStatus.OK);
		
		return entity;
	}
	
	@GetMapping(value="/{boardNo}", produces = "application/json")
	public ResponseEntity<JSPBoard>read2Json(@PathVariable("boardNo") int boardNo){
		log.info("read2Json()");
		JSPBoard board = new JSPBoard();
		
		board.setBoardNo(boardNo);
		board.setTitle("제목");
		board.setContent("내용");
		board.setWriter("작성자");
		board.setRegDate(LocalDateTime.now());
		
		ResponseEntity<JSPBoard> entity =
				new ResponseEntity<JSPBoard>(board,HttpStatus.OK);
		
		return entity;
	}
	
	@GetMapping(value = "/{boardNo}", produces = "application/xml")
	public ResponseEntity<JSPBoard> read2Xml(@PathVariable("boardNo") int boardNo) {
		log.info("read2Xml()");
		
		JSPBoard board = new JSPBoard();
		
		board.setTitle("제목");
		board.setContent("내용");
		board.setWriter("작성자");
		board.setRegDate(LocalDateTime.now());
		
		ResponseEntity<JSPBoard> entity = 
				new ResponseEntity<JSPBoard>(board, HttpStatus.OK);
		
		return entity;
	}
}
