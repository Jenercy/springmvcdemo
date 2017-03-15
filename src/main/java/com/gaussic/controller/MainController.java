package com.gaussic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by huangtao001 on 2017/3/15.
 */
@Controller
public class MainController{

@RequestMapping(value = "/", method =  RequestMethod.GET)
public  String index() {
    return "index";
}

}
