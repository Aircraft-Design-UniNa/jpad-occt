package opencascade;

/**
 *  This class describes the organized set of points used in the
 *  approximations. A MultiLine is composed of n
 *  MultiPointConstraints.
 *  The approximation of the MultiLine will be done in the order
 *  of the given n MultiPointConstraints.
 * 
 *  Example of a MultiLine composed of MultiPointConstraints:
 * 
 *  P1______P2_____P3______P4________........_____PNbMult
 * 
 *  Q1______Q2_____Q3______Q4________........_____QNbMult
 *  .                                               .
 *  .                                               .
 *  .                                               .
 *  R1______R2_____R3______R4________........_____RNbMult
 * 
 *  Pi, Qi, ..., Ri are points of dimension 2 or 3.
 * 
 *  (P1, Q1, ...R1), ...(Pn, Qn, ...Rn) n= 1,...NbMult are
 *  MultiPointConstraints.
 *  There are NbPoints points in each MultiPointConstraint.
 */
public class AppDef_MultiLine {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  AppDef_MultiLine(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  AppDef_MultiLine(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(AppDef_MultiLine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_AppDef_MultiLine(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  creates an undefined MultiLine.
   */
  public AppDef_MultiLine() {
    this(OCCwrapJavaJNI.new_AppDef_MultiLine__SWIG_0(), true);
  }

  /**
   *  given the number NbMult of MultiPointConstraints of this
   *  MultiLine , it initializes all the fields.SetValue must be
   *  called in order for the values of the multipoint
   *  constraint to be taken into account.
   *  An exception is raised if NbMult < 0.
   */
  public AppDef_MultiLine(int NbMult) {
    this(OCCwrapJavaJNI.new_AppDef_MultiLine__SWIG_1(NbMult), true);
  }

  /**
   *  Constructs a MultiLine with an array of MultiPointConstraints.
   */
  public AppDef_MultiLine( AppDef_Array1OfMultiPointConstraint  tabMultiP) {
    this(OCCwrapJavaJNI.new_AppDef_MultiLine__SWIG_2(AppDef_Array1OfMultiPointConstraint.getCPtr(tabMultiP), tabMultiP), true);
  }

  /**
   *  The MultiLine constructed will have one line of
   *  3d points without their tangencies.
   */
  public AppDef_MultiLine( TColgp_Array1OfPnt  tabP3d) {
    this(OCCwrapJavaJNI.new_AppDef_MultiLine__SWIG_3(TColgp_Array1OfPnt.getCPtr(tabP3d), tabP3d), true);
  }

  /**
   *  The MultiLine constructed will have one line of
   *  2d points without their tangencies.
   */
  public AppDef_MultiLine( TColgp_Array1OfPnt2d  tabP2d) {
    this(OCCwrapJavaJNI.new_AppDef_MultiLine__SWIG_4(TColgp_Array1OfPnt2d.getCPtr(tabP2d), tabP2d), true);
  }

  /**
   *  returns the number of MultiPointConstraints of the
   *  MultiLine.
   */
  public int NbMultiPoints() {
    return OCCwrapJavaJNI.AppDef_MultiLine_NbMultiPoints(swigCPtr, this);
  }

  /**
   *  returns the number of Points from MultiPoints composing
   *  the MultiLine.
   */
  public int NbPoints() {
    return OCCwrapJavaJNI.AppDef_MultiLine_NbPoints(swigCPtr, this);
  }

  /**
   *  It sets the MultiPointConstraint of range Index to the
   *  value MPoint.
   *  An exception is raised if Index < 0 or Index> MPoint.
   *  An exception is raised if the dimensions of the
   *  MultiPoints are different.
   */
  public void SetValue(int Index,  AppDef_MultiPointConstraint  MPoint) {
    OCCwrapJavaJNI.AppDef_MultiLine_SetValue(swigCPtr, this, Index, AppDef_MultiPointConstraint.getCPtr(MPoint), MPoint);
  }

  /**
   *  returns the MultiPointConstraint of range Index
   *  An exception is raised if Index<0 or Index>MPoint.
   */
  public AppDef_MultiPointConstraint Value(int Index) {
    return new AppDef_MultiPointConstraint(OCCwrapJavaJNI.AppDef_MultiLine_Value(swigCPtr, this, Index), true);
  }

  /**
   *  Prints on the stream o information on the current
   *  state of the object.
   *  Is used to redefine the operator <<.
   */
  public void Dump(SWIGTYPE_p_Standard_OStream o) {
    OCCwrapJavaJNI.AppDef_MultiLine_Dump(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(o));
  }

}
