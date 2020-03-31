package com.wzf.design.other.jdbc;

import java.sql.*;

/**
 * @Author: HERO
 * @Date: 2020/3/29 23:17
 * @Version 1.0
 */
public class Basic {


    public static void main(String[] args) {
        query();
    }

    static void query() {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String sql = "select * from user ";
            //加载注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //连接数据库
            connection = DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");

            preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next()){
                String name = rs.getString("name");
                System.out.println(name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(connection != null) {
                    connection.close();
                }
                if(preparedStatement != null){
                     preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
