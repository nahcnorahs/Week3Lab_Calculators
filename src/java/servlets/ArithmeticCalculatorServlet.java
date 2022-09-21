package servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sharon
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String result = "---";
        request.setAttribute("result", result);
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request,response);
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String operator = request.getParameter("operator");
        
        if (first == null && first.equals("") || second == null && second.equals("")){
            request.setAttribute("result", "invalid");
        } else {
            try {
                int first1 = Integer.parseInt(first);
                int second1 = Integer.parseInt(second);
                int result=0;
               
                if (operator.equals("+")) {
                    int calcResult = first1 + second1;
                    result = calcResult;
                } else if (operator.equals("-")){
                    int calcResult = first1 - second1;
                    result = calcResult;
                } else if (operator.equals("*")){
                    int calcResult = first1 * second1;
                    result = calcResult;
                } else if (operator.equals("%")){
                    int calcResult = first1 % second1;
                    result = calcResult;
                }
                 request.setAttribute("first",first);
                 request.setAttribute("second",second);
                 request.setAttribute("result", result);
            } catch (NumberFormatException e){
                request.setAttribute("result", "invalid");
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request,response);
                return;
            }
        }
          getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request,response);
    }


}
