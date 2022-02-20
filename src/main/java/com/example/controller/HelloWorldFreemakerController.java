package com.example.controller;

import com.example.service.LotteryTicketService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("hello")
@RestController
@RequestMapping("/freemarker")
public class HelloWorldFreemakerController {
    @Autowired
    LotteryTicketService lotteryTicketService;
    /**
     * 设置数据，返回到freemarker视图
     * @return
     */
    @RequestMapping("/say")
    @ApiOperation(value="逗你玩", notes="逗你玩")
    public void say(){

        System.err.println(111);
    }
    @RequestMapping("/ssq")
    @ApiOperation(value="ssq", notes="ssq")
    public void ssq(){

        lotteryTicketService.shuangseqiu();
    }
}
