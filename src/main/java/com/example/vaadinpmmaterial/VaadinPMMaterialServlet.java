package com.example.vaadinpmmaterial;

import com.vaadin.flow.server.VaadinServlet;
import com.vaadin.flow.server.VaadinServletConfiguration;

import javax.servlet.annotation.WebServlet;


@WebServlet(urlPatterns = "/*", name = "VaadinPMMaterialServlet", asyncSupported = true)
@VaadinServletConfiguration(ui = VaadinPMMaterialUI.class, productionMode = false)
public class VaadinPMMaterialServlet extends VaadinServlet { }