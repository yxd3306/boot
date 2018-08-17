package com.boot.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.consumer.service.HiService;

@RestController
public class HiController {

	@Autowired
	private HiService hiService;
	
	@GetMapping("/hi")
	public String hi(@RequestParam String name) {
		return hiService.hiService(name);
	}
	@GetMapping("/list")
	public List<String> list() {
		return hiService.list();
	}
}
