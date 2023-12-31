package seminars.third.tdd;

public class User {
    private String name;
    private String password;
    boolean isAdmin;
    boolean isAuthenticate;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isAuthenticate = false;
    }

    // Геттеры и сеттеры для свойств name, password, isAdmin и isAuthenticate

    public void authenticate(String password) {
        if (this.password.equals(password)) {
            isAuthenticate = true;
            System.out.println("User " + name + " is authenticated");
        } else {
            System.out.println("Invalid password for user " + name);
        }
    }
}
