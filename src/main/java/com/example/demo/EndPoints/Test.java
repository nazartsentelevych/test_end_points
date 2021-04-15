package com.example.demo.EndPoints;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Test {

    @PostMapping("/test")
    public Map<String, String> test(@RequestBody String body){
        System.out.println(body);
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("foo", "bar");
        map.put("aa", "bb");
        return map;
    }

    @GetMapping(path = "/test")
    public Map<String, Object> sayHello()
    {
        return new JSONObject(
                "{'aa':{'s':1}}}"
        ).toMap();
    }
}
