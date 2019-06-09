package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import services.MyService;
import services.MyServiceDependency;

@org.springframework.context.annotation.Configuration
@ComponentScan("services")
public class Configuration {

  @Bean
  public MyServiceDependency myServiceDependency() {
    return new MyServiceDependency("Geo", 31);
  }

  @Bean
  public MyService myService(){
    return new MyService(myServiceDependency());
  }
}
