package com.example.ScheduleSystem;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled (cron ="0 0 18 * * 0,1,2,3,4,5,6")

    public void ScheduleTest(){
        System.out.println("Wassup!!");

    }
}
