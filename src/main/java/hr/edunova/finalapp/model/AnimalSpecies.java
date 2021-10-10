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
public class AnimalSpecies extends Entitet {
    
    @Column(
            columnDefinition = "VARCHAR(25)",
            nullable = false
    )
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
