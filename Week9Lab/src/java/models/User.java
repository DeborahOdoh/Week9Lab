package models;

import java.io.Serializable;
import java.util.logging.Logger;

public class User implements Serializable{
    private String email; 
    private String firstName; 
    private String lastName; 
    private String password; 
    private Role role; 

    public User() {
    }

    public User(String email, String firstName,String lastName,  String password, Role role) {
        this.email = email;
        this.firstName = firstName;
        this.lastName= lastName;
        this.password = password;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public void setFirstName(String first_name) {
        this.firstName = first_name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setEmail(String email) {
     this.email = email; 
    }
   
    
    
}
