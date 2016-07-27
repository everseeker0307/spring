package com.everseeker.spring.jersey.config;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

/**
 * Created by everseeker on 16/7/26.
 */
public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig() {
        packages("com.everseeker.spring.jersey.action");
        register(JacksonFeature.class);
        property(ServerProperties.METAINF_SERVICES_LOOKUP_DISABLE, true);
    }
}
