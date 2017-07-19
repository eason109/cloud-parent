package com.eason.course.consumer.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Eason on 7/19/2017.
 */
@Component
public class ComputeClientHystrix implements  ComputeClient{
    @Override
    public Integer add(@RequestParam(value = "a") Integer a,@RequestParam("b") Integer b) {
        return -9999;
    }
}
