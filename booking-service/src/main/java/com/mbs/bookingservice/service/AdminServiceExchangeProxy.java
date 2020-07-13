package com.mbs.bookingservice.service;

import com.mbs.bookingservice.model.BookingDao;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "admin-service")
@RibbonClient(name = "admin-service")
public interface AdminServiceExchangeProxy {

    @PostMapping("/bookings/add")
    public BookingDao requestBooking(@RequestBody BookingDao bookingDao);
}
