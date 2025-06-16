import java.sql.*;
public class App {
    public static void main(String[] args) throws Exception {
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish a connection to the database
        String url = "jdbc:mysql://localhost:3306/javaDb";
        String user = "root";
        String password = "1234";
        int id=13;
        String name="JohnS";
        Connection connection = DriverManager.getConnection(url, user, password);
        //String query = "insert into student values(11,'JohnD')";
        //String query2 = "insert into student values("+id+",'"+name+"')";
        String query2 = "insert into student values(?,?)";


        // Create a statement object to execute SQL queries
        //Statement statement = connection.createStatement();
        PreparedStatement statement = connection.prepareStatement(query2);
        statement.setInt(1, id);
        statement.setString(2, name);

        //insert a record
        //int count = statement.executeUpdate(query);
        int count = statement.executeUpdate();
        System.out.println(count + " record(s) inserted.");

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
