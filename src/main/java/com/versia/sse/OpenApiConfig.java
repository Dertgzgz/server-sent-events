package com.versia.sse;

import java.util.Comparator;
import java.util.stream.Collectors;

import org.springdoc.core.customizers.OpenApiCustomiser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
@Configuration
@OpenAPIDefinition(info = @Info(title = "Auth Example API",
                                description = "SSE endpoint:"
                                            + "<ul>"                                                                   
                                            + "</ul>"
                                            + "<br/> ",
                                contact = @Contact(name = "VERSIA",
                                                  email = "informacion@versia.com",
                                                  url = "http://www.versia.com"),
                                version = "v1"),
                   externalDocs = @ExternalDocumentation(description = "GitLab",
                                                         url = "")
)
public class OpenApiConfig {
    
    @Bean
    public OpenApiCustomiser sortTagsAlphabetically() {
        return openApi -> openApi.setTags(openApi.getTags()
                .stream()
                .sorted(Comparator.comparing(tag -> tag.getName()))
                .collect(Collectors.toList()));
    }
}