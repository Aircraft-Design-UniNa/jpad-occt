package opencascade;

/**
 *  Rebuilds connectivity between faces in shell
 */
public class ShapeFix_FaceConnect {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeFix_FaceConnect(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeFix_FaceConnect(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeFix_FaceConnect obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeFix_FaceConnect(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ShapeFix_FaceConnect() {
    this(OCCwrapJavaJNI.new_ShapeFix_FaceConnect(), true);
  }

  public long Add( TopoDS_Face  aFirst,  TopoDS_Face  aSecond) {
    return OCCwrapJavaJNI.ShapeFix_FaceConnect_Add(swigCPtr, this, TopoDS_Face.getCPtr(aFirst), aFirst, TopoDS_Face.getCPtr(aSecond), aSecond);
  }

  public TopoDS_Shell Build( TopoDS_Shell  shell, double sewtoler, double fixtoler) {
    return new TopoDS_Shell(OCCwrapJavaJNI.ShapeFix_FaceConnect_Build(swigCPtr, this, TopoDS_Shell.getCPtr(shell), shell, sewtoler, fixtoler), true);
  }

  /**
   *  Clears internal data structure
   */
  public void Clear() {
    OCCwrapJavaJNI.ShapeFix_FaceConnect_Clear(swigCPtr, this);
  }

}
