package opencascade;

/**
 *  This class gives a simple way to create then write a
 *  Model compliant to a given norm, from a Shape
 *  The model can then be edited by tools by other appropriate tools
 */
public class XSControl_Writer {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  XSControl_Writer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  XSControl_Writer(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(XSControl_Writer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_XSControl_Writer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a Writer from scratch
   */
  public XSControl_Writer() {
    this(OCCwrapJavaJNI.new_XSControl_Writer__SWIG_0(), true);
  }

  /**
   *  Creates a Writer from scratch, with a norm name which
   *  identifie a Controller
   */
  public XSControl_Writer(String norm) {
    this(OCCwrapJavaJNI.new_XSControl_Writer__SWIG_1(norm), true);
  }

  /**
   *  Creates a Writer from an already existing Session
   *  If <scratch> is True (D), clears already recorded data
   */
  public XSControl_Writer( XSControl_WorkSession  WS, long scratch) {
    this(OCCwrapJavaJNI.new_XSControl_Writer__SWIG_2( XSControl_WorkSession.getCPtr(WS) , WS, scratch), true);
  }

  public XSControl_Writer( XSControl_WorkSession  WS) {
    this(OCCwrapJavaJNI.new_XSControl_Writer__SWIG_3( XSControl_WorkSession.getCPtr(WS) , WS), true);
  }

  /**
   *  Sets a specific norm to <me>
   *  Returns True if done, False if <norm> is not available
   */
  public long SetNorm(String norm) {
    return OCCwrapJavaJNI.XSControl_Writer_SetNorm(swigCPtr, this, norm);
  }

  /**
   *  Sets a specific session to <me>
   */
  public void SetWS( XSControl_WorkSession  WS, long scratch) {
    OCCwrapJavaJNI.XSControl_Writer_SetWS__SWIG_0(swigCPtr, this,  XSControl_WorkSession.getCPtr(WS) , WS, scratch);
  }

  public void SetWS( XSControl_WorkSession  WS) {
    OCCwrapJavaJNI.XSControl_Writer_SetWS__SWIG_1(swigCPtr, this,  XSControl_WorkSession.getCPtr(WS) , WS);
  }

  public  XSControl_WorkSession  WS() {
    return new XSControl_WorkSession ( OCCwrapJavaJNI.XSControl_Writer_WS(swigCPtr, this), true );
  }

  public  Interface_InterfaceModel  Model(long newone) {
    return new Interface_InterfaceModel ( OCCwrapJavaJNI.XSControl_Writer_Model__SWIG_0(swigCPtr, this, newone), true );
  }

  public  Interface_InterfaceModel  Model() {
    return new Interface_InterfaceModel ( OCCwrapJavaJNI.XSControl_Writer_Model__SWIG_1(swigCPtr, this), true );
  }

  /**
   *  Transfers a Shape according to the mode
   */
  public IFSelect_ReturnStatus TransferShape( TopoDS_Shape  sh, int mode) {
    return IFSelect_ReturnStatus.swigToEnum(OCCwrapJavaJNI.XSControl_Writer_TransferShape__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(sh), sh, mode));
  }

  public IFSelect_ReturnStatus TransferShape( TopoDS_Shape  sh) {
    return IFSelect_ReturnStatus.swigToEnum(OCCwrapJavaJNI.XSControl_Writer_TransferShape__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(sh), sh));
  }

  /**
   *  Writes the produced model
   */
  public IFSelect_ReturnStatus WriteFile(String filename) {
    return IFSelect_ReturnStatus.swigToEnum(OCCwrapJavaJNI.XSControl_Writer_WriteFile(swigCPtr, this, filename));
  }

  /**
   *  Prints Statistics about Transfer
   */
  public void PrintStatsTransfer(int what, int mode) {
    OCCwrapJavaJNI.XSControl_Writer_PrintStatsTransfer__SWIG_0(swigCPtr, this, what, mode);
  }

  public void PrintStatsTransfer(int what) {
    OCCwrapJavaJNI.XSControl_Writer_PrintStatsTransfer__SWIG_1(swigCPtr, this, what);
  }

}
