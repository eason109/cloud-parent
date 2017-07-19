package com.eason.course.cloud.consume.web;

import com.eason.course.cloud.consume.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Eason on 7/18/2017.
 */
@RestController
public class ConsumerController {

    @Autowired
    ComputeService computeService;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        return computeService.addService();
    }
}
