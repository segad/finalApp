/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.util;

import hr.edunova.finalapp.model.User;

/**
 *
 * @author Dalibor
 */
public class ApplicationInfo {
    
    public static final String APP_TITLE = "Animal assistant";
    
    public static User user;
    
    public static String getNaslov(String window_title){
        if(ApplicationInfo.user==null){
            return ApplicationInfo.APP_TITLE;
        }
        return ApplicationInfo.APP_TITLE + " " + window_title +": " + ApplicationInfo.user.getName() + " " + ApplicationInfo.user.getSurname();
    }
    
}
