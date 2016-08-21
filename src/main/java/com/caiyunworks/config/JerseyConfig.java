package com.caiyunworks.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Tony Wang on 8/20/16.
 */
@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("com.caiyunworks.endpoint");
    }
}
