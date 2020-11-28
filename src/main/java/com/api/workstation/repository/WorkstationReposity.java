package com.api.workstation.repository;


import com.api.workstation.model.WorkstationModel;
import org.springframework.data.mongodb.repository.MongoRepository;

interface WorkstationReposity extends MongoRepository<WorkstationModel, String> {

}
