package com.manager.app.repository;

import com.manager.app.domain.Expence;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface ExpenceRepository extends CrudRepository<Expence, Long> {

    List<Expence> findAllByuserIdAndExpenceDate(Long userId, Date expenceDate);
}
