package org.example.intelijepractice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/svtanal")
public class ServletAnalysis extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ServletAnalysis() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.append("<!doctype html><html><head><title>Hello Servlet</title></head><body>")
                .append("<h2>Hello World</h2><hr>")
                .append("현재 날짜와 시간: " + java.time.LocalTime.now())
                .append("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}
