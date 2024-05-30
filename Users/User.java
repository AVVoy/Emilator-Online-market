package Users;

public class User extends AbstractUser{
    public User(String name, String phone) {
        super(name, phone);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        User user = (User) obj;
        return this.getId() == user.getId();
    }
}
