package com.epitech.screenfleet.tvservice.Repository;

import com.epitech.screenfleet.tvservice.Model.Tv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TvRepository extends JpaRepository<Tv, Long> {
}

