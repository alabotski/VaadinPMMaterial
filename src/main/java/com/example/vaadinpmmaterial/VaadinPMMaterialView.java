package com.example.vaadinpmmaterial;

import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.material.Material;

/**
 * entry point for form login based auth.
 */
@Route(value = "", absolute = true)
@Tag("login-view")
@JavaScript("frontend://bower_components/jquery/3.3.1/dist/jquery.min.js")
@HtmlImport("frontend://styles/shared-styles.html")
@HtmlImport("frontend://templates/login-view.html")
@Theme(value = Material.class, variant = Material.DARK)
@BodySize(height = "100vh", width = "100vw")
@Viewport("width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=yes")
public class VaadinPMMaterialView extends PolymerTemplate<TemplateModel> implements HasComponents {

    @Id("login-form")
    private LoginForm _loginForm;

}
