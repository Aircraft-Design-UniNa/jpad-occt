package opencascade;

/**
 *  defines root of IGES Entity definition, including Directory
 *  Part, lists of (optionnal) Properties and Associativities
 */
public class IGESData_IGESEntity extends Standard_Transient {
  IGESData_IGESEntity(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  gives IGES typing info (includes "Type" and "Form" data)
   */
  public IGESData_IGESType IGESType() {
    return new IGESData_IGESType(OCCwrapJavaJNI.IGESData_IGESEntity_IGESType(swigCPtr, this), true);
  }

  /**
   *  gives IGES Type Number (often coupled with Form Number)
   */
  public int TypeNumber() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_TypeNumber(swigCPtr, this);
  }

  /**
   *  Returns the form number for that
   *  type of an IGES entity. The default form number is 0.
   */
  public int FormNumber() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_FormNumber(swigCPtr, this);
  }

  public  IGESData_IGESEntity  DirFieldEntity(int fieldnum) {
    return new IGESData_IGESEntity ( OCCwrapJavaJNI.IGESData_IGESEntity_DirFieldEntity(swigCPtr, this, fieldnum), true );
  }

  /**
   *  returns True if an IGESEntity is defined with a Structure
   *  (it is normally reserved for certain classes, such as Macros)
   */
  public long HasStructure() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_HasStructure(swigCPtr, this);
  }

  public  IGESData_IGESEntity  Structure() {
    return new IGESData_IGESEntity ( OCCwrapJavaJNI.IGESData_IGESEntity_Structure(swigCPtr, this), true );
  }

  /**
   *  Returns the definition status of LineFont
   */
  public IGESData_DefType DefLineFont() {
    return IGESData_DefType.swigToEnum(OCCwrapJavaJNI.IGESData_IGESEntity_DefLineFont(swigCPtr, this));
  }

  /**
   *  Returns LineFont definition as an Integer (if defined as Rank)
   *  If LineFont is defined as an Entity, returns a negative value
   */
  public int RankLineFont() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_RankLineFont(swigCPtr, this);
  }

  public  IGESData_LineFontEntity  LineFont() {
    return new IGESData_LineFontEntity ( OCCwrapJavaJNI.IGESData_IGESEntity_LineFont(swigCPtr, this), true );
  }

  /**
   *  Returns the definition status of Level
   */
  public IGESData_DefList DefLevel() {
    return IGESData_DefList.swigToEnum(OCCwrapJavaJNI.IGESData_IGESEntity_DefLevel(swigCPtr, this));
  }

  /**
   *  Returns the level the entity
   *  belongs to. Returns -1 if the entity belongs to more than one  level.
   */
  public int Level() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_Level(swigCPtr, this);
  }

  public  IGESData_LevelListEntity  LevelList() {
    return new IGESData_LevelListEntity ( OCCwrapJavaJNI.IGESData_IGESEntity_LevelList(swigCPtr, this), true );
  }

  /**
   *  Returns the definition status of
   *  the view. This can be: none, one or several.
   */
  public IGESData_DefList DefView() {
    return IGESData_DefList.swigToEnum(OCCwrapJavaJNI.IGESData_IGESEntity_DefView(swigCPtr, this));
  }

  public  IGESData_ViewKindEntity  View() {
    return new IGESData_ViewKindEntity ( OCCwrapJavaJNI.IGESData_IGESEntity_View(swigCPtr, this), true );
  }

  public  IGESData_ViewKindEntity  SingleView() {
    return new IGESData_ViewKindEntity ( OCCwrapJavaJNI.IGESData_IGESEntity_SingleView(swigCPtr, this), true );
  }

  public  IGESData_ViewKindEntity  ViewList() {
    return new IGESData_ViewKindEntity ( OCCwrapJavaJNI.IGESData_IGESEntity_ViewList(swigCPtr, this), true );
  }

  /**
   *  Returns True if a Transformation Matrix is defined
   */
  public long HasTransf() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_HasTransf(swigCPtr, this);
  }

  public  IGESData_TransfEntity  Transf() {
    return new IGESData_TransfEntity ( OCCwrapJavaJNI.IGESData_IGESEntity_Transf(swigCPtr, this), true );
  }

  /**
   *  Returns True if a LabelDisplay mode is defined for this entity
   */
  public long HasLabelDisplay() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_HasLabelDisplay(swigCPtr, this);
  }

  public  IGESData_LabelDisplayEntity  LabelDisplay() {
    return new IGESData_LabelDisplayEntity ( OCCwrapJavaJNI.IGESData_IGESEntity_LabelDisplay(swigCPtr, this), true );
  }

  /**
   *  gives Blank Status (0 visible, 1 blanked)
   */
  public int BlankStatus() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_BlankStatus(swigCPtr, this);
  }

  /**
   *  gives Subordinate Switch (0-1-2-3)
   */
  public int SubordinateStatus() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_SubordinateStatus(swigCPtr, this);
  }

  /**
   *  gives Entity's Use Flag (0 to 5)
   */
  public int UseFlag() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_UseFlag(swigCPtr, this);
  }

  /**
   *  gives Hierarchy status (0-1-2)
   */
  public int HierarchyStatus() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_HierarchyStatus(swigCPtr, this);
  }

  /**
   *  Returns the LineWeight Number (0  not defined), see also LineWeight
   */
  public int LineWeightNumber() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_LineWeightNumber(swigCPtr, this);
  }

  /**
   *  Returns the true Line Weight, computed from LineWeightNumber and
   *  Global Parameter in the Model by call to SetLineWeight
   */
  public double LineWeight() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_LineWeight(swigCPtr, this);
  }

  /**
   *  Returns the definition status of Color.
   */
  public IGESData_DefType DefColor() {
    return IGESData_DefType.swigToEnum(OCCwrapJavaJNI.IGESData_IGESEntity_DefColor(swigCPtr, this));
  }

  /**
   *  Returns the color definition as
   *  an integer value if the color was defined as a rank.
   *  Warning A negative value is returned if the color was defined as an entity.
   */
  public int RankColor() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_RankColor(swigCPtr, this);
  }

  public  IGESData_ColorEntity  Color() {
    return new IGESData_ColorEntity ( OCCwrapJavaJNI.IGESData_IGESEntity_Color(swigCPtr, this), true );
  }

  /**
   *  returns "reserved" alphanumeric values res1 and res2
   *  res1 and res2 have to be reserved as Character[9 at least]
   *  (remark : their content is changed)
   *  returned values are ended by null character in 9th
   *  returned Boolean is False if res1 and res2 are blank, true else
   */
  public long CResValues(String res1, String res2) {
    return OCCwrapJavaJNI.IGESData_IGESEntity_CResValues(swigCPtr, this, res1, res2);
  }

  /**
   *  Returns true if a short label is defined.
   *  A short label is a non-blank 8-character string.
   */
  public long HasShortLabel() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_HasShortLabel(swigCPtr, this);
  }

  public  TCollection_HAsciiString  ShortLabel() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IGESData_IGESEntity_ShortLabel(swigCPtr, this), true );
  }

  /**
   *  Returns true if a subscript number is defined.
   *  A subscript number is an integer used to identify a label.
   */
  public long HasSubScriptNumber() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_HasSubScriptNumber(swigCPtr, this);
  }

  /**
   *  Returns the integer subscript number used to identify this IGES entity.
   *  Warning 0 is returned if no subscript number is defined for this IGES entity.
   */
  public int SubScriptNumber() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_SubScriptNumber(swigCPtr, this);
  }

  /**
   *  Initializes a directory field as an Entiy of any kind
   *  See DirFieldEntity for more details
   */
  public void InitDirFieldEntity(int fieldnum,  IGESData_IGESEntity  ent) {
    OCCwrapJavaJNI.IGESData_IGESEntity_InitDirFieldEntity(swigCPtr, this, fieldnum,  IGESData_IGESEntity.getCPtr(ent) , ent);
  }

  /**
   *  Initializes Transf, or erases it if <ent> is given Null
   */
  public void InitTransf( IGESData_TransfEntity  ent) {
    OCCwrapJavaJNI.IGESData_IGESEntity_InitTransf(swigCPtr, this,  IGESData_TransfEntity.getCPtr(ent) , ent);
  }

  /**
   *  Initializes View, or erases it if <ent> is given Null
   */
  public void InitView( IGESData_ViewKindEntity  ent) {
    OCCwrapJavaJNI.IGESData_IGESEntity_InitView(swigCPtr, this,  IGESData_ViewKindEntity.getCPtr(ent) , ent);
  }

  /**
   *  Initializes LineFont : if <ent> is not Null, it gives LineFont,
   *  else <rank> gives or erases (if zero) RankLineFont
   */
  public void InitLineFont( IGESData_LineFontEntity  ent, int rank) {
    OCCwrapJavaJNI.IGESData_IGESEntity_InitLineFont__SWIG_0(swigCPtr, this,  IGESData_LineFontEntity.getCPtr(ent) , ent, rank);
  }

  public void InitLineFont( IGESData_LineFontEntity  ent) {
    OCCwrapJavaJNI.IGESData_IGESEntity_InitLineFont__SWIG_1(swigCPtr, this,  IGESData_LineFontEntity.getCPtr(ent) , ent);
  }

  /**
   *  Initializes Level : if <ent> is not Null, it gives LevelList,
   *  else <val> gives or erases (if zero) unique Level
   */
  public void InitLevel( IGESData_LevelListEntity  ent, int val) {
    OCCwrapJavaJNI.IGESData_IGESEntity_InitLevel__SWIG_0(swigCPtr, this,  IGESData_LevelListEntity.getCPtr(ent) , ent, val);
  }

  public void InitLevel( IGESData_LevelListEntity  ent) {
    OCCwrapJavaJNI.IGESData_IGESEntity_InitLevel__SWIG_1(swigCPtr, this,  IGESData_LevelListEntity.getCPtr(ent) , ent);
  }

  /**
   *  Initializes Color data : if <ent> is not Null, it gives Color,
   *  else <rank> gives or erases (if zero) RankColor
   */
  public void InitColor( IGESData_ColorEntity  ent, int rank) {
    OCCwrapJavaJNI.IGESData_IGESEntity_InitColor__SWIG_0(swigCPtr, this,  IGESData_ColorEntity.getCPtr(ent) , ent, rank);
  }

  public void InitColor( IGESData_ColorEntity  ent) {
    OCCwrapJavaJNI.IGESData_IGESEntity_InitColor__SWIG_1(swigCPtr, this,  IGESData_ColorEntity.getCPtr(ent) , ent);
  }

  /**
   *  Initializes the Status of Directory Part
   */
  public void InitStatus(int blank, int subordinate, int useflag, int hierarchy) {
    OCCwrapJavaJNI.IGESData_IGESEntity_InitStatus(swigCPtr, this, blank, subordinate, useflag, hierarchy);
  }

  /**
   *  Sets a new Label to an IGES Entity
   *  If <sub> is given, it sets value of SubScriptNumber
   *  else, SubScriptNumber is erased
   */
  public void SetLabel( TCollection_HAsciiString  label, int sub) {
    OCCwrapJavaJNI.IGESData_IGESEntity_SetLabel__SWIG_0(swigCPtr, this,  TCollection_HAsciiString.getCPtr(label) , label, sub);
  }

  public void SetLabel( TCollection_HAsciiString  label) {
    OCCwrapJavaJNI.IGESData_IGESEntity_SetLabel__SWIG_1(swigCPtr, this,  TCollection_HAsciiString.getCPtr(label) , label);
  }

  /**
   *  Initializes various data (those not yet seen above), or erases
   *  them if they are given as Null (Zero for <weightnum>) :
   *  <str> for Structure, <lab> for LabelDisplay, and
   *  <weightnum> for WeightNumber
   */
  public void InitMisc( IGESData_IGESEntity  str,  IGESData_LabelDisplayEntity  lab, int weightnum) {
    OCCwrapJavaJNI.IGESData_IGESEntity_InitMisc(swigCPtr, this,  IGESData_IGESEntity.getCPtr(str) , str,  IGESData_LabelDisplayEntity.getCPtr(lab) , lab, weightnum);
  }

  /**
   *  Returns True if an entity has one and only one parent, defined
   *  by a SingleParentEntity Type Associativity (explicit sharing).
   *  Thus, implicit sharing remains defined at model level
   *  (see class ToolLocation)
   */
  public long HasOneParent() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_HasOneParent(swigCPtr, this);
  }

  public  IGESData_IGESEntity  UniqueParent() {
    return new IGESData_IGESEntity ( OCCwrapJavaJNI.IGESData_IGESEntity_UniqueParent(swigCPtr, this), true );
  }

  /**
   *  Returns Location given by Transf in Directory Part (see above)
   *  It must be considered for local definition : if the Entity is
   *  set in a "Parent", that one can add its one Location, but this
   *  is not taken in account here : see CompoundLocation for that.
   *  If no Transf is defined, returns Identity
   *  If Transf is itself compound, gives the final result
   */
  public gp_GTrsf Location() {
    return new gp_GTrsf(OCCwrapJavaJNI.IGESData_IGESEntity_Location(swigCPtr, this), true);
  }

  /**
   *  Returns Location considered for Vectors, i.e. without its
   *  Translation Part. As Location, it gives local definition.
   */
  public gp_GTrsf VectorLocation() {
    return new gp_GTrsf(OCCwrapJavaJNI.IGESData_IGESEntity_VectorLocation(swigCPtr, this), true);
  }

  /**
   *  Returns Location by taking in account a Parent which has its
   *  own Location : that one will be combined to that of <me>
   *  The Parent is considered only if HasOneParent is True,
   *  else it is ignored and CompoundLocation = Location
   */
  public gp_GTrsf CompoundLocation() {
    return new gp_GTrsf(OCCwrapJavaJNI.IGESData_IGESEntity_CompoundLocation(swigCPtr, this), true);
  }

  /**
   *  says if a Name is defined, as Short Label or as Name Property
   *  (Property is looked first, else ShortLabel is considered)
   */
  public long HasName() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_HasName(swigCPtr, this);
  }

  public  TCollection_HAsciiString  NameValue() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.IGESData_IGESEntity_NameValue(swigCPtr, this), true );
  }

  /**
   *  Returns True if the Entity is defined with an Associativity
   *  list, even empty (that is, file contains its length 0)
   *  Else, the file contained NO idencation at all about this list.
   */
  public long ArePresentAssociativities() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_ArePresentAssociativities(swigCPtr, this);
  }

  /**
   *  gives number of recorded associativities (0  no list defined)
   */
  public int NbAssociativities() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_NbAssociativities(swigCPtr, this);
  }

  /**
   *  gives how many Associativities have a given type
   */
  public int NbTypedAssociativities( Standard_Type  atype) {
    return OCCwrapJavaJNI.IGESData_IGESEntity_NbTypedAssociativities(swigCPtr, this,  Standard_Type.getCPtr(atype) , atype);
  }

  public  IGESData_IGESEntity  TypedAssociativity( Standard_Type  atype) {
    return new IGESData_IGESEntity ( OCCwrapJavaJNI.IGESData_IGESEntity_TypedAssociativity(swigCPtr, this,  Standard_Type.getCPtr(atype) , atype), true );
  }

  /**
   *  Sets "me" in the Associativity list of another Entity
   */
  public void Associate( IGESData_IGESEntity  ent) {
    OCCwrapJavaJNI.IGESData_IGESEntity_Associate(swigCPtr, this,  IGESData_IGESEntity.getCPtr(ent) , ent);
  }

  /**
   *  Resets "me" from the Associativity list of another Entity
   */
  public void Dissociate( IGESData_IGESEntity  ent) {
    OCCwrapJavaJNI.IGESData_IGESEntity_Dissociate(swigCPtr, this,  IGESData_IGESEntity.getCPtr(ent) , ent);
  }

  /**
   *  Returns True if the Entity is defined with a Property list,
   *  even empty (that is, file contains its length 0)
   *  Else, the file contained NO idencation at all about this list
   */
  public long ArePresentProperties() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_ArePresentProperties(swigCPtr, this);
  }

  /**
   *  Gives number of recorded properties (0  no list defined)
   */
  public int NbProperties() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_NbProperties(swigCPtr, this);
  }

  /**
   *  gives how many Properties have a given type
   */
  public int NbTypedProperties( Standard_Type  atype) {
    return OCCwrapJavaJNI.IGESData_IGESEntity_NbTypedProperties(swigCPtr, this,  Standard_Type.getCPtr(atype) , atype);
  }

  public  IGESData_IGESEntity  TypedProperty( Standard_Type  atype, int anum) {
    return new IGESData_IGESEntity ( OCCwrapJavaJNI.IGESData_IGESEntity_TypedProperty__SWIG_0(swigCPtr, this,  Standard_Type.getCPtr(atype) , atype, anum), true );
  }

  public  IGESData_IGESEntity  TypedProperty( Standard_Type  atype) {
    return new IGESData_IGESEntity ( OCCwrapJavaJNI.IGESData_IGESEntity_TypedProperty__SWIG_1(swigCPtr, this,  Standard_Type.getCPtr(atype) , atype), true );
  }

  /**
   *  Adds a Property in the list
   */
  public void AddProperty( IGESData_IGESEntity  ent) {
    OCCwrapJavaJNI.IGESData_IGESEntity_AddProperty(swigCPtr, this,  IGESData_IGESEntity.getCPtr(ent) , ent);
  }

  /**
   *  Removes a Property from the list
   */
  public void RemoveProperty( IGESData_IGESEntity  ent) {
    OCCwrapJavaJNI.IGESData_IGESEntity_RemoveProperty(swigCPtr, this,  IGESData_IGESEntity.getCPtr(ent) , ent);
  }

  /**
   *  computes and sets "true" line weight according IGES rules from
   *  global data MaxLineWeight (maxv) and LineWeightGrad (gradw),
   *  or sets it to defw (Default) if LineWeightNumber is null
   */
  public void SetLineWeight(double defw, double maxw, int gradw) {
    OCCwrapJavaJNI.IGESData_IGESEntity_SetLineWeight(swigCPtr, this, defw, maxw, gradw);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.IGESData_IGESEntity_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.IGESData_IGESEntity_get_type_descriptor(), true );
  }

  public static  IGESData_IGESEntity  DownCast( Standard_Transient  T) {
    return new IGESData_IGESEntity ( OCCwrapJavaJNI.IGESData_IGESEntity_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.IGESData_IGESEntity_TypeOf(), true );
  }

}
