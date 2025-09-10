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

/**
 *
 * @author DYICT
 */
public class RegisterServlet extends HttpServlet {

    @EJB
    UserFacadeLocal us;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User user = new User();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone_number = request.getParameter("phone_number");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        
        //set the attributes
        user.setName(name);
        user.setEmail(email);
        user.setPhoneNumber(phone_number);
        user.setPasswordHash(password);
        user.setRole(role);
        
        //persist to the databsae
        us.create(user);
        
        //set the user attribute        
        request.setAttribute("user", user);

        //redirect
        RequestDispatcher disp = request.getRequestDispatcher("register_success.jsp");
        disp.forward(request, response);
    }

}
