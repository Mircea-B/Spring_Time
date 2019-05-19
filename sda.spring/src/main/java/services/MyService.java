package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {

  private MyServiceDependency msd;
@Autowired
  public MyService(MyServiceDependency msd) {
    this.msd = msd;
  }

  @Override
  public String toString() {
    return "MyService{" +
            "msd=" + msd +
            '}';
  }

  public MyServiceDependency getMsd() {
    return msd;
  }
}
