package opencascade;

/**
 *  Description of a global section (corresponds to file header)
 *  used as well in IGESModel, IGESReader and IGESWriter
 *  Warning : From IGES-5.1, a parameter is added : LastChangeDate (concerns
 *  transferred set of data, not the file itself)
 *  Of course, it can be absent if read from earlier versions
 *  (a default is then to be set to current date)
 *  From 5.3, one more : ApplicationProtocol (optional)
 */
public class IGESData_GlobalSection {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IGESData_GlobalSection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IGESData_GlobalSection(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IGESData_GlobalSection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (IGESData_GlobalSection ptr) { Ptr = ptr; }
    public IGESData_GlobalSection AsReference () { return Ptr; }
    public IGESData_GlobalSection AsCopy () { return Ptr.MakeCopy(); }
    public IGESData_GlobalSection Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IGESData_GlobalSection(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an empty GlobalSection, ready to be filled,
   *  Warning : No default value is provided
   */
  public IGESData_GlobalSection() {
    this(OCCwrapJavaJNI.new_IGESData_GlobalSection(), true);
  }

  /**
   *  Copies data referenced by Handle (that is, Strings)
   *  usefull to "isolate" a GlobalSection after copy by "="
   *  (from a Model to another Model for instance)
   */
  public void CopyRefs() {
    OCCwrapJavaJNI.IGESData_GlobalSection_CopyRefs(swigCPtr, this);
  }

  public  TCollection_HAsciiString  TranslatedFromHollerith( TCollection_HAsciiString  astr) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IGESData_GlobalSection_TranslatedFromHollerith(swigCPtr, this,  TCollection_HAsciiString.getCPtr(astr) , astr), true );
  }

  /**
   *  Returns the parameter delimiter character.
   */
  public char Separator() {
    return OCCwrapJavaJNI.IGESData_GlobalSection_Separator(swigCPtr, this);
  }

  /**
   *  Returns the record delimiter character.
   */
  public char EndMark() {
    return OCCwrapJavaJNI.IGESData_GlobalSection_EndMark(swigCPtr, this);
  }

