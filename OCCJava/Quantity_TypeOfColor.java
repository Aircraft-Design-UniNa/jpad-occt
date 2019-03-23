package opencascade;

/**
 *  Identifies color definition systems
 *  -   Quantity_TOC_RGB: with this system a
 *  color is defined by its quantities of red, green and blue (R-G-B values).
 *  -   Quantity_TOC_HLS: with this system a
 *  color is defined by its hue angle and its
 *  lightness and saturation values (H-L-S values).
 *  A Quantity_Color object may define a color
 *  from three values R-G-B or H-L-S according
 *  to a given color definition system.
 */
public enum Quantity_TypeOfColor {
  Quantity_TOC_RGB,
  Quantity_TOC_HLS;

  public final int swigValue() {
    return swigValue;
  }

  public static Quantity_TypeOfColor swigToEnum(int swigValue) {
    Quantity_TypeOfColor[] swigValues = Quantity_TypeOfColor.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (Quantity_TypeOfColor swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + Quantity_TypeOfColor.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private Quantity_TypeOfColor() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private Quantity_TypeOfColor(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private Quantity_TypeOfColor(Quantity_TypeOfColor swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

