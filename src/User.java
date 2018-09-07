import javax.management.relation.Role;

public class User {

    private static int nextId = 0;
    private int id = nextId++;
    private String name;
    private String login;
    private String pass;
    private Roles roles = new Roles();

    public User(String login, String pass) {
        this.login = login;
        this.pass = pass;
        this.roles.right = "client";
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                ", roles=" + roles.right +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles.right = roles;
    }
}
