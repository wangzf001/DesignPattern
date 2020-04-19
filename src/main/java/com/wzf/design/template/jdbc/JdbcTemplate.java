package com.wzf.design.template.jdbc;

import com.wzf.design.strategy.promotion.PromotionActivity;

import javax.sql.DataSource;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HERO
 * @Date: 2020/4/12 15:14
 * @Version 1.0
 */
public class JdbcTemplate {

    private DataSource dataSource;


    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) {
        List list = null;
        try {
            Connection connection = this.getConnection();
            PreparedStatement pstm = this.createPreparedStatement(connection,sql);
            ResultSet rs = this.executeQuery(pstm,values);

            list = this.paresResultSet(rs,rowMapper);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Connection getConnection() {
        try {
            return this.dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    protected PreparedStatement createPreparedStatement(Connection conn, String sql) {
        try {
            return conn.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    protected ResultSet executeQuery(PreparedStatement pstm, Object[] values) throws SQLException {
        if(values != null){
            for (int i = 0; i < values.length; i++) {
                pstm.setObject(i, values[i]);
            }
        }
        return pstm.executeQuery();
    }

    protected List<?> paresResultSet(ResultSet rs,RowMapper rowMapper) throws Exception {
        List<Object> list = new ArrayList<>();
        int rowNum = 1;
        while (rs.next()) {
            list.add(rowMapper.mapRow(rs,rowNum ++));
        }
        return list;


    }

}
