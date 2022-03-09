package com.versia.sse.tcpclient;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@MessageEndpoint
public class TcpConsumer {

    @ServiceActivator(inputChannel = "event-channel")
    public void consume(byte[] bytes) {
    	
        log.info("in consume {}",new String(bytes));
    }

}
