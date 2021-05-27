package com.victor.integrations.interswitch.services;

import com.victor.integrations.interswitch.pojo.GetBillerResponse;
import org.springframework.stereotype.Service;

@Service
public interface InterswitchService {

    GetBillerResponse getBillers();
}
