package com.example.docker.sampledocker;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ApiController {

    private Logger log = LoggerFactory.getLogger(ApiController.class);

    @GetMapping(value = "/health")
    public String getHealth() {
        log.info("Alive");
        return "alive";
    }


}
