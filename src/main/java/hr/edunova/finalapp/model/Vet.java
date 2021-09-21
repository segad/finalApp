/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Dalibor
 */
@Entity
public class Vet extends Entitet {
    private String phoneNumber; /*It is string beacuse phone numbers starts
    with zero or + which is problem if data type is integer
    */

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
}
