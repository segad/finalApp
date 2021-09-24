/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Dalibor
 */
@Entity
public class Event extends Entitet{
    
    private Date date;
    private String description;
        private boolean done; //turn off reminder

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public List<Vet> getVet() {
        return vet;
    }

    public void setVet(List<Vet> vet) {
        this.vet = vet;
    }
    
     //one visit can have one animal
    //animal can have more activity
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
   @ManyToOne
   private Animal animal;
   
   @ManyToOne
   private Activity activity;
   
       //one activity can have one Vet
    //Vet can have more activity
    @ManyToMany
    private List<Vet> vet;
    
    
}
