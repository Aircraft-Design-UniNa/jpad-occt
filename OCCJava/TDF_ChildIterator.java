package opencascade;

/**
 *  Iterates on the children of a label, at the first
 *  level only. It is possible to ask the iterator to
 *  explore all the sub label levels of the given one,
 *  with the option "allLevels".
 */
public class TDF_ChildIterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF_ChildIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF_ChildIterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF_ChildIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF_ChildIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an empty iterator  object to
   *  explore the children of a label.
   */
  public TDF_ChildIterator() {
    this(OCCwrapJavaJNI.new_TDF_ChildIterator__SWIG_0(), true);
  }

  /**
   *  Constructs the iterator object defined by
   *  the label aLabel.  Iterates on the children of the given label. If
   *  <allLevels> option is set to true, it explores not
   *  only the first, but all the sub label levels.
   */
  public TDF_ChildIterator(TDF_Label aLabel, long allLevels) {
    this(OCCwrapJavaJNI.new_TDF_ChildIterator__SWIG_1(TDF_Label.getCPtr(aLabel), aLabel, allLevels), true);
  }

  public TDF_ChildIterator(TDF_Label aLabel) {
    this(OCCwrapJavaJNI.new_TDF_ChildIterator__SWIG_2(TDF_Label.getCPtr(aLabel), aLabel), true);
  }

  /**
   *  Initializes the iteration on the children of the
   *  given label.
   *  If <allLevels> option is set to true,
   *  it explores not only the first, but all the sub
   *  label levels.
   *  If allLevels is false, only the first level of
   *  child labels is explored.
   *  In the example below, the label is iterated
   *  using Initialize, More and Next and its
   *  child labels dumped using TDF_Tool::Entry.
   *  Example
   *  void DumpChildren(const
   *  TDF_Label& aLabel)
   *  {
   *  TDF_ChildIterator it;
   *  TCollection_AsciiString es;
   *  for
   *  (it.Initialize(aLabel,Standard_True);
   *  it.More(); it.Next()){
   *  TDF_Tool::Entry(it.Value(),es);
   *  cout << as.ToCString() << endl;
   *  }
   *  }
   */
  public void Initialize(TDF_Label aLabel, long allLevels) {
    OCCwrapJavaJNI.TDF_ChildIterator_Initialize__SWIG_0(swigCPtr, this, TDF_Label.getCPtr(aLabel), aLabel, allLevels);
  }

  public void Initialize(TDF_Label aLabel) {
    OCCwrapJavaJNI.TDF_ChildIterator_Initialize__SWIG_1(swigCPtr, this, TDF_Label.getCPtr(aLabel), aLabel);
  }

  /**
   *  Returns true if a current label is found in the
   *  iteration process.
   */
  public long More() {
    return OCCwrapJavaJNI.TDF_ChildIterator_More(swigCPtr, this);
  }

  /**
   *  Move the  current  iteration  to the next Item.
   */
  public void Next() {
    OCCwrapJavaJNI.TDF_ChildIterator_Next(swigCPtr, this);
  }

  /**
   *  Moves this iteration to the next brother
   *  label. A brother label is one with the same
   *  father as an initial label.
   *  Use this function when the non-empty
   *  constructor or Initialize has allLevels set to
   *  true. The result is that the iteration does not
   *  explore the children of the current label.
   *  This method is interesting only with
   *  "allLevels" behavior, because it avoids to explore
   *  the current label children.
   */
  public void NextBrother() {
    OCCwrapJavaJNI.TDF_ChildIterator_NextBrother(swigCPtr, this);
  }

  /**
   *  Returns the current label; or, if there is
   *  none, a null label.
   */
  public TDF_Label Value() {
    return new TDF_Label(OCCwrapJavaJNI.TDF_ChildIterator_Value(swigCPtr, this), true);
  }

}
