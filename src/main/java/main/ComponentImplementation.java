package main;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplementation implements ComponentInterfaceA<DomainObjectImplementation>, ComponentInterfaceB<DomainObjectImplementation> {
  public DomainObjectImplementation get() {
    return new DomainObjectImplementation();
  }
}
