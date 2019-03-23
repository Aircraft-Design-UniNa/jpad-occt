package opencascade;

public class TColStd_HArray1OfBoolean extends Standard_Transient {
  TColStd_HArray1OfBoolean(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public  TColStd_Array1OfBoolean  Array1() {
    TColStd_Array1OfBoolean ret = new TColStd_Array1OfBoolean(OCCwrapJavaJNI.TColStd_HArray1OfBoolean_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  TColStd_Array1OfBoolean  ChangeArray1() {
    TColStd_Array1OfBoolean ret = new TColStd_Array1OfBoolean(OCCwrapJavaJNI.TColStd_HArray1OfBoolean_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_HArray1OfBoolean_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_HArray1OfBoolean_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_HArray1OfBoolean_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_HArray1OfBoolean_Upper(swigCPtr, this);
  }

  public  long  Value(int theIndex) { return OCCwrapJavaJNI.TColStd_HArray1OfBoolean_Value(swigCPtr, this, theIndex); }

  public long[] ChangeValue(int theIndex) {return OCCwrapJavaJNI.TColStd_HArray1OfBoolean_ChangeValue(swigCPtr, this, theIndex);}

  public static  TColStd_HArray1OfBoolean  DownCast( Standard_Transient  T) {
    return new TColStd_HArray1OfBoolean ( OCCwrapJavaJNI.TColStd_HArray1OfBoolean_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColStd_HArray1OfBoolean_TypeOf(), true );
  }

}
