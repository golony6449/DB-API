package dev.golony.dbapi.db.log;

import com.sun.istack.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface LogRepository extends JpaRepository<Log, Long> {
    List<Log> findAll();
    Log save(Log log);
}
