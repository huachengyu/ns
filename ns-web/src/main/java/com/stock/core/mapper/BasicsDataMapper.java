package com.stock.core.mapper;

import com.stock.core.dal.BasicsDataDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: huacy
 * Date: 2017/1/15
 * Time: 21:14
 */
@Mapper
public interface BasicsDataMapper {

    @Select("select * from basics_data")
    public List<BasicsDataDO> findAll();
}
