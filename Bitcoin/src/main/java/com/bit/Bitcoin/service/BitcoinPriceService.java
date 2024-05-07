package com.bit.Bitcoin.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bit.Bitcoin.model.BitCointPrice;

@Service
public class BitcoinPriceService {
    private final String API_URL = "https://www.boredapi.com/api/activity";

    public BitCointPrice getBitcoinPrice() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            return restTemplate.getForObject(API_URL, BitCointPrice.class);
        } catch (Exception e) {
            // Handle any exceptions (e.g., connection errors, invalid response)
            e.printStackTrace();
            return null;
        }
    }
}
