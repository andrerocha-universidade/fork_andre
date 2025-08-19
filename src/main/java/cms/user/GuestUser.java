package cms.user;

public class GuestUser extends User {
    public GuestUser(int id, String name, String email, String password) {
        super(id, name, email, password);
    }
}
