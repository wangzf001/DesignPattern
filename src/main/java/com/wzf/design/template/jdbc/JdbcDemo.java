package com.wzf.design.template.jdbc;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.util.List;

/**
 * @Author: HERO
 * @Date: 2020/4/12 16:08
 * @Version 1.0
 */
public class JdbcDemo {

    public static void main(String[] args) {

        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost/test");
        dataSource.setPassword("root");
        dataSource.setUser("root");

        MemberDao memberDao = new MemberDao(dataSource);
        List result = memberDao.selectAll();
        System.out.println(result);

    }

}
