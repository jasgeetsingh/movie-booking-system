package com.mbs.adminservice.repository;

import com.mbs.adminservice.model.Screening;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public interface ScreeningRepository extends JpaRepository<Screening, Serializable> {


}
