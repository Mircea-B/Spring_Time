import car.Masina;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import config.CarConfiguration;

public class CarRunner {
  public static void main(String[] args) {
    ApplicationContext context
            = new AnnotationConfigApplicationContext(CarConfiguration.class);
    Masina masina = (Masina) context.getBean("masina");
    System.out.println(masina);
  }
}
