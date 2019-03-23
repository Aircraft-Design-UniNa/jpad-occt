package opencascade;

/**
 *  A framework to present the principal properties of
 *  inertia of a system of which global properties are
 *  computed by a GProp_GProps object.
 *  There is always a set of axes for which the
 *  products of inertia of a geometric system are equal
 *  to 0; i.e. the matrix of inertia of the system is
 *  diagonal. These axes are the principal axes of
 *  inertia. Their origin is coincident with the center of
 *  mass of the system. The associated moments are
 *  called the principal moments of inertia.
 *  This sort of presentation object is created, filled and
 *  returned by the function PrincipalProperties for
 *  any GProp_GProps object, and can be queried to access the result.
 *  Note: The system whose principal properties of
 *  inertia are returned by this framework is referred to
 *  as the current system. The current system,
 *  however, is retained neither by this presentation
 *  framework nor by the GProp_GProps object which activates it.
 */
public class GProp_PrincipalProps {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GProp_PrincipalProps(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GProp_PrincipalProps(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GProp_PrincipalProps obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (GProp_PrincipalProps ptr) { Ptr = ptr; }
    public GProp_PrincipalProps AsReference () { return Ptr; }
    public GProp_PrincipalProps AsCopy () { return Ptr.MakeCopy(); }
    public GProp_PrincipalProps Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GProp_PrincipalProps(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  creates an undefined PrincipalProps.
   */
  public GProp_PrincipalProps() {
    this(OCCwrapJavaJNI.new_GProp_PrincipalProps(), true);
  }

  /**
   *  returns true if the geometric system has an axis of symmetry.
   *  For  comparing  moments  relative  tolerance  1.e-10  is  used.
   *  Usually  it  is  enough  for  objects,  restricted  by  faces  with
   *  analitycal  geometry.
   */
  public long HasSymmetryAxis() {
    return OCCwrapJavaJNI.GProp_PrincipalProps_HasSymmetryAxis__SWIG_0(swigCPtr, this);
  }

  /**
   *  returns true if the geometric system has an axis of symmetry.
   *  aTol  is  relative  tolerance for  cheking  equality  of  moments
   *  If  aTol  ==  0,  relative  tolerance  is  ~  1.e-16  (Epsilon(I))
   */
  public long HasSymmetryAxis(double aTol) {
    return OCCwrapJavaJNI.GProp_PrincipalProps_HasSymmetryAxis__SWIG_1(swigCPtr, this, aTol);
  }

  /**
   *  returns true if the geometric system has a point of symmetry.
   *  For  comparing  moments  relative  tolerance  1.e-10  is  used.
   *  Usually  it  is  enough  for  objects,  restricted  by  faces  with
   *  analitycal  geometry.
   */
  public long HasSymmetryPoint() {
    return OCCwrapJavaJNI.GProp_PrincipalProps_HasSymmetryPoint__SWIG_0(swigCPtr, this);
  }

  /**
   *  returns true if the geometric system has a point of symmetry.
   *  aTol  is  relative  tolerance for  cheking  equality  of  moments
   *  If  aTol  ==  0,  relative  tolerance  is  ~  1.e-16  (Epsilon(I))
   */
  public long HasSymmetryPoint(double aTol) {
    return OCCwrapJavaJNI.GProp_PrincipalProps_HasSymmetryPoint__SWIG_1(swigCPtr, this, aTol);
  }

  /**
   *  Ixx, Iyy and Izz return the principal moments of inertia
   *  in the current system.
   *  Notes :
   *  - If the current system has an axis of symmetry, two
   *  of the three values Ixx, Iyy and Izz are equal. They
   *  indicate which eigen vectors define an infinity of
   *  axes of principal inertia.
   *  - If the current system has a center of symmetry, Ixx,
   *  Iyy and Izz are equal.
   */
  public void Moments(double[] Ixx, double[] Iyy, double[] Izz) {
    OCCwrapJavaJNI.GProp_PrincipalProps_Moments(swigCPtr, this, Ixx, Iyy, Izz);
  }

  /**
   *  returns the first axis of inertia.
   * 
   *  if the system has a point of symmetry there is an infinity of
   *  solutions. It is not possible to defines the three axis of
   *  inertia.
   */
  public  gp_Vec  FirstAxisOfInertia() {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.GProp_PrincipalProps_FirstAxisOfInertia(swigCPtr, this), true);
    return ret;
  }

  /**
   *  returns the second axis of inertia.
   * 
   *  if the system has a point of symmetry or an axis of symmetry the
   *  second and the third axis of symmetry are undefined.
   */
  public  gp_Vec  SecondAxisOfInertia() {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.GProp_PrincipalProps_SecondAxisOfInertia(swigCPtr, this), true);
    return ret;
  }

  /**
   *  returns the third axis of inertia.
   *  This and the above functions return the first, second or third eigen vector of the
   *  matrix of inertia of the current system.
   *  The first, second and third principal axis of inertia
   *  pass through the center of mass of the current
   *  system. They are respectively parallel to these three eigen vectors.
   *  Note that:
   *  - If the current system has an axis of symmetry, any
   *  axis is an axis of principal inertia if it passes
   *  through the center of mass of the system, and runs
   *  parallel to a linear combination of the two eigen
   *  vectors of the matrix of inertia, corresponding to the
   *  two eigen values which are equal. If the current
   *  system has a center of symmetry, any axis passing
   *  through the center of mass of the system is an axis
   *  of principal inertia. Use the functions
   *  HasSymmetryAxis and HasSymmetryPoint to
   *  check these particular cases, where the returned
   *  eigen vectors define an infinity of principal axis of inertia.
   *  - The Moments function can be used to know which
   *  of the three eigen vectors corresponds to the two
   *  eigen values which are equal.
   * 
   *  if the system has a point of symmetry or an axis of symmetry the
   *  second and the third axis of symmetry are undefined.
   */
  public  gp_Vec  ThirdAxisOfInertia() {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.GProp_PrincipalProps_ThirdAxisOfInertia(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the principal radii of gyration  Rxx, Ryy
   *  and Rzz are the radii of gyration of the current
   *  system about its three principal axes of inertia.
   *  Note that:
   *  - If the current system has an axis of symmetry,
   *  two of the three values Rxx, Ryy and Rzz are equal.
   *  - If the current system has a center of symmetry,
   *  Rxx, Ryy and Rzz are equal.
   */
  public void RadiusOfGyration(double[] Rxx, double[] Ryy, double[] Rzz) {
    OCCwrapJavaJNI.GProp_PrincipalProps_RadiusOfGyration(swigCPtr, this, Rxx, Ryy, Rzz);
  }

}
