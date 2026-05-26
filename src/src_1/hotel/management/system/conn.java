package src_1.hotel.management.system;

import java.sql.*;

public class conn {

    Connection c;

    public conn() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hotelmanagement",
                    "root",
                    "chotadon"  
            );

            System.out.println("Database Connected");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}