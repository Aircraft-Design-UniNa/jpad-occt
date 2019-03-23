package opencascade;

/**
 *  The class provides the root interface for the algorithms in Boolean Component.
 */
public class BOPAlgo_Algo extends BOPAlgo_Options {

  private long swigCPtr;
  BOPAlgo_Algo(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_Algo_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BOPAlgo_Algo(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_Algo_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BOPAlgo_Algo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void Perform() {
    OCCwrapJavaJNI.BOPAlgo_Algo_Perform(swigCPtr, this);
  }

}
