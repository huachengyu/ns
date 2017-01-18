package com.stock.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: huacy
 * Date: 2017/1/8
 * Time: 21:30
 */
@Controller
public class IndexController extends BaseController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/logout")
    public String logout() {
        return "logout";
    }
}
