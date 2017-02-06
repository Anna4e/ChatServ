package ua.kiev.prog;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Anna on 29.01.2017.
 */
public class ChatRoomUsers extends ChatRoom {
        private HashMap<String, RoomUsers> chatRoomUsers;
    private  boolean status;
    String room;
    public ChatRoomUsers() {
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String login = req.getParameter("userToCR");
        room = req.getParameter("room");
        //проверка на анличие указанной чат-комнаты
        for (HashMap.Entry entry: chatRoomUsers.entrySet()) {
            String roomHM = (String) entry.getKey();
            if (roomHM.equals(room)){
                addNewRoom(room, login);
                break;
            }
            }


    }


    private void addNewRoom(String room, String login){
        RoomUsers newName = new RoomUsers();
        newName.add(login);
        chatRoomUsers.put(room, newName);

    }
}