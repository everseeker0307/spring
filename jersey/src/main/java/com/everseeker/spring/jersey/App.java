package com.everseeker.spring.jersey;

import com.everseeker.spring.jersey.config.ApplicationConfig;
import com.everseeker.spring.jersey.config.RootConfig;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;

/**
 * Created by everseeker on 16/7/26.
 */
public class App {

    public static void main(String[] args) throws Exception {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        ServletHolder holder = new ServletHolder(new ServletContainer(applicationConfig));
        ServletContextHandler handler = new ServletContextHandler();
        handler.setContextPath("/");
        handler.addServlet(holder, "/*");
        handler.setInitParameter("contextConfigLocation", RootConfig.class.getName());

        int port = 8080;
        Server server = new Server(port);
        server.setHandler(handler);
        server.start();
        server.join();
    }
}
