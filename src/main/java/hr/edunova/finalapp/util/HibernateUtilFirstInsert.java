/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.util;
import hr.edunova.finalapp.model.User;
import hr.edunova.finalapp.model.Vet;
import hr.edunova.finalapp.model.AnimalSpecies;
import com.github.javafaker.Faker;
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
        
         s.beginTransaction();
        Faker faker = new Faker(); 
         
        User u = new User();
        //u.setId(1L);
        u.setName("Peter");
        u.setSurname("Peterson");
        u.setUsername("peter");
        //u.setPassword("peterson");
        u.setPassword(BCrypt.hashpw("peterson", BCrypt.gensalt()));
        
       
        //List <Vet> vets = new ArrayList<>();
        Vet v;
        AnimalSpecies as;
        for (int i = 0; i < 30; i++) {
            v = new Vet();
            as = new AnimalSpecies();
            v.setName(faker.name().firstName());
            v.setSurname(faker.name().lastName());
            v.setPhoneNumber(faker.phoneNumber().cellPhone());
            s.save(v);
            
            as.setName(faker.animal().name());
            s.save(as);
        }
        
        s.save(u);
        s.getTransaction().commit();
    }
}
