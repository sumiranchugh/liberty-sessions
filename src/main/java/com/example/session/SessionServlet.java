package com.example.session;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ServiceA")
public class SessionServlet extends HttpServlet {
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
        HttpSession session = req.getSession();
        resp.getOutputStream().println(session.getAttribute("foo").toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("foo", "bar");
        resp.getOutputStream().println(session.getAttribute("foo").toString());
    }



}
