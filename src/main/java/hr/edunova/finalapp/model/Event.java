/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.model;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Dalibor
 */
@Entity
public class Event extends Entitet{
    
    @Column(
            nullable = false
    )
    private LocalDate date;
    private String description;
    private boolean done; //turn off reminder
     
   @ManyToOne
   private Animal animal;
   
   @ManyToMany
   private List<Activity> activity;
   
   @ManyToOne
   private Vet vet;

    public List<Activity> getActivity() {
        return activity;
    }

    public void setActivity(List<Activity> activity) {
        this.activity = activity;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
   
   
       //one activity can have one Vet
    //Vet can have more activity

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
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
  
  
    
    
}
