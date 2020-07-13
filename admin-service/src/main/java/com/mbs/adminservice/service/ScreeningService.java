package com.mbs.adminservice.service;



import com.mbs.adminservice.model.Screening;
import com.mbs.adminservice.model.Seat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ScreeningService {
    List<Screening> getAllScreenings();

    Screening getScreeningById(Long screening_id);

    Screening addScreening(Screening newScreening);

    Screening updateScreening(Screening updatedScreening, Long screening_id);

    List<Seat> getSeatsByScreeningId(Long screening_id);

    List<Screening> getAllScreenings(LocalDateTime startDate, LocalDateTime endDate);
}
