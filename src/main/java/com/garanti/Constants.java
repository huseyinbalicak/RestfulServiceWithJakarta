package com.garanti;

import java.sql.Connection;
import java.sql.DriverManager;

public final class Constants
{
    private static final String USER = "BILGE";

    private static final String PASSWORD = "123456";

    private static final String URL = "jdbc:oracle:thin:@localhost:1521";

    public static Connection getConnection() throws Exception
    {
        // gerekebilir
        Class.forName("oracle.jdbc.OracleDriver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}