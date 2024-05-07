package com.bit.Bitcoin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bit.Bitcoin.model.Activity;
import com.bit.Bitcoin.service.ActivityService;

@RestController
@RequestMapping("/activity")
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    @GetMapping("/random")
    public Activity getRandomActivity() {
        return activityService.getRandomActivity();
    }
}

