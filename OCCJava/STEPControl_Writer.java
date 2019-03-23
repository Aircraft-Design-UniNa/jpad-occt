package opencascade;

/**
 *  This class creates and writes
 *  STEP files from Open CASCADE models. A STEP file can be
 *  written to an existing STEP file or to a new one.
 *  Translation can be performed in one or several operations. Each
 *  translation operation outputs a distinct root entity in the STEP file.
 */
public class STEPControl_Writer {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  STEPControl_Writer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  STEPControl_Writer(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(STEPControl_Writer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_STEPControl_Writer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a Writer from scratch
   */
  public STEPControl_Writer() {
    this(OCCwrapJavaJNI.new_STEPControl_Writer__SWIG_0(), true);
  }

  /**
   *  Creates a Writer from an already existing Session
   *  If <scratch> is True (D), clears already recorded data
   */
  public STEPControl_Writer( XSControl_WorkSession  WS, long scratch) {
    this(OCCwrapJavaJNI.new_STEPControl_Writer__SWIG_1( XSControl_WorkSession.getCPtr(WS) , WS, scratch), true);
  }

  public STEPControl_Writer( XSControl_WorkSession  WS) {
    this(OCCwrapJavaJNI.new_STEPControl_Writer__SWIG_2( XSControl_WorkSession.getCPtr(WS) , WS), true);
  }

  /**
   *  Sets a length-measure value that
   *  will be written to uncertainty-measure-with-unit
   *  when the next shape is translated.
   */
  public void SetTolerance(double Tol) {
    OCCwrapJavaJNI.STEPControl_Writer_SetTolerance(swigCPtr, this, Tol);
  }

  /**
   *  Unsets the tolerance formerly forced by SetTolerance
   */
  public void UnsetTolerance() {
    OCCwrapJavaJNI.STEPControl_Writer_UnsetTolerance(swigCPtr, this);
  }

  /**
   *  Sets a specific session to <me>
   */
  public void SetWS( XSControl_WorkSession  WS, long scratch) {
    OCCwrapJavaJNI.STEPControl_Writer_SetWS__SWIG_0(swigCPtr, this,  XSControl_WorkSession.getCPtr(WS) , WS, scratch);
  }

  public void SetWS( XSControl_WorkSession  WS) {
    OCCwrapJavaJNI.STEPControl_Writer_SetWS__SWIG_1(swigCPtr, this,  XSControl_WorkSession.getCPtr(WS) , WS);
  }

  public  XSControl_WorkSession  WS() {
    return new XSControl_WorkSession ( OCCwrapJavaJNI.STEPControl_Writer_WS(swigCPtr, this), true );
  }

  public  StepData_StepModel  Model(long newone) {
    return new StepData_StepModel ( OCCwrapJavaJNI.STEPControl_Writer_Model__SWIG_0(swigCPtr, this, newone), true );
  }

  public  StepData_StepModel  Model() {
    return new StepData_StepModel ( OCCwrapJavaJNI.STEPControl_Writer_Model__SWIG_1(swigCPtr, this), true );
  }

  /**
   *  Translates shape sh to a STEP
   *  entity. mode defines the STEP entity type to be output:
   *  - STEPControlStd_AsIs translates a shape to its highest possible
   *  STEP representation.
   *  - STEPControlStd_ManifoldSolidBrep translates a shape to a STEP
   *  manifold_solid_brep or brep_with_voids entity.
   *  - STEPControlStd_FacetedBrep translates a shape into a STEP
   *  faceted_brep entity.
   *  - STEPControlStd_ShellBasedSurfaceModel translates a shape into a STEP
   *  shell_based_surface_model entity.
   *  - STEPControlStd_GeometricCurveSet translates a shape into a STEP
   *  geometric_curve_set entity.
   */
  public IFSelect_ReturnStatus Transfer( TopoDS_Shape  sh, STEPControl_StepModelType mode, long compgraph) {
    return IFSelect_ReturnStatus.swigToEnum(OCCwrapJavaJNI.STEPControl_Writer_Transfer__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(sh), sh, mode.swigValue(), compgraph));
  }

  public IFSelect_ReturnStatus Transfer( TopoDS_Shape  sh, STEPControl_StepModelType mode) {
    return IFSelect_ReturnStatus.swigToEnum(OCCwrapJavaJNI.STEPControl_Writer_Transfer__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(sh), sh, mode.swigValue()));
  }

  /**
   *  Writes a STEP model in the file identified by filename.
   */
  public IFSelect_ReturnStatus Write(String filename) {
    return IFSelect_ReturnStatus.swigToEnum(OCCwrapJavaJNI.STEPControl_Writer_Write(swigCPtr, this, filename));
  }

  /**
   *  Displays the statistics for the
   *  last translation. what defines the kind of statistics that are displayed:
   *  - 0 gives general statistics   (number of translated roots,
   *  number of warnings, number of   fail messages),
   *  - 1 gives root results,
   *  - 2 gives statistics for all checked entities,
   *  - 3 gives the list of translated entities,
   *  - 4 gives warning and fail messages,
   *  - 5 gives fail messages only.
   *  mode is used according to the use of what. If what is 0, mode is
   *  ignored. If what is 1, 2 or 3, mode defines the following:
   *  - 0 lists the numbers of STEP entities in a STEP model,
   *  - 1 gives the number, identifier, type and result type for each
   *  STEP entity and/or its status (fail, warning, etc.),
   *  - 2 gives maximum information for each STEP entity (i.e. checks),
   *  - 3 gives the number of entities by the type of a STEP entity,
   *  - 4 gives the number of of STEP entities per result type and/or status,
   *  - 5 gives the number of pairs (STEP or result type and status),
   *  - 6 gives the number of pairs (STEP or result type and status)
   *  AND the list of entity numbers in the STEP model.
   */
  public void PrintStatsTransfer(int what, int mode) {
    OCCwrapJavaJNI.STEPControl_Writer_PrintStatsTransfer__SWIG_0(swigCPtr, this, what, mode);
  }

  public void PrintStatsTransfer(int what) {
    OCCwrapJavaJNI.STEPControl_Writer_PrintStatsTransfer__SWIG_1(swigCPtr, this, what);
  }

}
