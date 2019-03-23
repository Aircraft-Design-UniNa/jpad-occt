package opencascade;

/**
 *  Dumps shape contents
 */
public class ShapeAnalysis_ShapeContents {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeAnalysis_ShapeContents(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeAnalysis_ShapeContents(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeAnalysis_ShapeContents obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeAnalysis_ShapeContents(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Initialize fields and call ClearFlags()
   */
  public ShapeAnalysis_ShapeContents() {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_ShapeContents(), true);
  }

  /**
   *  Clears all accumulated statictics
   */
  public void Clear() {
    OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_Clear(swigCPtr, this);
  }

  /**
   *  Clears all flags
   */
  public void ClearFlags() {
    OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_ClearFlags(swigCPtr, this);
  }

  /**
   *  Counts quantities of sun-shapes in shape and
   *  stores sub-shapes according to flags
   */
  public void Perform( TopoDS_Shape  shape) {
    OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_Perform(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape);
  }

  public long[] ModifyBigSplineMode() {return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_ModifyBigSplineMode(swigCPtr, this);}

  public long[] ModifyIndirectMode() {return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_ModifyIndirectMode(swigCPtr, this);}

  public long[] ModifyOffestSurfaceMode() {return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_ModifyOffestSurfaceMode(swigCPtr, this);}

  public long[] ModifyTrimmed3dMode() {return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_ModifyTrimmed3dMode(swigCPtr, this);}

  public long[] ModifyOffsetCurveMode() {return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_ModifyOffsetCurveMode(swigCPtr, this);}

  public long[] ModifyTrimmed2dMode() {return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_ModifyTrimmed2dMode(swigCPtr, this);}

  public int NbSolids() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbSolids(swigCPtr, this);
  }

  public int NbShells() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbShells(swigCPtr, this);
  }

  public int NbFaces() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbFaces(swigCPtr, this);
  }

  public int NbWires() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbWires(swigCPtr, this);
  }

  public int NbEdges() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbEdges(swigCPtr, this);
  }

  public int NbVertices() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbVertices(swigCPtr, this);
  }

  public int NbSolidsWithVoids() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbSolidsWithVoids(swigCPtr, this);
  }

  public int NbBigSplines() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbBigSplines(swigCPtr, this);
  }

  public int NbC0Surfaces() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbC0Surfaces(swigCPtr, this);
  }

  public int NbC0Curves() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbC0Curves(swigCPtr, this);
  }

  public int NbOffsetSurf() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbOffsetSurf(swigCPtr, this);
  }

  public int NbIndirectSurf() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbIndirectSurf(swigCPtr, this);
  }

  public int NbOffsetCurves() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbOffsetCurves(swigCPtr, this);
  }

  public int NbTrimmedCurve2d() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbTrimmedCurve2d(swigCPtr, this);
  }

  public int NbTrimmedCurve3d() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbTrimmedCurve3d(swigCPtr, this);
  }

  public int NbBSplibeSurf() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbBSplibeSurf(swigCPtr, this);
  }

  public int NbBezierSurf() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbBezierSurf(swigCPtr, this);
  }

  public int NbTrimSurf() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbTrimSurf(swigCPtr, this);
  }

  public int NbWireWitnSeam() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbWireWitnSeam(swigCPtr, this);
  }

  public int NbWireWithSevSeams() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbWireWithSevSeams(swigCPtr, this);
  }

  public int NbFaceWithSevWires() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbFaceWithSevWires(swigCPtr, this);
  }

  public int NbNoPCurve() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbNoPCurve(swigCPtr, this);
  }

  public int NbFreeFaces() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbFreeFaces(swigCPtr, this);
  }

  public int NbFreeWires() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbFreeWires(swigCPtr, this);
  }

  public int NbFreeEdges() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbFreeEdges(swigCPtr, this);
  }

  public int NbSharedSolids() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbSharedSolids(swigCPtr, this);
  }

  public int NbSharedShells() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbSharedShells(swigCPtr, this);
  }

  public int NbSharedFaces() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbSharedFaces(swigCPtr, this);
  }

  public int NbSharedWires() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbSharedWires(swigCPtr, this);
  }

  public int NbSharedFreeWires() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbSharedFreeWires(swigCPtr, this);
  }

  public int NbSharedFreeEdges() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbSharedFreeEdges(swigCPtr, this);
  }

  public int NbSharedEdges() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbSharedEdges(swigCPtr, this);
  }

  public int NbSharedVertices() {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_NbSharedVertices(swigCPtr, this);
  }

  public  TopTools_HSequenceOfShape  BigSplineSec() {
    return new TopTools_HSequenceOfShape ( OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_BigSplineSec(swigCPtr, this), true );
  }

  public  TopTools_HSequenceOfShape  IndirectSec() {
    return new TopTools_HSequenceOfShape ( OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_IndirectSec(swigCPtr, this), true );
  }

  public  TopTools_HSequenceOfShape  OffsetSurfaceSec() {
    return new TopTools_HSequenceOfShape ( OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_OffsetSurfaceSec(swigCPtr, this), true );
  }

  public  TopTools_HSequenceOfShape  Trimmed3dSec() {
    return new TopTools_HSequenceOfShape ( OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_Trimmed3dSec(swigCPtr, this), true );
  }

  public  TopTools_HSequenceOfShape  OffsetCurveSec() {
    return new TopTools_HSequenceOfShape ( OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_OffsetCurveSec(swigCPtr, this), true );
  }

  public  TopTools_HSequenceOfShape  Trimmed2dSec() {
    return new TopTools_HSequenceOfShape ( OCCwrapJavaJNI.ShapeAnalysis_ShapeContents_Trimmed2dSec(swigCPtr, this), true );
  }

}
