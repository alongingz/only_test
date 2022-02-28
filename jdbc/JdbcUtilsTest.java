package com.learn.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * 测试 JdbcUtils 工具类
 */

public class JdbcUtilsTest {
    public static void main(String[] args) {
//        getQuery();
        getUpdate();
    }

    public static void getQuery() {
        Statement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;

        try {
            connection = JdbcUtils.getConnection();
            statement = connection.createStatement();

            // 查询
            String sql = "select * from tables1";
            resultSet = statement.executeQuery(sql);
            // 游标默认在 字段名栏，所以要把游标下移一行 result.next()
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.close(resultSet, statement, connection);
        }
    }



    public static void getUpdate() {
        Statement statement = null;
        Connection connection = null;
        Integer result = null;

        try {
            connection = JdbcUtils.getConnection();
            statement = connection.createStatement();

            // 增删改
             String sql = "update tables1 set name='nanbo1' where id = 4";
//            String sql = "insert into tables1 values(default, 'nanbo')";
            result = statement.executeUpdate(sql);
            System.out.println(result);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.close(statement, connection);
        }
    }
}
