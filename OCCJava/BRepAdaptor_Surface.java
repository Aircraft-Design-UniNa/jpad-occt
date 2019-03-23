package opencascade;

/**
 *  The Surface from BRepAdaptor allows to  use a Face
 *  of the BRep topology look like a 3D surface.
 * 
 *  It  has  the methods  of  the class   Surface from
 *  Adaptor3d.
 * 
 *  It is created or initialized with a Face. It takes
 *  into account the local coordinates system.
 * 
 *  The  u,v parameter range is   the minmax value for
 *  the  restriction,  unless  the flag restriction is
 *  set to false.
 */
public class BRepAdaptor_Surface extends Adaptor3d_Surface {

  private long swigCPtr;
  BRepAdaptor_Surface(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepAdaptor_Surface_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepAdaptor_Surface(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepAdaptor_Surface_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepAdaptor_Surface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepAdaptor_Surface(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Creates an undefined surface with no face loaded.
   */
  public BRepAdaptor_Surface() {
    this(OCCwrapJavaJNI.new_BRepAdaptor_Surface__SWIG_0(), true);
  }

  /**
   *  Creates a surface to  access the geometry  of <F>.
   *  If  <Restriction> is  true  the parameter range is
   *  the  parameter  range  in   the  UV space  of  the
   *  restriction.
   */
  public BRepAdaptor_Surface( TopoDS_Face  F, long R) {
    this(OCCwrapJavaJNI.new_BRepAdaptor_Surface__SWIG_1(TopoDS_Face.getCPtr(F), F, R), true);
  }

  public BRepAdaptor_Surface( TopoDS_Face  F) {
    this(OCCwrapJavaJNI.new_BRepAdaptor_Surface__SWIG_2(TopoDS_Face.getCPtr(F), F), true);
  }

  /**
   *  Sets the surface to the geometry of <F>.
   */
  public void Initialize( TopoDS_Face  F, long Restriction) {
    OCCwrapJavaJNI.BRepAdaptor_Surface_Initialize__SWIG_0(swigCPtr, this, TopoDS_Face.getCPtr(F), F, Restriction);
  }

  public void Initialize( TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepAdaptor_Surface_Initialize__SWIG_1(swigCPtr, this, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Returns the surface.
   */
  public  GeomAdaptor_Surface  Surface() {
    GeomAdaptor_Surface ret = new GeomAdaptor_Surface(OCCwrapJavaJNI.BRepAdaptor_Surface_Surface(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the surface.
   */
  public  GeomAdaptor_Surface  ChangeSurface() {
    GeomAdaptor_Surface ret = new GeomAdaptor_Surface(OCCwrapJavaJNI.BRepAdaptor_Surface_ChangeSurface(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the surface coordinate system.
   */
  public  gp_Trsf  Trsf() {
    gp_Trsf ret = new gp_Trsf(OCCwrapJavaJNI.BRepAdaptor_Surface_Trsf(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the face.
   */
  public  TopoDS_Face  Face() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.BRepAdaptor_Surface_Face(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the face tolerance.
   */
  public double Tolerance() {
    return OCCwrapJavaJNI.BRepAdaptor_Surface_Tolerance(swigCPtr, this);
  }

}
