package com.example.shoppingcart;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {
    public Connection databaseLink;

    public Connection getDatabaseLink() {
        String databaseName = "shoppingcart_db";
        String databaseUser = "Riean";
        String databasePassword = "x0ucdct3xrpsztOj";

        String url = "jdbc:mysql://jblminiproject-do-user-10209104-0.b.db.ondigitalocean.com/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
            System.out.println("DB Connection done !");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("DB Connection Failures !");
        }

        return databaseLink;
    }
}
