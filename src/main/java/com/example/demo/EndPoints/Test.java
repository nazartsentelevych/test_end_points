package com.example.demo.EndPoints;

import com.example.demo.pojo.Rec;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path = "/id/{id}")
    public Rec sayHello(@PathVariable Integer id)
    {
        Rec result;
        switch (id) {
            case 1:
                result = new Rec(1, "cat", "/stile_cat.css");
                break;
            case 2:
                result = new Rec(2, "dog", "/stile_dog.css");
                break;
            default:
                result = new Rec(3, "mouse", "/stile_mouse.css");
                break;
        }
        return result;
    }
}
