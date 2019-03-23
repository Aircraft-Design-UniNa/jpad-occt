package opencascade;

/**
 *  Lets you choose the manner in which you want to analyze an
 *  IGES or STEP file. Your analysis can be either message-oriented or
 *  entity-oriented. The specific values are as follows:
 *  - ItemsByEntity is a sequential list of all
 *  messages per entity of the defined type
 *  - CountByItem is the number of entities of the defined
 *  type, with their rank number per message
 *  - ShortByItem is the number of entities of the defined
 *  type, with their types per message; displays the rank
 *  numbers of the first five entities of the defined type
 *  per message
 *  - ListByItem is the number of entities of the defined type
 *  per message and the numbers of the entities
 *  - EntitiesByItem is the number of entities of the
 *  defined type, with their types, rank numbers and
 *  Directory Entry numbers per message
 *  - GeneralInfo is general information on transfer such as:
 *  -      number of entities
 *  -      number of roots
 *  -      number of resulting Open CASCADE shapes
 *  -      number of warnings and failures
 *  -      CountSummary summary statistics for counters and signatures
 *  -      ResultCount information that contains the number of
 *  roots in the IGES file and the number of resulting Open CASCADE shapes.
 *  -       Mapping of the IGES root entities to the resulting Open
 *  CASCADE shape (including type and form of the IGES entity
 *  and type of the resulting shape).
 */
public enum IFSelect_PrintCount {
  IFSelect_ItemsByEntity,
  IFSelect_CountByItem,
  IFSelect_ShortByItem,
  IFSelect_ListByItem,
  IFSelect_EntitiesByItem,
  IFSelect_CountSummary,
  IFSelect_GeneralInfo,
  IFSelect_Mapping,
  IFSelect_ResultCount;

  public final int swigValue() {
    return swigValue;
  }

  public static IFSelect_PrintCount swigToEnum(int swigValue) {
    IFSelect_PrintCount[] swigValues = IFSelect_PrintCount.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (IFSelect_PrintCount swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + IFSelect_PrintCount.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private IFSelect_PrintCount() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private IFSelect_PrintCount(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private IFSelect_PrintCount(IFSelect_PrintCount swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

