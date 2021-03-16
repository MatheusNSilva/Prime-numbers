package com.svlain.primenumbers.controller;

import java.util.List;
import com.svlain.primenumbers.model.NumericRange;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/prime-numbers")
public class PrimeNumbersController {

    @PostMapping()
    public List<Integer> calculate(@RequestBody NumericRange range) {
        NumericRange numericRange = range;
        return numericRange.rangeList(numericRange.getFirstValue(), numericRange.getLastValue());
    }
}