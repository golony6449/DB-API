package dev.golony.dbapi.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbApiCommonController {
    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }
}
