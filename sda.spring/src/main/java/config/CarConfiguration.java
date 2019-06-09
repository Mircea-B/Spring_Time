package config;

import car.Anvelope;
import car.Benzina;
import car.Bujie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan("car")
public class CarConfiguration {

  @Bean
  public Bujie bujie() {
    return new Bujie(true);
  }

  @Bean
  public Benzina benzina() {
    return new Benzina(98);
  }

  @Bean
  public Anvelope anvelope() {
    return new Anvelope(2200);
  }
}
