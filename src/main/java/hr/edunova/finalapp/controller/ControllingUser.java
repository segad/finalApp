/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.controller;

import hr.edunova.finalapp.model.User;
import hr.edunova.finalapp.util.AppException;
import java.util.List;
import java.util.regex.*;
import javax.persistence.NoResultException;
import org.mindrot.jbcrypt.BCrypt;



/**
 *
 * @author Dalibor
 */
public class ControllingUser extends ControllingPerson<User>{

    @Override
    public List<User> read() {
        return session.createQuery("from User").list();
    }
    
    @Override
    protected void controlDelete() throws AppException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    protected void controlCreate() throws AppException {
        super.controlCreate();
    }
    
     private void controlUsername() throws AppException {
        if(!isValidUsername(entity.getUsername())){
            throw new AppException("Invalid username");
        }
    }
        
    private void controlPassword() throws AppException {
        
       if(!isValidPassword(entity.getPassword())){
            throw new AppException("Invalid password");
        }
    }
    
    public User authorize(String email, String password){
        User user=null;
        try{
            user = (User)session.createQuery("from User u where u.email=:email")
                .setParameter("email", email).getSingleResult();
        }catch(NoResultException e){
            return null;
        }
     
        
        if(user==null){
            return null;
        }
        
        return BCrypt.checkpw(email, user.getPassword())? user : null;
    }

    public static boolean isValidUsername(String name)
    {
  
        // Regex to check valid username.
        String regex = "^[A-Za-z]\\w{5,29}$";
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
  
        // If the username is empty
        // return false
        if (name == null) {
            return false;
        }
  
        // Pattern class contains matcher() method
        // to find matching between given username
        // and regular expression.
        Matcher m = p.matcher(name);
  
        // Return if the username
        // matched the ReGex
        return m.matches();
        
        
        /* A username is considered valid if all the following constraints are satisfied:

        The username consists of 6 to 30 characters inclusive. If the username
        consists of less than 6 or greater than 30 characters, then it is an invalid username.
        The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters [a – z], uppercase characters [A – Z], and digits [0 – 9].
        The first character of the username must be an alphabetic character, i.e., either lowercase character
        [a – z] or uppercase character [A – Z].
        */
    }
    public static boolean isValidPassword(String password){
       String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(password);
       return matcher.matches();
       
       
      /* Here are rules for password:

        Must have at least one numeric character
        Must have at least one lowercase character
        Must have at least one uppercase character
        Must have at least one special symbol among @#$%
        Password length should be between 8 and 20
       */
       
    }
    
        
    
    
}
