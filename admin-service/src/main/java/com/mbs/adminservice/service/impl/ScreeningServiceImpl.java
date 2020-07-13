package com.mbs.adminservice.service.impl;


import com.mbs.adminservice.exception.ScreeningNotFoundException;
import com.mbs.adminservice.model.Screening;
import com.mbs.adminservice.model.Seat;
import com.mbs.adminservice.repository.ScreeningRepository;
import com.mbs.adminservice.service.ScreeningService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Primary
public class ScreeningServiceImpl implements ScreeningService {

    @Autowired
    ScreeningRepository screeningRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(ScreeningServiceImpl.class);

    @Override
    public List<Screening> getAllScreenings() {
        return screeningRepository.findAll();
    }

    @Override
    public List<Screening> getAllScreenings(LocalDateTime startDate, LocalDateTime endDate) {
        return screeningRepository.findAll().stream().filter(screening -> screening.getDate().isAfter(startDate) && screening.getDate().isBefore(endDate)).collect(Collectors.toList());
    }

    @Override
    public Screening getScreeningById(Long screening_id) {
        return screeningRepository.findById(screening_id).orElseThrow(ScreeningNotFoundException:: new);
    }

    @Override
    public Screening addScreening(Screening newScreening) {
        LOGGER.debug("movie from screen " + newScreening.getMovie());
        return screeningRepository.save(newScreening);
    }

    @Override
    public Screening updateScreening(Screening updatedScreening, Long screening_id) {
        return null;
    }

    @Override
    public List<Seat> getSeatsByScreeningId(Long screening_id) {
        Screening screening = getScreeningById(screening_id);
        if (screening.getFull()) {
            return new ArrayList();
        }
        return new ArrayList(screening.getScreen().getSeats());
    }
}
