package com.boot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.service.HiService;

@RestController
public class HiServiceImpl implements HiService {

	@RequestMapping("/hi")
	public String hi(@RequestParam(value = "name",defaultValue="yxd")String name) {
		return name;
	}

	@RequestMapping("/list")
	public List<String> list() {
		List<String> list = new ArrayList<>();
		list.add("yxd");
		list.add("21");
		list.add("男");
		return list;
	}
	

}
