/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Dalibor
 */
@Entity
public class User extends Person{
    
//    @Column(
//     columnDefinition = "VARCHAR(25)",
//            nullable = false
//    )
    private String username;
    
//    @Column(
//     columnDefinition = "VARCHAR(25)",
//            nullable = false
//    )
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
