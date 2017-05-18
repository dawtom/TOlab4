import java.util.ArrayList;

/**
 * Created by Dawid Tomasiewicz on 18.05.17.
 */
public class Game {

    Game(){
        this.userList = new ArrayList<User>();
        this.eventList = new ArrayList<Event>();
    }

    private ArrayList<User> userList;
    private ArrayList<Event> eventList;

    public void sendResults(User user, int result){
        user.setPresentResult(result);
    }
    public void createEvent(Event e){
        this.eventList.add(e);
    }
    public void addUser(User user) {
        this.userList.add(user);
    }
    public void removeUser(User user) {
        this.userList.remove(user);
    }
}
