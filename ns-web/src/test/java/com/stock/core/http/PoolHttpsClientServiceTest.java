package com.stock.core.http;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * User: huacy
 * Date: 2017/1/18
 * Time: 23:10
 */
public class PoolHttpsClientServiceTest {

    private PoolHttpsClientService poolHttpsClientService = new PoolHttpsClientService();

    @Test
    public void testGetUrlContent() {
        String url = "http://web.juhe.cn:8080/finance/stock/hs";
        Map<String,Object> params = new HashMap<>();
        params.put("key","");//APP Key
        params.put("gid","sz300311");//证券交易代码，如'00001'（可多值输入）
        String result = poolHttpsClientService.getUrlContent(url, params);
        System.out.println(result);
    }
}