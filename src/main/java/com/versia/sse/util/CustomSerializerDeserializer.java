package com.versia.sse.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import javax.validation.constraints.NotNull;

import org.springframework.core.serializer.Deserializer;
import org.springframework.core.serializer.Serializer;

import lombok.extern.log4j.Log4j2;

/**
* A custom serializer for incoming and/or outcoming messages.
*/
@Log4j2
public class CustomSerializerDeserializer implements Serializer<byte[]>, Deserializer<byte[]> {

    @NotNull
    @Override
    public byte[] deserialize(InputStream inputStream) throws IOException {
        byte[] message = new byte[0];
        if (inputStream.available() > 0) {
            message = inputStream.readAllBytes();
        }
        log.debug("Deserialized message {}", new String(message, StandardCharsets.UTF_8));
        return message;
    }

    @Override
    public void serialize(@NotNull byte[] message, OutputStream outputStream) throws IOException {
        log.info("Serializing {}", new String(message, StandardCharsets.UTF_8));
        outputStream.write(message);
        outputStream.flush();
    }
}