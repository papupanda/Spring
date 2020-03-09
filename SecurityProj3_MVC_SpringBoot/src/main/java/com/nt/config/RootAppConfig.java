package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value= {PersitanceAppConfig.class,SecurityAppConfig.class})
public class RootAppConfig {

}
