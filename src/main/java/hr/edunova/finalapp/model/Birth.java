 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author Dalibor
 */
@Entity
public class Birth extends Entitet {
    
    @Column(nullable = false)
    public int numberOfNewborns;
    public String description;

    public int getNumberOfNewborns() {
        return numberOfNewborns;
    }

    public void setNumberOfNewborns(int numberOfNewborns) {
        this.numberOfNewborns = numberOfNewborns;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    

    
}
