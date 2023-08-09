package org.nerfilin.java.jdbc;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/portafoliotitulo?serverTimezone=UTC";
        String username = "root";
        String password = "root";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT * FROM libro");

            while (resultado.next()) {
                System.out.println(resultado.getString("titulo"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}