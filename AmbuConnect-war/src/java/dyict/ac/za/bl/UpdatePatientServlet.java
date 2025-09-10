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

public class UpdatePatientServlet extends HttpServlet {

    //ENJECT  handles database operations for Patient
    @EJB
    PatientFacadeLocal pf;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Retrieve updated patient details from the form
        String idStr = request.getParameter("patient_id");
        int id = Integer.parseInt(idStr);

        String name = request.getParameter("name");
        String contact = request.getParameter("contact");
        String address = request.getParameter("address");

        //existing person in db
        Patient patient = pf.find(id);

        if (patient != null) {
            patient.setPatient_id(id);
            patient.setName(name);
            patient.setContact(contact);
            patient.setAddress(address);

            //update the patient in the database
            pf.edit(patient);

            //Pass updated patient back to JS
            //request.setAttribute("patient", patient);
            //request.setAttribute("message", "Patient updated successfully");

            //redirect to the success page
            //RequestDispatcher disp = request.getRequestDispatcher("success.jsp");
            //disp.forward(request, response);
            
            response.sendRedirect("ListPatientServlet.do");
        }else{
            request.setAttribute("error", "Patient not found");
            //redirect to the success page
           // RequestDispatcher disp = request.getRequestDispatcher("success.jsp");
            //disp.forward(request, response);
            
            response.sendRedirect("ListPatientServlet.do");
        }

    }

}
