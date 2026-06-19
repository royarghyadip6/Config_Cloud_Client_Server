package com.appconfiguration.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "build")
public class BuildInfo {
    private String id;
    private String owner;
    private String name;
    private String version;
}
