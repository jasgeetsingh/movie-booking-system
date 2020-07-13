package com.mbs.adminservice.model.dao;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ScreeningDao {

    Long movieId;
    LocalDate date;

}
