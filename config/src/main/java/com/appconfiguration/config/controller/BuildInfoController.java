package com.appconfiguration.config.controller;

import com.appconfiguration.config.BuildInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RefreshScope
public class BuildInfoController {

    @Value("${build.id:default-id}")
    private String buildId;
    @Value("${build.id:default-owner}")
    private String buildOwner;
    @Value("${build.name:default-name}")
    private String buildName;
    @Value("${build.version:default-version}")
    private String buildVersion;

    private final BuildInfo buildInfo;

    /**
     * Configuration will automatically refresh once <a href="http://localhost:8080/actuator/refresh">http://localhost:8080/actuator/refresh</a> is called, no need to restart the application
     * @return
     */
    @GetMapping("/build-info")
    public String getBuildInfo() {
//        return "Build ID: " + buildInfo.getId() + ",Build Owner: " + buildInfo.getOwner() + ", Build Name: " + buildInfo.getName() + ", Build Version: " + buildInfo.getVersion();
        return "Build ID: " + buildId + ",Build Owner: " + buildOwner + ", Build Name: " + buildName + ", Build Version: " + buildVersion;
    }

}
