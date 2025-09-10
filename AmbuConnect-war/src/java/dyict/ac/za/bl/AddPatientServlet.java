package dyict.ac.za.bl;

import dyict.ac.za.entities.Patient;
import dyict.ac.za.session.PatientFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/AddPatientServlet.do") 
public class AddPatientServlet extends HttpServlet {
    
    @EJB PatientFacadeLocal pf;
            
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //instatiate an object
        Patient patient = new Patient();
        
        //retrieve the varibles from the form
        String name = request.getParameter("name");
        String contact = request.getParameter("contact");
        String address = request.getParameter("address");
         
        //sett the attributes
        patient.setName(name);
        patient.setContact(contact);
        patient.setAddress(address);
        
        //persist the patient on thne database
        pf.create(patient);
        
        //set attribute of the patients
        request.setAttribute("patient", patient);
        
        //redirect
        RequestDispatcher disp = request.getRequestDispatcher("patient_added_success.jsp");
        disp.forward(request, response);
        
    }
    
}
