package opencascade;

/**
 *  A tool to visit the contents of a named shape attribute.
 *  Pairs of shapes in the attribute are iterated, one
 *  being the pre-modification or the old shape, and
 *  the other the post-modification or the new shape.
 *  This allows you to have a full access to all
 *  contents of an attribute. If, on the other hand, you
 *  are only interested in topological entities stored
 *  in the attribute, you can use the functions
 *  GetShape and CurrentShape in TNaming_Tool.
 */
public class TNaming_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TNaming_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TNaming_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TNaming_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TNaming_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Iterates on all  the history records in
   *  <anAtt>.
   */
  public TNaming_Iterator( TNaming_NamedShape  anAtt) {
    this(OCCwrapJavaJNI.new_TNaming_Iterator__SWIG_0( TNaming_NamedShape.getCPtr(anAtt) , anAtt), true);
  }

  /**
   *  Iterates on all  the history records in
   *  the current transaction
   */
  public TNaming_Iterator( TDF_Label  aLabel) {
    this(OCCwrapJavaJNI.new_TNaming_Iterator__SWIG_1(TDF_Label.getCPtr(aLabel), aLabel), true);
  }

  /**
   *  Iterates on all  the history records in
   *  the transaction <aTrans>
   */
  public TNaming_Iterator( TDF_Label  aLabel, int aTrans) {
    this(OCCwrapJavaJNI.new_TNaming_Iterator__SWIG_2(TDF_Label.getCPtr(aLabel), aLabel, aTrans), true);
  }

  /**
   *  Returns True if there is a current Item in
   *  the iteration.
   */
  public long More() {
    return OCCwrapJavaJNI.TNaming_Iterator_More(swigCPtr, this);
  }

  /**
   *  Moves the iteration to the next Item
   */
  public void Next() {
    OCCwrapJavaJNI.TNaming_Iterator_Next(swigCPtr, this);
  }

  /**
   *  Returns the old shape in this iterator object.
   *  This shape can be a null one.
   */
  public  TopoDS_Shape  OldShape() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TNaming_Iterator_OldShape(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the new shape in this iterator object.
   */
  public  TopoDS_Shape  NewShape() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TNaming_Iterator_NewShape(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns true if the  new  shape is a modification  (split,
   *  fuse,etc...) of the old shape.
   */
  public long IsModification() {
    return OCCwrapJavaJNI.TNaming_Iterator_IsModification(swigCPtr, this);
  }

  public TNaming_Evolution Evolution() {
    return TNaming_Evolution.swigToEnum(OCCwrapJavaJNI.TNaming_Iterator_Evolution(swigCPtr, this));
  }

}
