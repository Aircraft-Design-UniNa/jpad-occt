package opencascade;

/**
 *  The Curve2d from BRepAdaptor allows to use an Edge
 *  on   a Face like   a  2d   curve. (curve  in   the
 *  parametric space).
 * 
 *  It  has  the methods    of the class Curve2d  from
 *  Adpator.
 * 
 *  It  is created or  initialized with a  Face and an
 *  Edge.  The methods are  inherited from  Curve from
 *  Geom2dAdaptor.
 */
public class BRepAdaptor_Curve2d extends Geom2dAdaptor_Curve {

  private long swigCPtr;
  BRepAdaptor_Curve2d(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepAdaptor_Curve2d_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepAdaptor_Curve2d(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepAdaptor_Curve2d_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepAdaptor_Curve2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepAdaptor_Curve2d(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Creates an uninitialized curve2d.
   */
  public BRepAdaptor_Curve2d() {
    this(OCCwrapJavaJNI.new_BRepAdaptor_Curve2d__SWIG_0(), true);
  }

  /**
   *  Creates with the pcurve of <E> on <F>.
   */
  public BRepAdaptor_Curve2d( TopoDS_Edge  E,  TopoDS_Face  F) {
    this(OCCwrapJavaJNI.new_BRepAdaptor_Curve2d__SWIG_1(TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F), true);
  }

  /**
   *  Initialize with the pcurve of <E> on <F>.
   */
  public void Initialize( TopoDS_Edge  E,  TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepAdaptor_Curve2d_Initialize(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Returns the Edge.
   */
  public  TopoDS_Edge  Edge() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepAdaptor_Curve2d_Edge(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the Face.
   */
  public  TopoDS_Face  Face() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.BRepAdaptor_Curve2d_Face(swigCPtr, this), true);
    return ret;
  }

}
