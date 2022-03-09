package com.versia.sse.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.ip.tcp.TcpReceivingChannelAdapter;
import org.springframework.integration.ip.tcp.connection.TcpNetClientConnectionFactory;
import org.springframework.integration.ip.tcp.serializer.AbstractByteArraySerializer;
import org.springframework.integration.ip.tcp.serializer.TcpCodecs;


@Configuration
public class TcpClientConfig {

    @Bean
    public TcpReceivingChannelAdapter tcpReceivingChannelAdapter() {
        TcpReceivingChannelAdapter adapter = new TcpReceivingChannelAdapter();
        adapter.setConnectionFactory(tcpNetClientConnectionFactory());
        adapter.setClientMode(true);
        adapter.setOutputChannelName("event-channel");
        return adapter;
    }

    private TcpNetClientConnectionFactory tcpNetClientConnectionFactory(){
        TcpNetClientConnectionFactory factory =
                new TcpNetClientConnectionFactory("localhost", 6694);
        factory.setDeserializer(codec());
        return factory;
    }
    
    @Bean
    public AbstractByteArraySerializer codec() {
        return TcpCodecs.lf();
    }

}