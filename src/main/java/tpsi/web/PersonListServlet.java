package tpsi.web;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PersonListServlet", urlPatterns = {"/personList"})
public class PersonListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            List<Person> persons = new ArrayList<>();
            persons.add(new Person("Jan","Kowalski","jkowalski@gmail.com"));
            persons.add(new Person("Janina","Kowalska","jkowalska@gmail.com"));
            persons.add(new Person("Adam","Nowak","anowak@gmail.com"));
            persons.add(new Person("Anna","Nowak","annowak@gmail.com"));
            request.setAttribute("persons", persons);
            request.getRequestDispatcher("personList.jsp").forward(request, response);
    }
}