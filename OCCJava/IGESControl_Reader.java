package opencascade;

/**
 *  Reads IGES files, checks them and translates their contents into Open CASCADE models.
 *  The IGES data can be that of a whole model or that of a specific list of entities in the model.
 *  As in XSControl_Reader, you specify the list using a selection.
 *  For translation of iges files it is possible to use the following sequence:
 *  To change parameters of translation
 *  class Interface_Static should be used before the beginning of translation
 *  (see IGES Parameters and General Parameters)
 *  Creation of reader
 *  IGESControl_Reader reader;
 *  To load a file in a model use method:
 *  reader.ReadFile("filename.igs")
 *  To check a loading file use method Check:
 *  reader.Check(failsonly); where failsonly is equal to Standard_True or
 *  Standard_False;
 *  To print the results of load:
 *  reader.PrintCheckLoad(failsonly,mode) where mode is equal to the value of
 *  enumeration IFSelect_PrintCount
 *  To transfer entities from a model the following methods can be used:
 *  for the whole model
 *  reader.TransferRoots(onlyvisible); where onlyvisible is equal to
 *  Standard_True or Standard_False;
 *  To transfer a list of entities:
 *  reader.TransferList(list);
 *  To transfer one entity
 *  reader.TransferEntity(ent) or reader.Transfer(num);
 *  To obtain a result the following method can be used:
 *  reader.IsDone()
 *  reader.NbShapes() and reader.Shape(num); or reader.OneShape();
 *  To print the results of transfer use method:
 *  reader.PrintTransferInfo(failwarn,mode); where printfail is equal to the
 *  value of enumeration IFSelect_PrintFail, mode see above.
 *  Gets correspondence between an IGES entity and a result shape obtained therefrom.
 *  reader.TransientProcess();
 *  TopoDS_Shape shape =
 *  TransferBRep::ShapeResult(reader.TransientProcess(),ent);
 */
public class IGESControl_Reader extends XSControl_Reader {

  private long swigCPtr;
  IGESControl_Reader(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.IGESControl_Reader_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  IGESControl_Reader(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.IGESControl_Reader_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(IGESControl_Reader obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IGESControl_Reader(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Creates a Reader from scratch
   */
  public IGESControl_Reader() {
    this(OCCwrapJavaJNI.new_IGESControl_Reader__SWIG_0(), true);
  }

  /**
   *  Creates a Reader from an already existing Session
   */
  public IGESControl_Reader( XSControl_WorkSession  WS, long scratch) {
    this(OCCwrapJavaJNI.new_IGESControl_Reader__SWIG_1( XSControl_WorkSession.getCPtr(WS) , WS, scratch), true);
  }

  public IGESControl_Reader( XSControl_WorkSession  WS) {
    this(OCCwrapJavaJNI.new_IGESControl_Reader__SWIG_2( XSControl_WorkSession.getCPtr(WS) , WS), true);
  }

  /**
   *  Set the transion of ALL Roots (if theReadOnlyVisible is False)
   *  or of Visible Roots (if theReadOnlyVisible is True)
   */
  public void SetReadVisible(long ReadRoot) {
    OCCwrapJavaJNI.IGESControl_Reader_SetReadVisible(swigCPtr, this, ReadRoot);
  }

  public long GetReadVisible() {
    return OCCwrapJavaJNI.IGESControl_Reader_GetReadVisible(swigCPtr, this);
  }

  public  IGESData_IGESModel  IGESModel() {
    return new IGESData_IGESModel ( OCCwrapJavaJNI.IGESControl_Reader_IGESModel(swigCPtr, this), true );
  }

}
