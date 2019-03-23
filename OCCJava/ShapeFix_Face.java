package opencascade;

/**
 *  This operator allows to perform various fixes on face
 *  and its wires: fixes provided by ShapeFix_Wire,
 *  fixing orientation of wires, addition of natural bounds,
 *  fixing of missing seam edge,
 *  and detection and removal of null-area wires
 */
public class ShapeFix_Face extends ShapeFix_Root {
  ShapeFix_Face(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates an empty tool
   */
  public ShapeFix_Face() {
    this(OCCwrapJavaJNI.new_ShapeFix_Face__SWIG_0(), true);
  }

  /**
   *  Creates a tool and loads a face
   */
  public ShapeFix_Face( TopoDS_Face  face) {
    this(OCCwrapJavaJNI.new_ShapeFix_Face__SWIG_1(TopoDS_Face.getCPtr(face), face), true);
  }

  /**
   *  Sets all modes to default
   */
  public void ClearModes() {
    OCCwrapJavaJNI.ShapeFix_Face_ClearModes(swigCPtr, this);
  }

  /**
   *  Loads a whole face already created, with its wires, sense and
   *  location
   */
  public void Init( TopoDS_Face  face) {
    OCCwrapJavaJNI.ShapeFix_Face_Init__SWIG_0(swigCPtr, this, TopoDS_Face.getCPtr(face), face);
  }

  /**
   *  Starts the creation of the face
   *  By default it will be FORWARD, or REVERSED if <fwd> is False
   */
  public void Init( Geom_Surface  surf, double preci, long fwd) {
    OCCwrapJavaJNI.ShapeFix_Face_Init__SWIG_1(swigCPtr, this,  Geom_Surface.getCPtr(surf) , surf, preci, fwd);
  }

  /**
   *  Starts the creation of the face
   *  By default it will be FORWARD, or REVERSED if <fwd> is False
   */
  public void Init( Geom_Surface  surf, double preci) {
    OCCwrapJavaJNI.ShapeFix_Face_Init__SWIG_2(swigCPtr, this,  Geom_Surface.getCPtr(surf) , surf, preci);
  }

  public void Init( ShapeAnalysis_Surface  surf, double preci, long fwd) {
    OCCwrapJavaJNI.ShapeFix_Face_Init__SWIG_3(swigCPtr, this,  ShapeAnalysis_Surface.getCPtr(surf) , surf, preci, fwd);
  }

  public void Init( ShapeAnalysis_Surface  surf, double preci) {
    OCCwrapJavaJNI.ShapeFix_Face_Init__SWIG_4(swigCPtr, this,  ShapeAnalysis_Surface.getCPtr(surf) , surf, preci);
  }

  public int[] FixWireMode() {return OCCwrapJavaJNI.ShapeFix_Face_FixWireMode(swigCPtr, this);}

  public int[] FixOrientationMode() {return OCCwrapJavaJNI.ShapeFix_Face_FixOrientationMode(swigCPtr, this);}

  public int[] FixAddNaturalBoundMode() {return OCCwrapJavaJNI.ShapeFix_Face_FixAddNaturalBoundMode(swigCPtr, this);}

  public int[] FixMissingSeamMode() {return OCCwrapJavaJNI.ShapeFix_Face_FixMissingSeamMode(swigCPtr, this);}

  public int[] FixSmallAreaWireMode() {return OCCwrapJavaJNI.ShapeFix_Face_FixSmallAreaWireMode(swigCPtr, this);}

  public int[] RemoveSmallAreaFaceMode() {return OCCwrapJavaJNI.ShapeFix_Face_RemoveSmallAreaFaceMode(swigCPtr, this);}

  public int[] FixIntersectingWiresMode() {return OCCwrapJavaJNI.ShapeFix_Face_FixIntersectingWiresMode(swigCPtr, this);}

  public int[] FixLoopWiresMode() {return OCCwrapJavaJNI.ShapeFix_Face_FixLoopWiresMode(swigCPtr, this);}

  public int[] FixSplitFaceMode() {return OCCwrapJavaJNI.ShapeFix_Face_FixSplitFaceMode(swigCPtr, this);}

  public int[] AutoCorrectPrecisionMode() {return OCCwrapJavaJNI.ShapeFix_Face_AutoCorrectPrecisionMode(swigCPtr, this);}

  public int[] FixPeriodicDegeneratedMode() {return OCCwrapJavaJNI.ShapeFix_Face_FixPeriodicDegeneratedMode(swigCPtr, this);}

  /**
   *  Returns a face which corresponds to the current state
   *  Warning: The finally produced face may be another one ... but with the
   *  same support
   */
  public TopoDS_Face Face() {
    return new TopoDS_Face(OCCwrapJavaJNI.ShapeFix_Face_Face(swigCPtr, this), true);
  }

  /**
   *  Returns resulting shape (Face or Shell if splitted)
   *  To be used instead of Face() if FixMissingSeam involved
   */
  public TopoDS_Shape Result() {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeFix_Face_Result(swigCPtr, this), true);
  }

