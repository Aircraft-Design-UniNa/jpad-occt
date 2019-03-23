package opencascade;

/**
 *  Creates and writes VRML files from Open
 *  CASCADE shapes. A VRML file can be written to
 *  an existing VRML file or to a new one.
 */
public class VrmlAPI_Writer {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  VrmlAPI_Writer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  VrmlAPI_Writer(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(VrmlAPI_Writer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_VrmlAPI_Writer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a writer object with default parameters.
   */
  public VrmlAPI_Writer() {
    this(OCCwrapJavaJNI.new_VrmlAPI_Writer(), true);
  }

  /**
   *  Resets all parameters (representation, deflection)
   *  to their default values..
   */
  public void ResetToDefaults() {
    OCCwrapJavaJNI.VrmlAPI_Writer_ResetToDefaults(swigCPtr, this);
  }

  /**
   *  Sets the deflection aDef of
   *  the mesh algorithm which is used to compute the shaded
   *  representation of the translated shape. The default
   *  value is -1. When the deflection value is less than
   *  0, the deflection is calculated from the relative
   *  size of the shaped.
   */
  public void SetDeflection(double aDef) {
    OCCwrapJavaJNI.VrmlAPI_Writer_SetDeflection(swigCPtr, this, aDef);
  }

  /**
   *  Sets the representation of the
   *  shape aRep which is written to the VRML file. The three options are :
   *  -      shaded
   *  -      wireframe
   *  -      both shaded and wireframe (default)
   *  defined through the VrmlAPI_RepresentationOfShape enumeration.
   */
  public void SetRepresentation(VrmlAPI_RepresentationOfShape aRep) {
    OCCwrapJavaJNI.VrmlAPI_Writer_SetRepresentation(swigCPtr, this, aRep.swigValue());
  }

  /**
   *  Set transparency to given material
   */
  public void SetTransparencyToMaterial( Vrml_Material  aMaterial, double aTransparency) {
    OCCwrapJavaJNI.VrmlAPI_Writer_SetTransparencyToMaterial(swigCPtr, this,  Vrml_Material.getCPtr(aMaterial) , aMaterial, aTransparency);
  }

  public void SetShininessToMaterial( Vrml_Material  aMaterial, double aShininess) {
    OCCwrapJavaJNI.VrmlAPI_Writer_SetShininessToMaterial(swigCPtr, this,  Vrml_Material.getCPtr(aMaterial) , aMaterial, aShininess);
  }

  public void SetAmbientColorToMaterial( Vrml_Material  aMaterial,  Quantity_HArray1OfColor  Color) {
    OCCwrapJavaJNI.VrmlAPI_Writer_SetAmbientColorToMaterial(swigCPtr, this,  Vrml_Material.getCPtr(aMaterial) , aMaterial,  Quantity_HArray1OfColor.getCPtr(Color) , Color);
  }

  public void SetDiffuseColorToMaterial( Vrml_Material  aMaterial,  Quantity_HArray1OfColor  Color) {
    OCCwrapJavaJNI.VrmlAPI_Writer_SetDiffuseColorToMaterial(swigCPtr, this,  Vrml_Material.getCPtr(aMaterial) , aMaterial,  Quantity_HArray1OfColor.getCPtr(Color) , Color);
  }

  public void SetSpecularColorToMaterial( Vrml_Material  aMaterial,  Quantity_HArray1OfColor  Color) {
    OCCwrapJavaJNI.VrmlAPI_Writer_SetSpecularColorToMaterial(swigCPtr, this,  Vrml_Material.getCPtr(aMaterial) , aMaterial,  Quantity_HArray1OfColor.getCPtr(Color) , Color);
  }

  public void SetEmissiveColorToMaterial( Vrml_Material  aMaterial,  Quantity_HArray1OfColor  Color) {
    OCCwrapJavaJNI.VrmlAPI_Writer_SetEmissiveColorToMaterial(swigCPtr, this,  Vrml_Material.getCPtr(aMaterial) , aMaterial,  Quantity_HArray1OfColor.getCPtr(Color) , Color);
  }

  /**
   *  Returns the representation of the shape which is
   *  written to the VRML file. Types of representation are set through the
   *  VrmlAPI_RepresentationOfShape enumeration.
   */
  public VrmlAPI_RepresentationOfShape GetRepresentation() {
    return VrmlAPI_RepresentationOfShape.swigToEnum(OCCwrapJavaJNI.VrmlAPI_Writer_GetRepresentation(swigCPtr, this));
  }

  public  Vrml_Material  GetFrontMaterial() {
    return new Vrml_Material ( OCCwrapJavaJNI.VrmlAPI_Writer_GetFrontMaterial(swigCPtr, this), true );
  }

  public  Vrml_Material  GetPointsMaterial() {
    return new Vrml_Material ( OCCwrapJavaJNI.VrmlAPI_Writer_GetPointsMaterial(swigCPtr, this), true );
  }

  public  Vrml_Material  GetUisoMaterial() {
    return new Vrml_Material ( OCCwrapJavaJNI.VrmlAPI_Writer_GetUisoMaterial(swigCPtr, this), true );
  }

  public  Vrml_Material  GetVisoMaterial() {
    return new Vrml_Material ( OCCwrapJavaJNI.VrmlAPI_Writer_GetVisoMaterial(swigCPtr, this), true );
  }

  public  Vrml_Material  GetLineMaterial() {
    return new Vrml_Material ( OCCwrapJavaJNI.VrmlAPI_Writer_GetLineMaterial(swigCPtr, this), true );
  }

  public  Vrml_Material  GetWireMaterial() {
    return new Vrml_Material ( OCCwrapJavaJNI.VrmlAPI_Writer_GetWireMaterial(swigCPtr, this), true );
  }

  public  Vrml_Material  GetFreeBoundsMaterial() {
    return new Vrml_Material ( OCCwrapJavaJNI.VrmlAPI_Writer_GetFreeBoundsMaterial(swigCPtr, this), true );
  }

  public  Vrml_Material  GetUnfreeBoundsMaterial() {
    return new Vrml_Material ( OCCwrapJavaJNI.VrmlAPI_Writer_GetUnfreeBoundsMaterial(swigCPtr, this), true );
  }

  /**
   *  Converts the shape aShape to
   *  VRML format of the passed version and writes it to the file identified by aFile.
   */
  public void Write( TopoDS_Shape  aShape, String aFile, int aVersion) {
    OCCwrapJavaJNI.VrmlAPI_Writer_Write__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(aShape), aShape, aFile, aVersion);
  }

  public void Write( TopoDS_Shape  aShape, String aFile) {
    OCCwrapJavaJNI.VrmlAPI_Writer_Write__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(aShape), aShape, aFile);
  }

}
