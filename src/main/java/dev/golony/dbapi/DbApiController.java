package dev.golony.dbapi;

import dev.golony.dbapi.db.log.Log;
import dev.golony.dbapi.db.log.LogRepository;
import dev.golony.dbapi.db.log.LogService;
import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RequiredArgsConstructor
@RestController
public class DbApiController {
    private final LogService logService;

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }

    @GetMapping("/")
    public HashMap<String, String> index(){
        RedisClient redisClient = RedisClient.create("redis://localhost:6379/0");
        StatefulRedisConnection<String, String> connection = redisClient.connect();
        RedisCommands<String, String> syncCommands = connection.sync();

        syncCommands.set("key", "Hello redis");

        System.out.println("get: " + syncCommands.get("key"));;

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("msg", "Success");
        hashMap.put("redis", syncCommands.get("key"));

        connection.close();
        redisClient.shutdown();

        Log log = new Log();

        logService.addLog(log);

        return hashMap;
    }
}
