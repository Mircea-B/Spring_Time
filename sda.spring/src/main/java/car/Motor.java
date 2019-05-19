package car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Motor {

  private Bujie bujie;
@Autowired
  public Motor(Bujie bujie) {
    this.bujie = bujie;
  }

  public Bujie getMybujie() {
    return bujie;
  }

  @Override
  public String toString() {
    return "Motor{" +
            "bujie=" + bujie +
            '}';
  }
}
