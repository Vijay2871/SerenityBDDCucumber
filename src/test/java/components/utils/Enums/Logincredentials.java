package components.utils.Enums;

public enum Logincredentials {
    REGISTERED_USER("vijaytest@gmail.com","Test1234"),
    INVALID_USER("vijay@gmail.com","Abcd@123"),
    GUEST_USER("vijaytest@gmail.com","");

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    private final String username;
    private final String password;

    Logincredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
