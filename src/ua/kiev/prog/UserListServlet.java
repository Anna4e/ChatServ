package ua.kiev.prog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Anna on 27.01.2017.
 */
public class UserListServlet {

    private static ArrayList<String> userList = new ArrayList();
    public UserListServlet() {
        userList.add("Anna");
        userList.add("Dimko");
        userList.add("Olja");
        userList.add("KotSemen");

    }

    public static ArrayList<String> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<String> userList) {
        this.userList = userList;
    }
}
