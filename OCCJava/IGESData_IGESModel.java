package opencascade;

/**
 *  Defines the file header and
 *  entities for IGES files. These headers and entities result from
 *  a complete data translation using the IGES data exchange processor.
 *  Each entity is contained in a single model only and has a
 *  unique identifier. You can access this identifier using the method Number.
 *  Gives an access to the general data in the Start and the Global
 *  sections of an IGES file.
 *  The IGES file includes the following sections:
 *  -Start,
 *  -Global,
 *  -Directory Entry,
 *  -Parameter Data,
 *  -Terminate
 */
public class IGESData_IGESModel extends Interface_InterfaceModel {
  IGESData_IGESModel(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public IGESData_IGESModel() {
    this(OCCwrapJavaJNI.new_IGESData_IGESModel(), true);
  }

  /**
   *  Prints the IGES file header
   *  (Start and Global Sections) to the log file. The integer
   *  parameter is intended to be used as a level indicator but is not used at present.
   */
  public void DumpHeader( Message_Messenger  S, int level) {
    OCCwrapJavaJNI.IGESData_IGESModel_DumpHeader__SWIG_0(swigCPtr, this,  Message_Messenger.getCPtr(S) , S, level);
  }

  public void DumpHeader( Message_Messenger  S) {
    OCCwrapJavaJNI.IGESData_IGESModel_DumpHeader__SWIG_1(swigCPtr, this,  Message_Messenger.getCPtr(S) , S);
  }

  public  TColStd_HSequenceOfHAsciiString  StartSection() {
    return new TColStd_HSequenceOfHAsciiString ( OCCwrapJavaJNI.IGESData_IGESModel_StartSection(swigCPtr, this), true );
  }

  /**
   *  Returns the count of recorded Start Lines
   */
  public int NbStartLines() {
    return OCCwrapJavaJNI.IGESData_IGESModel_NbStartLines(swigCPtr, this);
  }

  /**
   *  Returns a line from the IGES file
   *  Start section by specifying its number. An empty string is
   *  returned if the number given is out of range, the range being
   *  from 1 to NbStartLines.
   */
  public String StartLine(int num) {
    return OCCwrapJavaJNI.IGESData_IGESModel_StartLine(swigCPtr, this, num);
  }

  /**
   *  Clears the IGES file Start Section
   */
  public void ClearStartSection() {
    OCCwrapJavaJNI.IGESData_IGESModel_ClearStartSection(swigCPtr, this);
  }

  /**
   *  Sets a new Start section from a list of strings.
   *  If copy is false, the Start section will be shared. Any
   *  modifications made to the strings later on, will have an effect on
   *  the Start section. If copy is true (default value),
   *  an independent copy of the strings is created and used as
   *  the Start section. Any modifications made to the strings
   *  later on, will have no effect on the Start section.
   */
  public void SetStartSection( TColStd_HSequenceOfHAsciiString  list, long copy) {
    OCCwrapJavaJNI.IGESData_IGESModel_SetStartSection__SWIG_0(swigCPtr, this,  TColStd_HSequenceOfHAsciiString.getCPtr(list) , list, copy);
  }

  public void SetStartSection( TColStd_HSequenceOfHAsciiString  list) {
    OCCwrapJavaJNI.IGESData_IGESModel_SetStartSection__SWIG_1(swigCPtr, this,  TColStd_HSequenceOfHAsciiString.getCPtr(list) , list);
  }

  /**
   *  Adds a new string to the existing
   *  Start section at the end if atnum is 0 or not given, or before
   *  atnumth line.
   */
  public void AddStartLine(String line, int atnum) {
    OCCwrapJavaJNI.IGESData_IGESModel_AddStartLine__SWIG_0(swigCPtr, this, line, atnum);
  }

  public void AddStartLine(String line) {
    OCCwrapJavaJNI.IGESData_IGESModel_AddStartLine__SWIG_1(swigCPtr, this, line);
  }

  /**
   *  Returns the Global section of the IGES file.
   */
  public  IGESData_GlobalSection  GlobalSection() {
    IGESData_GlobalSection ret = new IGESData_GlobalSection(OCCwrapJavaJNI.IGESData_IGESModel_GlobalSection(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Sets the Global section of the IGES file.
   */
  public void SetGlobalSection( IGESData_GlobalSection  header) {
    OCCwrapJavaJNI.IGESData_IGESModel_SetGlobalSection(swigCPtr, this, IGESData_GlobalSection.getCPtr(header), header);
  }

  /**
   *  Sets some of the Global section
   *  parameters with the values defined by the translation
   *  parameters. param may be:
   *  - receiver (value read in XSTEP.iges.header.receiver),
   *  - author (value read in XSTEP.iges.header.author),
   *  - company (value read in XSTEP.iges.header.company).
   *  The default value for param is an empty string.
   *  Returns True when done and if param is given, False if param is
   *  unknown or empty. Note: Set the unit in the IGES
   *  file Global section via IGESData_BasicEditor class.
   */
  public long ApplyStatic(String param) {
    return OCCwrapJavaJNI.IGESData_IGESModel_ApplyStatic__SWIG_0(swigCPtr, this, param);
  }

  public long ApplyStatic() {
    return OCCwrapJavaJNI.IGESData_IGESModel_ApplyStatic__SWIG_1(swigCPtr, this);
  }

  public  IGESData_IGESEntity  Entity(int num) {
    return new IGESData_IGESEntity ( OCCwrapJavaJNI.IGESData_IGESModel_Entity(swigCPtr, this, num), true );
  }

  /**
   *  Returns the equivalent DE Number for an Entity, i.e.
   *  2*Number(ent)-1 , or 0 if <ent> is unknown from <me>
   *  This DE Number is used for File Writing for instance
   */
  public int DNum( IGESData_IGESEntity  ent) {
    return OCCwrapJavaJNI.IGESData_IGESModel_DNum(swigCPtr, this,  IGESData_IGESEntity.getCPtr(ent) , ent);
  }

  /**
   *  Sets LineWeights of contained Entities according header data
   *  (MaxLineWeight and LineWeightGrad) or to a default value for
   *  undefined weights
   */
  public void SetLineWeights(double defw) {
    OCCwrapJavaJNI.IGESData_IGESModel_SetLineWeights(swigCPtr, this, defw);
  }

  /**
   *  Prints label specific to IGES norm for a given entity, i.e.
   *  its directory entry number (2*Number-1)
   */
  public void PrintInfo( Standard_Transient  ent,  Message_Messenger  S) {
    OCCwrapJavaJNI.IGESData_IGESModel_PrintInfo(swigCPtr, this,  Standard_Transient.getCPtr(ent) , ent,  Message_Messenger.getCPtr(S) , S);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.IGESData_IGESModel_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.IGESData_IGESModel_get_type_descriptor(), true );
  }

  public static  IGESData_IGESModel  DownCast( Standard_Transient  T) {
    return new IGESData_IGESModel ( OCCwrapJavaJNI.IGESData_IGESModel_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.IGESData_IGESModel_TypeOf(), true );
  }

}
