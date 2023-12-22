package com.poja.bigsum.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class BigSumController {
    @GetMapping("/big-sum")
    public BigInteger getBigSum(@RequestParam("a") String a, @RequestParam("b") String b){
        BigInteger sum;
        BigInteger firstNumber = new BigInteger(a);
        BigInteger secondNumber = new BigInteger(b);
        sum = firstNumber.add(secondNumber);
        return sum;
    }
}
