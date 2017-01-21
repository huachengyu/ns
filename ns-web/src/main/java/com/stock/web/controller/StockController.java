package com.stock.web.controller;

import com.alibaba.fastjson.JSON;
import com.stock.biz.service.BasicsDataService;
import com.stock.core.dal.StockDataByMonthDO;
import com.stock.core.mapper.StockDataByMonthMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

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
    @Autowired
    private StockDataByMonthMapper stockDataByMonthMapper;

    @RequestMapping("/query")
    public String query() throws Exception {
        return JSON.toJSONString(basicsDataService.findAll());
    }

    @RequestMapping("/insert")
    public String insert() throws Exception {
        StockDataByMonthDO stockDataByMonthDO = new StockDataByMonthDO();
        stockDataByMonthDO.setCode("123456");
        stockDataByMonthDO.setOpen(new BigDecimal(1.1));
        stockDataByMonthDO.setHigh(new BigDecimal(2.2));
        stockDataByMonthDO.setClose(new BigDecimal(3.3));
        stockDataByMonthDO.setLow(new BigDecimal(4.4));
        stockDataByMonthDO.setVolume(new BigDecimal(5.5));
        stockDataByMonthDO.setPriceChange(new BigDecimal(6.6));
        stockDataByMonthDO.setPChange(new BigDecimal(7.7));
        stockDataByMonthDO.setTurnover(new BigDecimal(8.8));
        stockDataByMonthDO.setStockDate("2017-01-21 00:00:00");
        stockDataByMonthDO.setYestodEndPri(new BigDecimal(9.9));
        stockDataByMonthDO.setNowPri(new BigDecimal(10.10));
        stockDataByMonthDO.setTraAmount(new BigDecimal(11.11));
        stockDataByMonthDO.setSellOne(new BigDecimal(12.12));
        stockDataByMonthDO.setSellOnePri(new BigDecimal(13.13));
        stockDataByMonthDO.setBuyOne(new BigDecimal(14.14));
        stockDataByMonthDO.setBuyOnePri(new BigDecimal(15.15));
        stockDataByMonthMapper.insert(stockDataByMonthDO);
        return JSON.toJSONString(true);
    }
}
