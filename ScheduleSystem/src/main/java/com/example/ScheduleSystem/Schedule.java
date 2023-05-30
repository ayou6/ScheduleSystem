package com.example.ScheduleSystem;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled (cron ="0 30 16 * 7,8 0-4")



    public void ScheduleTest(){
        System.out.println("Wassup!!");

    }
}
