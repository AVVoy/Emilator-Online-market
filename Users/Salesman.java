package Users;

public class Salesman extends AbstractUser{
    public Salesman(String name, String phone) {
        super(name, phone);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Salesman)) return false;
        Salesman user = (Salesman) obj;
        return this.getId() == user.getId();
    }
}
