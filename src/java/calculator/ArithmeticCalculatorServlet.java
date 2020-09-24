
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
public class ArithmeticCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
      
        //Setting the result attribute to --- if no calculation is done
        req.setAttribute("result", "---");
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(req,res);
    }   
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
           
        //Getting the input values from both textboxes
        String first = req.getParameter("firstValue");
        String second = req.getParameter("secondValue");
        
        //Setting the textboxes' placeholders to entered value
            req.setAttribute("first", first);
            req.setAttribute("second", second);
        try
        {
        
        //Converting values from textboxes to int
        int newFirst = Integer.valueOf(first);
        int newSecond = Integer.valueOf(second);
        
        //Checking if + button is pressed
        if(req.getParameter("+") != null)
        {     
            req.setAttribute("result", (newFirst + newSecond));
        }
        //Checking if - button is pressed
        else if(req.getParameter("-") != null)
        {
            req.setAttribute("result", (newFirst - newSecond));
        }
        //Checking if * button is pressed
        else if(req.getParameter("*") != null)
        {
            req.setAttribute("result", (newFirst * newSecond));
        }
        //Checking if % button is pressed
        else if(req.getParameter("%") != null)
        {
            req.setAttribute("result", (newFirst % newSecond));
        }
        
        }catch(NumberFormatException e)
        {
            req.setAttribute("result", "invalid");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(req, res);
        
    }   

}
