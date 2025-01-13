public class User {

    private int id;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private boolean Active;

    public User(String password, String username, String lastname, String firstname, int id, boolean inActive) {
        this.password = password;
        this.username = username;
        this.lastname = lastname;
        this.firstname = firstname;
        this.id = id;
        this.Active = inActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean isActive) {
        this.Active = isActive;
    }

    public User(){

    }
}
