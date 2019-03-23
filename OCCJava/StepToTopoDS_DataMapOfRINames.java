package opencascade;

public class StepToTopoDS_DataMapOfRINames {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepToTopoDS_DataMapOfRINames(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepToTopoDS_DataMapOfRINames(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepToTopoDS_DataMapOfRINames obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_DataMapOfRINames(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepToTopoDS_DataMapOfRINames() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_DataMapOfRINames__SWIG_0(), true);
  }

  public StepToTopoDS_DataMapOfRINames(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_DataMapOfRINames__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public StepToTopoDS_DataMapOfRINames(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_DataMapOfRINames__SWIG_2(theNbBuckets), true);
  }

  public StepToTopoDS_DataMapOfRINames( StepToTopoDS_DataMapOfRINames  theOther) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_DataMapOfRINames__SWIG_3(StepToTopoDS_DataMapOfRINames.getCPtr(theOther), theOther), true);
  }

  public void Exchange( StepToTopoDS_DataMapOfRINames  theOther) {
    OCCwrapJavaJNI.StepToTopoDS_DataMapOfRINames_Exchange(swigCPtr, this, StepToTopoDS_DataMapOfRINames.getCPtr(theOther), theOther);
  }

  public  StepToTopoDS_DataMapOfRINames  Assign( StepToTopoDS_DataMapOfRINames  theOther) {
    StepToTopoDS_DataMapOfRINames ret = new StepToTopoDS_DataMapOfRINames(OCCwrapJavaJNI.StepToTopoDS_DataMapOfRINames_Assign(swigCPtr, this, StepToTopoDS_DataMapOfRINames.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int N) {
    OCCwrapJavaJNI.StepToTopoDS_DataMapOfRINames_ReSize(swigCPtr, this, N);
  }

  public long Bind( TCollection_AsciiString  theKey,  TopoDS_Shape  theItem) {
    return OCCwrapJavaJNI.StepToTopoDS_DataMapOfRINames_Bind(swigCPtr, this, TCollection_AsciiString.getCPtr(theKey), theKey, TopoDS_Shape.getCPtr(theItem), theItem);
  }

  public long IsBound( TCollection_AsciiString  theKey) {
    return OCCwrapJavaJNI.StepToTopoDS_DataMapOfRINames_IsBound(swigCPtr, this, TCollection_AsciiString.getCPtr(theKey), theKey);
  }

  public long UnBind( TCollection_AsciiString  theKey) {
    return OCCwrapJavaJNI.StepToTopoDS_DataMapOfRINames_UnBind(swigCPtr, this, TCollection_AsciiString.getCPtr(theKey), theKey);
  }

  public  TopoDS_Shape  Find( TCollection_AsciiString  theKey) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_DataMapOfRINames_Find__SWIG_0(swigCPtr, this, TCollection_AsciiString.getCPtr(theKey), theKey), true);
    return ret;
  }

  public long Find( TCollection_AsciiString  theKey, TopoDS_Shape theValue) {
    return OCCwrapJavaJNI.StepToTopoDS_DataMapOfRINames_Find__SWIG_1(swigCPtr, this, TCollection_AsciiString.getCPtr(theKey), theKey, TopoDS_Shape.getCPtr(theValue), theValue);
  }

  public TopoDS_Shape ChangeFind( TCollection_AsciiString  theKey) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_DataMapOfRINames_ChangeFind(swigCPtr, this, TCollection_AsciiString.getCPtr(theKey), theKey), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.StepToTopoDS_DataMapOfRINames_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.StepToTopoDS_DataMapOfRINames_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.StepToTopoDS_DataMapOfRINames_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepToTopoDS_DataMapOfRINames_Size(swigCPtr, this);
  }

}
