/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author Dalibor
 */
@Entity
public class Nativity extends Entitet {
    public int numberOfNewborns;
    
    @ManyToMany
    private List<Vet> vets;
    
}
