package com.learn.jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * JdbcUtils 工具类
 */

public class JdbcUtils {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;


    // 读取配置文件，静态代码块，在全部方法之前只调用一次。
    static {
        try {
            Properties properties = new Properties();

            // 获取 src 路径下文件方式 ClassLoader 类加载器
            ClassLoader classLoader = JdbcUtils.class.getClassLoader();
            URL resource = classLoader.getResource("jdbc.properties");
            String resourcePath = resource.getPath();
            properties.load(new FileReader(resourcePath));  // 读取配置文件

            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            driver = properties.getProperty("driver");
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 获取连接
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }


    // 释放连接 资源  --- 增删改时使用
    public static void close(Statement statement, Connection connection) {
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

    // 释放连接 资源 --- 查询时使用
    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

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
