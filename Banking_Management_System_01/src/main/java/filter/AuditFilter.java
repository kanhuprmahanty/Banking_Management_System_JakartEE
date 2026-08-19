package filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import service.AuditLogService;

import java.io.IOException;

@WebFilter("/*")
public class AuditFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req =
                (HttpServletRequest) request;

        String url =
                req.getRequestURI();

        if(url.contains("login")
                || url.contains("transaction")
                || url.contains("loan")
                || url.contains("customer")) {

            new AuditLogService()
                    .logActivity(
                            1,
                            "SYSTEM",
                            "ADMIN",
                            "ACCESS",
                            url,
                            req.getRemoteAddr(),
                            "SUCCESS");
        }

        chain.doFilter(
                request,
                response);
    }
}
