package com.spring.events.springevents.publisher;

import com.spring.events.springevents.events.BigBangTheoryEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ZeeCafePublisher {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;
    public void streamBigBangTheory(String episodeNo) {
        System.out.println("Starting BBT episode :" + episodeNo);
        applicationEventPublisher.publishEvent(new BigBangTheoryEvent(episodeNo));
    }
}
