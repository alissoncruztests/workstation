package com.api.workstation.model;

import com.api.workstation.model.Enums.TypeUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserModel {

    @Id
    private String id;
    private String part;
    private String description;
    private TypeUser typeUser;
    private String user;
    private DateTime date;

}