  public  TCollection_HAsciiString  SendName() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IGESData_GlobalSection_SendName(swigCPtr, this), true );
  }

  public  TCollection_HAsciiString  FileName() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IGESData_GlobalSection_FileName(swigCPtr, this), true );
  }

  public  TCollection_HAsciiString  SystemId() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IGESData_GlobalSection_SystemId(swigCPtr, this), true );
  }

  public  TCollection_HAsciiString  InterfaceVersion() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IGESData_GlobalSection_InterfaceVersion(swigCPtr, this), true );
  }

  /**
   *  Returns the number of binary bits for integer representations.
   */
  public int IntegerBits() {
    return OCCwrapJavaJNI.IGESData_GlobalSection_IntegerBits(swigCPtr, this);
  }

  /**
   *  Returns the maximum power of a decimal representation of a
   *  single-precision floating point number in the sending system.
   */
  public int MaxPower10Single() {
    return OCCwrapJavaJNI.IGESData_GlobalSection_MaxPower10Single(swigCPtr, this);
  }

  public int MaxDigitsSingle() {
    return OCCwrapJavaJNI.IGESData_GlobalSection_MaxDigitsSingle(swigCPtr, this);
  }

  /**
   *  Returns the maximum power of a decimal representation of a
   *  double-precision floating point number in the sending system.
   */
  public int MaxPower10Double() {
    return OCCwrapJavaJNI.IGESData_GlobalSection_MaxPower10Double(swigCPtr, this);
  }

  public int MaxDigitsDouble() {
    return OCCwrapJavaJNI.IGESData_GlobalSection_MaxDigitsDouble(swigCPtr, this);
  }

  public  TCollection_HAsciiString  ReceiveName() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IGESData_GlobalSection_ReceiveName(swigCPtr, this), true );
  }

  /**
   *  Returns the scale used in the IGES file.
   */
  public double Scale() {
    return OCCwrapJavaJNI.IGESData_GlobalSection_Scale(swigCPtr, this);
  }

  /**
   *  Returns the unit flag that was used to write the IGES file.
   */
  public int UnitFlag() {
    return OCCwrapJavaJNI.IGESData_GlobalSection_UnitFlag(swigCPtr, this);
  }

  public  TCollection_HAsciiString  UnitName() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IGESData_GlobalSection_UnitName(swigCPtr, this), true );
  }

  /**
   *  Returns the maximum number of line weight gradations.
   */
  public int LineWeightGrad() {
    return OCCwrapJavaJNI.IGESData_GlobalSection_LineWeightGrad(swigCPtr, this);
  }

  /**
   *  Returns the of maximum line weight width in IGES file units.
   */
  public double MaxLineWeight() {
    return OCCwrapJavaJNI.IGESData_GlobalSection_MaxLineWeight(swigCPtr, this);
  }

  public  TCollection_HAsciiString  Date() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IGESData_GlobalSection_Date(swigCPtr, this), true );
  }

  /**
   *  Returns the resolution used in the IGES file.
   */
  public double Resolution() {
    return OCCwrapJavaJNI.IGESData_GlobalSection_Resolution(swigCPtr, this);
  }

  /**
   *  Returns the approximate maximum coordinate value found in the model.
   */
  public double MaxCoord() {
    return OCCwrapJavaJNI.IGESData_GlobalSection_MaxCoord(swigCPtr, this);
  }

  /**
   *  Returns True if the approximate maximum coordinate value found in
   *  the model is greater than 0.
   */
  public long HasMaxCoord() {
    return OCCwrapJavaJNI.IGESData_GlobalSection_HasMaxCoord(swigCPtr, this);
  }

  public  TCollection_HAsciiString  AuthorName() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IGESData_GlobalSection_AuthorName(swigCPtr, this), true );
  }

  public  TCollection_HAsciiString  CompanyName() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IGESData_GlobalSection_CompanyName(swigCPtr, this), true );
  }

  /**
   *  Returns the IGES version that the IGES file was written in.
   */
  public int IGESVersion() {
    return OCCwrapJavaJNI.IGESData_GlobalSection_IGESVersion(swigCPtr, this);
  }

  public int DraftingStandard() {
    return OCCwrapJavaJNI.IGESData_GlobalSection_DraftingStandard(swigCPtr, this);
  }

  public  TCollection_HAsciiString  LastChangeDate() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IGESData_GlobalSection_LastChangeDate(swigCPtr, this), true );
  }

  /**
   *  Returns True if the date and time when the model was created or
   *  last modified are specified, i.e. not defaulted to NULL.
   */
  public long HasLastChangeDate() {
    return OCCwrapJavaJNI.IGESData_GlobalSection_HasLastChangeDate(swigCPtr, this);
  }

  public void SetLastChangeDate() {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetLastChangeDate__SWIG_0(swigCPtr, this);
  }

  public  TCollection_HAsciiString  ApplicationProtocol() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IGESData_GlobalSection_ApplicationProtocol(swigCPtr, this), true );
  }

  public long HasApplicationProtocol() {
    return OCCwrapJavaJNI.IGESData_GlobalSection_HasApplicationProtocol(swigCPtr, this);
  }

  public static  TCollection_HAsciiString  NewDateString(int year, int month, int day, int hour, int minut, int second, int mode) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IGESData_GlobalSection_NewDateString__SWIG_0(year, month, day, hour, minut, second, mode), true );
  }

  public static  TCollection_HAsciiString  NewDateString(int year, int month, int day, int hour, int minut, int second) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IGESData_GlobalSection_NewDateString__SWIG_1(year, month, day, hour, minut, second), true );
  }

  public static  TCollection_HAsciiString  NewDateString( TCollection_HAsciiString  date, int mode) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IGESData_GlobalSection_NewDateString__SWIG_2( TCollection_HAsciiString.getCPtr(date) , date, mode), true );
  }

  public static  TCollection_HAsciiString  NewDateString( TCollection_HAsciiString  date) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IGESData_GlobalSection_NewDateString__SWIG_3( TCollection_HAsciiString.getCPtr(date) , date), true );
  }

  /**
   *  Returns the unit value (in
   *  meters) that the IGES file was written in.
   */
  public double UnitValue() {
    return OCCwrapJavaJNI.IGESData_GlobalSection_UnitValue(swigCPtr, this);
  }

  public void SetSeparator(char val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetSeparator(swigCPtr, this, val);
  }

  public void SetEndMark(char val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetEndMark(swigCPtr, this, val);
  }

  public void SetSendName( TCollection_HAsciiString  val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetSendName(swigCPtr, this,  TCollection_HAsciiString.getCPtr(val) , val);
  }

  public void SetFileName( TCollection_HAsciiString  val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetFileName(swigCPtr, this,  TCollection_HAsciiString.getCPtr(val) , val);
  }

  public void SetSystemId( TCollection_HAsciiString  val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetSystemId(swigCPtr, this,  TCollection_HAsciiString.getCPtr(val) , val);
  }

  public void SetInterfaceVersion( TCollection_HAsciiString  val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetInterfaceVersion(swigCPtr, this,  TCollection_HAsciiString.getCPtr(val) , val);
  }

  public void SetIntegerBits(int val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetIntegerBits(swigCPtr, this, val);
  }

  public void SetMaxPower10Single(int val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetMaxPower10Single(swigCPtr, this, val);
  }

  public void SetMaxDigitsSingle(int val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetMaxDigitsSingle(swigCPtr, this, val);
  }

  public void SetMaxPower10Double(int val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetMaxPower10Double(swigCPtr, this, val);
  }

  public void SetMaxDigitsDouble(int val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetMaxDigitsDouble(swigCPtr, this, val);
  }

  public void SetReceiveName( TCollection_HAsciiString  val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetReceiveName(swigCPtr, this,  TCollection_HAsciiString.getCPtr(val) , val);
  }

  public void SetScale(double val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetScale(swigCPtr, this, val);
  }

  public void SetUnitFlag(int val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetUnitFlag(swigCPtr, this, val);
  }

  public void SetUnitName( TCollection_HAsciiString  val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetUnitName(swigCPtr, this,  TCollection_HAsciiString.getCPtr(val) , val);
  }

  public void SetLineWeightGrad(int val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetLineWeightGrad(swigCPtr, this, val);
  }

  public void SetMaxLineWeight(double val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetMaxLineWeight(swigCPtr, this, val);
  }

  public void SetDate( TCollection_HAsciiString  val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetDate(swigCPtr, this,  TCollection_HAsciiString.getCPtr(val) , val);
  }

  public void SetResolution(double val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetResolution(swigCPtr, this, val);
  }

  public void SetMaxCoord(double val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetMaxCoord__SWIG_0(swigCPtr, this, val);
  }

  public void SetMaxCoord() {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetMaxCoord__SWIG_1(swigCPtr, this);
  }

  public void MaxMaxCoord(double val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_MaxMaxCoord__SWIG_0(swigCPtr, this, val);
  }

  public void MaxMaxCoord() {
    OCCwrapJavaJNI.IGESData_GlobalSection_MaxMaxCoord__SWIG_1(swigCPtr, this);
  }

  public void MaxMaxCoords( gp_XYZ  xyz) {
    OCCwrapJavaJNI.IGESData_GlobalSection_MaxMaxCoords(swigCPtr, this, gp_XYZ.getCPtr(xyz), xyz);
  }

  public void SetAuthorName( TCollection_HAsciiString  val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetAuthorName(swigCPtr, this,  TCollection_HAsciiString.getCPtr(val) , val);
  }

  public void SetCompanyName( TCollection_HAsciiString  val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetCompanyName(swigCPtr, this,  TCollection_HAsciiString.getCPtr(val) , val);
  }

  public void SetIGESVersion(int val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetIGESVersion(swigCPtr, this, val);
  }

  public void SetDraftingStandard(int val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetDraftingStandard(swigCPtr, this, val);
  }

  public void SetLastChangeDate( TCollection_HAsciiString  val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetLastChangeDate__SWIG_1(swigCPtr, this,  TCollection_HAsciiString.getCPtr(val) , val);
  }

  public void SetApplicationProtocol( TCollection_HAsciiString  val) {
    OCCwrapJavaJNI.IGESData_GlobalSection_SetApplicationProtocol(swigCPtr, this,  TCollection_HAsciiString.getCPtr(val) , val);
  }

}
