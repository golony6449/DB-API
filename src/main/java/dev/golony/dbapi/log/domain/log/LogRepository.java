package dev.golony.dbapi.log.domain.log;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LogRepository extends JpaRepository<Log, Long> {
    List<Log> findAll();
    Log save(Log log);
}