  /**
   *  Add a wire to current face using BRep_Builder.
   *  Wire is added without taking into account orientation of face
   *  (as if face were FORWARD).
   */
  public void Add( TopoDS_Wire  wire) {
    OCCwrapJavaJNI.ShapeFix_Face_Add(swigCPtr, this, TopoDS_Wire.getCPtr(wire), wire);
  }

  /**
   *  Performs all the fixes, depending on modes
   *  Function Status returns the status of last call to Perform()
   *  ShapeExtend_OK   : face was OK, nothing done
   *  ShapeExtend_DONE1: some wires are fixed
   *  ShapeExtend_DONE2: orientation of wires fixed
   *  ShapeExtend_DONE3: missing seam added
   *  ShapeExtend_DONE4: small area wire removed
   *  ShapeExtend_DONE5: natural bounds added
   *  ShapeExtend_FAIL1: some fails during fixing wires
   *  ShapeExtend_FAIL2: cannot fix orientation of wires
   *  ShapeExtend_FAIL3: cannot add missing seam
   *  ShapeExtend_FAIL4: cannot remove small area wire
   */
  public long Perform() {
    return OCCwrapJavaJNI.ShapeFix_Face_Perform(swigCPtr, this);
  }

  /**
   *  Fixes orientation of wires on the face
   *  It tries to make all wires lie outside all others (according
   *  to orientation) by reversing orientation of some of them.
   *  If face lying on sphere or torus has single wire and
   *  AddNaturalBoundMode is True, that wire is not reversed in
   *  any case (supposing that natural bound will be added).
   *  Returns True if wires were reversed
   */
  public long FixOrientation() {
    return OCCwrapJavaJNI.ShapeFix_Face_FixOrientation__SWIG_0(swigCPtr, this);
  }

  /**
   *  Fixes orientation of wires on the face
   *  It tries to make all wires lie outside all others (according
   *  to orientation) by reversing orientation of some of them.
   *  If face lying on sphere or torus has single wire and
   *  AddNaturalBoundMode is True, that wire is not reversed in
   *  any case (supposing that natural bound will be added).
   *  Returns True if wires were reversed
   *  OutWires return information about out wires + list of
   *  internal wires for each (for performing split face).
   */
  public long FixOrientation( TopTools_DataMapOfShapeListOfShape  MapWires) {
    return OCCwrapJavaJNI.ShapeFix_Face_FixOrientation__SWIG_1(swigCPtr, this, TopTools_DataMapOfShapeListOfShape.getCPtr(MapWires), MapWires);
  }

  /**
   *  Adds natural boundary on face if it is missing.
   *  Two cases are supported:
   *  - face has no wires
   *  - face lies on geometrically double-closed surface
   *  (sphere or torus) and none of wires is left-oriented
   *  Returns True if natural boundary was added
   */
  public long FixAddNaturalBound() {
    return OCCwrapJavaJNI.ShapeFix_Face_FixAddNaturalBound(swigCPtr, this);
  }

