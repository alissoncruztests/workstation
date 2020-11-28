package com.api.workstation.controller;

import com.api.estacao.api.BookingApi;
import com.api.estacao.model.ApiBookingResponseTO;
import com.api.estacao.model.ApiBookingTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.validation.Valid;

@Controller
public class BookingController implements BookingApi {

    @Override
    public ResponseEntity<ApiBookingResponseTO> createBooking(@Valid ApiBookingTO booking) {
        return null;
    }

    @Override
    public ResponseEntity<Void> createCheckin(String id, @Valid ApiBookingTO product) {
        return null;
    }

    @Override
    public ResponseEntity<Void> createCheckout(String id, @Valid ApiBookingTO product) {
        return null;
    }

    @Override
    public ResponseEntity<ApiBookingResponseTO> getBookingsByCodeUser(String codeUser) {
        return null;
    }
}
