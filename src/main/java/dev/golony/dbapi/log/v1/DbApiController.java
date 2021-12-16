package dev.golony.dbapi.log.v1;

import dev.golony.dbapi.log.domain.log.Log;
import dev.golony.dbapi.log.domain.log.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.tags.Param;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/log/v1")
public class DbApiController {
    private final LogService logService;

    @GetMapping("/")
    public HashMap<String, String> index(){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("msg", "Success");

        Log log = new Log();

        logService.addLog(log);

        return hashMap;
    }

    @PutMapping("/")
    public Map<String, String> logging(@RequestParam(value = "ip") String ip){
        Map<String, String> data = new HashMap<String, String>();

        Log log = Log.builder()
                        .ip(ip)
                        .build();

        logService.addLog(log);

        return data;
    }
}
