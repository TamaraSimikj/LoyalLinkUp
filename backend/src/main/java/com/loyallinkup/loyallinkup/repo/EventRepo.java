package com.loyallinkup.loyallinkup.repo;

import com.loyallinkup.loyallinkup.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends JpaRepository<Event, Long> {
}
