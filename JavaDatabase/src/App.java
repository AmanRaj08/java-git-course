import java.sql.*;
public class App {
    public static void main(String[] args) throws Exception {
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish a connection to the database
        String url = "jdbc:mysql://localhost:3306/javaDb";
        String user = "root";
        String password = "1234";
        Connection connection = DriverManager.getConnection(url, user, password);

        // Create a statement object to execute SQL queries
        Statement statement = connection.createStatement();

        // Execute a simple query
        ResultSet resultSet = statement.executeQuery("SELECT * FROM student");

        // Process the results
        while (resultSet.next()) {
            System.out.println(resultSet.getString("roll")+ " : " + resultSet.getString("name"));
            // Add more columns as needed
        }

        // Close the resources
        resultSet.close();
        statement.close();
        connection.close();
    }
}
