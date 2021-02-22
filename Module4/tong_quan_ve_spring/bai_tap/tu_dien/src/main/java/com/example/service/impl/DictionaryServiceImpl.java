package com.example.service.impl;

import com.example.service.DictionaryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Override
    public String search(String text) {
        Map<String, String> map = new HashMap<>();
        map.put("hello", "xin chao");
        map.put("bye", "buyen");
        String result = "";
        for (String key : map.keySet()) {
            if (text.equals(key)) {
                result = map.get(key);
                break;
            } else {
                result="Khong co";
            }
        }
        return result;
    }
}
