package dyict.ac.za.bl;

import dyict.ac.za.entities.Patient;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PatientServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Patient patient = new Patient();
        
        String idStr = request.getParameter("patient_id");
        int id = Integer.parseInt(idStr);
         
        String name = request.getParameter("name");
        String contact = request.getParameter("contact");
        String address = request.getParameter("address");
        
        RequestDispatcher disp = request.getRequestDispatcher("success.jsp");
        disp.forward(request, response);
    }

}
