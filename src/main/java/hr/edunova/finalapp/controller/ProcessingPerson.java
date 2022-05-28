/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.controller;

import hr.edunova.finalapp.model.Person;
import hr.edunova.finalapp.util.AppException;

/**
 *
 * @author Dalibor
 */
public abstract class ProcessingPerson<T extends Person>  extends Processing<T>{

    @Override
    protected void controlCreate() throws AppException {
        controlName();
        controlSurname();
        controlPhoneNumber();
    }
    
    @Override
    protected void controlUpdate() throws AppException {
        controlName();
        controlSurname();
        controlPhoneNumber();
    }
     
    private void controlName() throws AppException {
        if(!nameWrong(entity.getName())){
            throw new AppException("Name wrong");
        }
    }
    
     private void controlSurname() throws AppException {
        if(!surnameWrong(entity.getSurname())){
            throw new AppException("Surname wrong");
        }
    }

    private void controlPhoneNumber() throws AppException {
        if(!phoneNumberWrong(entity.getPhoneNumber())){
            throw new AppException("Phone number wrong");
        }
    }

    private boolean nameWrong(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean surnameWrong(String surname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean phoneNumberWrong(String phoneNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
