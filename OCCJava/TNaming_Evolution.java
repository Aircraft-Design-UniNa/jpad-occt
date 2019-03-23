package opencascade;

/**
 *  Defines the type of evolution in old shape - new shape pairs.
 *  The definitions - in the form of the terms of
 *  the enumeration - are needed by the
 *  TNaming_NamedShape attribute and
 *  indicate what entities this attribute records as follows:
 *  -   PRIMITIVE
 *  -   New entities; in each pair, old shape is a
 *  null shape and new shape is a created
 *  entity.
 *  -   GENERATED
 *  -   Entities created from other entities; in
 *  each pair, old shape is the generator and
 *  new shape is the created entity.
 *  -   MODIFY
 *  -   Split or merged entities, in each pair, old
 *  shape is the entity before the operation
 *  and new shape is the new entity after the
 *  operation.
 *  -   DELETE
 *  -   Deletion of entities; in each pair, old
 *  shape is a deleted entity and new shape is null.
 *  -   SELECTED
 *  -   Named topological entities; in each pair,
 *  the new shape is a named entity and the
 *  old shape is not used.
 * 
 *  For a split which generates multiple faces, the
 *  attribute will contain many pairs with the same
 *  old shape; for a merge, it will contain many
 *  pairs with the same new shape.
 *  Finally, an example of delete would be a face
 *  removed by a Boolean operation.
 */
public enum TNaming_Evolution {
  TNaming_PRIMITIVE,
  TNaming_GENERATED,
  TNaming_MODIFY,
  TNaming_DELETE,
  TNaming_REPLACE,
  TNaming_SELECTED;

  public final int swigValue() {
    return swigValue;
  }

  public static TNaming_Evolution swigToEnum(int swigValue) {
    TNaming_Evolution[] swigValues = TNaming_Evolution.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (TNaming_Evolution swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + TNaming_Evolution.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private TNaming_Evolution() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private TNaming_Evolution(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private TNaming_Evolution(TNaming_Evolution swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

