package com.victor.integrations.interswitch.controller;

import com.victor.integrations.interswitch.pojo.GetBillerResponse;
import com.victor.integrations.interswitch.services.InterswitchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/interswitch")
public class InterswitchController {

    private final InterswitchService interswitchService;

    public InterswitchController(InterswitchService interswitchService) {
        this.interswitchService = interswitchService;
    }

    @GetMapping("/getBillers")
    public GetBillerResponse getAllBillers(){
        return interswitchService.getBillers();
    }

}
