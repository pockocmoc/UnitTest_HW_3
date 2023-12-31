package seminars.third.tdd;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        // Создание пользователей
        User adminUser = new User("admin", "admin123", true);
        User regularUser1 = new User("user1", "password1", false);
        User regularUser2 = new User("user2", "password2", false);

        // Добавление пользователей в репозиторий
        userRepository.addUser(adminUser);
        userRepository.addUser(regularUser1);
        userRepository.addUser(regularUser2);

        // Аутентификация пользователей
        adminUser.authenticate("admin123");
        regularUser1.authenticate("password1");
        regularUser2.authenticate("password2");

        // Разлогинивание всех пользователей, кроме администраторов
        userRepository.logoutNonAdminUsers();
        System.out.println(userRepository);
    }
}

