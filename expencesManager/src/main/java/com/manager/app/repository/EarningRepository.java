package com.manager.app.repository;

import com.manager.app.domain.Earning;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface EarningRepository extends CrudRepository<Earning, Long> {

    List<Earning> findAllByUserIdAndDate(Long userId, Date earningDate);

}
