package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;

@Component
public class Scheduler {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Scheduled(cron = "1 * * * * *")
    public void cronSch(){
        logger.info(System.currentTimeMillis()+" :: >> Schedul cron Test");
    }
}
