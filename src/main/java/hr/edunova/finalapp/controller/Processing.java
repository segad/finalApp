/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.finalapp.controller;


import java.util.List;
import org.hibernate.Session;
import hr.edunova.finalapp.util.HibernateUtil;
import hr.edunova.finalapp.util.AppException;

/**
 *
 * @author Dalibor
 */
public abstract class Processing<T> {
    
    protected Session session;
    protected T entity;
    
    public abstract List<T> read();
    protected abstract void controlCreate() throws AppException;
    protected abstract void controlUpdate() throws AppException;
    protected abstract void controlDelete() throws AppException;
    
    public Processing() {
        this.session = HibernateUtil.getSession();
        //this.session.setCacheMode(CacheMode.REFRESH);
    }
    
    public T create() throws AppException{
        controlCreate();
        save();
        return entity;
    }
    public T update() throws AppException{
        controlUpdate();
        save();
        return entity;
    }
    
    public void delete() throws AppException{
        controlDelete();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
    }
    
    private void save(){
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
    }

    public T getEntitet() {
        return entity;
    }

    public void setEntitet(T entitet) {
        this.entity = entitet;
    }
    
}
