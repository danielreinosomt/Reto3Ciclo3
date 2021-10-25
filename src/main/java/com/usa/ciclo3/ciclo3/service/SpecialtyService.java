package com.usa.ciclo3.ciclo3.service;

import java.util.List;
import java.util.Optional;

import com.usa.ciclo3.ciclo3.model.Specialty;
import com.usa.ciclo3.ciclo3.repository.SpecialtyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SpecialtyService {

    @Autowired
    private SpecialtyRepository specialtyRepository;

    public List<Specialty> getAll(){
        return specialtyRepository.getAll();
    }
    public Optional<Specialty> getSpecialty(int id){
        return specialtyRepository.getSpecialty(id);
    }
    public Specialty save(Specialty s){

        if(s.getId()==null){
            return specialtyRepository.save(s);
        }else{
            Optional<Specialty> saux=specialtyRepository.getSpecialty(s.getId());
            if(saux.isEmpty()){
                return specialtyRepository.save(s);
            }else{
                return s;
            }
        }
    }
    
}
