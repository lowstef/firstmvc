/**
 * @author lowstef
 * @create 2018/9/3
 * @since 1.0.0
 */
package demo2;


import java.sql.*;

public class Test2 {

public void demo() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");

    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "root");

    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("select * from emp");

    while (resultSet.next()) {
        System.out.println(resultSet.getObject(2)+"\t"+resultSet.getObject(3));
    }
        resultSet.close();
    statement.close();
    connection.close();
}

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Test2 test2 = new Test2();
        test2.demo();
    }
}
