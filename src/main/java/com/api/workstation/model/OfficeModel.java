package com.api.workstation.model;

import com.api.workstation.model.Enums.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OfficeModel {

    @Id
    private String id;
    private String name;
    private String address;
    private StatusEnum statusEnum;
}
