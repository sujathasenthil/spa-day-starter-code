package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    @NotBlank(message="Username can't be empty!")
    @Size(min = 5, max=15, message="UserName length should be between 5 and 15")
    private String username;
    @Email(message="Give Valid Email address!")
    private String email;
    @NotBlank(message="Password can't be empty")
    @Size(min=6, message="Password should contain minimum 6 characters long!")
    private String password;
    @NotNull(message="Password do not match")
    private String verifyPassword;
    public User() {

    }

    public User(String username, String email, String password, String verifyPassword) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verifyPassword=verifyPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        checkPassword();
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        checkPassword();
    }
    private void checkPassword(){
        if((this.password != null) && (this.verifyPassword != null) && ( (this.password).toLowerCase().equals((this.verifyPassword).toLowerCase()) ))
            this.verifyPassword = null;
    }
}



    //    private String username;
//    private String password;
//    private String email;
//    public User(String username, String password,String email) {
//        this.username = username;
//        this.email = email;
//        this.password = password;
//    }
//    public User(){
//
//    }
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//}
