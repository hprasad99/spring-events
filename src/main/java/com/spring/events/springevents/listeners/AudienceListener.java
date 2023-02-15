package com.spring.events.springevents.listeners;

import com.spring.events.springevents.events.BigBangTheoryEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AudienceListener {

    @EventListener
    public void onApplicationEvent(BigBangTheoryEvent event) {
        System.out.println("Audience : Started Watching BBT");
        System.out.println("Audience : Playing episode - " + event.getEpisodeNo());
    }
}
