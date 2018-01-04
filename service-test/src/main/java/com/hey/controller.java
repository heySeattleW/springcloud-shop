package com.hey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hey on 2018/1/4.
 */
@RestController
@RefreshScope
public class controller {

    @Value("${value}")
    private String value;

    @RequestMapping("/value")
    public String from() {
        return this.value;
    }
}
