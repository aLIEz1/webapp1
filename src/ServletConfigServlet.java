import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author super
 */
public class ServletConfigServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
//        ServletConfig config = this.getServletConfig();
//        String v1 = config.getInitParameter("data1");
//        System.out.println("v1:" + v1);
//        String v2 = config.getInitParameter("data2");
//        System.out.println("v2:" + v2);

        ServletContext ctx =this.getServletContext();
        String globalValue1 = ctx.getInitParameter("globalData1");
        String globalValue2 = ctx.getInitParameter("globalData2");
        System.out.println("globalValue1:"+globalValue1);
        System.out.println("globalValue2:"+globalValue2);
        String attribute1 = (String) ctx.getAttribute("attribute1");
        System.out.println("attribute1:"+attribute1);
    }
}
