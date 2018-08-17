package com.boot.consumer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class HiService {

	@Autowired
	private RestTemplate restTemplate;
	
	public String hiService(String name) {
        return restTemplate.getForObject("http://BOOT-MANAGER-SERVICE/hi?name="+name,String.class);
    }
	public List<String> list() {
		return restTemplate.getForObject("http://BOOT-MANAGER-SERVICE/list",List.class);
	}
}
