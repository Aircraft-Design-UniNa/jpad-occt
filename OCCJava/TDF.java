package opencascade;

/**
 *  This package provides data framework for binding
 *  features and data structures.
 * 
 *  The feature structure is a tree used to bind
 *  semantic informations about each feature together.
 * 
 *  The only one concrete   attribute defined in  this
 *  package is the TagSource attribute.This attribute
 *  is used for  random creation of child labels under
 *  a given label. Tags are randomly delivered.
 */
public class TDF {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Sets link between GUID and ProgID in hidden DataMap
   */
  public static void AddLinkGUIDToProgID( Standard_GUID  ID,  TCollection_ExtendedString  ProgID) {
    OCCwrapJavaJNI.TDF_AddLinkGUIDToProgID(Standard_GUID.getCPtr(ID), ID, TCollection_ExtendedString.getCPtr(ProgID), ProgID);
  }

  /**
   *  Returns True if there is GUID for given <ProgID> then GUID is returned in <ID>
   */
  public static long GUIDFromProgID( TCollection_ExtendedString  ProgID, Standard_GUID ID) {
    return OCCwrapJavaJNI.TDF_GUIDFromProgID(TCollection_ExtendedString.getCPtr(ProgID), ProgID, Standard_GUID.getCPtr(ID), ID);
  }

  /**
   *  Returns True if there is ProgID for given <ID> then ProgID is returned in <ProgID>
   */
  public static long ProgIDFromGUID( Standard_GUID  ID, TCollection_ExtendedString ProgID) {
    return OCCwrapJavaJNI.TDF_ProgIDFromGUID(Standard_GUID.getCPtr(ID), ID, TCollection_ExtendedString.getCPtr(ProgID), ProgID);
  }

  public TDF() {
    this(OCCwrapJavaJNI.new_TDF(), true);
  }

}
