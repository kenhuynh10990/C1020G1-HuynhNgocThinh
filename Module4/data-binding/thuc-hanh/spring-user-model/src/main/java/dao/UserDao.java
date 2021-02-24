package dao;

import model.Login;
import model.User;
import org.graalvm.compiler.lir.LIRInstruction;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User>users;
    static {
        users=new ArrayList<>();
        User u1=new User();
        u1.setAge(10);
        u1.setName("a");
        u1.setAccount("a");
        u1.setEmail("a@g.com");
        u1.setPassword("1234");
        users.add(u1);

        User u2=new User();
        u2.setAge(10);
        u2.setName("b");
        u2.setAccount("b");
        u2.setEmail("b@g.com");
        u2.setPassword("1234");
        users.add(u2);

        User u3=new User();
        u3.setAge(10);
        u3.setName("c");
        u3.setAccount("c");
        u3.setEmail("c@g.com");
        u3.setPassword("1234");
        users.add(u3);

        User u4=new User();
        u4.setAge(10);
        u4.setName("d");
        u4.setAccount("d");
        u4.setEmail("d@g.com");
        u4.setPassword("1234");
        users.add(u4);
    }
    public static User checkLogin(Login login){
        for (User u : users){
            if (u.getAccount().equals(login.getAccount())&& u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
