package dyict.ac.za.bl;

import dyict.ac.za.entities.User;
import dyict.ac.za.session.UserFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    @EJB
    UserFacadeLocal us;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("email");
        String password = request.getParameter("password");

        //get admin details from the context-param
        String adminUsername = getServletContext().getInitParameter("adminUsername");
        String adminPassword = getServletContext().getInitParameter("adminPassword");

        HttpSession session = request.getSession();

        if (username != null && username.equals(adminUsername) && password != null && password.equals(adminPassword)) {

            session.setAttribute("user", null);
            session.setAttribute("role", "Admin");
            response.sendRedirect("adminDashboard.jsp");

            return; //stop further execution
        }

        //find the user in the database by email
        User user = us.findByEmail(username);

        if (user != null && user.getPasswordHash().equals(password)) {

            session.setAttribute("user", user);
            session.setAttribute("role", user.getRole());

            switch (user.getRole().toLowerCase()) {
                case "admin":
                    response.sendRedirect("adminDashboard.jsp");
                    break;
                case "patient":
                    response.sendRedirect("patientDashboard.jsp");
                    break;
                case "driver":
                    response.sendRedirect("driverDashboard.jsp");
                    break;
                case "paramedic":
                    response.sendRedirect("paramedicDashboard.jsp");
                    break;
                default:
                    request.setAttribute("error", "Unknown role");
                    RequestDispatcher disp = request.getRequestDispatcher("login.jsp");
                    disp.forward(request, response);
            }
        } else {
            request.setAttribute("error", "invalid login credentials");
            RequestDispatcher disp = request.getRequestDispatcher("login.jsp");
            disp.forward(request, response);
        }

    }

}
