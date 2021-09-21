/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Dalibor
 */
@Entity
public class Activity extends Entitet {
    
    private String name;
    private String description;
    private Date date;
    private boolean repet; /*if is true, you will get reminder
    when durability time expires  */
    private int durability; /*period which last until you 
    need repet activity again*/
    private boolean done; //turn off reminder

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isRepet() {
        return repet;
    }

    public void setRepet(boolean repet) {
        this.repet = repet;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
    
    //one activity can have one Vet
    //Vet can have more activity
    @ManyToOne
    private Vet vet;
    
    //one activity can have one animal
    //animal can have more activity
   @ManyToOne
   private AnimalBaseData animalBaseData;
   
}
