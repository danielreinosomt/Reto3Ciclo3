package com.usa.ciclo3.ciclo3.service;

import java.util.List;
import java.util.Optional;

import com.usa.ciclo3.ciclo3.model.Doctor;
import com.usa.ciclo3.ciclo3.repository.DoctorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAll(){
        return doctorRepository.getAll();
    }

    public Optional<Doctor> getDoctor(int id){
        return doctorRepository.getDoctor(id);
    }

    public Doctor save(Doctor d){
        if(d.getId()==null){
            return doctorRepository.save(d);
        }else{
            Optional<Doctor> daux=doctorRepository.getDoctor(d.getId());
            if(daux.isEmpty()){
                return doctorRepository.save(d);
            }else{
                return d;
            }
        }
    }
    
}
