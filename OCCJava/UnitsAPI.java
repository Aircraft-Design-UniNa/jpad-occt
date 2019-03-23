package opencascade;

/**
 *  The UnitsAPI global functions are used to
 *  convert a value from any unit into another unit.
 *  Principles
 *  Conversion is executed among three unit systems:
 *  -   the SI System
 *  -   the user's Local System
 *  -   the user's Current System.
 *  The SI System is the standard international unit
 *  system. It is indicated by SI in the synopses of
 *  the UnitsAPI functions.
 *  The MDTV System corresponds to the SI
 *  international standard but the length unit and all
 *  its derivatives use millimeters instead of the meters.
 *  Both systems are proposed by Open CASCADE;
 *  the SI System is the standard option. By
 *  selecting one of these two systems, the user
 *  defines his Local System through the
 *  SetLocalSystem function. The Local System is
 *  indicated by LS in the synopses of the UnitsAPI functions.
 *  The user's Local System units can be modified in
 *  the working environment. The user defines his
 *  Current System by modifying its units through
 *  the SetCurrentUnit function. The Current
 *  System is indicated by Current in the synopses
 *  of the UnitsAPI functions.
 */
public class UnitsAPI {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  UnitsAPI(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  UnitsAPI(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(UnitsAPI obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_UnitsAPI(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Converts the current unit value to the local system units value.
   *  Example: CurrentToLS(1.,"LENGTH") returns 1000. if the current length unit
   *  is meter and LocalSystem is MDTV.
   */
  public static double CurrentToLS(double aData, String aQuantity) {
    return OCCwrapJavaJNI.UnitsAPI_CurrentToLS(aData, aQuantity);
  }

  /**
   *  Converts the current unit value to the SI system units value.
   *  Example: CurrentToSI(1.,"LENGTH") returns 0.001 if current length unit
   *  is millimeter.
   */
  public static double CurrentToSI(double aData, String aQuantity) {
    return OCCwrapJavaJNI.UnitsAPI_CurrentToSI(aData, aQuantity);
  }

  /**
   *  Converts the local system units value to the current unit value.
   *  Example: CurrentFromLS(1000.,"LENGTH") returns 1. if current length unit
   *  is meter and LocalSystem is MDTV.
   */
  public static double CurrentFromLS(double aData, String aQuantity) {
    return OCCwrapJavaJNI.UnitsAPI_CurrentFromLS(aData, aQuantity);
  }

  /**
   *  Converts the SI system units value to the current unit value.
   *  Example: CurrentFromSI(0.001,"LENGTH") returns 1 if current length unit
   *  is millimeter.
   */
  public static double CurrentFromSI(double aData, String aQuantity) {
    return OCCwrapJavaJNI.UnitsAPI_CurrentFromSI(aData, aQuantity);
  }

  /**
   *  Converts the local unit value to the local system units value.
   *  Example: AnyToLS(1.,"in.") returns 25.4 if the LocalSystem is MDTV.
   */
  public static double AnyToLS(double aData, String aUnit) {
    return OCCwrapJavaJNI.UnitsAPI_AnyToLS__SWIG_0(aData, aUnit);
  }

  /**
   *  Converts the local unit value to the local system units value.
   *  and gives the associated dimension of the unit
   */
  public static double AnyToLS(double aData, String aUnit,  Units_Dimensions  aDim) {
    return OCCwrapJavaJNI.UnitsAPI_AnyToLS__SWIG_1(aData, aUnit,  Units_Dimensions.getCPtr(aDim) , aDim);
  }

  /**
   *  Converts the local unit value to the SI system units value.
   *  Example: AnyToSI(1.,"in.") returns 0.0254
   */
  public static double AnyToSI(double aData, String aUnit) {
    return OCCwrapJavaJNI.UnitsAPI_AnyToSI__SWIG_0(aData, aUnit);
  }

  /**
   *  Converts the local unit value to the SI system units value.
   *  and gives the associated dimension of the unit
   */
  public static double AnyToSI(double aData, String aUnit,  Units_Dimensions  aDim) {
    return OCCwrapJavaJNI.UnitsAPI_AnyToSI__SWIG_1(aData, aUnit,  Units_Dimensions.getCPtr(aDim) , aDim);
  }

  /**
   *  Converts the local system units value to the local unit value.
   *  Example: AnyFromLS(25.4,"in.") returns 1. if the LocalSystem is MDTV.
   *  Note: aUnit is also used to identify the type of physical quantity to convert.
   */
  public static double AnyFromLS(double aData, String aUnit) {
    return OCCwrapJavaJNI.UnitsAPI_AnyFromLS(aData, aUnit);
  }

  /**
   *  Converts the SI system units value to the local unit value.
   *  Example: AnyFromSI(0.0254,"in.") returns 0.001
   *  Note: aUnit is also used to identify the type of physical quantity to convert.
   */
  public static double AnyFromSI(double aData, String aUnit) {
    return OCCwrapJavaJNI.UnitsAPI_AnyFromSI(aData, aUnit);
  }

  /**
   *  Converts the aData value expressed in the
   *  current unit for the working environment, as
   *  defined for the physical quantity aQuantity by the
   *  last call to the SetCurrentUnit function, into the unit aUnit.
   */
  public static double CurrentToAny(double aData, String aQuantity, String aUnit) {
    return OCCwrapJavaJNI.UnitsAPI_CurrentToAny(aData, aQuantity, aUnit);
  }

  /**
   *  Converts the aData value expressed in the unit
   *  aUnit, into the current unit for the working
   *  environment, as defined for the physical quantity
   *  aQuantity by the last call to the SetCurrentUnit function.
   */
  public static double CurrentFromAny(double aData, String aQuantity, String aUnit) {
    return OCCwrapJavaJNI.UnitsAPI_CurrentFromAny(aData, aQuantity, aUnit);
  }

  /**
   *  Converts the local unit value to another local unit value.
   *  Example: AnyToAny(0.0254,"in.","millimeter") returns 1. ;
   */
  public static double AnyToAny(double aData, String aUnit1, String aUnit2) {
    return OCCwrapJavaJNI.UnitsAPI_AnyToAny(aData, aUnit1, aUnit2);
  }

  /**
   *  Converts the local system units value to the SI system unit value.
   *  Example: LSToSI(1.,"LENGTH") returns 0.001 if the local system
   *  length unit is millimeter.
   */
  public static double LSToSI(double aData, String aQuantity) {
    return OCCwrapJavaJNI.UnitsAPI_LSToSI(aData, aQuantity);
  }

  /**
   *  Converts the SI system unit value to the local system units value.
   *  Example: SIToLS(1.,"LENGTH") returns 1000. if the local system
   *  length unit is millimeter.
   */
  public static double SIToLS(double aData, String aQuantity) {
    return OCCwrapJavaJNI.UnitsAPI_SIToLS(aData, aQuantity);
  }

  /**
   *  Sets the local system units.
   *  Example: SetLocalSystem(UnitsAPI_MDTV)
   */
  public static void SetLocalSystem(UnitsAPI_SystemUnits aSystemUnit) {
    OCCwrapJavaJNI.UnitsAPI_SetLocalSystem__SWIG_0(aSystemUnit.swigValue());
  }

  public static void SetLocalSystem() {
    OCCwrapJavaJNI.UnitsAPI_SetLocalSystem__SWIG_1();
  }

  /**
   *  Returns the current local system units.
   */
  public static UnitsAPI_SystemUnits LocalSystem() {
    return UnitsAPI_SystemUnits.swigToEnum(OCCwrapJavaJNI.UnitsAPI_LocalSystem());
  }

  /**
   *  Sets the current unit dimension <aUnit> to the unit quantity <aQuantity>.
   *  Example: SetCurrentUnit("LENGTH","millimeter")
   */
  public static void SetCurrentUnit(String aQuantity, String aUnit) {
    OCCwrapJavaJNI.UnitsAPI_SetCurrentUnit(aQuantity, aUnit);
  }

  /**
   *  Returns the current unit dimension <aUnit> from the unit quantity <aQuantity>.
   */
  public static String CurrentUnit(String aQuantity) {
    return OCCwrapJavaJNI.UnitsAPI_CurrentUnit(aQuantity);
  }

  /**
   *  saves the units in the file .CurrentUnits of the directory pointed by the
   *  CSF_CurrentUnitsUserDefaults environment variable.
   */
  public static void Save() {
    OCCwrapJavaJNI.UnitsAPI_Save();
  }

  public static void Reload() {
    OCCwrapJavaJNI.UnitsAPI_Reload();
  }

  public static  Units_Dimensions  Dimensions(String aQuantity) {
    return new Units_Dimensions ( OCCwrapJavaJNI.UnitsAPI_Dimensions(aQuantity), true );
  }

  public static  Units_Dimensions  DimensionLess() {
    return new Units_Dimensions ( OCCwrapJavaJNI.UnitsAPI_DimensionLess(), true );
  }

  public static  Units_Dimensions  DimensionMass() {
    return new Units_Dimensions ( OCCwrapJavaJNI.UnitsAPI_DimensionMass(), true );
  }

  public static  Units_Dimensions  DimensionLength() {
    return new Units_Dimensions ( OCCwrapJavaJNI.UnitsAPI_DimensionLength(), true );
  }

  public static  Units_Dimensions  DimensionTime() {
    return new Units_Dimensions ( OCCwrapJavaJNI.UnitsAPI_DimensionTime(), true );
  }

  public static  Units_Dimensions  DimensionElectricCurrent() {
    return new Units_Dimensions ( OCCwrapJavaJNI.UnitsAPI_DimensionElectricCurrent(), true );
  }

  public static  Units_Dimensions  DimensionThermodynamicTemperature() {
    return new Units_Dimensions ( OCCwrapJavaJNI.UnitsAPI_DimensionThermodynamicTemperature(), true );
  }

  public static  Units_Dimensions  DimensionAmountOfSubstance() {
    return new Units_Dimensions ( OCCwrapJavaJNI.UnitsAPI_DimensionAmountOfSubstance(), true );
  }

  public static  Units_Dimensions  DimensionLuminousIntensity() {
    return new Units_Dimensions ( OCCwrapJavaJNI.UnitsAPI_DimensionLuminousIntensity(), true );
  }

  public static  Units_Dimensions  DimensionPlaneAngle() {
    return new Units_Dimensions ( OCCwrapJavaJNI.UnitsAPI_DimensionPlaneAngle(), true );
  }

  public static  Units_Dimensions  DimensionSolidAngle() {
    return new Units_Dimensions ( OCCwrapJavaJNI.UnitsAPI_DimensionSolidAngle(), true );
  }

  /**
   *  Checks the coherence between the quantity <aQuantity>
   *  and the unit <aUnits> in the current system and
   *  returns FALSE when it's WRONG.
   */
  public static long Check(String aQuantity, String aUnit) {
    return OCCwrapJavaJNI.UnitsAPI_Check(aQuantity, aUnit);
  }

  public UnitsAPI() {
    this(OCCwrapJavaJNI.new_UnitsAPI(), true);
  }

}
