/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.opensymphony.xwork2.ActionSupport;
import Model.Login;
import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.util.logging.Logger;
/**
 *
 * @author user
 */
public class LoginAction extends ActionSupport{

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public static void setLOG(Logger LOG) {
        ActionSupport.LOG = LOG;
    }
    private String email;
    private String password;
    private String error;
    private String message;
    private String submit;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String execute() throws Exception {
       
        Login login = new Login();
        if(login.getLoginInfo(email, password)){
            error="You are Successfully logged in!!!!";
            
            return SUCCESS;
        }
        error="Your email and password combination is wrong!";
        return INPUT;
    }

    @Override
     public void validate() {
        if(getEmail().length() == 0){
            addFieldError("Email", "Email cann't be Empty");
        }
        else if(getPassword().length() == 0){
            addFieldError("password", "Password Can't be Empty");
        }
    }
}
