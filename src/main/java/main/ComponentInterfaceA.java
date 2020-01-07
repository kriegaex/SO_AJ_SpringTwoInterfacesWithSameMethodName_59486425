package main;

public interface ComponentInterfaceA<T extends DomainObjectInterfaceA> {
  T get();
}
