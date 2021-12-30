package com.versia.sse.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.versia.sse.model.Event;
import com.versia.sse.service.MessageService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class SseController {

  @Autowired
  MessageService messageService;

  @GetMapping(path = "/",  produces = MediaType.TEXT_EVENT_STREAM_VALUE)
  public Flux<Event> index() {
    return messageService.stream();
  }

}
