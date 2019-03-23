package opencascade;

/**
 *  Defines an Iterator on Entities.
 *  Allows considering of various criteria
 */
public class Interface_EntityIterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Interface_EntityIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Interface_EntityIterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Interface_EntityIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Interface_EntityIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Defines an empty iterator (see AddList & AddItem)
   */
  public Interface_EntityIterator() {
    this(OCCwrapJavaJNI.new_Interface_EntityIterator__SWIG_0(), true);
  }

  /**
   *  Defines an iterator on a list, directly i.e. without copying it
   */
  public Interface_EntityIterator( TColStd_HSequenceOfTransient  list) {
    this(OCCwrapJavaJNI.new_Interface_EntityIterator__SWIG_1( TColStd_HSequenceOfTransient.getCPtr(list) , list), true);
  }

  /**
   *  Gets a list of entities and adds its to the iteration list
   */
  public void AddList( TColStd_HSequenceOfTransient  list) {
    OCCwrapJavaJNI.Interface_EntityIterator_AddList(swigCPtr, this,  TColStd_HSequenceOfTransient.getCPtr(list) , list);
  }

  /**
   *  Adds to the iteration list a defined entity
   */
  public void AddItem( Standard_Transient  anentity) {
    OCCwrapJavaJNI.Interface_EntityIterator_AddItem(swigCPtr, this,  Standard_Transient.getCPtr(anentity) , anentity);
  }

  /**
   *  same as AddItem (kept for compatibility)
   */
  public void GetOneItem( Standard_Transient  anentity) {
    OCCwrapJavaJNI.Interface_EntityIterator_GetOneItem(swigCPtr, this,  Standard_Transient.getCPtr(anentity) , anentity);
  }

  /**
   *  Selects entities with are Kind of a given type,  keep only
   *  them (is keep is True) or reject only them (if keep is False)
   */
  public void SelectType( Standard_Type  atype, long keep) {
    OCCwrapJavaJNI.Interface_EntityIterator_SelectType(swigCPtr, this,  Standard_Type.getCPtr(atype) , atype, keep);
  }

  /**
   *  Returns count of entities which will be iterated on
   *  Calls Start if not yet done
   */
  public int NbEntities() {
    return OCCwrapJavaJNI.Interface_EntityIterator_NbEntities(swigCPtr, this);
  }

  /**
   *  Returns count of entities of a given type (kind of)
   */
  public int NbTyped( Standard_Type  type) {
    return OCCwrapJavaJNI.Interface_EntityIterator_NbTyped(swigCPtr, this,  Standard_Type.getCPtr(type) , type);
  }

  /**
   *  Returns the list of entities of a given type (kind of)
   */
  public Interface_EntityIterator Typed( Standard_Type  type) {
    return new Interface_EntityIterator(OCCwrapJavaJNI.Interface_EntityIterator_Typed(swigCPtr, this,  Standard_Type.getCPtr(type) , type), true);
  }

  /**
   *  Allows re-iteration (useless for the first iteration)
   */
  public void Start() {
    OCCwrapJavaJNI.Interface_EntityIterator_Start(swigCPtr, this);
  }

  /**
   *  Says if there are other entities (vertices) to iterate
   *  the first time, calls Start
   */
  public long More() {
    return OCCwrapJavaJNI.Interface_EntityIterator_More(swigCPtr, this);
  }

  /**
   *  Sets iteration to the next entity (vertex) to give
   */
  public void Next() {
    OCCwrapJavaJNI.Interface_EntityIterator_Next(swigCPtr, this);
  }

  public  Standard_Transient  Value() {
    return new Standard_Transient ( OCCwrapJavaJNI.Interface_EntityIterator_Value(swigCPtr, this), true );
  }

  public  TColStd_HSequenceOfTransient  Content() {
    return new TColStd_HSequenceOfTransient ( OCCwrapJavaJNI.Interface_EntityIterator_Content(swigCPtr, this), true );
  }

  /**
   *  Clears data of iteration
   */
  public void Destroy() {
    OCCwrapJavaJNI.Interface_EntityIterator_Destroy(swigCPtr, this);
  }

}
