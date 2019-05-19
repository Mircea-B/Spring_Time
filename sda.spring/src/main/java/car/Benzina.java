package car;

public class Benzina {

  int cifrOctanica;

  public Benzina(int cifrOctanica) {
    this.cifrOctanica = cifrOctanica;
  }

  public int getCifrOctanica() {
    return cifrOctanica;
  }

  public void setCifrOctanica(int cifrOctanica) {
    this.cifrOctanica = cifrOctanica;
  }

  @Override
  public String toString() {
    return "Benzina{" +
            "cifrOctanica=" + cifrOctanica +
            '}';
  }
}
