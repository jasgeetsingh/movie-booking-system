package com.mbs.adminservice.service;

import com.mbs.adminservice.model.Screen;

import java.util.List;

public interface ScreenService {
    List<Screen> getAllScreens();

    Screen getScreenById(Long screen_id);

    Screen addScreen(Screen newScreen);

    Screen updateScreen(Screen updatedScreen, Long screen_id);

    void deleteScreenById(Long screen_id);
}
