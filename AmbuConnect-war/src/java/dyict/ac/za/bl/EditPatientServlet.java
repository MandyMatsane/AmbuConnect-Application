package dyict.ac.za.bl;

import dyict.ac.za.entities.Patient;
import dyict.ac.za.session.PatientFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditPatientServlet extends HttpServlet {

    @EJB
    PatientFacadeLocal pf;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        
        Patient patient = pf.find(id);
        
        request.setAttribute("patient", patient);
        
        RequestDispatcher disp = request.getRequestDispatcher("edit_patients.jsp");
        disp.forward(request, response);
    }

}
