package opencascade;

public class BRepBuilderAPI_Collect {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepBuilderAPI_Collect(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepBuilderAPI_Collect(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepBuilderAPI_Collect obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepBuilderAPI_Collect(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BRepBuilderAPI_Collect() {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_Collect(), true);
  }

  public void Add( TopoDS_Shape  SI,  BRepBuilderAPI_MakeShape  MKS) {
    OCCwrapJavaJNI.BRepBuilderAPI_Collect_Add(swigCPtr, this, TopoDS_Shape.getCPtr(SI), SI, BRepBuilderAPI_MakeShape.getCPtr(MKS), MKS);
  }

  public void AddGenerated( TopoDS_Shape  S,  TopoDS_Shape  Gen) {
    OCCwrapJavaJNI.BRepBuilderAPI_Collect_AddGenerated(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, TopoDS_Shape.getCPtr(Gen), Gen);
  }

  public void AddModif( TopoDS_Shape  S,  TopoDS_Shape  Mod) {
    OCCwrapJavaJNI.BRepBuilderAPI_Collect_AddModif(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, TopoDS_Shape.getCPtr(Mod), Mod);
  }

  public void Filter( TopoDS_Shape  SF) {
    OCCwrapJavaJNI.BRepBuilderAPI_Collect_Filter(swigCPtr, this, TopoDS_Shape.getCPtr(SF), SF);
  }

  public  TopTools_DataMapOfShapeListOfShape  Modification() {
    TopTools_DataMapOfShapeListOfShape ret = new TopTools_DataMapOfShapeListOfShape(OCCwrapJavaJNI.BRepBuilderAPI_Collect_Modification(swigCPtr, this), false, this);
    return ret;
  }

  public  TopTools_DataMapOfShapeListOfShape  Generated() {
    TopTools_DataMapOfShapeListOfShape ret = new TopTools_DataMapOfShapeListOfShape(OCCwrapJavaJNI.BRepBuilderAPI_Collect_Generated(swigCPtr, this), false, this);
    return ret;
  }

}
