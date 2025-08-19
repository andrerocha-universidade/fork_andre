package cms.user;

public abstract class User {
    private int id;
    private String name;
    private String email;
    private String password;

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getters obrigatórios
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // O teste geralmente exige um método de verificação de senha
    public boolean checkPassword(String password) {
        return this.password != null && this.password.equals(password);
    }
}
