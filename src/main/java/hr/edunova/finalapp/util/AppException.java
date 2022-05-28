/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.util;

/**
 *
 * @author Dalibor
 */
public class AppException extends Exception {
    
    private String message;

    public AppException(String message) {
        super();
        this.message = message;
    }

    public String getPoruka() {
        return message;
    }
}
