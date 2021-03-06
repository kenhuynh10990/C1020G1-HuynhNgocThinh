package cg.wbd.grandemonstration.appconfig;


import cg.wbd.grandemonstration.concern.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class AppConfig {
    @Bean
    public Logger logger() {
        return new Logger();
    }
}
