package car;

public class Anvelope {

  int presiune;

  public Anvelope(int presiune) {
    this.presiune = presiune;
  }

  public int getPresiune() {
    return presiune;
  }

  public void setPresiune(int presiune) {
    this.presiune = presiune;
  }

  @Override
  public String toString() {
    return "Anvelope{" +
            "presiune=" + presiune +
            '}';
  }
}
