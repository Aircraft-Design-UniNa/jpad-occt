package opencascade;

/**
 *  A variable-length sequence of "extended"
 *  (UNICODE) characters (16-bit character
 *  type). It provides editing operations with
 *  built-in memory management to make
 *  ExtendedString objects easier to use than
 *  ordinary extended character arrays.
 *  HExtendedString objects are handles to strings.
 *  - HExtendedString strings may be shared by several objects.
 *  - You may use an ExtendedString object to get the actual string.
 *  Note: HExtendedString objects use an
 *  ExtendedString string as a field.
 */
public class TCollection_HExtendedString extends Standard_Transient {
  TCollection_HExtendedString(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Initializes a HExtendedString to an empty ExtendedString.
   */
  public TCollection_HExtendedString() {
    this(OCCwrapJavaJNI.new_TCollection_HExtendedString__SWIG_0(), true);
  }

  /**
   *  Initializes a HExtendedString with a CString.
   */
  public TCollection_HExtendedString(String message) {
    this(OCCwrapJavaJNI.new_TCollection_HExtendedString__SWIG_1(message), true);
  }

  /**
   *  Initializes a HExtendedString with an ExtString.
   */
  public TCollection_HExtendedString(SWIGTYPE_p_Standard_ExtString message) {
    this(OCCwrapJavaJNI.new_TCollection_HExtendedString__SWIG_2(SWIGTYPE_p_Standard_ExtString.getCPtr(message)), true);
  }

  /**
   *  Initializes a HExtendedString with a single character.
   */
  public TCollection_HExtendedString(short aChar) {
    this(OCCwrapJavaJNI.new_TCollection_HExtendedString__SWIG_3(aChar), true);
  }

  /**
   *  Initializes a HExtendedString with <length> space allocated.
   *  and filled with <filler>.This is usefull for buffers.
   */
  public TCollection_HExtendedString(int length, short filler) {
    this(OCCwrapJavaJNI.new_TCollection_HExtendedString__SWIG_4(length, filler), true);
  }

  /**
   *  Initializes a HExtendedString with a HExtendedString.
   */
  public TCollection_HExtendedString( TCollection_ExtendedString  aString) {
    this(OCCwrapJavaJNI.new_TCollection_HExtendedString__SWIG_5(TCollection_ExtendedString.getCPtr(aString), aString), true);
  }

  /**
   *  Initializes a HExtendedString with an HAsciiString.
   */
  public TCollection_HExtendedString( TCollection_HAsciiString  aString) {
    this(OCCwrapJavaJNI.new_TCollection_HExtendedString__SWIG_6( TCollection_HAsciiString.getCPtr(aString) , aString), true);
  }

  /**
   *  Initializes a HExtendedString with a HExtendedString.
   */
  public TCollection_HExtendedString( TCollection_HExtendedString  aString) {
    this(OCCwrapJavaJNI.new_TCollection_HExtendedString__SWIG_7( TCollection_HExtendedString.getCPtr(aString) , aString), true);
  }

  /**
   *  Appends <other>  to me.
   */
  public void AssignCat( TCollection_HExtendedString  other) {
    OCCwrapJavaJNI.TCollection_HExtendedString_AssignCat(swigCPtr, this,  TCollection_HExtendedString.getCPtr(other) , other);
  }

  public  TCollection_HExtendedString  Cat( TCollection_HExtendedString  other) {
    return new TCollection_HExtendedString ( OCCwrapJavaJNI.TCollection_HExtendedString_Cat(swigCPtr, this,  TCollection_HExtendedString.getCPtr(other) , other), true );
  }

  /**
   *  Substitutes all the characters equal to aChar by NewChar
   *  in the string <me>.
   */
  public void ChangeAll(short aChar, short NewChar) {
    OCCwrapJavaJNI.TCollection_HExtendedString_ChangeAll(swigCPtr, this, aChar, NewChar);
  }

  /**
   *  Removes all characters contained in <me>.
   *  This produces an empty ExtendedString.
   */
  public void Clear() {
    OCCwrapJavaJNI.TCollection_HExtendedString_Clear(swigCPtr, this);
  }

  /**
   *  Returns True if the string <me> contains zero character
   */
  public long IsEmpty() {
    return OCCwrapJavaJNI.TCollection_HExtendedString_IsEmpty(swigCPtr, this);
  }

  /**
   *  Insert a ExtCharacter at position <where>.
   *  Example:
   *  aString contains "hy not ?"
   *  aString.Insert(1,'W'); gives "Why not ?"
   *  aString contains "Wh"
   *  aString.Insert(3,'y'); gives "Why"
   *  aString contains "Way"
   *  aString.Insert(2,'h'); gives "Why"
   */
  public void Insert(int where, short what) {
    OCCwrapJavaJNI.TCollection_HExtendedString_Insert__SWIG_0(swigCPtr, this, where, what);
  }

  /**
   *  Insert a HExtendedString at position <where>.
   */
  public void Insert(int where,  TCollection_HExtendedString  what) {
    OCCwrapJavaJNI.TCollection_HExtendedString_Insert__SWIG_1(swigCPtr, this, where,  TCollection_HExtendedString.getCPtr(what) , what);
  }

  /**
   *  Returns TRUE if <me> is less than <other>.
   */
  public long IsLess( TCollection_HExtendedString  other) {
    return OCCwrapJavaJNI.TCollection_HExtendedString_IsLess(swigCPtr, this,  TCollection_HExtendedString.getCPtr(other) , other);
  }

  /**
   *  Returns TRUE if <me> is greater than <other>.
   */
  public long IsGreater( TCollection_HExtendedString  other) {
    return OCCwrapJavaJNI.TCollection_HExtendedString_IsGreater(swigCPtr, this,  TCollection_HExtendedString.getCPtr(other) , other);
  }

  /**
   *  Returns True if the string contains only "Ascii Range"  characters
   */
  public long IsAscii() {
    return OCCwrapJavaJNI.TCollection_HExtendedString_IsAscii(swigCPtr, this);
  }

  /**
   *  Returns number of characters in <me>.
   *  This is the same functionality as 'strlen' in C.
   */
  public int Length() {
    return OCCwrapJavaJNI.TCollection_HExtendedString_Length(swigCPtr, this);
  }

  /**
   *  Erases <ahowmany> characters from position <where>,
   *  <where> included.
   *  Example:
   *  aString contains "Hello"
   *  aString.Erase(2,2) erases 2 characters from position 1
   *  This gives "Hlo".
   */
  public void Remove(int where, int ahowmany) {
    OCCwrapJavaJNI.TCollection_HExtendedString_Remove__SWIG_0(swigCPtr, this, where, ahowmany);
  }

  public void Remove(int where) {
    OCCwrapJavaJNI.TCollection_HExtendedString_Remove__SWIG_1(swigCPtr, this, where);
  }

  /**
   *  Removes every <what> characters from <me>.
   */
  public void RemoveAll(short what) {
    OCCwrapJavaJNI.TCollection_HExtendedString_RemoveAll(swigCPtr, this, what);
  }

  /**
   *  Replaces one character in the string at position <where>.
   *  If <where> is less than zero or greater than the length of <me>
   *  an exception is raised.
   *  Example:
   *  aString contains "Garbake"
   *  astring.Replace(6,'g')  gives <me> = "Garbage"
   */
  public void SetValue(int where, short what) {
    OCCwrapJavaJNI.TCollection_HExtendedString_SetValue__SWIG_0(swigCPtr, this, where, what);
  }

  /**
   *  Replaces a part of <me> by another string.
   */
  public void SetValue(int where,  TCollection_HExtendedString  what) {
    OCCwrapJavaJNI.TCollection_HExtendedString_SetValue__SWIG_1(swigCPtr, this, where,  TCollection_HExtendedString.getCPtr(what) , what);
  }

  public  TCollection_HExtendedString  Split(int where) {
    return new TCollection_HExtendedString ( OCCwrapJavaJNI.TCollection_HExtendedString_Split(swigCPtr, this, where), true );
  }

  /**
   *  Searches a String in <me> from the beginning
   *  and returns position of first item <what> matching.
   *  It returns -1 if not found.
   */
  public int Search( TCollection_HExtendedString  what) {
    return OCCwrapJavaJNI.TCollection_HExtendedString_Search(swigCPtr, this,  TCollection_HExtendedString.getCPtr(what) , what);
  }

  /**
   *  Searches a ExtendedString in another ExtendedString from the end
   *  and returns position of first item <what> matching.
   *  It returns -1 if not found.
   */
  public int SearchFromEnd( TCollection_HExtendedString  what) {
    return OCCwrapJavaJNI.TCollection_HExtendedString_SearchFromEnd(swigCPtr, this,  TCollection_HExtendedString.getCPtr(what) , what);
  }

  /**
   *  Returns pointer to ExtString
   */
  public SWIGTYPE_p_Standard_ExtString ToExtString() {
    return new SWIGTYPE_p_Standard_ExtString(OCCwrapJavaJNI.TCollection_HExtendedString_ToExtString(swigCPtr, this), true);
  }

  public  TCollection_HExtendedString  Token(SWIGTYPE_p_Standard_ExtString separators, int whichone) {
    return new TCollection_HExtendedString ( OCCwrapJavaJNI.TCollection_HExtendedString_Token__SWIG_0(swigCPtr, this, SWIGTYPE_p_Standard_ExtString.getCPtr(separators), whichone), true );
  }

  public  TCollection_HExtendedString  Token(SWIGTYPE_p_Standard_ExtString separators) {
    return new TCollection_HExtendedString ( OCCwrapJavaJNI.TCollection_HExtendedString_Token__SWIG_1(swigCPtr, this, SWIGTYPE_p_Standard_ExtString.getCPtr(separators)), true );
  }

  /**
   *  Truncates <me> to <ahowmany> characters.
   *  Example:  me = "Hello Dolly" -> Trunc(3) -> me = "Hel"
   */
  public void Trunc(int ahowmany) {
    OCCwrapJavaJNI.TCollection_HExtendedString_Trunc(swigCPtr, this, ahowmany);
  }

  /**
   *  Returns ExtCharacter at position <where> in <me>.
   *  If <where> is less than zero or greater than the length of
   *  <me>, an exception is raised.
   *  Example:
   *  aString contains "Hello"
   *  aString.Value(2) returns 'e'
   */
  public short Value(int where) {
    return OCCwrapJavaJNI.TCollection_HExtendedString_Value(swigCPtr, this, where);
  }

  /**
   *  Returns the field myString
   */
  public  TCollection_ExtendedString  String() {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TCollection_HExtendedString_String(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Displays <me> .
   */
  public void Print(SWIGTYPE_p_Standard_OStream astream) {
    OCCwrapJavaJNI.TCollection_HExtendedString_Print(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(astream));
  }

  public long IsSameState( TCollection_HExtendedString  other) {
    return OCCwrapJavaJNI.TCollection_HExtendedString_IsSameState(swigCPtr, this,  TCollection_HExtendedString.getCPtr(other) , other);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TCollection_HExtendedString_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TCollection_HExtendedString_get_type_descriptor(), true );
  }

  public static  TCollection_HExtendedString  DownCast( Standard_Transient  T) {
    return new TCollection_HExtendedString ( OCCwrapJavaJNI.TCollection_HExtendedString_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TCollection_HExtendedString_TypeOf(), true );
  }

}
