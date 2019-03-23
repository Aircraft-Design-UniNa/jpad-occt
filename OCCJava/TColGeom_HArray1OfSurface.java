package opencascade;

public class TColGeom_HArray1OfSurface extends Standard_Transient {
  TColGeom_HArray1OfSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColGeom_HArray1OfSurface(int theLower, int theUpper,  Geom_Surface  theValue) {
    this(OCCwrapJavaJNI.new_TColGeom_HArray1OfSurface__SWIG_0(theLower, theUpper,  Geom_Surface.getCPtr(theValue) , theValue), true);
  }

  public TColGeom_HArray1OfSurface(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColGeom_HArray1OfSurface__SWIG_1(theLower, theUpper), true);
  }

  public TColGeom_HArray1OfSurface( TColGeom_Array1OfSurface  theOther) {
    this(OCCwrapJavaJNI.new_TColGeom_HArray1OfSurface__SWIG_2(TColGeom_Array1OfSurface.getCPtr(theOther), theOther), true);
  }

  public  TColGeom_Array1OfSurface  Array1() {
    TColGeom_Array1OfSurface ret = new TColGeom_Array1OfSurface(OCCwrapJavaJNI.TColGeom_HArray1OfSurface_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  TColGeom_Array1OfSurface  ChangeArray1() {
    TColGeom_Array1OfSurface ret = new TColGeom_Array1OfSurface(OCCwrapJavaJNI.TColGeom_HArray1OfSurface_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColGeom_HArray1OfSurface_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColGeom_HArray1OfSurface_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColGeom_HArray1OfSurface_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColGeom_HArray1OfSurface_Upper(swigCPtr, this);
  }

  public  Geom_Surface  Value(int theIndex) {
    return new Geom_Surface ( OCCwrapJavaJNI.TColGeom_HArray1OfSurface_Value(swigCPtr, this, theIndex), true );
  }

  public  Geom_Surface  ChangeValue(int theIndex) {
    return new Geom_Surface ( OCCwrapJavaJNI.TColGeom_HArray1OfSurface_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  Geom_Surface  theItem) {
    OCCwrapJavaJNI.TColGeom_HArray1OfSurface_SetValue(swigCPtr, this, theIndex,  Geom_Surface.getCPtr(theItem) , theItem);
  }

  public static  TColGeom_HArray1OfSurface  DownCast( Standard_Transient  T) {
    return new TColGeom_HArray1OfSurface ( OCCwrapJavaJNI.TColGeom_HArray1OfSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColGeom_HArray1OfSurface_TypeOf(), true );
  }

}
