package opencascade;

/**
 *  A ReportEntity is produced to aknowledge and memorize the
 *  binding between a Check and an Entity. The Check can bring
 *  Fails (+ Warnings if any), or only Warnings. If it is empty,
 *  the Report Entity is for an Unknown Entity.
 * 
 *  The ReportEntity brings : the Concerned Entity, the
 *  Check, and if the Entity is empty (Fails due to Read
 *  Errors, hence the Entity could not be loaded), a Content.
 *  The Content is itself an Transient Object, but remains in a
 *  literal form : it is an "Unknown Entity". If the Concerned
 *  Entity is itself Unknown, Concerned and Content are equal.
 * 
 *  According to the Check, if it brings Fail messages,
 *  the ReportEntity is an "Error Entity", the Concerned Entity is
 *  an "Erroneous Entity". Else it is a "Correction Entity", the
 *  Concerned Entity is a "Corrected Entity". With no Check
 *  message and if Concerened and Content are equal, it reports
 *  for an "Unknown Entity".
 * 
 *  Each norm must produce its own type of Unknown Entity, but can
 *  use the class UndefinedContent to brings parameters : it is
 *  enough for most of information and avoids to redefine them,
 *  only the specific part remains to be defined for each norm.
 */
public class Interface_ReportEntity extends Standard_Transient {
  Interface_ReportEntity(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a ReportEntity for an Unknown Entity : Check is empty,
   *  and Concerned equates Content (i.e. the Unknown Entity)
   */
  public Interface_ReportEntity( Standard_Transient  unknown) {
    this(OCCwrapJavaJNI.new_Interface_ReportEntity__SWIG_0( Standard_Transient.getCPtr(unknown) , unknown), true);
  }

  /**
   *  Creates a ReportEntity with its features :
   *  - <acheck> is the Check to be memorised
   *  - <concerned> is the Entity to which the Check is bound
   *  Later, a Content can be set : it is required for an Error
   */
  public Interface_ReportEntity( Interface_Check  acheck,  Standard_Transient  concerned) {
    this(OCCwrapJavaJNI.new_Interface_ReportEntity__SWIG_1( Interface_Check.getCPtr(acheck) , acheck,  Standard_Transient.getCPtr(concerned) , concerned), true);
  }

  /**
   *  Sets a Content : it brings non interpreted data which belong
   *  to the Concerned Entity. It can be empty then loaded later.
   *  Remark that for an Unknown Entity, Content is set by Create.
   */
  public void SetContent( Standard_Transient  content) {
    OCCwrapJavaJNI.Interface_ReportEntity_SetContent(swigCPtr, this,  Standard_Transient.getCPtr(content) , content);
  }

  public  Interface_Check  Check() {
    return new Interface_Check ( OCCwrapJavaJNI.Interface_ReportEntity_Check(swigCPtr, this), true );
  }

  public  Interface_Check  CCheck() {
    return new Interface_Check ( OCCwrapJavaJNI.Interface_ReportEntity_CCheck(swigCPtr, this), true );
  }

  public  Standard_Transient  Concerned() {
    return new Standard_Transient ( OCCwrapJavaJNI.Interface_ReportEntity_Concerned(swigCPtr, this), true );
  }

  /**
   *  Returns True if a Content is stored (it can equate Concerned)
   */
  public long HasContent() {
    return OCCwrapJavaJNI.Interface_ReportEntity_HasContent(swigCPtr, this);
  }

  /**
   *  Returns True if a Content is stored AND differs from Concerned
   *  (i.e. redefines content) : used when Concerned could not be
   *  loaded
   */
  public long HasNewContent() {
    return OCCwrapJavaJNI.Interface_ReportEntity_HasNewContent(swigCPtr, this);
  }

  public  Standard_Transient  Content() {
    return new Standard_Transient ( OCCwrapJavaJNI.Interface_ReportEntity_Content(swigCPtr, this), true );
  }

  /**
   *  Returns True for an Error Entity, i.e. if the Check
   *  brings at least one Fail message
   */
  public long IsError() {
    return OCCwrapJavaJNI.Interface_ReportEntity_IsError(swigCPtr, this);
  }

  /**
   *  Returns True for an Unknown Entity, i,e. if the Check
   *  is empty and Concerned equates Content
   */
  public long IsUnknown() {
    return OCCwrapJavaJNI.Interface_ReportEntity_IsUnknown(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Interface_ReportEntity_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Interface_ReportEntity_get_type_descriptor(), true );
  }

  public static  Interface_ReportEntity  DownCast( Standard_Transient  T) {
    return new Interface_ReportEntity ( OCCwrapJavaJNI.Interface_ReportEntity_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Interface_ReportEntity_TypeOf(), true );
  }

}
