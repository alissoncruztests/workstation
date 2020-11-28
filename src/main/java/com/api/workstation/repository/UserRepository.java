package com.api.workstation.repository;


import com.api.workstation.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

interface UserReposity extends MongoRepository<UserModel, String> {

}
