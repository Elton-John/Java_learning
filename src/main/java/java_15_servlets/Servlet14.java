package java_15_servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet14")
public class Servlet14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String browser  = req.getHeader("User-Agent");
        String adresIP = req.getRemoteAddr();
        System.out.println(browser);
        System.out.println(adresIP);
    }
}
