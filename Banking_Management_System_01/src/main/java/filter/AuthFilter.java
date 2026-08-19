package filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebFilter("/dashboard.jsp")
public class AuthFilter
implements Filter {

    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain)
            throws IOException,
            ServletException {

        HttpServletRequest req =
                (HttpServletRequest)
                        request;

        HttpSession session =
                req.getSession(false);

        if(session==null ||
                session.getAttribute(
                        "userId")==null){

            ((HttpServletResponse)
                    response)
                    .sendRedirect(
                    "login.jsp");

            return;
        }

        chain.doFilter(
                request,
                response);
    }
}