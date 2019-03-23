package opencascade;

/**
 *  A groundwork to convert a shape to data which complies
 *  with a particular norm. This data can be that of a whole
 *  model or that of a specific list of entities in the model.
 *  You specify the list using a single selection or a
 *  combination of selections. A selection is an operator which
 *  computes a list of entities from a list given in input. To
 *  specify the input, you can use:
 *  - A predefined selection such as "xst-transferrable-roots"
 *  - A filter based on a  signature.
 *  A signature is an operator which returns a string from an
 *  entity according to its type.
 *  For example:
 *  - "xst-type" (CDL)
 *  - "iges-level"
 *  - "step-type".
 *  A filter can be based on a signature by giving a value to
 *  be matched by the string returned. For example,
 *  "xst-type(Curve)".
 *  If no list is specified, the selection computes its list of
 *  entities from the whole model. To use this class, you have to
 *  initialize the transfer norm first, as shown in the example below.
 *  Example:
 *  Control_Reader reader;
 *  IFSelect_ReturnStatus status = reader.ReadFile (filename.);
 *  When using IGESControl_Reader or STEPControl_Reader - as the
 *  above example shows - the reader initializes the norm directly.
 *  Note that loading the file only stores the data. It does
 *  not translate this data. Shapes are accumulated by
 *  successive transfers. The last shape is cleared by:
 *  - ClearShapes which allows you to handle a new batch
 *  - TransferRoots which restarts the list of shapes from scratch.
 */
