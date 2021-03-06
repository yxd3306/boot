package com.boot.consumer.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@SuppressWarnings("unchecked")
public class HiService {

    @Autowired
    private RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.postForObject("http://BOOT-MANAGER-SERVICE/hi?name=", name, String.class);
    }

    public List<String> list() {
        return restTemplate.getForObject("http://BOOT-MANAGER-SERVICE/list", List.class);
    }
    
    
    public Map<Object,Object> map(){
        return restTemplate.getForObject("http://BOOT-MANAGER-SERVICE/map",Map.class);
    }
    public Integer getInt(){
        return restTemplate.getForObject("http://BOOT-MANAGER-SERVICE/map",Integer.class);
    }
    public String test(){
        return restTemplate.getForObject("http://BOOT-MANAGER-SERVICE/test",String.class);
    }
}
