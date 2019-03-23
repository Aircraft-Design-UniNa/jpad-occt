package opencascade;

/**
 *  This class creates and writes
 *  STL files from Open CASCADE shapes. An STL file can be written to an existing STL file or to a new one.
 */
public class StlAPI_Writer {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StlAPI_Writer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StlAPI_Writer(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StlAPI_Writer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StlAPI_Writer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a writer object with default parameters: ASCIIMode.
   */
  public StlAPI_Writer() {
    this(OCCwrapJavaJNI.new_StlAPI_Writer(), true);
  }

  public long[] ASCIIMode() {return OCCwrapJavaJNI.StlAPI_Writer_ASCIIMode(swigCPtr, this);}

  /**
   *  Converts a given shape to STL format and writes it to file with a given filename.
   *  \return the error state.
   */
  public long Write( TopoDS_Shape  theShape, String theFileName) {
    return OCCwrapJavaJNI.StlAPI_Writer_Write(swigCPtr, this, TopoDS_Shape.getCPtr(theShape), theShape, theFileName);
  }

}
