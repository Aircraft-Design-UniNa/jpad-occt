package opencascade;

/**
 *  Root  class of  all the maps,  provides utilitites
 *  for managing the buckets.
 *  Maps are dynamically extended data structures where
 *  data is quickly accessed with a key.
 *  General properties of maps
 *  -   Map items may be (complex) non-unitary data; they
 *  may be difficult to manage with an array. Moreover, the
 *  map allows a data structure to be indexed by complex   data.
 *  -   The size of a map is dynamically extended. So a map
 *  may be first dimensioned for a little number of items.
 *  Maps avoid the use of large and quasi-empty arrays.
 *  -   The access to a map item is much faster than the one
 *  to a sequence, a list, a queue or a stack item.
 *  -   The access time to a map item may be compared with
 *  the one to an array item. First of all, it depends on the
 *  size of the map. It also depends on the quality of a user
 *  redefinable function (the hashing function) to find
 *  quickly where the item is.
 *  -   The exploration of a map may be of better performance
 *  than the exploration of an array because the size of the
 *  map is adapted to the number of inserted items.
 *  These properties explain why maps are commonly used as
 *  internal data structures for algorithms.
 *  Definitions
 *  -   A map is a data structure for which data is addressed   by keys.
 *  -   Once inserted in the map, a map item is referenced as   an entry of the map.
 *  -   Each entry of the map is addressed by a key. Two
 *  different keys address two different entries of the map.
 *  -   The position of an entry in the map is called a bucket.
 *  -   A map is dimensioned by its number of buckets, i.e. the
 *  maximum number of entries in the map. The
 *  performance of a map is conditioned by the number of buckets.
 *  -   The hashing function transforms a key into a bucket
 *  index. The number of values that can be computed by
 *  the hashing function is equal to the number of buckets of the map.
 *  -   Both the hashing function and the equality test
 *  between two keys are provided by a hasher object.
 *  -   A map may be explored by a map iterator. This
 *  exploration provides only inserted entries in the map
 *  (i.e. non empty buckets).
 *  Collections' generic maps
 *  The Collections component provides numerous generic derived maps.
 *  -   These maps include automatic management of the
 *  number of buckets: they are automatically resized when
 *  the number of keys exceeds the number of buckets. If
 *  you have a fair idea of the number of items in your map,
 *  you can save on automatic resizing by specifying a
 *  number of buckets at the time of construction, or by using
 *  a resizing function. This may be considered for crucial optimization issues.
 *  -   Keys, items and hashers are parameters of these generic derived maps.
 *  -   TCollection_MapHasher class describes the
 *  functions required by any hasher which is to be used
 *  with a map instantiated from the Collections component.
 *  -   An iterator class is automatically instantiated at the
 *  time of instantiation of a map provided by the
 *  Collections component if this map is to be explored
 *  with an iterator. Note that some provided generic maps
 *  are not to be explored with an iterator but with indexes   (indexed maps).
 */
public class TCollection_BasicMap {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TCollection_BasicMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TCollection_BasicMap(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TCollection_BasicMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TCollection_BasicMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Returns the number of buckets in <me>.
   */
  public int NbBuckets() {
    return OCCwrapJavaJNI.TCollection_BasicMap_NbBuckets(swigCPtr, this);
  }

  /**
   *  Returns the number of keys already stored in <me>.
   */
  public int Extent() {
    return OCCwrapJavaJNI.TCollection_BasicMap_Extent(swigCPtr, this);
  }

  /**
   *  Returns  True when the map  contains no keys.
   *  This is exactly Extent() == 0.
   */
  public long IsEmpty() {
    return OCCwrapJavaJNI.TCollection_BasicMap_IsEmpty(swigCPtr, this);
  }

  /**
   *  Prints  on <S> usefull  statistics  about  the map
   *  <me>.  It  can be used  to test the quality of the hashcoding.
   */
  public void Statistics(SWIGTYPE_p_Standard_OStream S) {
    OCCwrapJavaJNI.TCollection_BasicMap_Statistics(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(S));
  }

}
