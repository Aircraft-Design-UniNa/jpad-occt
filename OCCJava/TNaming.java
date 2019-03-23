package opencascade;

/**
 *  A topological attribute can be seen as a hook
 *  into the topological structure. To this hook,
 *  data can be attached and references defined.
 *  It is used for keeping and access to
 *  topological objects and their evolution. All
 *  topological objects are stored in the one
 *  user-protected TNaming_UsedShapes
 *  attribute at the root label of the data
 *  framework. This attribute contains map with all
 *  topological shapes, used in this document.
 *  To all other labels TNaming_NamedShape
 *  attribute can be added. This attribute contains
 *  references (hooks) to shapes from the
 *  TNaming_UsedShapes attribute and evolution
 *  of these shapes. TNaming_NamedShape
 *  attribute contains a set of pairs of hooks: old
 *  shape and new shape (see the figure below).
 *  It allows not only get the topological shapes by
 *  the labels, but also trace evolution of the
 *  shapes and correctly resolve dependent
 *  shapes by the changed one.
 *  If shape is just-created, then the old shape for
 *  accorded named shape is an empty shape. If
 *  a shape is deleted, then the new shape in this named shape is empty.
 *  Different algorithms may dispose sub-shapes
 *  of the result shape at the individual label depending on necessity:
 *  -  If a sub-shape must have some extra attributes (material of
 *  each face or color of each edge). In this case a specific sub-shape is
 *  placed to the separate label (usually, sub-label of the result shape label)
 *  with all attributes of this sub-shape.
 *  -  If topological naming is needed, a necessary and sufficient
 *  (for selected sub-shapes identification) set of sub-shapes is
 *  placed to the child labels of the result
 *  shape label. As usual, as far as basic solids and closed shells are
 *  concerned, all faces of the shape are disposed. Edges and vertices
 *  sub-shapes can be identified as intersection of contiguous faces.
 *  Modified/generated shapes may be placed to one named shape and
 *  identified as this named shape and source named shape that also can be
 *  identified with used algorithms.
 *  TNaming_NamedShape may contain a few
 *  pairs of hooks with the same evolution. In this
 *  case topology shape, which belongs to the
 *  named shape, is a compound of new shapes.
 *  The data model contains both the topology
 *  and the hooks, and functions handle both
 *  topological entities and hooks. Consider the
 *  case of a box function, which creates a solid
 *  with six faces and six hooks. Each hook is
 *  attached to a face. If you want, you can also
 *  have this function create hooks for edges and
 *  vertices as well as for faces. For the sake of
 *  simplicity though, let's limit the example.
 *  Not all functions can define explicit hooks for
 *  all topological entities they create, but all
 *  topological entities can be turned into hooks
 *  when necessary. This is where topological naming is necessary.
 */
