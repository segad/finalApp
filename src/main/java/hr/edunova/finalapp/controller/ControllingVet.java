/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.controller;


import hr.edunova.finalapp.model.Vet;
import hr.edunova.finalapp.util.AppException;
import java.util.List;

/**
 *
 * @author Dalibor
 */
public class ControllingVet extends ControllingPerson<Vet>{

    @Override
    public List<Vet> read() {
        return session.createQuery("from Vet").list();
    }

    @Override
    protected void controlDelete() throws AppException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //place to set exception
    }
    
    @Override
    protected void controlCreate() throws AppException {
        super.controlCreate();
    }
    
}
