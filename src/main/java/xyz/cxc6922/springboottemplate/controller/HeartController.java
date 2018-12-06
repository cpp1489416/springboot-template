package xyz.cxc6922.springboottemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.cxc6922.springboottemplate.model.dto.RestApiResult;

@Controller
public class HeartController {

    @RequestMapping("heart")
    @ResponseBody
    public Object heart() {
        return new RestApiResult(new Object() {
            public String message = "OK";
        });
    }
}
