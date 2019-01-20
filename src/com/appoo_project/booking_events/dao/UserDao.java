package dao;


import data_layer.User;
import java.sql.SQLException;

public interface UserDao {

    void insertUser(User user) throws SQLException;
    void updateUser(User user) throws SQLException;
    void deleteUser(int ID) throws SQLException;
    void selectAllUsers() throws SQLException;
    void selectUserById(int ID) throws  SQLException;

}
