/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.model;
import javax.persistence.Entity;

/**
 *
 * @author Dalibor
 */
@Entity
public class Activity extends Entitet {
    
    private String name;
    
    
    private boolean repet; /*if is true, you will get reminder
    when daysOfRepeating time expires  */
    private int daysOfRepeating; /*period which last until you 
    need repet activity again*/


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    public boolean isRepet() {
        return repet;
    }

    public void setRepet(boolean repet) {
        this.repet = repet;
    }

    public int getDaysOfRepeating() {
        return daysOfRepeating;
    }

    public void setDaysOfRepeating(int daysOfRepeating) {
        this.daysOfRepeating = daysOfRepeating;
    }


    

    
   
   
}
