
package calculator;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 759175
 */
public class AgeCalculatorServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(req, res);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
     
        //Gets the value from age input type box named inputAge
        String age = req.getParameter("inputAge");
        //To use the above attribute inside jsp, we use EL(Expression Language) that looks like this ${attrib.name}
        
        //If the user doesn't put anything in the textbox
        if(age.equals(""))
        {
            req.setAttribute("ageAttribute", "You must give your current age");        
        }
        else{
              try
                {
                //Storing a converted int value inside new variable newAge
                int newAge = Integer.valueOf(age);
                //Incrementing it by 1
                newAge++;
                //Setting the attribute inside jsp to a message with incremented newAge
                req.setAttribute("ageAttribute", "Your age next birthday will be " + newAge);
                }
                //If anything else is entered other than int
                catch(NumberFormatException e)
                {
                //Throw this message(instead of default exception message)
                req.setAttribute("ageAttribute", "You must enter a number.");
                }
             } 
        //Sending the data with attributes back to original jsp
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(req, res);
        
    }

}
