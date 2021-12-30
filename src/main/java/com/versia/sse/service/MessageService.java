package com.versia.sse.service;

import com.versia.sse.model.Event;

import reactor.core.publisher.Flux;

public interface MessageService {
	Flux<Event> stream();
}
