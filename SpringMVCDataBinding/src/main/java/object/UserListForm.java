package object;

import java.util.List;

/**
 * Created by Thpffcj on 2017/07/23.
 */
public class UserListForm {
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserListForm{" +
                "users=" + users +
                '}';
    }
}
