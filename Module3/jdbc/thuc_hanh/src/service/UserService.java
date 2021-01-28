package service;

import bean.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    public void insertUser(User user) ;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public void deleteUser(int id) ;

    public void updateUser(User user) ;
    List<User> search(String country);
    public User getUserById(int id);

    public void insertUserStore(User user) throws SQLException;
    public void addUserTransaction(User user, int[] permisions);

}
