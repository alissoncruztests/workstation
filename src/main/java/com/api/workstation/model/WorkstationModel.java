package com.api.workstation.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkstationModel {

    @Id
    private String id;
    private String nome;
    private String address;
    private String status;
    private Date createdDate;

}
