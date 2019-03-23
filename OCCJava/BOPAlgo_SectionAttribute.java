package opencascade;

/**
 *  Class is a container of the flags used
 *  by intersection algorithm
 */
public class BOPAlgo_SectionAttribute {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BOPAlgo_SectionAttribute(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BOPAlgo_SectionAttribute(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BOPAlgo_SectionAttribute obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPAlgo_SectionAttribute(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Default constructor
   */
  public BOPAlgo_SectionAttribute() {
    this(OCCwrapJavaJNI.new_BOPAlgo_SectionAttribute__SWIG_0(), true);
  }

  /**
   *  Constructor
   */
  public BOPAlgo_SectionAttribute(long theAproximation, long thePCurveOnS1, long thePCurveOnS2) {
    this(OCCwrapJavaJNI.new_BOPAlgo_SectionAttribute__SWIG_1(theAproximation, thePCurveOnS1, thePCurveOnS2), true);
  }

  /**
   *  Sets the Approximation flag
   */
  public void Approximation(long theApprox) {
    OCCwrapJavaJNI.BOPAlgo_SectionAttribute_Approximation__SWIG_0(swigCPtr, this, theApprox);
  }

  /**
   *  Sets the PCurveOnS1 flag
   */
  public void PCurveOnS1(long thePCurveOnS1) {
    OCCwrapJavaJNI.BOPAlgo_SectionAttribute_PCurveOnS1__SWIG_0(swigCPtr, this, thePCurveOnS1);
  }

  /**
   *  Sets the PCurveOnS2 flag
   */
  public void PCurveOnS2(long thePCurveOnS2) {
    OCCwrapJavaJNI.BOPAlgo_SectionAttribute_PCurveOnS2__SWIG_0(swigCPtr, this, thePCurveOnS2);
  }

  /**
   *  Returns the Approximation flag
   */
  public long Approximation() {
    return OCCwrapJavaJNI.BOPAlgo_SectionAttribute_Approximation__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns the PCurveOnS1 flag
   */
  public long PCurveOnS1() {
    return OCCwrapJavaJNI.BOPAlgo_SectionAttribute_PCurveOnS1__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns the PCurveOnS2 flag
   */
  public long PCurveOnS2() {
    return OCCwrapJavaJNI.BOPAlgo_SectionAttribute_PCurveOnS2__SWIG_1(swigCPtr, this);
  }

}
