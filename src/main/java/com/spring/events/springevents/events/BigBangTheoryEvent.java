package com.spring.events.springevents.events;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BigBangTheoryEvent {
    private String episodeNo;

    public BigBangTheoryEvent(String episodeNo) {
        this.episodeNo = episodeNo;
    }
}
