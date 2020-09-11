package java_11;

//import org.apache.logging.log4j.LogManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//import java.util.logging.LogManager;
//import org.apache.logging.log4j.Logger;
//import java.util.logging.LogManager;
//import java.util.logging.Logger;


@WebServlet(name = "ServletBankAccountCreate", urlPatterns = {"/bank_account_create"})
public class ServletBankAccountCreate extends HttpServlet {
   // private static final Logger log= LogManager.getLogger(ServletBankAccountCreate.class);
    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String pesel = request.getParameter("pesel");
        PrintWriter writer = response.getWriter();
        writer.println(name + surname +pesel);
        //log.debug("Pobrano z formularza: name = {}, surname = {}, pesel = {}", name,surname,pesel);
        BankAccount bankAccountWithoutId = new BankAccount(name,surname,pesel);
        BankAccount bankAccount = BankAccountDao.create(bankAccountWithoutId);
        assert bankAccount != null;
        writer.println(bankAccount.getName());
        request.setAttribute("bankAccount", bankAccount);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/bank_account_presentation.jsp");
        dispatcher.forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/bank_account_create.jsp");
        dispatcher.forward(request,response);
    }
}