public class TNaming {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TNaming(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TNaming(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TNaming obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TNaming(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Subtituter les  shapes  sur les structures de   source
   *  vers cible
   */
  public static void Substitute( TDF_Label  labelsource,  TDF_Label  labelcible,  TopTools_DataMapOfShapeShape  mapOldNew) {
    OCCwrapJavaJNI.TNaming_Substitute(TDF_Label.getCPtr(labelsource), labelsource, TDF_Label.getCPtr(labelcible), labelcible, TopTools_DataMapOfShapeShape.getCPtr(mapOldNew), mapOldNew);
  }

  /**
   *  Mise a jour des shapes du label  et de ses fils en
   *  tenant compte des  substitutions decrite par
   *  mapOldNew.
   * 
   *  Warning: le  remplacement du shape est  fait    dans tous
   *  les    attributs  qui  le contiennent meme si ceux
   *  ci ne sont pas associees a des sous-labels de <Label>.
   */
  public static void Update( TDF_Label  label,  TopTools_DataMapOfShapeShape  mapOldNew) {
    OCCwrapJavaJNI.TNaming_Update(TDF_Label.getCPtr(label), label, TopTools_DataMapOfShapeShape.getCPtr(mapOldNew), mapOldNew);
  }

  /**
   *  Application de la Location sur les shapes du label
   *  et  de   ses   sous   labels.
   */
  public static void Displace( TDF_Label  label,  TopLoc_Location  aLocation, long WithOld) {
    OCCwrapJavaJNI.TNaming_Displace__SWIG_0(TDF_Label.getCPtr(label), label, TopLoc_Location.getCPtr(aLocation), aLocation, WithOld);
  }

  public static void Displace( TDF_Label  label,  TopLoc_Location  aLocation) {
    OCCwrapJavaJNI.TNaming_Displace__SWIG_1(TDF_Label.getCPtr(label), label, TopLoc_Location.getCPtr(aLocation), aLocation);
  }

  /**
   *  Remplace  les  shapes du label et  des sous-labels
   *  par des copies.
   */
  public static void ChangeShapes( TDF_Label  label,  TopTools_DataMapOfShapeShape  M) {
    OCCwrapJavaJNI.TNaming_ChangeShapes(TDF_Label.getCPtr(label), label, TopTools_DataMapOfShapeShape.getCPtr(M), M);
  }

  /**
   *  Application de la transformation sur les shapes du
   *  label et de ses sous labels.
   *  Warning: le  remplacement du shape est  fait    dans tous
   *  les    attributs  qui  le contiennent meme si ceux
   *  ci ne sont pas associees a des sous-labels de <Label>.
   */
  public static void Transform( TDF_Label  label,  gp_Trsf  aTransformation) {
    OCCwrapJavaJNI.TNaming_Transform(TDF_Label.getCPtr(label), label, gp_Trsf.getCPtr(aTransformation), aTransformation);
  }

  /**
   *  Replicates the named shape with the transformation <T>
   *  on the label <L> (and sub-labels if necessary)
   *  (TNaming_GENERATED is set)
   */
  public static void Replicate( TNaming_NamedShape  NS,  gp_Trsf  T,  TDF_Label  L) {
    OCCwrapJavaJNI.TNaming_Replicate__SWIG_0( TNaming_NamedShape.getCPtr(NS) , NS, gp_Trsf.getCPtr(T), T, TDF_Label.getCPtr(L), L);
  }

  /**
   *  Replicates the shape with the transformation <T>
   *  on the label <L> (and sub-labels if necessary)
   *  (TNaming_GENERATED is set)
   */
  public static void Replicate( TopoDS_Shape  SH,  gp_Trsf  T,  TDF_Label  L) {
    OCCwrapJavaJNI.TNaming_Replicate__SWIG_1(TopoDS_Shape.getCPtr(SH), SH, gp_Trsf.getCPtr(T), T, TDF_Label.getCPtr(L), L);
  }

  /**
   *  Builds shape from map content
   */
  public static TopoDS_Shape MakeShape( TopTools_MapOfShape  MS) {
    return new TopoDS_Shape(OCCwrapJavaJNI.TNaming_MakeShape(TopTools_MapOfShape.getCPtr(MS), MS), true);
  }

  /**
   *  Find unique context of shape <S>
   */
  public static TopoDS_Shape FindUniqueContext( TopoDS_Shape  S,  TopoDS_Shape  Context) {
    return new TopoDS_Shape(OCCwrapJavaJNI.TNaming_FindUniqueContext(TopoDS_Shape.getCPtr(S), S, TopoDS_Shape.getCPtr(Context), Context), true);
  }

  /**
   *  Find unique context of shape <S>,which is pure concatenation
   *  of atomic shapes (Compound). The result is concatenation of
   *  single contexts
   */
  public static TopoDS_Shape FindUniqueContextSet( TopoDS_Shape  S,  TopoDS_Shape  Context,  TopTools_HArray1OfShape  Arr) {
    return new TopoDS_Shape(OCCwrapJavaJNI.TNaming_FindUniqueContextSet(TopoDS_Shape.getCPtr(S), S, TopoDS_Shape.getCPtr(Context), Context,  TopTools_HArray1OfShape.getCPtr(Arr) , Arr), true);
  }

  /**
   *  Subtitutes shape in source structure
   */
  public static long SubstituteSShape( TDF_Label  accesslabel,  TopoDS_Shape  From, TopoDS_Shape To) {
    return OCCwrapJavaJNI.TNaming_SubstituteSShape(TDF_Label.getCPtr(accesslabel), accesslabel, TopoDS_Shape.getCPtr(From), From, TopoDS_Shape.getCPtr(To), To);
  }

  /**
   *  Returns True if outer wire is found and the found wire in <theWire>.
   */
  public static long OuterWire( TopoDS_Face  theFace, TopoDS_Wire theWire) {
    return OCCwrapJavaJNI.TNaming_OuterWire(TopoDS_Face.getCPtr(theFace), theFace, TopoDS_Wire.getCPtr(theWire), theWire);
  }

  /**
   *  Returns True if outer Shell is found and the found shell in <theShell>.
   *  Print of TNaming enumeration
   *  =============================
   */
  public static long OuterShell( TopoDS_Solid  theSolid, TopoDS_Shell theShell) {
    return OCCwrapJavaJNI.TNaming_OuterShell(TopoDS_Solid.getCPtr(theSolid), theSolid, TopoDS_Shell.getCPtr(theShell), theShell);
  }

  /**
   *  Prints the  evolution  <EVOL> as  a String on  the
   *  Stream <S> and returns <S>.
   */
  public static SWIGTYPE_p_Standard_OStream Print(TNaming_Evolution EVOL, SWIGTYPE_p_Standard_OStream S) {
    return new SWIGTYPE_p_Standard_OStream(OCCwrapJavaJNI.TNaming_Print__SWIG_0(EVOL.swigValue(), SWIGTYPE_p_Standard_OStream.getCPtr(S)), false);
  }

  /**
   *  Prints the name of name type <NAME> as a String on
   *  the Stream <S> and returns <S>.
   */
  public static SWIGTYPE_p_Standard_OStream Print(TNaming_NameType NAME, SWIGTYPE_p_Standard_OStream S) {
    return new SWIGTYPE_p_Standard_OStream(OCCwrapJavaJNI.TNaming_Print__SWIG_1(NAME.swigValue(), SWIGTYPE_p_Standard_OStream.getCPtr(S)), false);
  }

  /**
   *  Prints the content of UsedShapes private  attribute as a String Table on
   *  the Stream <S> and returns <S>.
   */
  public static SWIGTYPE_p_Standard_OStream Print( TDF_Label  ACCESS, SWIGTYPE_p_Standard_OStream S) {
    return new SWIGTYPE_p_Standard_OStream(OCCwrapJavaJNI.TNaming_Print__SWIG_2(TDF_Label.getCPtr(ACCESS), ACCESS, SWIGTYPE_p_Standard_OStream.getCPtr(S)), false);
  }

  public TNaming() {
    this(OCCwrapJavaJNI.new_TNaming(), true);
  }

}
