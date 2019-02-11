package web;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class HelloWorldBean implements Serializable {
    private String message;

    public HelloWorldBean() {
        this.message = "It works!";
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
