/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.model;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
/**
 *
 * @author Dalibor
 */

@Entity
public class Animal extends Entitet{
    
    @Column(
            columnDefinition = "VARCHAR(25)",
            nullable = false
    )
    private String name;
    
    @Column(
            nullable = false
    )
    private LocalDate dateOfBirth; //check how to define date of birth
    
    @Column(
            columnDefinition = "VARCHAR(25)",
            nullable = false
    )
    private String sex;
    
    
    private int fatherId; //if exist in table
    private int motherId; //if exist in table
    
    @Column(
            nullable = false
    )
    private boolean active; //animal is death or live

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public AnimalSpecies getAnimalSpecies() {
        return animalSpecies;
    }

    public void setAnimalSpecies(AnimalSpecies animalSpecies) {
        this.animalSpecies = animalSpecies;
    }
   

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



    public int getFatherId() {
        return fatherId;
    }

    public void setFatherId(int fatherId) {
        this.fatherId = fatherId;
    }

    public int getMotherId() {
        return motherId;
    }

    public void setMotherId(int motherId) {
        this.motherId = motherId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    
    //One animal can have one species
    //Species can have more animals
    @ManyToOne
    private AnimalSpecies animalSpecies;
    
    @ManyToOne
    private Birth birth;
}
