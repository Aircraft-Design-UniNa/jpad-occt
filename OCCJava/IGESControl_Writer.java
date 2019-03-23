package opencascade;

/**
 *  This class creates and writes
 *  IGES files from CAS.CADE models. An IGES file can be written to
 *  an existing IGES file or to a new one.
 *  The translation can be performed in one or several
 *  operations. Each translation operation
 *  outputs a distinct root entity in the IGES file.
 *  To write an IGES file it is possible to use the following sequence:
 *  To modify the IGES file header or to change translation
 *  parameters it is necessary to use class Interface_Static (see
 *  IGESParameters and GeneralParameters).
 */
public class IGESControl_Writer {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IGESControl_Writer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IGESControl_Writer(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IGESControl_Writer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IGESControl_Writer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a writer object with the
   *  default unit (millimeters) and write mode (Face).
   *  IGESControl_Writer (const Standard_CString unit,
   *  const Standard_Integer modecr = 0);
   */
  public IGESControl_Writer() {
    this(OCCwrapJavaJNI.new_IGESControl_Writer__SWIG_0(), true);
  }

  /**
   *  Creates a writer with given
   *  values for units and for write mode.
   *  unit may be any unit that is accepted by the IGES standard.
   *  By default, it is the millimeter.
   *  modecr defines the write mode and may be:
   *  - 0: Faces (default)
   *  - 1: BRep.
   */
  public IGESControl_Writer(String unit, int modecr) {
    this(OCCwrapJavaJNI.new_IGESControl_Writer__SWIG_1(unit, modecr), true);
  }

  /**
   *  Creates a writer object with the
   *  prepared IGES model model in write mode.
   *  modecr defines the write mode and may be:
   *  - 0: Faces (default)
   *  - 1: BRep.
   */
  public IGESControl_Writer(String unit) {
    this(OCCwrapJavaJNI.new_IGESControl_Writer__SWIG_2(unit), true);
  }

  public IGESControl_Writer( IGESData_IGESModel  model, int modecr) {
    this(OCCwrapJavaJNI.new_IGESControl_Writer__SWIG_3( IGESData_IGESModel.getCPtr(model) , model, modecr), true);
  }

  public IGESControl_Writer( IGESData_IGESModel  model) {
    this(OCCwrapJavaJNI.new_IGESControl_Writer__SWIG_4( IGESData_IGESModel.getCPtr(model) , model), true);
  }

  public  IGESData_IGESModel  Model() {
    return new IGESData_IGESModel ( OCCwrapJavaJNI.IGESControl_Writer_Model(swigCPtr, this), true );
  }

  /**
   *  Translates a Shape to IGES Entities and adds them to the model
   *  Returns True if done, False if Shape not suitable for IGES or null
   */
  public long AddShape( TopoDS_Shape  sh) {
    return OCCwrapJavaJNI.IGESControl_Writer_AddShape(swigCPtr, this, TopoDS_Shape.getCPtr(sh), sh);
  }

  /**
   *  Translates a Geometry (Surface or Curve) to IGES Entities and
   *  adds them to the model
   *  Returns True if done, False if geom is neither a Surface or
   *  a Curve suitable for IGES or is null
   */
  public long AddGeom( Standard_Transient  geom) {
    return OCCwrapJavaJNI.IGESControl_Writer_AddGeom(swigCPtr, this,  Standard_Transient.getCPtr(geom) , geom);
  }

  /**
   *  Adds an IGES entity (and the ones it references) to the model
   */
  public long AddEntity( IGESData_IGESEntity  ent) {
    return OCCwrapJavaJNI.IGESControl_Writer_AddEntity(swigCPtr, this,  IGESData_IGESEntity.getCPtr(ent) , ent);
  }

  /**
   *  Computes the entities found in
   *  the model, which is ready to be written.
   *  This contrasts with the default computation of headers only.
   */
  public void ComputeModel() {
    OCCwrapJavaJNI.IGESControl_Writer_ComputeModel(swigCPtr, this);
  }

  /**
   *  Computes then writes the model to an OStream
   *  Returns True when done, false in case of error
   */
  public long Write(SWIGTYPE_p_Standard_OStream S, long fnes) {
    return OCCwrapJavaJNI.IGESControl_Writer_Write__SWIG_0(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(S), fnes);
  }

  /**
   *  Prepares and writes an IGES model
   *  either to an OStream, S or to a file name,CString.
   *  Returns True if the operation was performed correctly and
   *  False if an error occurred (for instance,
   *  if the processor could not create the file).
   */
  public long Write(SWIGTYPE_p_Standard_OStream S) {
    return OCCwrapJavaJNI.IGESControl_Writer_Write__SWIG_1(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(S));
  }

  public long Write(String file, long fnes) {
    return OCCwrapJavaJNI.IGESControl_Writer_Write__SWIG_2(swigCPtr, this, file, fnes);
  }

  public long Write(String file) {
    return OCCwrapJavaJNI.IGESControl_Writer_Write__SWIG_3(swigCPtr, this, file);
  }

}
