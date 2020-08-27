package java_16_session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/get")
public class SessionGetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        PrintWriter writer = resp.getWriter();
        try {
            int counter = (int) session.getAttribute("counter");
            counter++;
            session.setAttribute("counter", counter);
            writer.println(counter);
        } catch (NullPointerException ex){
            writer.println("Empty");
        }


    }
}
