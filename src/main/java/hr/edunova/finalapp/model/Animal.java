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
public class Animal extends Entitet{
    
    private String name;
    private Date dateOfBirth; //check how to define date of birth
    private String sex;
    private int chipCode;
    private int fatherId; //if exist in table
    private int motherId; //if exist in table
    private boolean active; //animal is death or live

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
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

    public int getChipCode() {
        return chipCode;
    }

    public void setChipCode(int chipCode) {
        this.chipCode = chipCode;
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
