package opencascade;

public class BRepCheck_Shell extends BRepCheck_Result {
  BRepCheck_Shell(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public BRepCheck_Shell( TopoDS_Shell  S) {
    this(OCCwrapJavaJNI.new_BRepCheck_Shell(TopoDS_Shell.getCPtr(S), S), true);
  }

  /**
   *  Checks if the oriented  faces of the shell  give a
   *  closed shell.    If the  wire is  closed,  returns
   *  BRepCheck_NoError.If      <Update>     is  set  to
   *  Standard_True, registers the status in the list.
   */
  public BRepCheck_Status Closed(long Update) {
    return BRepCheck_Status.swigToEnum(OCCwrapJavaJNI.BRepCheck_Shell_Closed__SWIG_0(swigCPtr, this, Update));
  }

  public BRepCheck_Status Closed() {
    return BRepCheck_Status.swigToEnum(OCCwrapJavaJNI.BRepCheck_Shell_Closed__SWIG_1(swigCPtr, this));
  }

  /**
   *  Checks if the   oriented faces  of  the shell  are
   *  correctly oriented.  An internal  call is  made to
   *  the  method  Closed.   If  <Update>    is set   to
   *  Standard_True, registers the status in the list.
   */
  public BRepCheck_Status Orientation(long Update) {
    return BRepCheck_Status.swigToEnum(OCCwrapJavaJNI.BRepCheck_Shell_Orientation__SWIG_0(swigCPtr, this, Update));
  }

  public BRepCheck_Status Orientation() {
    return BRepCheck_Status.swigToEnum(OCCwrapJavaJNI.BRepCheck_Shell_Orientation__SWIG_1(swigCPtr, this));
  }

  public void SetUnorientable() {
    OCCwrapJavaJNI.BRepCheck_Shell_SetUnorientable(swigCPtr, this);
  }

  public long IsUnorientable() {
    return OCCwrapJavaJNI.BRepCheck_Shell_IsUnorientable(swigCPtr, this);
  }

  public int NbConnectedSet( TopTools_ListOfShape  theSets) {
    return OCCwrapJavaJNI.BRepCheck_Shell_NbConnectedSet(swigCPtr, this, TopTools_ListOfShape.getCPtr(theSets), theSets);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.BRepCheck_Shell_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepCheck_Shell_get_type_descriptor(), true );
  }

  public static  BRepCheck_Shell  DownCast( Standard_Transient  T) {
    return new BRepCheck_Shell ( OCCwrapJavaJNI.BRepCheck_Shell_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepCheck_Shell_TypeOf(), true );
  }

}
