import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author super
 */
public class ServletContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        ServletContext ctx =this.getServletContext();
        String globalValue1 = ctx.getInitParameter("globalData1");
        String globalValue2 = ctx.getInitParameter("globalData2");
        System.out.println("servletContext globalValue1:"+globalValue1);
        System.out.println("servletContext globalValue2:"+globalValue2);
        ctx.setAttribute("attribute1","111");
    }
}
