package com.learn.jdbc;

import javafx.scene.chart.ScatterChart;

import java.sql.*;


/**
 * Statment 执行sql对象
 * execute(String sql) 方法 执行任意sql，返回boolean类型（了解，用不到）
 * executeQuery(String sql) 方法 执行 DQL 语句 即 select 返回 ResultSet 对象
 * executeUpdate(String sql) 方法 执行 DML（insert, update, delete） DDL（create,alter,drop） 语句，返回影响的行数。
 */


public class mysqlDemoOne {
    public static void main(String[] args) {
        Statement statement = null;
        Connection connection = null;
        try {
            //        Class.forName("com.mysql.cj.jdbc.Driver"); // mysql 8.0 配置
            connection = DriverManager.getConnection("jdbc:mysql:///test1?" +
                    "useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false", "root", "123456");
            statement = connection.createStatement();

            // 查询
            String sql = "select * from tables1";
            ResultSet result = statement.executeQuery(sql);
            // 游标默认在 字段名栏，所以要把游标下移一行 result.next()
            while (result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("name"));
            }


            // 增删改
//            String sql = "update tables1 set name='wow' where id = 1";
//            String sql = "insert into tables1 values(default, 'wanwu')";
//            Integer result = statement.executeUpdate(sql);
//            System.out.println(result);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }

    }


}
