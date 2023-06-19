package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Forum;
import com.example.demo.service.ForumService;

@Controller
public class ForumController {

	@Autowired
	ForumService service;

	// トップページ(フォームがある画面)
	@GetMapping("/")
	public String top(Model model) {
		model.addAttribute("forum", new Forum());
		return "top";
	}

	// データベースへの登録
	@PostMapping("/create")
	public String saveForum(@ModelAttribute Forum forum, Model model) {
		service.insert(forum);
		return "result";
	}

}
