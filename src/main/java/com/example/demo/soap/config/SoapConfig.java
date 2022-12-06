package com.example.demo.soap.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class SoapConfig {

    private static final String NAMESPACE ="http://www.soap.demo.example.com/ws";

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext context){
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(context);
        servlet.setTransformSchemaLocations(true);
        return new ServletRegistrationBean<MessageDispatcherServlet>( servlet, "/ws/*" );
    }

    @Bean(name = "taskTracker")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema){
        DefaultWsdl11Definition defaultWsdl11Definition = new DefaultWsdl11Definition();
        defaultWsdl11Definition.setPortTypeName("TaskTrackerPort");
        defaultWsdl11Definition.setLocationUri("/ws");
        defaultWsdl11Definition.setTargetNamespace( NAMESPACE );
        defaultWsdl11Definition.setSchema(schema);
        return  defaultWsdl11Definition;
    }

    @Bean
    public  XsdSchema schema(){
        return new SimpleXsdSchema( new ClassPathResource("xsd/tracker.xsd") );
    }

}
