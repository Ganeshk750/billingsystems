package com.ganesh.api.service;

import com.ganesh.api.entity.BaseObject;
import com.ganesh.api.repository.AbstractBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Component
public class BillingBaseService<T extends BaseObject, ID extends Serializable> {

    private AbstractBaseRepository<T, ID> repository;

    @Autowired
    public BillingBaseService(AbstractBaseRepository<T, ID> repository) {
        this.repository = repository;
    }

    public BaseObject save(T entity){
       // return (BaseObject)repository.save(entity);
        return  repository.save(entity);
    }

    public List<T> findAll(){
        return repository.findAll();
    }

    public Optional<T> findById(ID id){
        return repository.findById(id);
    }

    public void deleteById(ID id){
        repository.deleteById(id);
    }

    public void delete(T type){
        repository.delete(type);
    }
}
