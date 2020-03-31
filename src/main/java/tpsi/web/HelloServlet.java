package tpsi.web;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String imie = request.getParameter("firstName");
            String nazwisko = request.getParameter("lastName");
            String email = request.getParameter("emailAddress");
            List<String> dni = new ArrayList<>();
            dni.add("Poniedziałek");
            dni.add("Wtorek");
            dni.add("Środa");
            dni.add("Czwartek");
            dni.add("Piątek");
            request.setAttribute("person", new Person(imie, nazwisko, email));
            request.setAttribute("dniTygodnia", dni);
            request.getRequestDispatcher("hello.jsp").forward(request, response);
    }
}