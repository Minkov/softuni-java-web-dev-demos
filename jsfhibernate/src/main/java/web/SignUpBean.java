package web;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import java.util.Date;

@Named
@RequestScoped
public class SignUpBean {
    private String username;
    private Date currentDate;
    private String messageFormat;

    public SignUpBean() {
        currentDate = new Date();
        messageFormat = "Item 1: {0}";
    }

    public void signUp() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public String getMessageFormat() {
        return messageFormat;
    }

    public void setMessageFormat(String messageFormat) {
        this.messageFormat = messageFormat;
    }
}