public class XSControl_Reader {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  XSControl_Reader(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  XSControl_Reader(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(XSControl_Reader obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_XSControl_Reader(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a Reader from scratch (creates an empty WorkSession)
   *  A WorkSession or a Controller must be provided before running
   */
  public XSControl_Reader() {
    this(OCCwrapJavaJNI.new_XSControl_Reader__SWIG_0(), true);
  }

  /**
   *  Creates a Reader from scratch, with a norm name which
   *  identifies a Controller
   */
  public XSControl_Reader(String norm) {
    this(OCCwrapJavaJNI.new_XSControl_Reader__SWIG_1(norm), true);
  }

  /**
   *  Creates a Reader from an already existing Session, with a
   *  Controller already set
   *  Virtual destructor
   */
  public XSControl_Reader( XSControl_WorkSession  WS, long scratch) {
    this(OCCwrapJavaJNI.new_XSControl_Reader__SWIG_2( XSControl_WorkSession.getCPtr(WS) , WS, scratch), true);
  }

  /**
   *  Empty virtual destructor
   */
  public XSControl_Reader( XSControl_WorkSession  WS) {
    this(OCCwrapJavaJNI.new_XSControl_Reader__SWIG_3( XSControl_WorkSession.getCPtr(WS) , WS), true);
  }

  /**
   *  Sets a specific norm to <me>
   *  Returns True if done, False if <norm> is not available
   */
  public long SetNorm(String norm) {
    return OCCwrapJavaJNI.XSControl_Reader_SetNorm(swigCPtr, this, norm);
  }

  /**
   *  Sets a specific session to <me>
   */
  public void SetWS( XSControl_WorkSession  WS, long scratch) {
    OCCwrapJavaJNI.XSControl_Reader_SetWS__SWIG_0(swigCPtr, this,  XSControl_WorkSession.getCPtr(WS) , WS, scratch);
  }

  public void SetWS( XSControl_WorkSession  WS) {
    OCCwrapJavaJNI.XSControl_Reader_SetWS__SWIG_1(swigCPtr, this,  XSControl_WorkSession.getCPtr(WS) , WS);
  }

  public  XSControl_WorkSession  WS() {
    return new XSControl_WorkSession ( OCCwrapJavaJNI.XSControl_Reader_WS(swigCPtr, this), true );
  }

  /**
   *  Loads a file and returns the read status
   *  Zero for a Model which compies with the Controller
   */
  public IFSelect_ReturnStatus ReadFile(String filename) {
    return IFSelect_ReturnStatus.swigToEnum(OCCwrapJavaJNI.XSControl_Reader_ReadFile(swigCPtr, this, filename));
  }

  public  Interface_InterfaceModel  Model() {
    return new Interface_InterfaceModel ( OCCwrapJavaJNI.XSControl_Reader_Model(swigCPtr, this), true );
  }

  public  TColStd_HSequenceOfTransient  GiveList(String first, String second) {
    return new TColStd_HSequenceOfTransient ( OCCwrapJavaJNI.XSControl_Reader_GiveList__SWIG_0(swigCPtr, this, first, second), true );
  }

  public  TColStd_HSequenceOfTransient  GiveList(String first) {
    return new TColStd_HSequenceOfTransient ( OCCwrapJavaJNI.XSControl_Reader_GiveList__SWIG_1(swigCPtr, this, first), true );
  }

  public  TColStd_HSequenceOfTransient  GiveList() {
    return new TColStd_HSequenceOfTransient ( OCCwrapJavaJNI.XSControl_Reader_GiveList__SWIG_2(swigCPtr, this), true );
  }

  public  TColStd_HSequenceOfTransient  GiveList(String first,  Standard_Transient  ent) {
    return new TColStd_HSequenceOfTransient ( OCCwrapJavaJNI.XSControl_Reader_GiveList__SWIG_3(swigCPtr, this, first,  Standard_Transient.getCPtr(ent) , ent), true );
  }

  /**
   *  Determines the list of root entities which are candidate for
   *  a transfer to a Shape, and returns the number
   *  of entities in the list
   */
  public int NbRootsForTransfer() {
    return OCCwrapJavaJNI.XSControl_Reader_NbRootsForTransfer(swigCPtr, this);
  }

  public  Standard_Transient  RootForTransfer(int num) {
    return new Standard_Transient ( OCCwrapJavaJNI.XSControl_Reader_RootForTransfer__SWIG_0(swigCPtr, this, num), true );
  }

  public  Standard_Transient  RootForTransfer() {
    return new Standard_Transient ( OCCwrapJavaJNI.XSControl_Reader_RootForTransfer__SWIG_1(swigCPtr, this), true );
  }

  /**
   *  Translates a root identified by the rank num in the model.
   *  false is returned if no shape is produced.
   */
  public long TransferOneRoot(int num) {
    return OCCwrapJavaJNI.XSControl_Reader_TransferOneRoot__SWIG_0(swigCPtr, this, num);
  }

  public long TransferOneRoot() {
    return OCCwrapJavaJNI.XSControl_Reader_TransferOneRoot__SWIG_1(swigCPtr, this);
  }

  /**
   *  Translates an IGES or STEP
   *  entity identified by the rank num in the model.
   *  false is returned if no shape is produced.
   */
  public long TransferOne(int num) {
    return OCCwrapJavaJNI.XSControl_Reader_TransferOne(swigCPtr, this, num);
  }

  /**
   *  Translates an IGES or STEP
   *  entity in the model. true is returned if a shape is
   *  produced; otherwise, false is returned.
   */
  public long TransferEntity( Standard_Transient  start) {
    return OCCwrapJavaJNI.XSControl_Reader_TransferEntity(swigCPtr, this,  Standard_Transient.getCPtr(start) , start);
  }

  /**
   *  Translates a list of entities.
   *  Returns the number of IGES or STEP entities that were
   *  successfully translated. The list can be produced with GiveList.
   *  Warning - This function does not clear the existing output shapes.
   */
  public int TransferList( TColStd_HSequenceOfTransient  list) {
    return OCCwrapJavaJNI.XSControl_Reader_TransferList(swigCPtr, this,  TColStd_HSequenceOfTransient.getCPtr(list) , list);
  }

  /**
   *  Translates all translatable
   *  roots and returns the number of successful translations.
   *  Warning - This function clears existing output shapes first.
   */
  public int TransferRoots() {
    return OCCwrapJavaJNI.XSControl_Reader_TransferRoots(swigCPtr, this);
  }

  /**
   *  Clears the list of shapes that
   *  may have accumulated in calls to TransferOne or TransferRoot.C
   */
  public void ClearShapes() {
    OCCwrapJavaJNI.XSControl_Reader_ClearShapes(swigCPtr, this);
  }

  /**
   *  Returns the number of shapes produced by translation.
   */
  public int NbShapes() {
    return OCCwrapJavaJNI.XSControl_Reader_NbShapes(swigCPtr, this);
  }

  /**
   *  Returns the shape resulting
   *  from a translation and identified by the rank num.
   *  num equals 1 by default. In other words, the first shape
   *  resulting from the translation is returned.
   */
  public TopoDS_Shape Shape(int num) {
    return new TopoDS_Shape(OCCwrapJavaJNI.XSControl_Reader_Shape__SWIG_0(swigCPtr, this, num), true);
  }

  public TopoDS_Shape Shape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.XSControl_Reader_Shape__SWIG_1(swigCPtr, this), true);
  }

  /**
   *  Returns all of the results in
   *  a single shape which is:
   *  - a null shape if there are no results,
   *  - a shape if there is one result,
   *  - a compound containing the resulting shapes if there are more than one.
   */
  public TopoDS_Shape OneShape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.XSControl_Reader_OneShape(swigCPtr, this), true);
  }

