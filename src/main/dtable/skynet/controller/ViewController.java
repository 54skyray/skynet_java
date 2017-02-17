package main.dtable.skynet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by skyRay on 2017/1/18.
 */
@Controller
public class ViewController {
    @RequestMapping("/view")
    public String view(){
        System.out.println("你已通过springMVC进入controller方法。。。。");
        return "index";
    }
}
