package java_15_servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private final static String USER = "admin";
    private final static String PASSWORD = "coderslab";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("username");
        String pass = req.getParameter("password");
        if (user.equals(USER) && pass.equals(PASSWORD)) {
            HttpSession session = req.getSession();
            session.setAttribute("username", user);
            resp.sendRedirect("/admin");
            // dodaj dane do sesji pod kluczem: username
            // przekieruj na adres /admin
        } else {
            PrintWriter writer = resp.getWriter();
            writer.println("Niepoprawne login lub hasło");
        }
    }
}
