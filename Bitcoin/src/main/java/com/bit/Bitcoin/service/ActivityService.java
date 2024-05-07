package com.bit.Bitcoin.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bit.Bitcoin.model.Activity;

@Service
public class ActivityService {
    private final String API_URL = "https://www.boredapi.com/api/activity";

    public Activity getRandomActivity() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL, Activity.class);
    }
}
