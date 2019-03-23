package opencascade;

/**
 *  Stores link between a shape <S> and a shape <NewS>
 *  obtained from <S>. <NewS> is an image of <S>.
 */
public class BRepAlgo_Image {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepAlgo_Image(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepAlgo_Image(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepAlgo_Image obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepAlgo_Image(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BRepAlgo_Image() {
    this(OCCwrapJavaJNI.new_BRepAlgo_Image(), true);
  }

  public void SetRoot( TopoDS_Shape  S) {
    OCCwrapJavaJNI.BRepAlgo_Image_SetRoot(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

  /**
   *  Links <NewS> as image of <OldS>.
   */
  public void Bind( TopoDS_Shape  OldS,  TopoDS_Shape  NewS) {
    OCCwrapJavaJNI.BRepAlgo_Image_Bind__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(OldS), OldS, TopoDS_Shape.getCPtr(NewS), NewS);
  }

  /**
   *  Links <NewS> as image of <OldS>.
   */
  public void Bind( TopoDS_Shape  OldS,  TopTools_ListOfShape  NewS) {
    OCCwrapJavaJNI.BRepAlgo_Image_Bind__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(OldS), OldS, TopTools_ListOfShape.getCPtr(NewS), NewS);
  }

  /**
   *  Add <NewS> to the image of <OldS>.
   */
  public void Add( TopoDS_Shape  OldS,  TopoDS_Shape  NewS) {
    OCCwrapJavaJNI.BRepAlgo_Image_Add__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(OldS), OldS, TopoDS_Shape.getCPtr(NewS), NewS);
  }

  /**
   *  Add <NewS> to the image of <OldS>.
   */
  public void Add( TopoDS_Shape  OldS,  TopTools_ListOfShape  NewS) {
    OCCwrapJavaJNI.BRepAlgo_Image_Add__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(OldS), OldS, TopTools_ListOfShape.getCPtr(NewS), NewS);
  }

  public void Clear() {
    OCCwrapJavaJNI.BRepAlgo_Image_Clear(swigCPtr, this);
  }

  /**
   *  Remove <S> to set of images.
   */
  public void Remove( TopoDS_Shape  S) {
    OCCwrapJavaJNI.BRepAlgo_Image_Remove(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

  public  TopTools_ListOfShape  Roots() {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BRepAlgo_Image_Roots(swigCPtr, this), false, this);
    return ret;
  }

  public long IsImage( TopoDS_Shape  S) {
    return OCCwrapJavaJNI.BRepAlgo_Image_IsImage(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

  /**
   *  Returns the generator of <S>
   */
  public  TopoDS_Shape  ImageFrom( TopoDS_Shape  S) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepAlgo_Image_ImageFrom(swigCPtr, this, TopoDS_Shape.getCPtr(S), S), true);
    return ret;
  }

  /**
   *  Returns the upper generator of <S>
   */
  public  TopoDS_Shape  Root( TopoDS_Shape  S) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepAlgo_Image_Root(swigCPtr, this, TopoDS_Shape.getCPtr(S), S), true);
    return ret;
  }

  public long HasImage( TopoDS_Shape  S) {
    return OCCwrapJavaJNI.BRepAlgo_Image_HasImage(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

  /**
   *  Returns the Image of <S>.
   *  Returns <S> in the list if HasImage(S) is false.
   */
  public  TopTools_ListOfShape  Image( TopoDS_Shape  S) {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BRepAlgo_Image_Image(swigCPtr, this, TopoDS_Shape.getCPtr(S), S), false, this);
    return ret;
  }

  /**
   *  Stores in <L> the images of images of...images of <S>.
   *  <L> contains only <S> if  HasImage(S) is false.
   */
  public void LastImage( TopoDS_Shape  S,  TopTools_ListOfShape  L) {
    OCCwrapJavaJNI.BRepAlgo_Image_LastImage(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, TopTools_ListOfShape.getCPtr(L), L);
  }

  /**
   *  Keeps only the link between roots and lastimage.
   */
  public void Compact() {
    OCCwrapJavaJNI.BRepAlgo_Image_Compact(swigCPtr, this);
  }

  /**
   *  Deletes in the images the shape of type <ShapeType>
   *  which are not in <S>.
   *  Warning:  Compact() must be call before.
   */
  public void Filter( TopoDS_Shape  S, TopAbs_ShapeEnum ShapeType) {
    OCCwrapJavaJNI.BRepAlgo_Image_Filter(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, ShapeType.swigValue());
  }

}
