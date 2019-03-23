package opencascade;

/**
 *  Performs geometric modifications on a shape.
 */
public class BRepTools_Modifier {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepTools_Modifier(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepTools_Modifier(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepTools_Modifier obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepTools_Modifier(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an empty Modifier.
   */
  public BRepTools_Modifier(long theMutableInput) {
    this(OCCwrapJavaJNI.new_BRepTools_Modifier__SWIG_0(theMutableInput), true);
  }

  /**
   *  Creates a modifier on the shape <S>.
   */
  public BRepTools_Modifier() {
    this(OCCwrapJavaJNI.new_BRepTools_Modifier__SWIG_1(), true);
  }

  /**
   *  Creates a modifier on  the shape <S>, and performs
   *  the modifications described by <M>.
   */
  public BRepTools_Modifier( TopoDS_Shape  S) {
    this(OCCwrapJavaJNI.new_BRepTools_Modifier__SWIG_2(TopoDS_Shape.getCPtr(S), S), true);
  }

  public BRepTools_Modifier( TopoDS_Shape  S,  BRepTools_Modification  M) {
    this(OCCwrapJavaJNI.new_BRepTools_Modifier__SWIG_3(TopoDS_Shape.getCPtr(S), S,  BRepTools_Modification.getCPtr(M) , M), true);
  }

  /**
   *  Initializes the modifier with the shape <S>.
   */
  public void Init( TopoDS_Shape  S) {
    OCCwrapJavaJNI.BRepTools_Modifier_Init(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

  /**
   *  Performs the modifications described by <M>.
   */
  public void Perform( BRepTools_Modification  M,  Message_ProgressIndicator  aProgress) {
    OCCwrapJavaJNI.BRepTools_Modifier_Perform__SWIG_0(swigCPtr, this,  BRepTools_Modification.getCPtr(M) , M,  Message_ProgressIndicator.getCPtr(aProgress) , aProgress);
  }

  public void Perform( BRepTools_Modification  M) {
    OCCwrapJavaJNI.BRepTools_Modifier_Perform__SWIG_1(swigCPtr, this,  BRepTools_Modification.getCPtr(M) , M);
  }

  /**
   *  Returns Standard_True if the modification has
   *  been computed successfully.
   */
  public long IsDone() {
    return OCCwrapJavaJNI.BRepTools_Modifier_IsDone(swigCPtr, this);
  }

  /**
   *  Returns the current mutable input state
   */
  public long IsMutableInput() {
    return OCCwrapJavaJNI.BRepTools_Modifier_IsMutableInput(swigCPtr, this);
  }

  /**
   *  Sets the mutable input state
   *  If true then the input (original) shape can be modified 
   *  during modification process
   */
  public void SetMutableInput(long theMutableInput) {
    OCCwrapJavaJNI.BRepTools_Modifier_SetMutableInput(swigCPtr, this, theMutableInput);
  }

  /**
   *  Returns the modified shape corresponding to <S>.
   */
  public  TopoDS_Shape  ModifiedShape( TopoDS_Shape  S) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepTools_Modifier_ModifiedShape(swigCPtr, this, TopoDS_Shape.getCPtr(S), S), true);
    return ret;
  }

}
