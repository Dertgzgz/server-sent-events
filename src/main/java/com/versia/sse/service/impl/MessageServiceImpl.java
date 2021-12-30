package com.versia.sse.service.impl;

import java.time.Duration;
import java.time.Instant;

import org.springframework.stereotype.Service;

import com.versia.sse.model.Event;
import com.versia.sse.service.MessageService;
import com.versia.sse.util.EventGenerator;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

  private final EventGenerator eventGenerator;

  public Flux<Event> stream() {
    return Flux.interval(Duration.ofSeconds(1))
      .map(it -> new Event("Bloqueo", eventGenerator.generate(), Instant.now()));
  }

}
