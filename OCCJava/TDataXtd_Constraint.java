package opencascade;

/**
 *  The groundwork to define constraint attributes.
 *  The constraint attribute contains the following sorts of data:
 *  -   Type whether the constraint attribute is a
 *  geometric constraint or a dimension
 *  -   Value the real number value of a numeric
 *  constraint such as an angle or a radius
 *  -   Geometries to identify the geometries
 *  underlying the topological attributes which
 *  define the constraint (up to 4)
 *  -   Plane for 2D constraints.
 */
public class TDataXtd_Constraint extends TDF_Attribute {
  TDataXtd_Constraint(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Finds or creates the constraint attribute defined
   *  by the topological attribute G1 and the constraint type type.
   */
  public static  TDataXtd_Constraint  Set( TDF_Label  label) {
    return new TDataXtd_Constraint ( OCCwrapJavaJNI.TDataXtd_Constraint_Set__SWIG_0(TDF_Label.getCPtr(label), label), true );
  }

  public TDataXtd_Constraint() {
    this(OCCwrapJavaJNI.new_TDataXtd_Constraint(), true);
  }

  /**
   *  Finds or creates the constraint attribute defined
   *  by the topological attributes G1 and G2, and by
   *  the constraint type type.
   */
  public void Set(TDataXtd_ConstraintEnum type,  TNaming_NamedShape  G1) {
    OCCwrapJavaJNI.TDataXtd_Constraint_Set__SWIG_1(swigCPtr, this, type.swigValue(),  TNaming_NamedShape.getCPtr(G1) , G1);
  }

  /**
   *  Finds or creates the constraint attribute defined
   *  by the topological attributes G1, G2 and G3, and
   *  by the constraint type type.
   */
  public void Set(TDataXtd_ConstraintEnum type,  TNaming_NamedShape  G1,  TNaming_NamedShape  G2) {
    OCCwrapJavaJNI.TDataXtd_Constraint_Set__SWIG_2(swigCPtr, this, type.swigValue(),  TNaming_NamedShape.getCPtr(G1) , G1,  TNaming_NamedShape.getCPtr(G2) , G2);
  }

  /**
   *  Finds or creates the constraint attribute defined
   *  by the topological attributes G1, G2, G3 and G4,
   *  and by the constraint type type.
   *  methods to read constraint fields
   *  =================================
   */
  public void Set(TDataXtd_ConstraintEnum type,  TNaming_NamedShape  G1,  TNaming_NamedShape  G2,  TNaming_NamedShape  G3) {
    OCCwrapJavaJNI.TDataXtd_Constraint_Set__SWIG_3(swigCPtr, this, type.swigValue(),  TNaming_NamedShape.getCPtr(G1) , G1,  TNaming_NamedShape.getCPtr(G2) , G2,  TNaming_NamedShape.getCPtr(G3) , G3);
  }

  public void Set(TDataXtd_ConstraintEnum type,  TNaming_NamedShape  G1,  TNaming_NamedShape  G2,  TNaming_NamedShape  G3,  TNaming_NamedShape  G4) {
    OCCwrapJavaJNI.TDataXtd_Constraint_Set__SWIG_4(swigCPtr, this, type.swigValue(),  TNaming_NamedShape.getCPtr(G1) , G1,  TNaming_NamedShape.getCPtr(G2) , G2,  TNaming_NamedShape.getCPtr(G3) , G3,  TNaming_NamedShape.getCPtr(G4) , G4);
  }

  /**
   *  Returns true if this constraint attribute is valid.
   *  By default, true is returned.
   *  When the value of a dimension is changed or
   *  when a geometry is moved, false is returned
   *  until the solver sets it back to true.
   */
  public long Verified() {
    return OCCwrapJavaJNI.TDataXtd_Constraint_Verified__SWIG_0(swigCPtr, this);
  }

  public TDataXtd_ConstraintEnum GetConstraintType() {
    return TDataXtd_ConstraintEnum.swigToEnum(OCCwrapJavaJNI.TDataXtd_Constraint_GetConstraintType(swigCPtr, this));
  }

  /**
   *  Returns true if this constraint attribute is
   *  two-dimensional.
   */
  public long IsPlanar() {
    return OCCwrapJavaJNI.TDataXtd_Constraint_IsPlanar(swigCPtr, this);
  }

  public  TNaming_NamedShape  GetPlane() {
    return new TNaming_NamedShape ( OCCwrapJavaJNI.TDataXtd_Constraint_GetPlane(swigCPtr, this), true );
  }

  /**
   *  Returns true if this constraint attribute is a
   *  dimension, and therefore has a value.
   */
  public long IsDimension() {
    return OCCwrapJavaJNI.TDataXtd_Constraint_IsDimension(swigCPtr, this);
  }

  public  TDataStd_Real  GetValue() {
    return new TDataStd_Real ( OCCwrapJavaJNI.TDataXtd_Constraint_GetValue(swigCPtr, this), true );
  }

  /**
   *  Returns the number of geometry attributes in this constraint attribute.
   *  This number will be between 1 and 4.
   */
  public int NbGeometries() {
    return OCCwrapJavaJNI.TDataXtd_Constraint_NbGeometries(swigCPtr, this);
  }

  public  TNaming_NamedShape  GetGeometry(int Index) {
    return new TNaming_NamedShape ( OCCwrapJavaJNI.TDataXtd_Constraint_GetGeometry(swigCPtr, this, Index), true );
  }

  /**
   *  Removes the geometries involved in the
   *  constraint or dimension from the array of
   *  topological attributes where they are stored.
   */
  public void ClearGeometries() {
    OCCwrapJavaJNI.TDataXtd_Constraint_ClearGeometries(swigCPtr, this);
  }

  /**
   *  Finds or creates the type of constraint CTR.
   */
  public void SetType(TDataXtd_ConstraintEnum CTR) {
    OCCwrapJavaJNI.TDataXtd_Constraint_SetType(swigCPtr, this, CTR.swigValue());
  }

  /**
   *  Finds or creates the plane of the 2D constraint
   *  attribute, defined by the planar topological attribute plane.
   */
  public void SetPlane( TNaming_NamedShape  plane) {
    OCCwrapJavaJNI.TDataXtd_Constraint_SetPlane(swigCPtr, this,  TNaming_NamedShape.getCPtr(plane) , plane);
  }

  /**
   *  Finds or creates the real number value V of the dimension constraint attribute.
   */
  public void SetValue( TDataStd_Real  V) {
    OCCwrapJavaJNI.TDataXtd_Constraint_SetValue(swigCPtr, this,  TDataStd_Real.getCPtr(V) , V);
  }

  /**
   *  Finds or creates the underlying geometry of the
   *  constraint defined by the topological attribute G
   *  and the integer index Index.
   */
  public void SetGeometry(int Index,  TNaming_NamedShape  G) {
    OCCwrapJavaJNI.TDataXtd_Constraint_SetGeometry(swigCPtr, this, Index,  TNaming_NamedShape.getCPtr(G) , G);
  }

  /**
   *  Returns true if this constraint attribute defined by status is valid.
   *  By default, true is returned.
   *  When the value of a dimension is changed or
   *  when a geometry is moved, false is returned until
   *  the solver sets it back to true.
   *  If status is false, Verified is set to false.
   */
  public void Verified(long status) {
    OCCwrapJavaJNI.TDataXtd_Constraint_Verified__SWIG_1(swigCPtr, this, status);
  }

  public void Inverted(long status) {
    OCCwrapJavaJNI.TDataXtd_Constraint_Inverted__SWIG_0(swigCPtr, this, status);
  }

  public long Inverted() {
    return OCCwrapJavaJNI.TDataXtd_Constraint_Inverted__SWIG_1(swigCPtr, this);
  }

  public void Reversed(long status) {
    OCCwrapJavaJNI.TDataXtd_Constraint_Reversed__SWIG_0(swigCPtr, this, status);
  }

  public long Reversed() {
    return OCCwrapJavaJNI.TDataXtd_Constraint_Reversed__SWIG_1(swigCPtr, this);
  }

  /**
   *  collects constraints on Childs for label <aLabel>
   */
  public static void CollectChildConstraints( TDF_Label  aLabel,  TDF_LabelList  TheList) {
    OCCwrapJavaJNI.TDataXtd_Constraint_CollectChildConstraints(TDF_Label.getCPtr(aLabel), aLabel, TDF_LabelList.getCPtr(TheList), TheList);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataXtd_Constraint_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataXtd_Constraint_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataXtd_Constraint_GetId(), true);
  }

  public static  TDataXtd_Constraint  DownCast( Standard_Transient  T) {
    return new TDataXtd_Constraint ( OCCwrapJavaJNI.TDataXtd_Constraint_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataXtd_Constraint_TypeOf(), true );
  }

}
