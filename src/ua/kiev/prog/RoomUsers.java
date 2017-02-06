package ua.kiev.prog;

import java.util.Comparator;

/**
 * Created by Anna on 30.01.2017.
 */
public class RoomUsers implements Comparator<String>{

    String newName;

    public String getNewName() {
        return newName;
    }

    public void add(String login) {

    }

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
