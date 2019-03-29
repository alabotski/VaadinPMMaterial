package com.example.vaadinpmmaterial;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.material.Material;

@HtmlImport("frontend://styles/vaadinpmmaterial-theme.html")
@Theme(value = Material.class, variant = "dark")
public class VaadinPMMaterialUI extends UI {

}
