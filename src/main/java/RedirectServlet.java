import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


// Задача этого сервлета — перенаправлять запросы на путь “/hello”.
@WebServlet("")
public class RedirectServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // перенаправление
//        getServletContext().getRequestDispatcher("/hello").forward(req, resp);
        resp.sendRedirect(req.getContextPath() + "/hello");
    }
}
