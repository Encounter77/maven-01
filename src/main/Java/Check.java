import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginCheck")
public class Check extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        resp.setCharacterEncoding("utf-8");
        String uname = req.getParameter("username");
        String upasword = req.getParameter("userpassword");
        PrintWriter out = resp.getWriter();
        if (uname.equals("jiangyanfei") && upasword.equals("123")) {
            out.print("<html><head><meta charset='UTF-8'><script>alert('登陆成功，即将跳转');" +
                    "window.location.href='success.jsp'</script></head></html>");
            // resp.sendRedirect("success.jsp");
        } else {
            out.print("<html><head><meta charset='UTF-8'><script>alert('登陆失败，请重新输入用户信息');" +
                    "window.location.href='index.jsp'</script></head></html>");
            // resp.sendRedirect("index.jsp");
        }
    }
}
