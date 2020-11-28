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
public class BookingModel {

    @Id
    private String id;
    private String idUser;
    private String idWorkstation;
    private String idOffice;
    private String bookingDate;
    private String checkInDate;
    private String checkOutDate;
    private Integer sizeHours;
    private StatusEnum statusEnum;
}
