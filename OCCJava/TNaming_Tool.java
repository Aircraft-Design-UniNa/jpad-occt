package opencascade;

/**
 *  A tool to get information on the topology of a
 *  named shape attribute.
 *  This information is typically a TopoDS_Shape object.
 *  Using this tool, relations between named shapes
 *  are also accessible.
 */
public class TNaming_Tool {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TNaming_Tool(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TNaming_Tool(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TNaming_Tool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TNaming_Tool(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Returns the last Modification of <NS>.
   *  Returns the shape CurrentShape contained in
   *  the named shape attribute NS.
   *  CurrentShape is the current state of the entities
   *  if they have been modified in other attributes of the same data structure.
   *  Each call to this function creates a new compound.
   */
  public static TopoDS_Shape CurrentShape( TNaming_NamedShape  NS) {
    return new TopoDS_Shape(OCCwrapJavaJNI.TNaming_Tool_CurrentShape__SWIG_0( TNaming_NamedShape.getCPtr(NS) , NS), true);
  }

  /**
   *  Returns the shape CurrentShape contained in
   *  the named shape attribute NS, and present in
   *  the updated attribute map Updated.
   *  CurrentShape is the current state of the entities
   *  if they have been modified in other attributes of the same data structure.
   *  Each call to this function creates a new compound.
   *  Warning
   *  Only the contents of Updated are searched.R
   */
  public static TopoDS_Shape CurrentShape( TNaming_NamedShape  NS,  TDF_LabelMap  Updated) {
    return new TopoDS_Shape(OCCwrapJavaJNI.TNaming_Tool_CurrentShape__SWIG_1( TNaming_NamedShape.getCPtr(NS) , NS, TDF_LabelMap.getCPtr(Updated), Updated), true);
  }

  public static  TNaming_NamedShape  CurrentNamedShape( TNaming_NamedShape  NS,  TDF_LabelMap  Updated) {
    return new TNaming_NamedShape ( OCCwrapJavaJNI.TNaming_Tool_CurrentNamedShape__SWIG_0( TNaming_NamedShape.getCPtr(NS) , NS, TDF_LabelMap.getCPtr(Updated), Updated), true );
  }

  public static  TNaming_NamedShape  CurrentNamedShape( TNaming_NamedShape  NS) {
    return new TNaming_NamedShape ( OCCwrapJavaJNI.TNaming_Tool_CurrentNamedShape__SWIG_1( TNaming_NamedShape.getCPtr(NS) , NS), true );
  }

  public static  TNaming_NamedShape  NamedShape( TopoDS_Shape  aShape,  TDF_Label  anAcces) {
    return new TNaming_NamedShape ( OCCwrapJavaJNI.TNaming_Tool_NamedShape(TopoDS_Shape.getCPtr(aShape), aShape, TDF_Label.getCPtr(anAcces), anAcces), true );
  }

  /**
   *  Returns the entities stored in the named shape attribute NS.
   *  If there is only one old-new pair, the new shape
   *  is returned. Otherwise, a Compound is returned.
   *  This compound is made out of all the new shapes found.
   *  Each call to this function creates a new compound.
   */
  public static TopoDS_Shape GetShape( TNaming_NamedShape  NS) {
    return new TopoDS_Shape(OCCwrapJavaJNI.TNaming_Tool_GetShape( TNaming_NamedShape.getCPtr(NS) , NS), true);
  }

  /**
   *  Returns the shape contained as OldShape in <NS>
   */
  public static TopoDS_Shape OriginalShape( TNaming_NamedShape  NS) {
    return new TopoDS_Shape(OCCwrapJavaJNI.TNaming_Tool_OriginalShape( TNaming_NamedShape.getCPtr(NS) , NS), true);
  }

  /**
   *  Returns the shape generated from S or by a
   *  modification of S and contained in the named
   *  shape Generation.
   */
  public static TopoDS_Shape GeneratedShape( TopoDS_Shape  S,  TNaming_NamedShape  Generation) {
    return new TopoDS_Shape(OCCwrapJavaJNI.TNaming_Tool_GeneratedShape(TopoDS_Shape.getCPtr(S), S,  TNaming_NamedShape.getCPtr(Generation) , Generation), true);
  }

  /**
   *  Returns True if <aShape> appears under a label.(DP)
   */
  public static long HasLabel( TDF_Label  access,  TopoDS_Shape  aShape) {
    return OCCwrapJavaJNI.TNaming_Tool_HasLabel(TDF_Label.getCPtr(access), access, TopoDS_Shape.getCPtr(aShape), aShape);
  }

  /**
   *  Returns  the label  of   the first apparition  of
   *  <aShape>.  Transdef  is a value of the transaction
   *  of the first apparition of <aShape>.
   */
  public static TDF_Label Label( TDF_Label  access,  TopoDS_Shape  aShape, int[] TransDef) {
    return new TDF_Label(OCCwrapJavaJNI.TNaming_Tool_Label(TDF_Label.getCPtr(access), access, TopoDS_Shape.getCPtr(aShape), aShape, TransDef), true);
  }

  /**
   *  Returns the shape created from the shape
   *  aShape contained in the attribute anAcces.
   */
  public static TopoDS_Shape InitialShape( TopoDS_Shape  aShape,  TDF_Label  anAcces,  TDF_LabelList  Labels) {
    return new TopoDS_Shape(OCCwrapJavaJNI.TNaming_Tool_InitialShape(TopoDS_Shape.getCPtr(aShape), aShape, TDF_Label.getCPtr(anAcces), anAcces, TDF_LabelList.getCPtr(Labels), Labels), true);
  }

  /**
   *  Returns the last transaction where the creation of S
   *  is valid.
   */
  public static int ValidUntil( TDF_Label  access,  TopoDS_Shape  S) {
    return OCCwrapJavaJNI.TNaming_Tool_ValidUntil(TDF_Label.getCPtr(access), access, TopoDS_Shape.getCPtr(S), S);
  }

  /**
   *  Returns the current shape (a Wire or a Shell) built (in the data framework)
   *  from the the shapes of the argument named shape.
   *  It is used for IDENTITY name type computation.
   */
  public static void FindShape( TDF_LabelMap  Valid,  TDF_LabelMap  Forbiden,  TNaming_NamedShape  Arg, TopoDS_Shape S) {
    OCCwrapJavaJNI.TNaming_Tool_FindShape(TDF_LabelMap.getCPtr(Valid), Valid, TDF_LabelMap.getCPtr(Forbiden), Forbiden,  TNaming_NamedShape.getCPtr(Arg) , Arg, TopoDS_Shape.getCPtr(S), S);
  }

  public TNaming_Tool() {
    this(OCCwrapJavaJNI.new_TNaming_Tool(), true);
  }

}
