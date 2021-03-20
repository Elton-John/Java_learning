package java_00_revision;

public class User extends Person {

    private String login;


    public User(Integer id, String name, String login) {
        super(id, name);
        this.login = login;
    }
}
