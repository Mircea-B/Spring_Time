package car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Masina {
  Motor motor;
  Sasiu sasiu;
  Anvelope anvelope;

  @Autowired
  public Masina(Motor motor, Sasiu sasiu, Anvelope anvelope) {
    this.motor = motor;
    this.sasiu = sasiu;
    this.anvelope = anvelope;
  }

  public Motor getMotor() {
    return motor;
  }

  public Sasiu getSasiu() {
    return sasiu;
  }

  public Anvelope getAnvelope() {
    return anvelope;
  }

  @Override
  public String toString() {
    return "Masina{" +
            "motor=" + motor +
            ", sasiu=" + sasiu +
            ", anvelope=" + anvelope +
            '}';
  }
}
