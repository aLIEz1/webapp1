import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author super
 */
public class GetPostServlet extends HttpServlet {
    public static final long serialVersionUID=1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter =resp.getWriter();
        String name1=req.getParameter("name1");
        String pw1=req.getParameter("pw1");
        printWriter.println("<HTML>");
        printWriter.println("<HEAD><TITLE>A Servlet</TITLE><HEAD/>");
        printWriter.println("<BODY>调用get方法<br></br>");

        printer(printWriter, name1, pw1);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter =resp.getWriter();
        String name2=req.getParameter("name2");
        String pw2=req.getParameter("pw2");
        printWriter.println("<HTML>");
        printWriter.println("<HEAD><TITLE>A Servlet</TITLE><HEAD/>");
        printWriter.println("<BODY>调用post方法<br></br>");

        printer(printWriter, name2, pw2);
    }

    private void printer(PrintWriter printWriter, String name2, String pw2) {
        printWriter.println("用户名:"+name2);
        printWriter.println("<br></br>");
        printWriter.println("密码:"+pw2);
        printWriter.println("<br></br>");
        printWriter.println("</BODY>");
        printWriter.println("<HTML>");
        printWriter.flush();
        printWriter.close();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}
