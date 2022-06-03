/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp;

import hr.edunova.finalapp.util.HibernateUtilFirstInsert;
import hr.edunova.finalapp.view.LoadingScreen;


/**
 *
 * @author Dalibor
 */
public class Start {
    
    public static void main(String[] args) {
//        HibernateUtilFirstInsert.putDataIntoDatabase();
        new LoadingScreen().setVisible(true);
        
    }
    
}
