package opencascade;

/**
 *  This class includes all  the methods to create and
 *  manipulate    the   dimensions  of the    physical
 *  quantities.
 */
public class Units_Dimensions extends Standard_Transient {
  Units_Dimensions(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns  a  Dimensions  object  which  represents  the
   *  dimension  of  a  physical  quantity.    Each  of  the
   *  <amass>,  <alength>,   <atime>,   <anelectriccurrent>,
   *  <athermodynamictemperature>,    <anamountofsubstance>,
   *  <aluminousintensity>, <aplaneangle>, <asolidangle> are
   *  the powers for  the 7  fundamental  units of  physical
   *  quantity and  the 2  secondary  fundamental  units  of
   *  physical quantity.
   */
  public Units_Dimensions(double amass, double alength, double atime, double anelectriccurrent, double athermodynamictemperature, double anamountofsubstance, double aluminousintensity, double aplaneangle, double asolidangle) {
    this(OCCwrapJavaJNI.new_Units_Dimensions(amass, alength, atime, anelectriccurrent, athermodynamictemperature, anamountofsubstance, aluminousintensity, aplaneangle, asolidangle), true);
  }

  /**
   *  Returns the power of mass stored in the dimensions.
   */
  public double Mass() {
    return OCCwrapJavaJNI.Units_Dimensions_Mass(swigCPtr, this);
  }

  /**
   *  Returns the power of length stored in the dimensions.
   */
  public double Length() {
    return OCCwrapJavaJNI.Units_Dimensions_Length(swigCPtr, this);
  }

  /**
   *  Returns the power of time stored in the dimensions.
   */
  public double Time() {
    return OCCwrapJavaJNI.Units_Dimensions_Time(swigCPtr, this);
  }

  /**
   *  Returns the  power of  electrical  intensity (current)
   *  stored in the dimensions.
   */
  public double ElectricCurrent() {
    return OCCwrapJavaJNI.Units_Dimensions_ElectricCurrent(swigCPtr, this);
  }

  /**
   *  Returns  the  power  of   temperature stored  in   the
   *  dimensions.
   */
  public double ThermodynamicTemperature() {
    return OCCwrapJavaJNI.Units_Dimensions_ThermodynamicTemperature(swigCPtr, this);
  }

  /**
   *  Returns  the power   of quantity   of  material (mole)
   *  stored in the dimensions.
   */
  public double AmountOfSubstance() {
    return OCCwrapJavaJNI.Units_Dimensions_AmountOfSubstance(swigCPtr, this);
  }

  /**
   *  Returns the  power of light   intensity stored  in the
   *  dimensions.
   */
  public double LuminousIntensity() {
    return OCCwrapJavaJNI.Units_Dimensions_LuminousIntensity(swigCPtr, this);
  }

  /**
   *  Returns  the power   of plane   angle  stored  in  the
   *  dimensions.
   */
  public double PlaneAngle() {
    return OCCwrapJavaJNI.Units_Dimensions_PlaneAngle(swigCPtr, this);
  }

  /**
   *  Returns the   power   of  solid angle stored   in  the
   *  dimensions.
   */
  public double SolidAngle() {
    return OCCwrapJavaJNI.Units_Dimensions_SolidAngle(swigCPtr, this);
  }

  /**
   *  Returns the quantity string of the dimension
   */
  public String Quantity() {
    return OCCwrapJavaJNI.Units_Dimensions_Quantity(swigCPtr, this);
  }

  public  Units_Dimensions  Multiply( Units_Dimensions  adimensions) {
    return new Units_Dimensions ( OCCwrapJavaJNI.Units_Dimensions_Multiply(swigCPtr, this,  Units_Dimensions.getCPtr(adimensions) , adimensions), true );
  }

  public  Units_Dimensions  Divide( Units_Dimensions  adimensions) {
    return new Units_Dimensions ( OCCwrapJavaJNI.Units_Dimensions_Divide(swigCPtr, this,  Units_Dimensions.getCPtr(adimensions) , adimensions), true );
  }

  public  Units_Dimensions  Power(double anexponent) {
    return new Units_Dimensions ( OCCwrapJavaJNI.Units_Dimensions_Power(swigCPtr, this, anexponent), true );
  }

  /**
   *  Returns true if  <me>  and <adimensions> have the same
   *  dimensions, false otherwise.
   */
  public long IsEqual( Units_Dimensions  adimensions) {
    return OCCwrapJavaJNI.Units_Dimensions_IsEqual(swigCPtr, this,  Units_Dimensions.getCPtr(adimensions) , adimensions);
  }

  /**
   *  Returns false if <me> and  <adimensions> have the same
   *  dimensions, true otherwise.
   */
  public long IsNotEqual( Units_Dimensions  adimensions) {
    return OCCwrapJavaJNI.Units_Dimensions_IsNotEqual(swigCPtr, this,  Units_Dimensions.getCPtr(adimensions) , adimensions);
  }

  /**
   *  Useful for degugging.
   */
  public void Dump(int ashift) {
    OCCwrapJavaJNI.Units_Dimensions_Dump(swigCPtr, this, ashift);
  }

  public static  Units_Dimensions  ALess() {
    return new Units_Dimensions ( OCCwrapJavaJNI.Units_Dimensions_ALess(), true );
  }

  public static  Units_Dimensions  AMass() {
    return new Units_Dimensions ( OCCwrapJavaJNI.Units_Dimensions_AMass(), true );
  }

  public static  Units_Dimensions  ALength() {
    return new Units_Dimensions ( OCCwrapJavaJNI.Units_Dimensions_ALength(), true );
  }

  public static  Units_Dimensions  ATime() {
    return new Units_Dimensions ( OCCwrapJavaJNI.Units_Dimensions_ATime(), true );
  }

  public static  Units_Dimensions  AElectricCurrent() {
    return new Units_Dimensions ( OCCwrapJavaJNI.Units_Dimensions_AElectricCurrent(), true );
  }

  public static  Units_Dimensions  AThermodynamicTemperature() {
    return new Units_Dimensions ( OCCwrapJavaJNI.Units_Dimensions_AThermodynamicTemperature(), true );
  }

  public static  Units_Dimensions  AAmountOfSubstance() {
    return new Units_Dimensions ( OCCwrapJavaJNI.Units_Dimensions_AAmountOfSubstance(), true );
  }

  public static  Units_Dimensions  ALuminousIntensity() {
    return new Units_Dimensions ( OCCwrapJavaJNI.Units_Dimensions_ALuminousIntensity(), true );
  }

  public static  Units_Dimensions  APlaneAngle() {
    return new Units_Dimensions ( OCCwrapJavaJNI.Units_Dimensions_APlaneAngle(), true );
  }

  public static  Units_Dimensions  ASolidAngle() {
    return new Units_Dimensions ( OCCwrapJavaJNI.Units_Dimensions_ASolidAngle(), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Units_Dimensions_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Units_Dimensions_get_type_descriptor(), true );
  }

  public static  Units_Dimensions  DownCast( Standard_Transient  T) {
    return new Units_Dimensions ( OCCwrapJavaJNI.Units_Dimensions_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Units_Dimensions_TypeOf(), true );
  }

}
