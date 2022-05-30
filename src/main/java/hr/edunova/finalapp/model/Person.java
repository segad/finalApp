/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Dalibor
 */
@MappedSuperclass
public abstract class Person extends Entitet {
    
//     @Column(
//            columnDefinition = "VARCHAR(25)",
//            nullable = false
//    )
    private String name;
    
//    @Column(
//            columnDefinition = "VARCHAR(25)",
//            nullable = false
//    )
    private String surname;

     @Column(columnDefinition = "VARCHAR(20)")
    private String phoneNumber; /*It is string beacuse phone numbers starts
    with zero or + which is problem if data type is integer
    */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
