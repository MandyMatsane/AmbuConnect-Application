package dyict.ac.za.bl;

import dyict.ac.za.entities.Patient;
import dyict.ac.za.session.PatientFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ListPatientServlet extends HttpServlet {

    @EJB PatientFacadeLocal pf;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Patient> patients = pf.findAll();
        
        request.setAttribute("patients", patients);
        
        RequestDispatcher disp = request.getRequestDispatcher("manage_patients.jsp");
        disp.forward(request, response);
        
    }
}
