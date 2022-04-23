package ca.bcit.comp2522.termproject.spiritbear;

import java.sql.*;
import java.util.Properties;

public class Login {

    public Login() {

    }

    public static boolean login(String userId, String password) throws SQLException, ClassNotFoundException {

        PreparedStatement pstmt;
        ResultSet rs;

        // Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Identify the driver, the rdbms, the host, the port, and the schema name
        final String URL = "jdbc:mysql://localhost:3306/comp2522";

        final Properties connectionProperties = new Properties();
        connectionProperties.put("user", "comp2522");
        connectionProperties.put("password", "I was born in 1973");

        final Connection connection = DriverManager.getConnection(URL, connectionProperties);

        if (connection != null) {
            System.out.println("Successfully connected to MySQL database test");
        }

        Statement stmt = connection.createStatement();

        String SQL = "select password from users where user_id = ?";
        pstmt = connection.prepareStatement(SQL);
        pstmt.setString(1, userId);
        rs = pstmt.executeQuery();

        if (rs.next()) {
            if (rs.getString(1).equals(password)) {
                return true;
            }
            else {
                return false;
            }
        }

        return false;
    }
}
