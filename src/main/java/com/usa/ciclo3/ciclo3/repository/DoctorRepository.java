package com.usa.ciclo3.ciclo3.repository;

import java.util.List;
import java.util.Optional;

import com.usa.ciclo3.ciclo3.model.Doctor;
import com.usa.ciclo3.ciclo3.repository.crud.DoctorCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class DoctorRepository {

    @Autowired
        private DoctorCrudRepository doctorCrudRepository;
        public List<Doctor> getAll(){
            return (List<Doctor>)doctorCrudRepository.findAll();
        }
        public Optional<Doctor> getDoctor(int id){
            return doctorCrudRepository.findById(id);
        } 

        public Doctor save(Doctor d){
            return doctorCrudRepository.save(d);
        }
        public void delete(Doctor doctor){
            doctorCrudRepository.delete(doctor);

        }
    
}
