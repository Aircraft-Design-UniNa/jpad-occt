package opencascade;

public class IntTools_SurfaceRangeLocalizeData {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntTools_SurfaceRangeLocalizeData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntTools_SurfaceRangeLocalizeData(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntTools_SurfaceRangeLocalizeData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntTools_SurfaceRangeLocalizeData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntTools_SurfaceRangeLocalizeData() {
    this(OCCwrapJavaJNI.new_IntTools_SurfaceRangeLocalizeData__SWIG_0(), true);
  }

  public IntTools_SurfaceRangeLocalizeData(int theNbSampleU, int theNbSampleV, double theMinRangeU, double theMinRangeV) {
    this(OCCwrapJavaJNI.new_IntTools_SurfaceRangeLocalizeData__SWIG_1(theNbSampleU, theNbSampleV, theMinRangeU, theMinRangeV), true);
  }

  public IntTools_SurfaceRangeLocalizeData( IntTools_SurfaceRangeLocalizeData  Other) {
    this(OCCwrapJavaJNI.new_IntTools_SurfaceRangeLocalizeData__SWIG_2(IntTools_SurfaceRangeLocalizeData.getCPtr(Other), Other), true);
  }

  public  IntTools_SurfaceRangeLocalizeData  Assign( IntTools_SurfaceRangeLocalizeData  Other) {
    IntTools_SurfaceRangeLocalizeData ret = new IntTools_SurfaceRangeLocalizeData(OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_Assign(swigCPtr, this, IntTools_SurfaceRangeLocalizeData.getCPtr(Other), Other), false, this);
    return ret;
  }

  public int GetNbSampleU() {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_GetNbSampleU(swigCPtr, this);
  }

  public int GetNbSampleV() {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_GetNbSampleV(swigCPtr, this);
  }

  public double GetMinRangeU() {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_GetMinRangeU(swigCPtr, this);
  }

  public double GetMinRangeV() {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_GetMinRangeV(swigCPtr, this);
  }

  public void AddOutRange( IntTools_SurfaceRangeSample  theRange) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_AddOutRange(swigCPtr, this, IntTools_SurfaceRangeSample.getCPtr(theRange), theRange);
  }

  public void AddBox( IntTools_SurfaceRangeSample  theRange,  Bnd_Box  theBox) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_AddBox(swigCPtr, this, IntTools_SurfaceRangeSample.getCPtr(theRange), theRange, Bnd_Box.getCPtr(theBox), theBox);
  }

  public long FindBox( IntTools_SurfaceRangeSample  theRange, Bnd_Box theBox) {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_FindBox(swigCPtr, this, IntTools_SurfaceRangeSample.getCPtr(theRange), theRange, Bnd_Box.getCPtr(theBox), theBox);
  }

  public long IsRangeOut( IntTools_SurfaceRangeSample  theRange) {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_IsRangeOut(swigCPtr, this, IntTools_SurfaceRangeSample.getCPtr(theRange), theRange);
  }

  public void ListRangeOut(IntTools_ListOfSurfaceRangeSample theList) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_ListRangeOut(swigCPtr, this, IntTools_ListOfSurfaceRangeSample.getCPtr(theList), theList);
  }

  public void RemoveRangeOutAll() {
    OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_RemoveRangeOutAll(swigCPtr, this);
  }

  /**
   *  Set the grid deflection.
   */
  public void SetGridDeflection(double theDeflection) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_SetGridDeflection(swigCPtr, this, theDeflection);
  }

  /**
   *  Query the grid deflection.
   */
  public double GetGridDeflection() {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_GetGridDeflection(swigCPtr, this);
  }

  /**
   *  Set the range U of the grid of points.
   */
  public void SetRangeUGrid(int theNbUGrid) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_SetRangeUGrid(swigCPtr, this, theNbUGrid);
  }

  /**
   *  Query the range U of the grid of points.
   */
  public int GetRangeUGrid() {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_GetRangeUGrid(swigCPtr, this);
  }

  /**
   *  Set the U parameter of the grid points at that index.
   */
  public void SetUParam(int theIndex, double theUParam) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_SetUParam(swigCPtr, this, theIndex, theUParam);
  }

  /**
   *  Query the U parameter of the grid points at that index.
   */
  public double GetUParam(int theIndex) {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_GetUParam(swigCPtr, this, theIndex);
  }

  /**
   *  Set the range V of the grid of points.
   */
  public void SetRangeVGrid(int theNbVGrid) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_SetRangeVGrid(swigCPtr, this, theNbVGrid);
  }

  /**
   *  Query the range V of the grid of points.
   */
  public int GetRangeVGrid() {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_GetRangeVGrid(swigCPtr, this);
  }

  /**
   *  Set the V parameter of the grid points at that index.
   */
  public void SetVParam(int theIndex, double theVParam) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_SetVParam(swigCPtr, this, theIndex, theVParam);
  }

  /**
   *  Query the V parameter of the grid points at that index.
   */
  public double GetVParam(int theIndex) {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_GetVParam(swigCPtr, this, theIndex);
  }

  /**
   *  Set the grid point.
   */
  public void SetGridPoint(int theUIndex, int theVIndex,  gp_Pnt  thePoint) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_SetGridPoint(swigCPtr, this, theUIndex, theVIndex, gp_Pnt.getCPtr(thePoint), thePoint);
  }

  /**
   *  Set the grid point.
   */
  public  gp_Pnt  GetGridPoint(int theUIndex, int theVIndex) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_GetGridPoint(swigCPtr, this, theUIndex, theVIndex), true);
    return ret;
  }

  /**
   *  Sets the frame area. Used to work with grid points.
   */
  public void SetFrame(double theUMin, double theUMax, double theVMin, double theVMax) {
    OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_SetFrame(swigCPtr, this, theUMin, theUMax, theVMin, theVMax);
  }

  /**
   *  Returns the number of grid points on U direction in frame.
   */
  public int GetNBUPointsInFrame() {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_GetNBUPointsInFrame(swigCPtr, this);
  }

  /**
   *  Returns the number of grid points on V direction in frame.
   */
  public int GetNBVPointsInFrame() {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_GetNBVPointsInFrame(swigCPtr, this);
  }

  /**
   *  Returns the grid point in frame.
   */
  public  gp_Pnt  GetPointInFrame(int theUIndex, int theVIndex) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_GetPointInFrame(swigCPtr, this, theUIndex, theVIndex), true);
    return ret;
  }

  /**
   *  Query the U parameter of the grid points
   *  at that index in frame.
   */
  public double GetUParamInFrame(int theIndex) {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_GetUParamInFrame(swigCPtr, this, theIndex);
  }

  /**
   *  Query the V parameter of the grid points
   *  at that index in frame.
   */
  public double GetVParamInFrame(int theIndex) {
    return OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_GetVParamInFrame(swigCPtr, this, theIndex);
  }

  /**
   *  Clears the grid of points.
   */
  public void ClearGrid() {
    OCCwrapJavaJNI.IntTools_SurfaceRangeLocalizeData_ClearGrid(swigCPtr, this);
  }

}
