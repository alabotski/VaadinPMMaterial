package com.example.vaadinpmmaterial;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.Route;

@Route(value = "home", layout = MainView.class)
@HtmlImport("frontend://bower_components/paper-slider/paper-slider.html")
public class HomeView extends Div {

  public HomeView() {
    add(new Label("Hello world"));
  }
}
