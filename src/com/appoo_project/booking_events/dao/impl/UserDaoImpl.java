package dao.impl;
import dao.UserDao;
import data_layer.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDaoImpl implements UserDao {


    private Connection connection = DatabaseConnection.getInstance().getConnection();

    public UserDaoImpl() throws SQLException {
    }

    public void selectUserById(int ID) throws SQLException {

        try {

            Statement stmt = connection.createStatement();
            String strSelect = "SELECT * FROM USERS where ID=" + ID;
            System.out.println("The SQL query is: " + strSelect);
            System.out.println();
            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next()) {
                String iduser = rset.getString("IDUSER");
                String firstnameuser = rset.getString("FISTNAMEUSER");
                String lastnameuser = rset.getString("LASTNAMEUSER");
                String usernameuser = rset.getString("USERNAMEUSER");
                String passworduser = rset.getString("PASSWORDUSER");
                String addressuser = rset.getString("ADDRESSUSER");
                String townuser = rset.getString("TOWNUSER");
                String countyuser = rset.getString("COUNTYUSER");
                String postcodeuser = rset.getString("POSTCODEUSER");
                String emailuser = rset.getString("EMAILUSER");
                System.out.println("Result" + "\n" +iduser + ", " + firstnameuser + ", " + lastnameuser + ", " + usernameuser
                        + ", " + passworduser + ", " + addressuser + ", " + townuser + ", " + countyuser + ", " + postcodeuser + ", " + emailuser);
                ++rowCount;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally {
            connection.close();
        }
    }



    public void selectAllUsers() throws SQLException {


        try {

            Statement stmt = connection.createStatement();
            String strSelect = "SELECT * FROM USERS";
            System.out.println("The SQL query is: " + strSelect);
            System.out.println();
            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next()) {
                String iduser = rset.getString("IDUSER");
                String firstnameuser = rset.getString("FISTNAMEUSER");
                String lastnameuser = rset.getString("LASTNAMEUSER");
                String usernameuser = rset.getString("USERNAMEUSER");
                String passworduser = rset.getString("PASSWORDUSER");
                String addressuser = rset.getString("ADDRESSUSER");
                String townuser = rset.getString("TOWNUSER");
                String countyuser = rset.getString("COUNTYUSER");
                String postcodeuser = rset.getString("POSTCODEUSER");
                String emailuser = rset.getString("EMAILUSER");
                System.out.println("Result" + "\n" +iduser + ", " + firstnameuser + ", " + lastnameuser + ", " + usernameuser
                        + ", " + passworduser + ", " + addressuser + ", " + townuser + ", " + countyuser + ", " + postcodeuser + ", " + emailuser);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally {
            connection.close();
        }
    }

    public void insertUser(User user) throws SQLException {
        try {

            Statement stmt = connection.createStatement();
            String q1 = "INSERT INTO USERS(IDUSER,FISTNAMEUSER,LASTNAMEUSER,USERNAMEUSER,PASSWORDUSER,ADDRESSUSER,TOWNUSER,COUNTYUSER,POSTCODEUSER,EMAILUSER) values(" + user.getID() + ",'" + user.getFistname() + "','" +user.getLastname()+ "','" +user.getUsername()+ "','" + user.getPassword() + "','" + user.getAddress() + "','" + user.getTown()+ "','" +user.getCounty()+ "','"+ user.getPostcode()+ "','"  +user.getEmail() + "')";
            int x = stmt.executeUpdate(q1);
            System.out.println("The SQL query is: " + q1);
            if (x > 0)
                System.out.println("Successfully Inserted");
            else
                System.out.println("Insert Failed");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally {
            connection.close();
        }
    }

    public void updateUser(User user) throws SQLException {
        try {

            Statement stmt = connection.createStatement();
            String strUpdate = "UPDATE USERS set PASSWORDUSER = '" + user.getPassword() +
                    "' WHERE IDUSER = " + user.getID();
            int x = stmt.executeUpdate(strUpdate);
            System.out.println("The SQL query is: " + strUpdate);
            if (x > 0)
                System.out.println("Password Successfully Updated");
            else
                System.out.println("ERROR OCCURED :(");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally {
            connection.close();
        }
    }

    public void deleteUser(int ID) throws SQLException {
        try {
            String id = "2";
            Statement stmt = connection.createStatement();
            String strDelete = "DELETE from USERS WHERE IDUSER = "+ id;
            int x = stmt.executeUpdate(strDelete);
            System.out.println("The SQL query is: " + strDelete);
            if (x > 0)
                System.out.println("Deleted");
            else
                System.out.println("ERROR OCCURED :(");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally {
            connection.close();
        }
    }

}

