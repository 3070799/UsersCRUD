import javax.management.relation.Role;

public class User {
    Roles admin = new Roles("admin");
    Roles client = new Roles("client");

    private static int nextId = 0;
    private int id = nextId++;
    private String name;
    private String login;
    private String pass;
    private Roles roles = client;

    public User(String login, String pass) {
        this.login = login;
        this.pass = pass;
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
                ", roles=" + getRoles() +
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

    public String getRoles() {
        return roles.getRole();
    }

    public void setRoles(String roles) {
        if(roles.equals("admin")){
            this.roles = admin;
        }else if(roles.equals(client)){
            this.roles = client;
        }

    }
}
