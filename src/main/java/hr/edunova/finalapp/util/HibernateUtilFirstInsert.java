/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.util;
import hr.edunova.finalapp.model.User;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;
/**
 *
 * @author Dalibor
 */
public class HibernateUtilFirstInsert {
    
    public static void putDataIntoDatabase(){
        Session s = HibernateUtil.getSession();
        
        
        User u = new User();
        //u.setId(1L);
        u.setName("Peter");
        u.setSurname("Peterson");
        u.setUsername("peter");
        //u.setPassword("peterson");
        u.setPassword(BCrypt.hashpw("o", BCrypt.gensalt()));
        
        s.save(u);
        
        s.getTransaction().commit();
    }
}
