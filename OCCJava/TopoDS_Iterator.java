package opencascade;

/**
 *  Iterates on the underlying shape underlying a given
 *  TopoDS_Shape object, providing access to its
 *  component sub-shapes. Each component shape is
 *  returned as a TopoDS_Shape with an orientation,
 *  and a compound of the original values and the relative values.
 */
public class TopoDS_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TopoDS_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TopoDS_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TopoDS_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopoDS_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an empty Iterator.
   */
  public TopoDS_Iterator() {
    this(OCCwrapJavaJNI.new_TopoDS_Iterator__SWIG_0(), true);
  }

  /**
   *  Creates an Iterator on <S> sub-shapes.
   *  Note:
   *  - If cumOri is true, the function composes all
   *  sub-shapes with the orientation of S.
   *  - If cumLoc is true, the function multiplies all
   *  sub-shapes by the location of S, i.e. it applies to
   *  each sub-shape the transformation that is associated with S.
   */
  public TopoDS_Iterator( TopoDS_Shape  S, long cumOri, long cumLoc) {
    this(OCCwrapJavaJNI.new_TopoDS_Iterator__SWIG_1(TopoDS_Shape.getCPtr(S), S, cumOri, cumLoc), true);
  }

  public TopoDS_Iterator( TopoDS_Shape  S, long cumOri) {
    this(OCCwrapJavaJNI.new_TopoDS_Iterator__SWIG_2(TopoDS_Shape.getCPtr(S), S, cumOri), true);
  }

  public TopoDS_Iterator( TopoDS_Shape  S) {
    this(OCCwrapJavaJNI.new_TopoDS_Iterator__SWIG_3(TopoDS_Shape.getCPtr(S), S), true);
  }

  /**
   *  Initializes this iterator with shape S.
   *  Note:
   *  - If cumOri is true, the function composes all
   *  sub-shapes with the orientation of S.
   *  - If cumLoc is true, the function multiplies all
   *  sub-shapes by the location of S, i.e. it applies to
   *  each sub-shape the transformation that is associated with S.
   */
  public void Initialize( TopoDS_Shape  S, long cumOri, long cumLoc) {
    OCCwrapJavaJNI.TopoDS_Iterator_Initialize__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, cumOri, cumLoc);
  }

  public void Initialize( TopoDS_Shape  S, long cumOri) {
    OCCwrapJavaJNI.TopoDS_Iterator_Initialize__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, cumOri);
  }

  public void Initialize( TopoDS_Shape  S) {
    OCCwrapJavaJNI.TopoDS_Iterator_Initialize__SWIG_2(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

  /**
   *  Returns true if there is another sub-shape in the
   *  shape which this iterator is scanning.
   */
  public long More() {
    return OCCwrapJavaJNI.TopoDS_Iterator_More(swigCPtr, this);
  }

  /**
   *  Moves on to the next sub-shape in the shape which
   *  this iterator is scanning.
   *  Exceptions
   *  Standard_NoMoreObject if there are no more sub-shapes in the shape.
   */
  public void Next() {
    OCCwrapJavaJNI.TopoDS_Iterator_Next(swigCPtr, this);
  }

  /**
   *  Returns the current sub-shape in the shape which
   *  this iterator is scanning.
   *  Exceptions
   *  Standard_NoSuchObject if there is no current sub-shape.
   */
  public  TopoDS_Shape  Value() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopoDS_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

}
