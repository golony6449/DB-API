package dev.golony.dbapi.db.log;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class LogService {
    private final LogRepository logRepository;

    @Transactional
    public Log addLog(Log log){
        log = new Log();
        return logRepository.save(log);
    }
}
