package com.example.AndxEntertainmentProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class webController
{
    @RequestMapping("/index.html")
            public String index()
    {
        return "index"; // launch index.html
    }
}
