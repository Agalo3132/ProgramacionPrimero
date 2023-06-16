package BaseDD;

import java.sql.*;
import java.time.LocalDateTime;

public class MainPersistence {

    public static void signUp(String username, String password) {

    }

    public static void main(String[] args) {
        String user = "root";
        String password = "Berserk";
        String url = "jdbc:mysql://localhost/mydb?user=root&password=Berserk";
        String sql = "INSERT INTO login (username, password, created) " +
                "VALUES ('alvaro', 123, '2023-01-01')";

        String sqlPre = "INSERT INTO login (username, password, created) " +
                "VALUES (?, ?, ?)";

        String sqlSelect = "SELECT * FROM login";
        String insert = "INSERT INTO login (username, password) VALUES (?, ?)";
        ResultSet result;
        LocalDateTime now = LocalDateTime.now();
        String update = "UPDATE login SET created_At= ? WHERE id = ?";


        try (final Connection connection = DriverManager.getConnection(url); //Statement statement = connection.createStatement();
             //PreparedStatement preparedStatement = connection.prepareStatement(sqlPre, Statement.RETURN_GENERATED_KEYS)

             PreparedStatement ps = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
             PreparedStatement pUpdate = connection.prepareStatement(update)) {

            boolean autocommit = connection.getAutoCommit();
            connection.setAutoCommit(false);


            ps.setString(1,"root");
            ps.setString(2,"1234");


            ps.execute();
            result = ps.getGeneratedKeys();
            if (result.next()) {
                int id = result.getInt(1);
                System.out.println(id);

                pUpdate.setTimestamp(1, Timestamp.valueOf(now));
                pUpdate.setInt(2, id);
                pUpdate.execute();
            }



            connection.commit();
            connection.setAutoCommit(autocommit);



            /**
            preparedStatement.setString(1, "admin2222");
            preparedStatement.setString(2, "root");
            preparedStatement.setTimestamp(3, Timestamp.valueOf(now));
            System.out.println(preparedStatement.execute());

            ResultSet rs = preparedStatement.getGeneratedKeys();
            /**
            if (rs.next()) {
                //System.out.println(rs.getInt(1));
                System.out.println(rs.getInt("id"));
            }
             **/
            /**
            ResultSet rs2 = statement.executeQuery(sqlSelect);
            while (rs.next()) {
                System.out.println(rs2.getString(2) + " ");
                System.out.println(rs2.getString(3));
            }

            //statement.execute(sql);
             **/


            //System.out.println(connection.getCatalog());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }



    }
}
