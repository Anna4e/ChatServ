package ua.kiev.prog;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Anna on 27.01.2017.
 */
public class LogoutServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String log = request.getParameter("login");
        String room = request.getParameter("room");
        HttpSession session = request.getSession(false);

        if (session != null)
            session.removeAttribute("login");
        if (!room.equals(null) && !room.equals(" ")){

        }
        response.sendRedirect("index.jsp");
    }
}
