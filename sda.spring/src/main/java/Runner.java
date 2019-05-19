import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.MyServiceDependency;
import services.config.*;

public class Runner {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);

    MyServiceDependency myServiceDependency = (MyServiceDependency) context.getBean("myServiceDependency");

    System.out.println(myServiceDependency);

  }
}
