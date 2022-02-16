package com.personalproject.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(service = Servlet.class)
@SlingServletPaths(value = "/bin/formAdditionServlet")
public class FormAddition extends SlingSafeMethodsServlet {
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        int firstnumber = Integer.parseInt(request.getParameter("firstnumber"));
        int secondnumber = Integer.parseInt(request.getParameter("secondnumber"));
        int add = firstnumber + secondnumber;
        response.getWriter().print(add);
    }
}
