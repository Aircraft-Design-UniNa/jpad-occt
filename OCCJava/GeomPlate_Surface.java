package opencascade;

/**
 *  Describes the characteristics of plate surface objects
 *  returned by BuildPlateSurface::Surface. These can be
 *  used to verify the quality of the resulting surface before
 *  approximating it to a Geom_BSpline surface generated
 *  by MakeApprox. This proves necessary in cases where
 *  you want to use the resulting surface as the support for
 *  a shape. The algorithmically generated surface cannot
 *  fill this function as is, and as a result must be converted first.
 */
public class GeomPlate_Surface extends Geom_Surface {
  GeomPlate_Surface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public GeomPlate_Surface( Geom_Surface  Surfinit,  Plate_Plate  Surfinter) {
    this(OCCwrapJavaJNI.new_GeomPlate_Surface( Geom_Surface.getCPtr(Surfinit) , Surfinit, Plate_Plate.getCPtr(Surfinter), Surfinter), true);
  }

  public  Geom_Surface  CallSurfinit() {
    return new Geom_Surface ( OCCwrapJavaJNI.GeomPlate_Surface_CallSurfinit(swigCPtr, this), true );
  }

  public void SetBounds(double Umin, double Umax, double Vmin, double Vmax) {
    OCCwrapJavaJNI.GeomPlate_Surface_SetBounds(swigCPtr, this, Umin, Umax, Vmin, Vmax);
  }

  public void RealBounds(double[] U1, double[] U2, double[] V1, double[] V2) {
    OCCwrapJavaJNI.GeomPlate_Surface_RealBounds(swigCPtr, this, U1, U2, V1, V2);
  }

  public void Constraints( TColgp_SequenceOfXY  Seq) {
    OCCwrapJavaJNI.GeomPlate_Surface_Constraints(swigCPtr, this, TColgp_SequenceOfXY.getCPtr(Seq), Seq);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.GeomPlate_Surface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomPlate_Surface_get_type_descriptor(), true );
  }

  public static  GeomPlate_Surface  DownCast( Standard_Transient  T) {
    return new GeomPlate_Surface ( OCCwrapJavaJNI.GeomPlate_Surface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomPlate_Surface_TypeOf(), true );
  }

}
