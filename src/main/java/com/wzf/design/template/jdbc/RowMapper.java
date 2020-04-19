package com.wzf.design.template.jdbc;

import java.sql.ResultSet;

/**
 * @Author: HERO
 * @Date: 2020/4/12 15:18
 * @Version 1.0
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs,int rowNum) throws Exception;
}
