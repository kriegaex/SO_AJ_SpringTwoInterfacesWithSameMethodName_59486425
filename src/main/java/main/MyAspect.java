package main;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
  @Pointcut("execution(public DomainObjectImplementation main.ComponentImplementation.*(..))")
  public void anyPublicOperation() {}

  @AfterReturning(pointcut = "anyPublicOperation()", returning = "aObject")
  public Object get(Object aObject) {
    DomainObjectImplementation returningObject = (DomainObjectImplementation) aObject;
    returningObject.setFieldToModifyThroughAspect(5);
    return returningObject;
  }
}
