package com.mbs.adminservice.service.impl;

import com.mbs.adminservice.model.Screen;
import com.mbs.adminservice.model.Theatre;
import com.mbs.adminservice.repository.ScreenRepository;
import com.mbs.adminservice.service.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class ScreenServiceImpl implements ScreenService {

    @Autowired
    ScreenRepository screenRepository;

    @Override
    public List<Screen> getAllScreens() {
        return null;
    }

    @Override
    public Screen getScreenById(Long screen_id) {
        return null;
    }

    @Override
    public Screen addScreen(Screen screen) {
        screen.getSeats().forEach(seat -> {
            screen.addSeat(seat);
        });
        screenRepository.save(screen);
        return screen;
    }

    @Override
    public Screen updateScreen(Screen updatedScreen, Long theatre_id) {
        return null;
    }

    @Override
    public void deleteScreenById(Long screen_id) {

    }
}
