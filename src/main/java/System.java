import java.util.LinkedList;
import java.util.List;

/**
 * Created by Dawid Tomasiewicz on 18.05.17.
 */
public class System {
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public System() {
        this.users = new LinkedList<User>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }
    public void removeUser(User user) {
        this.users.remove(user);
    }
}
