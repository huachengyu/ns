package com.stock.web.controller;

import com.alibaba.fastjson.JSON;
import com.stock.biz.service.BasicsDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: huacy
 * Date: 2017/1/15
 * Time: 17:13
 */
@RestController
@RequestMapping("/stock")
public class StockController extends BaseController {

    @Autowired
    private BasicsDataService basicsDataService;

    @RequestMapping("/query")
    public String query() throws Exception {
        return JSON.toJSONString(basicsDataService.findAll());
    }
}
