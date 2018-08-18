package com.boot.consumer.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.consumer.service.HiService;

@Controller
public class HiController {

    @Autowired
    private HiService hiService;

    @RequestMapping("/hi")
	public String hi(@RequestParam String name,Model model) {
	    String Sname = hiService.hiService(name);
	    model.addAttribute("name", Sname);
	    return "index";
	}

    @GetMapping("/list")
    @ResponseBody
    public List<String> list() {
        return hiService.list();
    }

    @GetMapping("/map")
    public Map<Object, Object> map() {
        return hiService.map();
    }

    @GetMapping("/")
    public String test() {
        return hiService.test();
    }
}
