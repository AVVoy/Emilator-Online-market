package Users;

public class AbstractUser {

    private String name;

    private static long count;

    private final long id;

    private String email;

    private String phone;
    AbstractUser(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.id = ++count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
