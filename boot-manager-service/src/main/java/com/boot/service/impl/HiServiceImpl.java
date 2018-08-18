package com.boot.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.service.HiService;

@RestController
public class HiServiceImpl implements HiService {

    @RequestMapping(value="/hi",method=RequestMethod.POST)
    public String hi(@RequestParam(value = "name", defaultValue = "yxd") String name) {
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

    @RequestMapping("/map")
    public Map<Object, Object> map() {
        Map<Object,Object> map = new HashMap<>();
        map.put("username", "yxd970311");
        map.put("password","123123");
        map.put("age", 22);
        map.put("sex", 0);
        return map;
    }

}
