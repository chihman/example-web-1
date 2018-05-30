package example;

import java.sql.*;
import java.util.ArrayList;

public class DataAccess {
    public ArrayList<String> LoadList() throws SQLException {
        Connection connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres", "postgres");
        Statement state = connect.createStatement();
        ResultSet res = state.executeQuery("select name from example");
        res.next();
        String temp = res.getString("name");
        ArrayList<String> list = new ArrayList<>();
        list.add(temp);
        list.add(res.getString("name"));
        return list;
    }

}
