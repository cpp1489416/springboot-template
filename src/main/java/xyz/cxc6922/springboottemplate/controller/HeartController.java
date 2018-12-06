package xyz.cxc6922.springboottemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.cxc6922.springboottemplate.model.dto.LombokDto;
import xyz.cxc6922.springboottemplate.model.dto.RestApiResult;
import xyz.cxc6922.springboottemplate.controller.ScalaController;
import xyz.cxc6922.springboottemplate.model.dto.ScalaPo;

import javax.naming.event.ObjectChangeListener;

@Controller
public class HeartController {
    @Autowired
    private ScalaController scalaController;

    @RequestMapping("heart")
    @ResponseBody
    public Object heart() {
        return new RestApiResult(new Object() {
            public String message = "OK";
        });
    }

    @RequestMapping("fromScala")
    @ResponseBody
    public Object fromScala() {
        return scalaController.testScala();
    }

    @RequestMapping("scalaPo")
    @ResponseBody
    public Object scalaPo() {
        return new ScalaPo();
    }

    @RequestMapping("javaLombok")
    @ResponseBody
    public Object javaLombok() {
        LombokDto dto = new LombokDto();
        dto.setStr("hello changed");
        return dto;
    }
}
