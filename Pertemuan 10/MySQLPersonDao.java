package person;

import java.sql.*;

/**
 * File : MySQLPersonDAO.java
 * Deskripsi : implementasi PersonDAO untuk MySQL
 * Ester Imelda Br Sihotang - 24060123140127
 */

public class MySQLPersonDao implements PersonDAO {
    public void savePerson(Person p) throws Exception {
        String name = p.getName();

        // membuat koneksi
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "Unchunch_18");

        // kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();
    }
}