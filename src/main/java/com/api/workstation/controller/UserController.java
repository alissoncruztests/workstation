package com.api.workstation.controller;

import com.api.estacao.api.UserApi;
import com.api.estacao.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@CrossOrigin("*")
@RestController
public class UserController /*extends BaseController implements UserApi */{



/*
    @Autowired
    private ProcessRepository processRepository;

    @Override
    public ResponseEntity<ApiProcessCodeTO> createProcess(@Valid ApiProcessTO newProcess) {

        ProcessModel saveProcess = ProcessModel.builder()
                .number(newProcess.getNumber())
                .description(newProcess.getDescription())
                .category(newProcess.getCategory())
                .user(newProcess.getUser())
                .part(newProcess.getPart())
                .build();

        processRepository.save(saveProcess);

        return new ResponseEntity<>(CREATED);
    }

    @Override
    public ResponseEntity<ApiResponseProcessTO> getProcess(String number) {
        return null;
    }

    @Override
    public ResponseEntity<ApiResponseProcessTO> getProcessos() {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateProcess(String number, @Valid ApiUpdateProcessTO process) {
        return null;
    }*/
}
