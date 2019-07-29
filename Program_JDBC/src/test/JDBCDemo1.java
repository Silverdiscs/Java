import org.junit.Test;

import java.sql.*;

/**
 * @Author: CX
 * @Date: 2019/7/29 上午 9:38
 * @Version 1.0
 * @Project: 与数据库jdbc连接，获取数据库的内容
 */

public class JDBCDemo1 {
    @Test
    // 查询 select
    public void test() {
        try {
            // 1. 加载驱动  Driver类
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取连接  Connection
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/jdbc",
                            "root","1118");
            // 3. 执行SQL
            String sql = "select * from user";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            // 遍历结果集合
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getNString("username");
                String password = resultSet.getNString("password");
                System.out.println("id为" + id + ",用户名为：" + username+
                        ",密码为：" + password);
            }
            // 4. 释放资源
            connection.close();
            statement.close();
            resultSet.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    // 插入数据 insert
    public void test1() {
        try {
            // 1. 加载驱动  Driver类
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取连接  Connection
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/jdbc",
                            "root","1118");
            // 3. 执行SQL
            String sql = "insert into user(username,password)" +
                    "values ('dov',456)";
            Statement statement = connection.createStatement();
            int resultRows = statement.executeUpdate(sql,
                    Statement.RETURN_GENERATED_KEYS);
            System.out.println(resultRows);
            // 4. 释放资源
            connection.close();
            statement.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    // 删除数据 delete
    public void test2() {
        try {
            // 1. 加载驱动  Driver类
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取连接  Connection
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/jdbc",
                            "root","1118");
            // 3. 执行SQL
            String sql = "delete from user where id = 1";
            Statement statement = connection.createStatement();
            int resultRows = statement.executeUpdate(sql,
                    Statement.RETURN_GENERATED_KEYS);
            System.out.println(resultRows);
            // 4. 释放资源
            connection.close();
            statement.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    // 查询某项数据 select
    public void test3() {
        try {
            // 1. 加载驱动  Driver类
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取连接  Connection
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/jdbc",
                            "root","1118");
            // 3. 执行SQL
            String sql = "select * from user where username = 'dov' " +
                    "and password = '456' ";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            // 遍历结果集合
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getNString("username");
                String password = resultSet.getNString("password");
                System.out.println("id为" + id + ",用户名为：" + username+
                        ",密码为：" + password);
            }
            // 4. 释放资源
            connection.close();
            statement.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Test
    // 模拟登录
    public void test4() {
        try {
            // 1. 加载驱动  Driver类
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取连接  Connection
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/jdbc",
                            "root","1118");
            // 3. 执行SQL
            String username = "dov";
            String password = "456";
            String sql = "select * from user where username =  '" + username + "'"
                    + "and password = '" + password + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            // 遍历结果集合
            if (resultSet.next()) {
                System.out.println("登陆成功！");
            }else {
                System.out.println("登录失败！");
            }
            // 4. 释放资源
            connection.close();
            statement.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    // 模拟登录
    public void test5() {
        try {
            // 1. 加载驱动  Driver类
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取连接  Connection
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/jdbc",
                            "root","1118");
            // 3. 执行SQL
            String sql = "select * from user" + " where username = ? and password = ?";
            // 预编译SQL
            PreparedStatement statement =
                    connection.prepareStatement(sql);
            String username = "ls or 1=1";
            String password = "okokokok";
            statement.setString(1,username);
            statement.setString(2,password);
            ResultSet resultSet = statement.executeQuery();
            // 遍历结果集合
            if (resultSet.next()) {
                System.out.println("登陆成功！");
            }else {
                System.out.println("登录失败！");
            }
            // 4. 释放资源
            connection.close();
            statement.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
