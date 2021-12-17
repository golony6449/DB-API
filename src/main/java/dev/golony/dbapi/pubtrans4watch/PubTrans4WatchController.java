package dev.golony.dbapi.pubtrans4watch;

import dev.golony.dbapi.pubtrans4watch.subwayinfo.dto.SubwayLineInfoResponseDto;
import dev.golony.dbapi.pubtrans4watch.subwayinfo.v1.dto.SubwayLineInfoDto;
import dev.golony.dbapi.pubtrans4watch.subwayinfo.v1.service.SubwayLineInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/pubtrans4watch")
public class PubTrans4WatchController {
    @Autowired
    SubwayLineInfoService subwayLineInfoService;

    @GetMapping("/arrivalInfo/cache/{stationName}")
    public Map<String, String> getArrivalInfo(@PathVariable String stationName){
        Map<String, String> data = new HashMap<>();
        data.put("stationName", stationName);

        return data;
    }

    @PutMapping("/arrival-info/cache")
    public Map<String, String> putArrivalInfo(){
        Map<String, String> data = new HashMap<>();

//        RedisClient redisClient = RedisClient.create("redis://localhost:6379/0");
//        StatefulRedisConnection<String, String> connection = redisClient.connect();
//        RedisCommands<String, String> syncCommands = connection.sync();
//
//        syncCommands.set("key", "Hello redis");
//
//        System.out.println("get: " + syncCommands.get("key"));;
//
//        HashMap<String, String> hashMap = new HashMap<>();
//        hashMap.put("msg", "Success");
//        hashMap.put("redis", syncCommands.get("key"));
//
//        connection.close();
//        redisClient.shutdown();

        return data;
    }

    @GetMapping("/subway-line-info")
    public SubwayLineInfoResponseDto getAllSubwayLineInfo(){
        SubwayLineInfoResponseDto dto = new SubwayLineInfoResponseDto();

        dto.setSubwayLineInfoDto(subwayLineInfoService.getAllSubwayLineInfo());

        return dto;
    }
}