  /**
   *  Prints the check list attached to loaded data, on the Standard
   *  Trace File (starts at cout)
   *  All messages or fails only, according to <failsonly>
   *  mode = 0 : per entity, prints messages
   *  mode = 1 : per message, just gives count of entities per check
   *  mode = 2 : also gives entity numbers
   */
  public void PrintCheckLoad(long failsonly, IFSelect_PrintCount mode) {
    OCCwrapJavaJNI.XSControl_Reader_PrintCheckLoad(swigCPtr, this, failsonly, mode.swigValue());
  }

  /**
   *  Displays check results for the
   *  last translation of IGES or STEP entities to Open CASCADE
   *  entities. Only fail messages are displayed if failsonly is
   *  true. All messages are displayed if failsonly is
   *  false. mode determines the contents and the order of the
   *  messages according to the terms of the IFSelect_PrintCount enumeration.
   */
  public void PrintCheckTransfer(long failsonly, IFSelect_PrintCount mode) {
    OCCwrapJavaJNI.XSControl_Reader_PrintCheckTransfer(swigCPtr, this, failsonly, mode.swigValue());
  }

  /**
   *  Displays the statistics for
   *  the last translation. what defines the kind of
   *  statistics that are displayed as follows:
   *  - 0 gives general statistics (number of translated roots,
   *  number of warnings, number of fail messages),
   *  - 1 gives root results,
   *  - 2 gives statistics for all checked entities,
   *  - 3 gives the list of translated entities,
   *  - 4 gives warning and fail messages,
   *  - 5 gives fail messages only.
   *  The use of mode depends on the value of what. If what is 0,
   *  mode is ignored. If what is 1, 2 or 3, mode defines the following:
   *  - 0 lists the numbers of IGES or STEP entities in the respective model
   *  - 1 gives the number, identifier, type and result
   *  type for each IGES or STEP entity and/or its status
   *  (fail, warning, etc.)
   *  - 2 gives maximum information for each IGES or STEP entity (i.e. checks)
   *  - 3 gives the number of entities per type of IGES or STEP entity
   *  - 4 gives the number of IGES or STEP entities per result type and/or status
   *  - 5 gives the number of pairs (IGES or STEP or result type and status)
   *  - 6 gives the number of pairs (IGES or STEP or result type
   *  and status) AND the list of entity numbers in the IGES or STEP model.
   *  If what is 4 or 5, mode defines the warning and fail
   *  messages as follows:
   *  - if mode is 0 all warnings and checks per entity are returned
   *  - if mode is 2 the list of entities per warning is returned.
   *  If mode is not set, only the list of all entities per warning is given.
   */
  public void PrintStatsTransfer(int what, int mode) {
    OCCwrapJavaJNI.XSControl_Reader_PrintStatsTransfer__SWIG_0(swigCPtr, this, what, mode);
  }

  public void PrintStatsTransfer(int what) {
    OCCwrapJavaJNI.XSControl_Reader_PrintStatsTransfer__SWIG_1(swigCPtr, this, what);
  }

  /**
   *  Gives statistics about Transfer
   */
  public void GetStatsTransfer( TColStd_HSequenceOfTransient  list, int[] nbMapped, int[] nbWithResult, int[] nbWithFail) {
    OCCwrapJavaJNI.XSControl_Reader_GetStatsTransfer(swigCPtr, this,  TColStd_HSequenceOfTransient.getCPtr(list) , list, nbMapped, nbWithResult, nbWithFail);
  }

}
