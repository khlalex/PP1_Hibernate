package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    private static final UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 20);
        userService.saveUser("Миша", "Губин", (byte) 23);
        userService.saveUser("Леша", "Зотов", (byte) 33);
        userService.saveUser("Валера", "Гусев", (byte) 44);

        userService.removeUserById(2);

        List<User> strings = userService.getAllUsers();
        for (User s : strings) {
            System.out.println(s);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
