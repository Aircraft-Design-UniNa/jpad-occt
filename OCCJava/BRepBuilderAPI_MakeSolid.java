package opencascade;

/**
 *  Describes functions to build a solid from shells.
 *  A solid is made of one shell, or a series of shells, which
 *  do not intersect each other. One of these shells
 *  constitutes the outside skin of the solid. It may be closed
 *  (a finite solid) or open (an infinite solid). Other shells
 *  form hollows (cavities) in these previous ones. Each
 *  must bound a closed volume.
 *  A MakeSolid object provides a framework for:
 *  -   defining and implementing the construction of a solid, and
 *  -   consulting the result.
 */
public class BRepBuilderAPI_MakeSolid extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepBuilderAPI_MakeSolid(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_MakeSolid_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepBuilderAPI_MakeSolid(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_MakeSolid_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepBuilderAPI_MakeSolid obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepBuilderAPI_MakeSolid(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Initializes the construction of a solid. An empty solid is
   *  considered to cover the whole space. The Add function
   *  is used to define shells to bound it.
   */
  public BRepBuilderAPI_MakeSolid() {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeSolid__SWIG_0(), true);
  }

  /**
   *  Make a solid from a CompSolid.
   */
  public BRepBuilderAPI_MakeSolid( TopoDS_CompSolid  S) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeSolid__SWIG_1(TopoDS_CompSolid.getCPtr(S), S), true);
  }

  /**
   *  Make a solid from a shell.
   */
  public BRepBuilderAPI_MakeSolid( TopoDS_Shell  S) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeSolid__SWIG_2(TopoDS_Shell.getCPtr(S), S), true);
  }

  /**
   *  Make a solid from two shells.
   */
  public BRepBuilderAPI_MakeSolid( TopoDS_Shell  S1,  TopoDS_Shell  S2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeSolid__SWIG_3(TopoDS_Shell.getCPtr(S1), S1, TopoDS_Shell.getCPtr(S2), S2), true);
  }

  /**
   *  Make a solid from three shells.
   *  Constructs a solid
   *  -   covering the whole space, or
   *  -   from shell S, or
   *  -   from two shells S1 and S2, or
   *  -   from three shells S1, S2 and S3, or
   *  Warning
   *  No check is done to verify the conditions of coherence
   *  of the resulting solid. In particular, S1, S2 (and S3) must
   *  not intersect each other.
   *  Besides, after all shells have been added using the Add
   *  function, one of these shells should constitute the outside
   *  skin of the solid; it may be closed (a finite solid) or open
   *  (an infinite solid). Other shells form hollows (cavities) in
   *  these previous ones. Each must bound a closed volume.
   */
  public BRepBuilderAPI_MakeSolid( TopoDS_Shell  S1,  TopoDS_Shell  S2,  TopoDS_Shell  S3) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeSolid__SWIG_4(TopoDS_Shell.getCPtr(S1), S1, TopoDS_Shell.getCPtr(S2), S2, TopoDS_Shell.getCPtr(S3), S3), true);
  }

  /**
   *  Make a solid from a solid. Usefull for adding later.
   */
  public BRepBuilderAPI_MakeSolid( TopoDS_Solid  So) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeSolid__SWIG_5(TopoDS_Solid.getCPtr(So), So), true);
  }

  /**
   *  Add a shell to a solid.
   * 
   *  Constructs a solid:
   *  -   from the solid So, to which shells can be added, or
   *  -   by adding the shell S to the solid So.
   *  Warning
   *  No check is done to verify the conditions of coherence
   *  of the resulting solid. In particular S must not intersect the solid S0.
   *  Besides, after all shells have been added using the Add
   *  function, one of these shells should constitute the outside
   *  skin of the solid. It may be closed (a finite solid) or open
   *  (an infinite solid). Other shells form hollows (cavities) in
   *  the previous ones. Each must bound a closed volume.
   */
  public BRepBuilderAPI_MakeSolid( TopoDS_Solid  So,  TopoDS_Shell  S) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeSolid__SWIG_6(TopoDS_Solid.getCPtr(So), So, TopoDS_Shell.getCPtr(S), S), true);
  }

  /**
   *  Adds the shell to the current solid.
   *  Warning
   *  No check is done to verify the conditions of coherence
   *  of the resulting solid. In particular, S must not intersect
   *  other shells of the solid under construction.
   *  Besides, after all shells have been added, one of
   *  these shells should constitute the outside skin of the
   *  solid. It may be closed (a finite solid) or open (an
   *  infinite solid). Other shells form hollows (cavities) in
   *  these previous ones. Each must bound a closed volume.
   */
  public void Add( TopoDS_Shell  S) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeSolid_Add(swigCPtr, this, TopoDS_Shell.getCPtr(S), S);
  }

  /**
   *  Returns the new Solid.
   */
  public  TopoDS_Solid  Solid() {
    TopoDS_Solid ret = new TopoDS_Solid(OCCwrapJavaJNI.BRepBuilderAPI_MakeSolid_Solid(swigCPtr, this), true);
    return ret;
  }

}
