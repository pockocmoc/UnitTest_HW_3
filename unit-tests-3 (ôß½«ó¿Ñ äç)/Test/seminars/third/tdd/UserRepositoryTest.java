package seminars.third.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRepositoryTest {
    private UserRepository userRepository;
    private User adminUser;
    private User nonAdminUser;

    @BeforeEach
    public void setup() {
        userRepository = new UserRepository();
        adminUser = new User("Admin", "admin_password", true);
        nonAdminUser = new User("User", "user_password", false);
        userRepository.addUser(adminUser);
        userRepository.addUser(nonAdminUser);
    }

    @Test
    public void testLogoutNonAdminUsers() {
        nonAdminUser.authenticate("user_password");
        Assertions.assertTrue(nonAdminUser.isAuthenticate);

        userRepository.logoutNonAdminUsers();

        Assertions.assertFalse(nonAdminUser.isAuthenticate);
    }
}