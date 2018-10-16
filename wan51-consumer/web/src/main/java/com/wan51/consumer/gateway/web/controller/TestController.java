package com.wan51.consumer.gateway.web.controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jim
 * @date 2018/1/12
 */
@RestController
@RequestMapping(value = "/index", method = RequestMethod.POST, consumes = "application/json;charset=UTF-8")
public class TestController {

    @RequestMapping(path = "/test")
    public Object cardCount(@RequestBody String test) {
        return "Hello JWS 1.0";
    }

}
