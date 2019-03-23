package opencascade;

/**
 *  Gives access to
 *  - entities in a STEP file,
 *  - the STEP file header.
 */
public class StepData_StepModel extends Interface_InterfaceModel {
  StepData_StepModel(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates an empty STEP model with an empty header.
   */
  public StepData_StepModel() {
    this(OCCwrapJavaJNI.new_StepData_StepModel(), true);
  }

  public  Standard_Transient  Entity(int num) {
    return new Standard_Transient ( OCCwrapJavaJNI.StepData_StepModel_Entity(swigCPtr, this, num), true );
  }

  /**
   *  says if a Header entity has a specifed type
   */
  public long HasHeaderEntity( Standard_Type  atype) {
    return OCCwrapJavaJNI.StepData_StepModel_HasHeaderEntity(swigCPtr, this,  Standard_Type.getCPtr(atype) , atype);
  }

  public  Standard_Transient  HeaderEntity( Standard_Type  atype) {
    return new Standard_Transient ( OCCwrapJavaJNI.StepData_StepModel_HeaderEntity(swigCPtr, this,  Standard_Type.getCPtr(atype) , atype), true );
  }

  /**
   *  Adds an Entity to the Header
   */
  public void AddHeaderEntity( Standard_Transient  ent) {
    OCCwrapJavaJNI.StepData_StepModel_AddHeaderEntity(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent);
  }

  /**
   *  Dumps the Header, with the Header Protocol of StepData.
   *  If the Header Protocol is not defined, for each Header Entity,
   *  prints its Type. Else sends the Header under the form of
   *  HEADER Section of an Ascii Step File
   *  <level> is not used because Header is not so big
   */
  public void DumpHeader( Message_Messenger  S, int level) {
    OCCwrapJavaJNI.StepData_StepModel_DumpHeader__SWIG_0(swigCPtr, this,  Message_Messenger.getCPtr(S) , S, level);
  }

  public void DumpHeader( Message_Messenger  S) {
    OCCwrapJavaJNI.StepData_StepModel_DumpHeader__SWIG_1(swigCPtr, this,  Message_Messenger.getCPtr(S) , S);
  }

  /**
   *  Attaches an ident to an entity to produce a label
   *  (does nothing if <ent> is not in <me>)
   */
  public void SetIdentLabel( Standard_Transient  ent, int ident) {
    OCCwrapJavaJNI.StepData_StepModel_SetIdentLabel(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent, ident);
  }

  /**
   *  returns the label ident attached to an entity, 0 if not in me
   */
  public int IdentLabel( Standard_Transient  ent) {
    return OCCwrapJavaJNI.StepData_StepModel_IdentLabel(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepData_StepModel_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepData_StepModel_get_type_descriptor(), true );
  }

  public static  StepData_StepModel  DownCast( Standard_Transient  T) {
    return new StepData_StepModel ( OCCwrapJavaJNI.StepData_StepModel_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepData_StepModel_TypeOf(), true );
  }

}
