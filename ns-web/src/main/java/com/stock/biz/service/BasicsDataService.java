package com.stock.biz.service;

import com.stock.core.dal.BasicsDataDO;
import com.stock.core.mapper.BasicsDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: huacy
 * Date: 2017/1/16
 * Time: 22:48
 */
@Service
public class BasicsDataService {
    @Autowired
    private BasicsDataMapper basicsDataMapper;

    public List<BasicsDataDO> findAll() throws SQLException {
        return basicsDataMapper.findAll();
    }
}
