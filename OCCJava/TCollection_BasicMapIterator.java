package opencascade;

/**
 *  This  class  provides    basic   services  for the
 *  iterators  on Maps. The  iterators  are  inherited
 *  from this one.
 * 
 *  The  iterator   contains  an   array   of pointers
 *  (buckets). Each bucket is a  pointer  on a node. A
 *  node contains a pointer on the next node.
 * 
 *  This class  provides also basic  services for  the
 *  implementation of Maps.
 *  A map iterator provides a step by step exploration of all
 *  entries of a map. After initialization of a concrete derived
 *  iterator, use in a loop:
 *  -   the function More to know if there is a current entry for
 *  the iterator in the map,
 *  -   then the functions which read data on an entry of the
 *  map (these functions are provided by each type of map),
 *  -   then the function Next to set the iterator to the next   entry of the map.
 *  Warning
 *  -   A map is a non-ordered data structure. The order in
 *  which entries of a map are explored by the iterator
 *  depends on its contents, and change when the map is edited.
 *  -   It is not recommended to modify the contents of a map
 *  during iteration: the result is unpredictable.
 */
public class TCollection_BasicMapIterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TCollection_BasicMapIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TCollection_BasicMapIterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TCollection_BasicMapIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TCollection_BasicMapIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Resets the iterator to the first node.
   */
  public void Reset() {
    OCCwrapJavaJNI.TCollection_BasicMapIterator_Reset(swigCPtr, this);
  }

  /**
   *  Returns true if there is a current entry for this iterator in the map.
   *  Use the function Next to set this iterator to the position of
   *  the next entry, if it exists.
   */
  public long More() {
    return OCCwrapJavaJNI.TCollection_BasicMapIterator_More(swigCPtr, this);
  }

  /**
   *  Sets this iterator to the position of the next entry of the map.
   *  Nothing is changed if there is no more entry to explore in
   *  the map: this iterator is always positioned on the last entry
   *  of the map but the function More returns false.
   */
  public void Next() {
    OCCwrapJavaJNI.TCollection_BasicMapIterator_Next(swigCPtr, this);
  }

}
