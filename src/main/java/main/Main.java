package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    ComponentImplementation bean = context.getBean(ComponentImplementation.class);
    DomainObjectImplementation domainObject = bean.get();
    System.err.println("Aspect modified get method = " + (domainObject.getFieldToModifyThroughAspect() == 5));
  }
}
