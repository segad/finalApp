/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.controller;

import hr.edunova.finalapp.model.AnimalSpecies;
import hr.edunova.finalapp.util.AppException;
import java.util.List;

/**
 *
 * @author Dalibor
 */
public class ControllingAnimalSpecies extends Controlling<AnimalSpecies> {

    @Override
    public List<AnimalSpecies> read() {
        return session.createQuery("from AnimalSpecies").list();        
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void controlCreate() throws AppException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void controlUpdate() throws AppException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void controlDelete() throws AppException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
