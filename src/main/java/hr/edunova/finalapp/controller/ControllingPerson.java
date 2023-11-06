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
public abstract class ControllingPerson<T extends Person>  extends Controlling<T>{

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
        if(nameWrong(entity.getName())){
            throw new AppException("Name can't contain a numbers");
        }
    }
    
     private void controlSurname() throws AppException {
        if(surnameWrong(entity.getSurname())){
            throw new AppException("Surname can't contain a numbers");
        }
    }

    private void controlPhoneNumber() throws AppException {
        if(phoneNumberWrong(entity.getPhoneNumber())){
            throw new AppException("Phone number can't contain a letters");
        }
    }

    private boolean nameWrong(String name) {
        char[] chars = name.toCharArray();
        boolean numberInName = false;
        for(char c : chars){
         if(Character.isDigit(c)){
             numberInName = true; 
         }
        }
         return numberInName;
        
    }

    private boolean surnameWrong(String surname) {
        char[] chars = surname.toCharArray();
        boolean numberInSurame = false;
        for(char c : chars){
         if(Character.isDigit(c)){
             numberInSurame = true; 
         }
        }
         return numberInSurame;
    }

    private boolean phoneNumberWrong(String phoneNumber) {
        String str = phoneNumber;
        boolean result = phoneNumber.matches("[a-zA-Z]+");
        return result;
    }
}
