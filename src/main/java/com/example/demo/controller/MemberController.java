package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.MemberDAO;
import com.example.demo.vo.MemberVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MemberController {
	
	@Autowired
	private final MemberDAO dao;
	
	@GetMapping("/listMember")
	public String listMember(Model model ) {
		List<MemberVO> list = dao.listMember();
		model.addAttribute("list",list);
		return "listMember";
	}
	

}
