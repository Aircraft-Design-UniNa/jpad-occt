package opencascade;

/**
 *  defines a Material node of VRML specifying properties of geometry
 *  and its appearance.
 *  This node defines the current surface material properties for all subsequent shapes.
 *  Material sets several components of the current material during traversal. Different shapes
 *  interpret materials with multiple values differently. To bind materials to shapes, use a
 *  MaterialBinding node.
 */
public class Vrml_Material extends Standard_Transient {
  Vrml_Material(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public Vrml_Material( Quantity_HArray1OfColor  aAmbientColor,  Quantity_HArray1OfColor  aDiffuseColor,  Quantity_HArray1OfColor  aSpecularColor,  Quantity_HArray1OfColor  aEmissiveColor,  TColStd_HArray1OfReal  aShininess,  TColStd_HArray1OfReal  aTransparency) {
    this(OCCwrapJavaJNI.new_Vrml_Material__SWIG_0( Quantity_HArray1OfColor.getCPtr(aAmbientColor) , aAmbientColor,  Quantity_HArray1OfColor.getCPtr(aDiffuseColor) , aDiffuseColor,  Quantity_HArray1OfColor.getCPtr(aSpecularColor) , aSpecularColor,  Quantity_HArray1OfColor.getCPtr(aEmissiveColor) , aEmissiveColor,  TColStd_HArray1OfReal.getCPtr(aShininess) , aShininess,  TColStd_HArray1OfReal.getCPtr(aTransparency) , aTransparency), true);
  }

  public Vrml_Material() {
    this(OCCwrapJavaJNI.new_Vrml_Material__SWIG_1(), true);
  }

  public void SetAmbientColor( Quantity_HArray1OfColor  aAmbientColor) {
    OCCwrapJavaJNI.Vrml_Material_SetAmbientColor(swigCPtr, this,  Quantity_HArray1OfColor.getCPtr(aAmbientColor) , aAmbientColor);
  }

  public  Quantity_HArray1OfColor  AmbientColor() {
    return new Quantity_HArray1OfColor ( OCCwrapJavaJNI.Vrml_Material_AmbientColor(swigCPtr, this), true );
  }

  public void SetDiffuseColor( Quantity_HArray1OfColor  aDiffuseColor) {
    OCCwrapJavaJNI.Vrml_Material_SetDiffuseColor(swigCPtr, this,  Quantity_HArray1OfColor.getCPtr(aDiffuseColor) , aDiffuseColor);
  }

  public  Quantity_HArray1OfColor  DiffuseColor() {
    return new Quantity_HArray1OfColor ( OCCwrapJavaJNI.Vrml_Material_DiffuseColor(swigCPtr, this), true );
  }

  public void SetSpecularColor( Quantity_HArray1OfColor  aSpecularColor) {
    OCCwrapJavaJNI.Vrml_Material_SetSpecularColor(swigCPtr, this,  Quantity_HArray1OfColor.getCPtr(aSpecularColor) , aSpecularColor);
  }

  public  Quantity_HArray1OfColor  SpecularColor() {
    return new Quantity_HArray1OfColor ( OCCwrapJavaJNI.Vrml_Material_SpecularColor(swigCPtr, this), true );
  }

  public void SetEmissiveColor( Quantity_HArray1OfColor  aEmissiveColor) {
    OCCwrapJavaJNI.Vrml_Material_SetEmissiveColor(swigCPtr, this,  Quantity_HArray1OfColor.getCPtr(aEmissiveColor) , aEmissiveColor);
  }

  public  Quantity_HArray1OfColor  EmissiveColor() {
    return new Quantity_HArray1OfColor ( OCCwrapJavaJNI.Vrml_Material_EmissiveColor(swigCPtr, this), true );
  }

  public void SetShininess( TColStd_HArray1OfReal  aShininess) {
    OCCwrapJavaJNI.Vrml_Material_SetShininess(swigCPtr, this,  TColStd_HArray1OfReal.getCPtr(aShininess) , aShininess);
  }

  public  TColStd_HArray1OfReal  Shininess() {
    return new TColStd_HArray1OfReal ( OCCwrapJavaJNI.Vrml_Material_Shininess(swigCPtr, this), true );
  }

  public void SetTransparency( TColStd_HArray1OfReal  aTransparency) {
    OCCwrapJavaJNI.Vrml_Material_SetTransparency(swigCPtr, this,  TColStd_HArray1OfReal.getCPtr(aTransparency) , aTransparency);
  }

  public  TColStd_HArray1OfReal  Transparency() {
    return new TColStd_HArray1OfReal ( OCCwrapJavaJNI.Vrml_Material_Transparency(swigCPtr, this), true );
  }

  public SWIGTYPE_p_Standard_OStream Print(SWIGTYPE_p_Standard_OStream anOStream) {
    return new SWIGTYPE_p_Standard_OStream(OCCwrapJavaJNI.Vrml_Material_Print(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(anOStream)), false);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Vrml_Material_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Vrml_Material_get_type_descriptor(), true );
  }

  public static  Vrml_Material  DownCast( Standard_Transient  T) {
    return new Vrml_Material ( OCCwrapJavaJNI.Vrml_Material_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Vrml_Material_TypeOf(), true );
  }

}
