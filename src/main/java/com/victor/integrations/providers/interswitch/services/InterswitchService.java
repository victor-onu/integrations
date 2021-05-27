package com.victor.integrations.providers.interswitch.services;

import com.victor.integrations.providers.interswitch.pojo.GetBillerResponse;
import org.springframework.stereotype.Service;

@Service
public interface InterswitchService {

    GetBillerResponse getBillers();
}
