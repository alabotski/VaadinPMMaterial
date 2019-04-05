package com.example.vaadinpmmaterial;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * Login form component.
 */
@Tag("login-form")
@HtmlImport("frontend://styles/shared-styles.html")
@HtmlImport("frontend://templates/login-form.html")
public class LoginForm extends PolymerTemplate<LoginForm.Model> {

  @Id("password")
  private PasswordField _password;
  @Id("login")
  private Button _login;

  public LoginForm() {
    _login.addClickListener(
        (ComponentEventListener<ClickEvent<Button>>) buttonClickEvent -> UI.getCurrent().navigate(HomeView.class));
  }

  public interface Model extends TemplateModel {

    void setError(boolean error);

    String getUserName();

    String getPassword();

    int getFailedAttempts();

    void setFailedAttempts(int failedAttempts);
  }


}
