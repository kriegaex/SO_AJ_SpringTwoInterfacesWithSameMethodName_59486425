package main;

public class DomainObjectImplementation implements DomainObjectInterfaceA, DomainObjectInterfaceB {
  private int fieldToModifyThroughAspect = 0;

  public int getFieldToModifyThroughAspect() {
    return fieldToModifyThroughAspect;
  }

  public void setFieldToModifyThroughAspect(int aFieldToModify) {
    fieldToModifyThroughAspect = aFieldToModify;
  }
}
