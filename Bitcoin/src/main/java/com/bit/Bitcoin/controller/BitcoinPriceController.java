package com.bit.Bitcoin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bit.Bitcoin.model.BitCointPrice;
import com.bit.Bitcoin.service.BitcoinPriceService;

@RestController
@RequestMapping("/bitcoin")
public class BitcoinPriceController {
    @Autowired
    private BitcoinPriceService bitcoinPriceService;

    @GetMapping("/price")
    public BitCointPrice getBitcoinPrice() {
        return bitcoinPriceService.getBitcoinPrice();
    }
}
