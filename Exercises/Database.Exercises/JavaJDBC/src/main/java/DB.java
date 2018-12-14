import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB {

    final String JDBC_DRIVER = "org.h2.Driver";
    final String URL = "jdbc:h2:C:\\Java\\JavaDB\\src\\main\\resources\\person";
    final String USERNAME = "sa";
    final String PASSWORD = "";

    Connection connection = null;
    Statement createStatement = null;
    DatabaseMetaData dbmd = null;

    public DB() {

        try {
            DriverManager.registerDriver(new org.h2.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        if (connection != null) {
            try {
                createStatement = connection.createStatement();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        try {
            dbmd = connection.getMetaData();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            ResultSet rsl = dbmd.getTables(null, "APP", "person", null);
//            if(!rsl.next()){
//                createStatement.execute("CREATE TABLE `PERSON` (\n" +
//                        "  `ID` int(11) NOT NULL AUTO_INCREMENT,\n" +
//                        "  `FIRSTNAME` varchar(255) NOT NULL COMMENT 'Persons first name',\n" +
//                        "  `LASTNAME` varchar(255) COMMENT 'Persons last name',\n" +
//                        "  `BIRTHDAY` date NOT NULL COMMENT 'Birthday',\n" +
//                        "  `NICKNAME` varchar(255) NOT NULL,\n" +
//                        "  PRIMARY KEY (`ID`),\n" +
//                        "  UNIQUE(`NICKNAME`)\n" +
//                        ");\n");
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public void addPersonObject(Person p) {

        String sql = "INSERT INTO `PERSON`(`FIRSTNAME`,`LASTNAME`,`BIRTHDAY`,`NICKNAME`) VALUES('" + p.getFirstname() + "','" + p.getLastname() + "','" + p.getBirthday() + "', '" + p.getNickname() + "' ) ";
        try {
            createStatement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void addPerson(String firstname, String lastname, String birthday, String nickname) {

        String sql = "INSERT INTO `PERSON`(`FIRSTNAME`,`LASTNAME`,`BIRTHDAY`,`NICKNAME`) VALUES('" + firstname + "','" + lastname + "','" + birthday + "', '" + nickname + "' ) ";
        try {
            createStatement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void addPersboWithPreparedStatemant(Person p) {
        String sql = "INSERT INTO `PERSON`(`FIRSTNAME`,`LASTNAME`,`BIRTHDAY`,`NICKNAME`) VALUES(?,?,?,?);";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, p.getFirstname());
            preparedStatement.setString(2, p.getLastname());
            preparedStatement.setString(3, p.getBirthday());
            preparedStatement.setString(4, p.getNickname());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void showAllPerson() {
        String sql = "SELECT * FROM PERSOn;";
        try {
            ResultSet resultSet = createStatement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String firstName = resultSet.getString("FIRSTNAME");
                String lastName = resultSet.getString("LASTNAME");
                String birthDay = resultSet.getString("BIRTHDAY");
                String nickName = resultSet.getString("NICKNAME");

                System.out.println(id + " - " + firstName + " - " + lastName + " - " + birthDay + " - " + nickName);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void showPersoMetaData() {
        String sql = "SELECT * FROM PERSON";

        ResultSet rs;
        ResultSetMetaData rsmd;

        try {
            rs = createStatement.executeQuery(sql);
            rsmd = rs.getMetaData();

            int columCount = rsmd.getColumnCount();

            for (int i = 1; i <= columCount; i++) {
                System.out.print(rsmd.getColumnName(i) + " | ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println();
    }


    public List<Person> getAllPersonList() {
        List<Person> personList = new ArrayList<>();

        String sql = "SELECT * FROM PERSOn;";
        try {
            ResultSet resultSet = createStatement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String firstName = resultSet.getString("FIRSTNAME");
                String lastName = resultSet.getString("LASTNAME");
                String birthDay = resultSet.getString("BIRTHDAY");
                String nickName = resultSet.getString("NICKNAME");

                personList.add(new Person(firstName, lastName, birthDay, nickName));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personList;
    }

    public void update(int ID){

        String sql = "SELECT birthday FROM person WHERE ID = " +ID+ ";";
        ResultSet rs;
        String updated = null;
        String a = null;

        try {
            rs = createStatement.executeQuery(sql);
            while (rs.next()){
                a = rs.getString(1);
                System.out.println(a);
            }
            String year = a.substring(0,4);
            String monthAndDay = a.substring(4,10);
            int n = Integer.parseInt(year);
            n = n+2;
            updated = n + monthAndDay;


        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql2 = "UPDATE person SET birthday=? WHERE ID = " + ID+ ";";
        try {
            PreparedStatement ps = connection.prepareStatement(sql2);
            ps.setString(1,updated);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void deletePerseonByID(String name){

        String sql ="DELETE FROM PERSON WHERE NICKNAME = ?";

        try
        {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,name);
            st.executeUpdate();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }





}
