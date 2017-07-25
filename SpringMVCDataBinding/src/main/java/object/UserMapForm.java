package object;

import java.util.Map;

/**
 * Created by Thpffcj on 2017/07/23.
 */
public class UserMapForm {
    private Map<String,User> users;

    @Override
    public String toString() {
        return "UserMapForm{" +
                "users=" + users +
                '}';
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }
}
