package com.dgsw.skew.controller;


import com.dgsw.skew.service.SkewService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SkewController {
    @Autowired
    private SkewService skewService;


}
