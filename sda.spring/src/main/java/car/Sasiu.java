package car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sasiu {
  Rezervor rezervor;
@Autowired
  public Sasiu(Rezervor rezervor) {
    this.rezervor = rezervor;
  }

  public Rezervor getRezervor() {
    return rezervor;
  }

  @Override
  public String toString() {
    return "Sasiu{" +
            "rezervor=" + rezervor +
            '}';
  }
}
