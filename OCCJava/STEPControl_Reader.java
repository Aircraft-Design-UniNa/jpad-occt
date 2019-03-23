package opencascade;

/**
 *  Reads STEP files, checks them and translates their contents
 *  into Open CASCADE models. The STEP data can be that of
 *  a whole model or that of a specific list of entities in the model.
 *  As in XSControl_Reader, you specify the list using a selection.
 *  For the translation of iges files it is possible to use next sequence:
 *  To change translation parameters
 *  class Interface_Static should be used before beginning of
 *  translation  (see STEP Parameters and General Parameters)
 *  Creation of reader - STEPControl_Reader reader;
 *  To load s file in a model use method reader.ReadFile("filename.stp")
 *  To print load results reader.PrintCheckLoad(failsonly,mode)
 *  where mode is equal to the value of enumeration IFSelect_PrintCount
 *  For definition number of candidates :
 *  Standard_Integer nbroots = reader. NbRootsForTransfer();
 *  To transfer entities from a model the following methods can be used:
 *  for the whole model - reader.TransferRoots();
 *  to transfer a list of entities: reader.TransferList(list);
 *  to transfer one entity Handle(Standard_Transient)
 *  ent = reader.RootForTransfer(num);
 *  reader.TransferEntity(ent), or
 *  reader.TransferOneRoot(num), or
 *  reader.TransferOne(num), or
 *  reader.TransferRoot(num)
 *  To obtain the result the following method can be used:
 *  reader.NbShapes() and reader.Shape(num); or reader.OneShape();
 *  To print the results of transfer use method:
 *  reader.PrintCheckTransfer(failwarn,mode);
 *  where printfail is equal to the value of enumeration
 *  IFSelect_PrintFail, mode see above; or reader.PrintStatsTransfer();
 *  Gets correspondence between a STEP entity and a result
 *  shape obtained from it.
 *  Handle(XSControl_WorkSession)
 *  WS = reader.WS();
 *  if ( WS->TransferReader()->HasResult(ent) )
 *  TopoDS_Shape shape = WS->TransferReader()->ShapeResult(ent);
 */
public class STEPControl_Reader extends XSControl_Reader {

  private long swigCPtr;
  STEPControl_Reader(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.STEPControl_Reader_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  STEPControl_Reader(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.STEPControl_Reader_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(STEPControl_Reader obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_STEPControl_Reader(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Creates a reader object with an empty STEP model.
   */
  public STEPControl_Reader() {
    this(OCCwrapJavaJNI.new_STEPControl_Reader__SWIG_0(), true);
  }

  /**
   *  Creates a Reader for STEP from an already existing Session
   *  Clears the session if it was not yet set for STEP
   */
  public STEPControl_Reader( XSControl_WorkSession  WS, long scratch) {
    this(OCCwrapJavaJNI.new_STEPControl_Reader__SWIG_1( XSControl_WorkSession.getCPtr(WS) , WS, scratch), true);
  }

  public STEPControl_Reader( XSControl_WorkSession  WS) {
    this(OCCwrapJavaJNI.new_STEPControl_Reader__SWIG_2( XSControl_WorkSession.getCPtr(WS) , WS), true);
  }

  public  StepData_StepModel  StepModel() {
    return new StepData_StepModel ( OCCwrapJavaJNI.STEPControl_Reader_StepModel(swigCPtr, this), true );
  }

  /**
   *  Transfers a root given its rank in the list of candidate roots
   *  Default is the first one
   *  Returns True if a shape has resulted, false else
   *  Same as inherited TransferOneRoot, kept for compatibility
   */
  public long TransferRoot(int num) {
    return OCCwrapJavaJNI.STEPControl_Reader_TransferRoot__SWIG_0(swigCPtr, this, num);
  }

  public long TransferRoot() {
    return OCCwrapJavaJNI.STEPControl_Reader_TransferRoot__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns sequence of all unit names for shape representations
   *  found in file
   */
  public void FileUnits( TColStd_SequenceOfAsciiString  theUnitLengthNames,  TColStd_SequenceOfAsciiString  theUnitAngleNames,  TColStd_SequenceOfAsciiString  theUnitSolidAngleNames) {
    OCCwrapJavaJNI.STEPControl_Reader_FileUnits(swigCPtr, this, TColStd_SequenceOfAsciiString.getCPtr(theUnitLengthNames), theUnitLengthNames, TColStd_SequenceOfAsciiString.getCPtr(theUnitAngleNames), theUnitAngleNames, TColStd_SequenceOfAsciiString.getCPtr(theUnitSolidAngleNames), theUnitSolidAngleNames);
  }

}
