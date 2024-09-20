package com.jooplayconsole.powtv.web;

import com.jooplayconsole.powtv.model.entity.PostDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ReactRestController {

    @PostMapping(value="/testData")
    public Map<Integer, String> testData(@RequestBody List<String> params){
        Map<Integer, String> data = new HashMap<>();
        data.put(1,"사과");
        data.put(2,"포도");
        data.put(3,"바나나");

        int i = 4;
        for(String param : params){
            data.put(i, param);
            i++;
        }

        return data;
    }

    @GetMapping("/api/posts")
    public List<PostDto> getPosts() {
        List<PostDto> posts = new ArrayList<>();
        posts.add(new PostDto("Recommended: ITZY YUNA Performance", "Watch the latest performance from ITZY YUNA.", "XxXxXxXxXx", 347, 23, 6));
        posts.add(new PostDto("Recommended: Christmas in New York", "Explore the Christmas spirit in NYC.", "YyYyYyYyYy", 441, 34, 14));
        posts.add(new PostDto("Top 5 Fashion Trends", "See the latest fashion trends this year.", "ZzZzZzZzZz", 123, 45, 12));

        return posts;
    }

}
