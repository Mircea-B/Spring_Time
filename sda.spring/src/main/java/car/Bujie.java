package car;

public class Bujie {

  Boolean istridium;

  public Bujie(Boolean istridium) {
    this.istridium = istridium;
  }

  public Boolean getIstridium() {
    return istridium;
  }

  public void setIstridium(Boolean istridium) {
    this.istridium = istridium;
  }

  @Override
  public String toString() {
    return "Bujie{" +
            "istridium=" + istridium +
            '}';
  }
}
