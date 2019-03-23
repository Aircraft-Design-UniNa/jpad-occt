package opencascade;

public class Standard_Version {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Standard_Version(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Standard_Version obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Standard_Version(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static int Major() {
    return OCCwrapJavaJNI.Standard_Version_Major();
  }

  public static int Minor() {
    return OCCwrapJavaJNI.Standard_Version_Minor();
  }

  public static int Maintenance() {
    return OCCwrapJavaJNI.Standard_Version_Maintenance();
  }

  public static double Number() {
    return OCCwrapJavaJNI.Standard_Version_Number();
  }

  public static String String() {
    return OCCwrapJavaJNI.Standard_Version_String();
  }

  public Standard_Version() {
    this(OCCwrapJavaJNI.new_Standard_Version(), true);
  }

}
