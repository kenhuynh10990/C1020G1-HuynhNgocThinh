package com.example.demo.appconfig;

import com.example.demo.concern.WriteFile;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
    @Bean
    public WriteFile writeFile(){
        return new WriteFile();
    }
}
