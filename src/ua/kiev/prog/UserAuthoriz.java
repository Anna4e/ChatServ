package ua.kiev.prog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Anna on 27.01.2017.
 */
public class UserAuthoriz extends HttpServlet {
    private String login;
    private String room;
     private boolean status;


    public UserAuthoriz(String name, String room){
        this.login=login;
        this.status=false;
           }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
    ArrayList<String> users = new ArrayList();
    users = UserListServlet.getUserList();

            if (users.equals(login)) {
                status = true;
                resp.setStatus(200);
                HttpSession httpSession = req.getSession(true);
                httpSession.setAttribute(login, true);
                return;

            } else {
                resp.setStatus(401);
            }



    }

}
