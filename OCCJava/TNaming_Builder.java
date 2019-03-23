package opencascade;

/**
 *  A tool to create and maintain topological attributes.
 *  Constructor creates an empty
 *  TNaming_NamedShape attribute at the given
 *  label. It allows adding "old shape" and "new
 *  shape" pairs with the specified evolution to this
 *  named shape. One evolution type per one
 *  builder must be used.
 */
public class TNaming_Builder {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TNaming_Builder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TNaming_Builder(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TNaming_Builder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TNaming_Builder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Create an   Builder.
   *  Warning:  Before Addition copies the current Value, and clear
   */
  public TNaming_Builder( TDF_Label  aLabel) {
    this(OCCwrapJavaJNI.new_TNaming_Builder(TDF_Label.getCPtr(aLabel), aLabel), true);
  }

  /**
   *  Records the shape newShape which was
   *  generated during a topological construction.
   *  As an example, consider the case of a face
   *  generated in construction of a box.
   */
  public void Generated( TopoDS_Shape  newShape) {
    OCCwrapJavaJNI.TNaming_Builder_Generated__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(newShape), newShape);
  }

  /**
   *  Records the shape newShape which was
   *  generated from the shape oldShape during a topological construction.
   *  As an example, consider the case of a face
   *  generated from an edge in construction of a prism.
   */
  public void Generated( TopoDS_Shape  oldShape,  TopoDS_Shape  newShape) {
    OCCwrapJavaJNI.TNaming_Builder_Generated__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(oldShape), oldShape, TopoDS_Shape.getCPtr(newShape), newShape);
  }

  /**
   *  Records the shape oldShape which was deleted from the current label.
   *  As an example, consider the case of a face removed by a Boolean operation.
   */
  public void Delete( TopoDS_Shape  oldShape) {
    OCCwrapJavaJNI.TNaming_Builder_Delete(swigCPtr, this, TopoDS_Shape.getCPtr(oldShape), oldShape);
  }

  /**
   *  Records the shape newShape which is a
   *  modification of the shape oldShape.
   *  As an example, consider the case of a face split
   *  or merged in a Boolean operation.
   */
  public void Modify( TopoDS_Shape  oldShape,  TopoDS_Shape  newShape) {
    OCCwrapJavaJNI.TNaming_Builder_Modify(swigCPtr, this, TopoDS_Shape.getCPtr(oldShape), oldShape, TopoDS_Shape.getCPtr(newShape), newShape);
  }

  /**
   *  Add a  Shape to the current label ,  This Shape is
   *  unmodified.  Used for example  to define a set
   *  of shapes under a label.
   */
  public void Select( TopoDS_Shape  aShape,  TopoDS_Shape  inShape) {
    OCCwrapJavaJNI.TNaming_Builder_Select(swigCPtr, this, TopoDS_Shape.getCPtr(aShape), aShape, TopoDS_Shape.getCPtr(inShape), inShape);
  }

  public  TNaming_NamedShape  NamedShape() {
    return new TNaming_NamedShape ( OCCwrapJavaJNI.TNaming_Builder_NamedShape(swigCPtr, this), true );
  }

}
