package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl num = new UserServiceImpl();
        num.createUsersTable();
        num.saveUser("Islam","Dzeytov", (byte) 21);
        num.saveUser("Nikita","Lyapis-Trubetskoy", (byte) 40);
        num.saveUser("Daddy","Vladdy", (byte) 63);
        num.saveUser("Leo","Messi", (byte) 34);
        List<User> list = num.getAllUsers();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        num.cleanUsersTable();
        num.dropUsersTable();
        // реализуйте алгоритм здесь
    }
}
