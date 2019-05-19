package car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rezervor {

  Benzina benzina;

  @Autowired
  public Rezervor(Benzina benzina) {
    this.benzina = benzina;
  }

  public Benzina getBenzina() {
    return benzina;
  }

  @Override
  public String toString() {
    return "Rezervor{" +
            "benzina=" + benzina +
            '}';
  }
}
