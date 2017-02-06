package ua.kiev.prog;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Anna on 29.01.2017.
 */
public class ChatRoom extends HttpServlet {
    private HashMap<String, RoomUsers> chatRoomUsers;

    String room;

    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
         room = req.getParameter("room");
         addNewRoom(req.getParameter("login"));
    }

    private void addNewRoom(String login){
        RoomUsers newName = new RoomUsers();
        newName.add(login);
        chatRoomUsers.put(room, newName);
    }



}
