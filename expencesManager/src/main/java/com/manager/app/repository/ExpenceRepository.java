package com.manager.app.repository;

import com.manager.app.domain.Expence;
import org.springframework.data.repository.CrudRepository;

public interface ExpenceRepository extends CrudRepository<Expence, Long> {
}