  /**
   *  Detects and fixes the special case when face on a closed
   *  surface is given by two wires closed in 3d but with gap in 2d.
   *  In that case it creates a new wire from the two, and adds a
   *  missing seam edge
   *  Returns True if missing seam was added
   */
  public long FixMissingSeam() {
    return OCCwrapJavaJNI.ShapeFix_Face_FixMissingSeam(swigCPtr, this);
  }

  /**
   *  Detects wires with small area (that is less than
   *  100*Precision::PConfusion(). Removes these wires if they are internal.
   *  Returns : True if at least one small wire removed,
   *  False if does nothing.
   */
  public long FixSmallAreaWire(long theIsRemoveSmallFace) {
    return OCCwrapJavaJNI.ShapeFix_Face_FixSmallAreaWire(swigCPtr, this, theIsRemoveSmallFace);
  }

  /**
   *  Detects if wire has a loop and fixes this situation by splitting on the few parts.
   *  if wire has a loops and it was splitted Status was set to value ShapeExtend_DONE6.
   */
  public long FixLoopWire( TopTools_SequenceOfShape  aResWires) {
    return OCCwrapJavaJNI.ShapeFix_Face_FixLoopWire(swigCPtr, this, TopTools_SequenceOfShape.getCPtr(aResWires), aResWires);
  }

  /**
   *  Detects and fixes the special case when face has more than one wire
   *  and this wires have intersection point
   */
  public long FixIntersectingWires() {
    return OCCwrapJavaJNI.ShapeFix_Face_FixIntersectingWires(swigCPtr, this);
  }

  /**
   *  If wire contains two coincidence edges it must be removed
   *  Queries on status after Perform()
   */
  public long FixWiresTwoCoincEdges() {
    return OCCwrapJavaJNI.ShapeFix_Face_FixWiresTwoCoincEdges(swigCPtr, this);
  }

  /**
   *  Split face if there are more than one out wire
   *  using inrormation after FixOrientation()
   */
  public long FixSplitFace( TopTools_DataMapOfShapeListOfShape  MapWires) {
    return OCCwrapJavaJNI.ShapeFix_Face_FixSplitFace(swigCPtr, this, TopTools_DataMapOfShapeListOfShape.getCPtr(MapWires), MapWires);
  }

  /**
   *  Fixes topology for a specific case when face is composed
   *  by a single wire belting a periodic surface. In that case
   *  a degenerated edge is reconstructed in the degenerated pole
   *  of the surface. Initial wire gets consistent orientation.
   *  Must be used in couple and before FixMissingSeam routine
   */
  public long FixPeriodicDegenerated() {
    return OCCwrapJavaJNI.ShapeFix_Face_FixPeriodicDegenerated(swigCPtr, this);
  }

  /**
   *  Returns the status of last call to Perform()
   *  ShapeExtend_OK   : face was OK, nothing done
   *  ShapeExtend_DONE1: some wires are fixed
   *  ShapeExtend_DONE2: orientation of wires fixed
   *  ShapeExtend_DONE3: missing seam added
   *  ShapeExtend_DONE4: small area wire removed
   *  ShapeExtend_DONE5: natural bounds added
   *  ShapeExtend_DONE8: face may be splited
   *  ShapeExtend_FAIL1: some fails during fixing wires
   *  ShapeExtend_FAIL2: cannot fix orientation of wires
   *  ShapeExtend_FAIL3: cannot add missing seam
   *  ShapeExtend_FAIL4: cannot remove small area wire
   */
  public long Status(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Face_Status(swigCPtr, this, status.swigValue());
  }

  public  ShapeFix_Wire  FixWireTool() {
    return new ShapeFix_Wire ( OCCwrapJavaJNI.ShapeFix_Face_FixWireTool(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeFix_Face_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_Face_get_type_descriptor(), true );
  }

  public static  ShapeFix_Face  DownCast( Standard_Transient  T) {
    return new ShapeFix_Face ( OCCwrapJavaJNI.ShapeFix_Face_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_Face_TypeOf(), true );
  }

}
