package opencascade;

/**
 *  This class allows the definition of a colour.
 *  The names of the colours are from the X11 specification.
 *  color object may be used for numerous applicative purposes.
 *  A color is defined by:
 *  -   its respective quantities of red, green and blue (R-G-B values), or
 *  -   its hue angle and its values of lightness and  saturation (H-L-S values).
 *  These two color definition systems are equivalent.
 *  Use this class in conjunction with:
 *  -   the Quantity_TypeOfColor enumeration
 *  which identifies the color definition system you are using,
 *  -   the Quantity_NameOfColor enumeration
 *  which lists numerous predefined colors and
 *  identifies them by their name.
 */
public class Quantity_Color {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Quantity_Color(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Quantity_Color(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Quantity_Color obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Quantity_Color ptr) { Ptr = ptr; }
    public Quantity_Color AsReference () { return Ptr; }
    public Quantity_Color AsCopy () { return Ptr.MakeCopy(); }
    public Quantity_Color Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Quantity_Color(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a colour with the default value of
   *  Colour name : YELLOW
   */
  public Quantity_Color() {
    this(OCCwrapJavaJNI.new_Quantity_Color__SWIG_0(), true);
  }

  /**
   *  Creates the colour <AName>.
   */
  public Quantity_Color(Quantity_NameOfColor AName) {
    this(OCCwrapJavaJNI.new_Quantity_Color__SWIG_1(AName.swigValue()), true);
  }

  /**
   *  Creates a color according to the definition system theType.
   *  Quantity_TOC_RGB:
   *   - theR1 the value of Red   within range [0.0; 1.0]
   *   - theR2 the value of Green within range [0.0; 1.0]
   *   - theR3 the value of Blue  within range [0.0; 1.0]
   * 
   *  Quantity_TOC_HLS:
   *   - theR1 is the Hue (H) angle in degrees within range [0.0; 360.0], 0.0 being Red.
   *     Value -1.0 is a special value reserved for grayscale color (S should be 0.0).
   *   - theR2 is the Lightness  (L) within range [0.0; 1.0]
   *   - theR3 is the Saturation (S) within range [0.0; 1.0]
   */
  public Quantity_Color(double theR1, double theR2, double theR3, Quantity_TypeOfColor theType) {
    this(OCCwrapJavaJNI.new_Quantity_Color__SWIG_2(theR1, theR2, theR3, theType.swigValue()), true);
  }

  /**
   *  Define color from RGB values.
   */
  public Quantity_Color(SWIGTYPE_p_NCollection_Vec3T_float_t theRgb) {
    this(OCCwrapJavaJNI.new_Quantity_Color__SWIG_3(SWIGTYPE_p_NCollection_Vec3T_float_t.getCPtr(theRgb)), true);
  }

  /**
   *  Increases or decreases the contrast by <ADelta>.
   *  <ADelta> is a percentage. Any value greater than zero
   *  will increase the contrast.
   *  The variation is expressed as a percentage of the
   *  current value.
   *  It is a variation of the saturation.
   */
  public void ChangeContrast(double ADelta) {
    OCCwrapJavaJNI.Quantity_Color_ChangeContrast(swigCPtr, this, ADelta);
  }

  /**
   *  Increases or decreases the intensity by <ADelta>.
   *  <ADelta> is a percentage. Any value greater than zero
   *  will increase the intensity.
   *  The variation is expressed as a percentage of the
   *  current value.
   *  It is a variation of the lightness.
   */
  public void ChangeIntensity(double ADelta) {
    OCCwrapJavaJNI.Quantity_Color_ChangeIntensity(swigCPtr, this, ADelta);
  }

  /**
   *  Updates the colour <me> from the definition of the
   *  colour <AName>.
   */
  public void SetValues(Quantity_NameOfColor AName) {
    OCCwrapJavaJNI.Quantity_Color_SetValues__SWIG_0(swigCPtr, this, AName.swigValue());
  }

  /**
   *  Updates a color according to the mode specified by theType.
   *  TOC_RGB:
   *   - theR1 the value of Red   within range [0.0; 1.0]
   *   - theR2 the value of Green within range [0.0; 1.0]
   *   - theR3 the value of Blue  within range [0.0; 1.0]
   * 
   *  TOC_HLS:
   *   - theR1 is the Hue (H) angle in degrees within range [0.0; 360.0], 0.0 being Red.
   *     -1.0 is a special value reserved for grayscale color (S should be 0.0).
   *   - theR2 is the Lightness  (L) within range [0.0; 1.0]
   *   - theR3 is the Saturation (S) within range [0.0; 1.0]
   */
  public void SetValues(double theR1, double theR2, double theR3, Quantity_TypeOfColor theType) {
    OCCwrapJavaJNI.Quantity_Color_SetValues__SWIG_1(swigCPtr, this, theR1, theR2, theR3, theType.swigValue());
  }

  /**
   *  Returns the percentage change of contrast and intensity
   *  between <me> and <AColor>.
   *  <DC> and <DI> are percentages, either positive or negative.
   *  The calculation is with respect to the current value of <me>
   *  If <DC> is positive then <me> is more contrasty.
   *  If <DI> is positive then <me> is more intense.
   */
  public void Delta( Quantity_Color  AColor, double[] DC, double[] DI) {
    OCCwrapJavaJNI.Quantity_Color_Delta(swigCPtr, this, Quantity_Color.getCPtr(AColor), AColor, DC, DI);
  }

  /**
   *  Returns the distance between two colours. It's a
   *  value between 0 and the square root of 3
   *  (the black/white distance)
   */
  public double Distance( Quantity_Color  AColor) {
    return OCCwrapJavaJNI.Quantity_Color_Distance(swigCPtr, this, Quantity_Color.getCPtr(AColor), AColor);
  }

  /**
   *  Returns the square of distance between two colours.
   */
  public double SquareDistance( Quantity_Color  AColor) {
    return OCCwrapJavaJNI.Quantity_Color_SquareDistance(swigCPtr, this, Quantity_Color.getCPtr(AColor), AColor);
  }

  /**
   *  Returns the Blue component (quantity of blue) of the color within range [0.0; 1.0].
   */
  public double Blue() {
    return OCCwrapJavaJNI.Quantity_Color_Blue(swigCPtr, this);
  }

  /**
   *  Returns the Green component (quantity of green) of the color within range [0.0; 1.0].
   */
  public double Green() {
    return OCCwrapJavaJNI.Quantity_Color_Green(swigCPtr, this);
  }

  /**
   *  Returns the Hue component (hue angle) of the color
   *  in degrees within range [0.0; 360.0], 0.0 being Red.
   *  -1.0 is a special value reserved for grayscale color (S should be 0.0)
   */
  public double Hue() {
    return OCCwrapJavaJNI.Quantity_Color_Hue(swigCPtr, this);
  }

  /**
   *  Returns Standard_True if the distance between <me> and
   *  <Other> is greater than Epsilon ().
   */
  public long IsDifferent( Quantity_Color  Other) {
    return OCCwrapJavaJNI.Quantity_Color_IsDifferent(swigCPtr, this, Quantity_Color.getCPtr(Other), Other);
  }

  /**
   *  Returns true if the Other color is
   *  -   different from, or
   *  -   equal to this color.
   *  Two colors are considered to be equal if their
   *  distance is no greater than Epsilon().
   *  These methods are aliases of operator != and operator ==.
   */
  public long IsEqual( Quantity_Color  Other) {
    return OCCwrapJavaJNI.Quantity_Color_IsEqual(swigCPtr, this, Quantity_Color.getCPtr(Other), Other);
  }

  /**
   *  Returns the Light component (value of the lightness) of the color within range [0.0; 1.0].
   */
  public double Light() {
    return OCCwrapJavaJNI.Quantity_Color_Light(swigCPtr, this);
  }

  /**
   *  Returns the name of the color defined by its
   *  quantities of red R, green G and blue B; more
   *  precisely this is the nearest color from the
   *  Quantity_NameOfColor enumeration.
   *  Exceptions
   *  Standard_OutOfRange if R, G or B is less than 0. or greater than 1.
   */
  public Quantity_NameOfColor Name() {
    return Quantity_NameOfColor.swigToEnum(OCCwrapJavaJNI.Quantity_Color_Name__SWIG_0(swigCPtr, this));
  }

  /**
   *  Returns the Red component (quantity of red) of the color within range [0.0; 1.0].
   */
  public double Red() {
    return OCCwrapJavaJNI.Quantity_Color_Red(swigCPtr, this);
  }

  /**
   *  Returns the Saturation component (value of the saturation) of the color within range [0.0; 1.0].
   */
  public double Saturation() {
    return OCCwrapJavaJNI.Quantity_Color_Saturation(swigCPtr, this);
  }

  /**
   *  Returns in theR1, theR2 and theR3 the components of this color according to the color system definition theType.
   *  If theType is Quantity_TOC_RGB:
   *   - theR1 the value of Red   between 0.0 and 1.0
   *   - theR2 the value of Green between 0.0 and 1.0
   *   - theR3 the value of Blue  between 0.0 and 1.0
   *  If theType is Quantity_TOC_HLS:
   *   - theR1 is the Hue (H) angle in degrees within range [0.0; 360.0], 0.0 being Red.
   *     -1.0 is a special value reserved for grayscale color (S should be 0.0).
   *   - theR2 is the Lightness  (L) within range [0.0; 1.0]
   *   - theR3 is the Saturation (S) within range [0.0; 1.0]
   */
  public void Values(double[] theR1, double[] theR2, double[] theR3, Quantity_TypeOfColor theType) {
    OCCwrapJavaJNI.Quantity_Color_Values(swigCPtr, this, theR1, theR2, theR3, theType.swigValue());
  }

  /**
   *  Sets the specified value used to compare <me> and
   *  an other color in IsDifferent and in IsEqual methods.
   *  Warning: The default value is 0.0001
   */
  public static void SetEpsilon(double AnEpsilon) {
    OCCwrapJavaJNI.Quantity_Color_SetEpsilon(AnEpsilon);
  }

  /**
   *  Returns the specified value used to compare <me> and
   *  an other color in IsDifferent and in IsEqual methods.
   */
  public static double Epsilon() {
    return OCCwrapJavaJNI.Quantity_Color_Epsilon();
  }

  /**
   *  Returns the name of the colour for which the RGB components
   *  are nearest to <R>, <G> and <B>.
   */
  public static Quantity_NameOfColor Name(double R, double G, double B) {
    return Quantity_NameOfColor.swigToEnum(OCCwrapJavaJNI.Quantity_Color_Name__SWIG_1(R, G, B));
  }

  /**
   *  Returns the name of the color identified by
   *  AName in the Quantity_NameOfColor enumeration.
   *  For example, the name of the color which
   *  corresponds to Quantity_NOC_BLACK is "BLACK".
   *  Exceptions
   *  Standard_OutOfRange if AName in not known
   *  in the Quantity_NameOfColor enumeration.
   */
  public static String StringName(Quantity_NameOfColor AColor) {
    return OCCwrapJavaJNI.Quantity_Color_StringName(AColor.swigValue());
  }

  /**
   *  Finds color from predefined names.
   *  For example, the name of the color which
   *  corresponds to "BLACK" is Quantity_NOC_BLACK.
   *  Returns false if name is unknown.
   */
  public static long ColorFromName(String theName, int[] theColor) {
    return OCCwrapJavaJNI.Quantity_Color_ColorFromName(theName, theColor);
  }

  /**
   *  Converts HLS components into RGB ones.
   */
  public static void HlsRgb(double H, double L, double S, double[] R, double[] G, double[] B) {
    OCCwrapJavaJNI.Quantity_Color_HlsRgb(H, L, S, R, G, B);
  }

  /**
   *  Converts RGB components into HLS ones.
   */
  public static void RgbHls(double R, double G, double B, double[] H, double[] L, double[] S) {
    OCCwrapJavaJNI.Quantity_Color_RgbHls(R, G, B, H, L, S);
  }

  /**
   *  Convert the Color value to ARGB integer value.
   *  theARGB has Alpha equal to zero, so the output is
   *  formatted as 0x00RRGGBB
   */
  public static void Color2argb( Quantity_Color  theColor, int[] theARGB) {
    OCCwrapJavaJNI.Quantity_Color_Color2argb(Quantity_Color.getCPtr(theColor), theColor, theARGB);
  }

  /**
   *  Convert integer ARGB value to Color. Alpha bits are ignored
   */
  public static void Argb2color(int theARGB, Quantity_Color theColor) {
    OCCwrapJavaJNI.Quantity_Color_Argb2color(theARGB, Quantity_Color.getCPtr(theColor), theColor);
  }

  /**
   *  Internal test
   */
  public static void Test() {
    OCCwrapJavaJNI.Quantity_Color_Test();
  }

}
