package main;

public interface ComponentInterfaceB<T extends DomainObjectInterfaceB> {
  T get();
}
