package opencascade;

/**
 *  A variable-length sequence of "extended" (UNICODE) characters (16-bit character type).
 *  It provides editing operations with built-in memory management
 *  to make ExtendedString objects easier to use than ordinary extended character arrays.
 *  ExtendedString objects follow "value semantics", that is, they are the actual strings,
 *  not handles to strings, and are copied through assignment.
 *  You may use HExtendedString objects to get handles to strings.
 * 
 *  Beware that class can transparently store UTF-16 string with surrogate pairs
 *  (Unicode symbol represented by two 16-bit code units).
 *  However, surrogate pairs are not considered by the following methods:
 *  - Method ::Length() return the number of 16-bit code units, not the number of Unicode symbols.
 *  - Methods taking/returning symbol index work with 16-bit code units, not true Unicode symbols,
 *    including ::Remove(), ::SetValue(), ::Value(), ::Search(), ::Trunc() and others.
 *  If application needs to process surrogate pairs, NCollection_Utf16Iter class can be used
 *  for iterating through Unicode string (UTF-32 code unit will be returned for each position).
 */
public class TCollection_ExtendedString {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TCollection_ExtendedString(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TCollection_ExtendedString(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TCollection_ExtendedString obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (TCollection_ExtendedString ptr) { Ptr = ptr; }
    public TCollection_ExtendedString AsReference () { return Ptr; }
    public TCollection_ExtendedString AsCopy () { return Ptr.MakeCopy(); }
    public TCollection_ExtendedString Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TCollection_ExtendedString(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Initializes a ExtendedString to an empty ExtendedString.
   */
  public TCollection_ExtendedString() {
    this(OCCwrapJavaJNI.new_TCollection_ExtendedString__SWIG_0(), true);
  }

  /**
   *  Creation by converting a CString to an extended
   *  string.  If <isMultiByte> is true then the string is
   *  treated as having UTF-8 coding.  If it is not a UTF-8
   *  then <isMultiByte> is ignored and each character is
   *  copied to ExtCharacter.
   */
  public TCollection_ExtendedString(String astring, long isMultiByte) {
    this(OCCwrapJavaJNI.new_TCollection_ExtendedString__SWIG_1(astring, isMultiByte), true);
  }

  /**
   *  Creation by converting an ExtString to an extended string.
   */
  public TCollection_ExtendedString(String astring) {
    this(OCCwrapJavaJNI.new_TCollection_ExtendedString__SWIG_2(astring), true);
  }

  /**
   *  Initialize from wide-char string considering it as Unicode string
   *  (the size of wide char is a platform-dependent - e.g. on Windows wchar_t is UTF-16).
   * 
   *  This constructor is unavailable if application is built with deprecated msvc option "-Zc:wchar_t-",
   *  since OCCT itself is never built with this option.
   */
  public TCollection_ExtendedString(SWIGTYPE_p_Standard_ExtString astring) {
    this(OCCwrapJavaJNI.new_TCollection_ExtendedString__SWIG_3(SWIGTYPE_p_Standard_ExtString.getCPtr(astring)), true);
  }

  /**
   *  Initializes a AsciiString with a single character.
   */
  public TCollection_ExtendedString(SWIGTYPE_p_Standard_WideChar theStringUtf) {
    this(OCCwrapJavaJNI.new_TCollection_ExtendedString__SWIG_4(SWIGTYPE_p_Standard_WideChar.getCPtr(theStringUtf)), true);
  }

  /**
   *  Initializes a ExtendedString with a single character.
   */
  public TCollection_ExtendedString(char aChar) {
    this(OCCwrapJavaJNI.new_TCollection_ExtendedString__SWIG_5(aChar), true);
  }

  /**
   *  Initializes a ExtendedString with <length> space allocated.
   *  and filled with <filler>.This is useful for buffers.
   */
  public TCollection_ExtendedString(short aChar) {
    this(OCCwrapJavaJNI.new_TCollection_ExtendedString__SWIG_6(aChar), true);
  }

  /**
   *  Initializes an ExtendedString with an integer value
   */
  public TCollection_ExtendedString(int length, short filler) {
    this(OCCwrapJavaJNI.new_TCollection_ExtendedString__SWIG_7(length, filler), true);
  }

  /**
   *  Initializes an ExtendedString with a real value
   */
  public TCollection_ExtendedString(int value) {
    this(OCCwrapJavaJNI.new_TCollection_ExtendedString__SWIG_8(value), true);
  }

  /**
   *  Initializes a ExtendedString with another ExtendedString.
   */
  public TCollection_ExtendedString(double value) {
    this(OCCwrapJavaJNI.new_TCollection_ExtendedString__SWIG_9(value), true);
  }

  /**
   *  Move constructor
   */
  public TCollection_ExtendedString( TCollection_ExtendedString  astring) {
    this(OCCwrapJavaJNI.new_TCollection_ExtendedString__SWIG_10(TCollection_ExtendedString.getCPtr(astring), astring), true);
  }

  /**
   *  Creation by converting an Ascii string to an extended
   *  string. The string is treated as having UTF-8 coding.
   *  If it is not a UTF-8 then each character is copied to ExtCharacter.
   */
  public TCollection_ExtendedString( TCollection_AsciiString  astring) {
    this(OCCwrapJavaJNI.new_TCollection_ExtendedString__SWIG_12(TCollection_AsciiString.getCPtr(astring), astring), true);
  }

  /**
   *  Appends the other extended string to this extended string.
   *  Note that this method is an alias of operator +=.
   *  Example: aString += anotherString
   */
  public void AssignCat( TCollection_ExtendedString  other) {
    OCCwrapJavaJNI.TCollection_ExtendedString_AssignCat(swigCPtr, this, TCollection_ExtendedString.getCPtr(other), other);
  }

  /**
   *  Appends <other> to me.
   */
  public TCollection_ExtendedString Cat( TCollection_ExtendedString  other) {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.TCollection_ExtendedString_Cat(swigCPtr, this, TCollection_ExtendedString.getCPtr(other), other), true);
  }

  /**
   *  Substitutes all the characters equal to aChar by NewChar
   *  in the ExtendedString <me>.
   *  The substitution can be case sensitive.
   *  If you don't use default case sensitive, no matter wether aChar
   *  is uppercase or not.
   */
  public void ChangeAll(short aChar, short NewChar) {
    OCCwrapJavaJNI.TCollection_ExtendedString_ChangeAll(swigCPtr, this, aChar, NewChar);
  }

  /**
   *  Removes all characters contained in <me>.
   *  This produces an empty ExtendedString.
   */
  public void Clear() {
    OCCwrapJavaJNI.TCollection_ExtendedString_Clear(swigCPtr, this);
  }

  /**
   *  Copy <fromwhere> to <me>.
   *  Used as operator =
   */
  public void Copy( TCollection_ExtendedString  fromwhere) {
    OCCwrapJavaJNI.TCollection_ExtendedString_Copy(swigCPtr, this, TCollection_ExtendedString.getCPtr(fromwhere), fromwhere);
  }

  /**
   *  Exchange the data of two strings (without reallocating memory).
   */
  public void Swap(TCollection_ExtendedString theOther) {
    OCCwrapJavaJNI.TCollection_ExtendedString_Swap(swigCPtr, this, TCollection_ExtendedString.getCPtr(theOther), theOther);
  }

  /**
   *  Insert a Character at position <where>.
   */
  public void Insert(int where, short what) {
    OCCwrapJavaJNI.TCollection_ExtendedString_Insert__SWIG_0(swigCPtr, this, where, what);
  }

  /**
   *  Insert a ExtendedString at position <where>.
   */
  public void Insert(int where,  TCollection_ExtendedString  what) {
    OCCwrapJavaJNI.TCollection_ExtendedString_Insert__SWIG_1(swigCPtr, this, where, TCollection_ExtendedString.getCPtr(what), what);
  }

  /**
   *  Returns True if this string contains no characters.
   */
  public long IsEmpty() {
    return OCCwrapJavaJNI.TCollection_ExtendedString_IsEmpty(swigCPtr, this);
  }

  /**
   *  Returns true if the characters in this extended
   *  string are identical to the characters in the other extended string.
   *  Note that this method is an alias of operator ==
   */
  public long IsEqual(SWIGTYPE_p_Standard_ExtString other) {
    return OCCwrapJavaJNI.TCollection_ExtendedString_IsEqual__SWIG_0(swigCPtr, this, SWIGTYPE_p_Standard_ExtString.getCPtr(other));
  }

  public long IsEqual( TCollection_ExtendedString  other) {
    return OCCwrapJavaJNI.TCollection_ExtendedString_IsEqual__SWIG_1(swigCPtr, this, TCollection_ExtendedString.getCPtr(other), other);
  }

  /**
   *  Returns true if there are differences between the
   *  characters in this extended string and the other extended string.
   *  Note that this method is an alias of operator !=.
   */
  public long IsDifferent(SWIGTYPE_p_Standard_ExtString other) {
    return OCCwrapJavaJNI.TCollection_ExtendedString_IsDifferent__SWIG_0(swigCPtr, this, SWIGTYPE_p_Standard_ExtString.getCPtr(other));
  }

  public long IsDifferent( TCollection_ExtendedString  other) {
    return OCCwrapJavaJNI.TCollection_ExtendedString_IsDifferent__SWIG_1(swigCPtr, this, TCollection_ExtendedString.getCPtr(other), other);
  }

  /**
   *  Returns TRUE if <me> is less than <other>.
   */
  public long IsLess(SWIGTYPE_p_Standard_ExtString other) {
    return OCCwrapJavaJNI.TCollection_ExtendedString_IsLess__SWIG_0(swigCPtr, this, SWIGTYPE_p_Standard_ExtString.getCPtr(other));
  }

  public long IsLess( TCollection_ExtendedString  other) {
    return OCCwrapJavaJNI.TCollection_ExtendedString_IsLess__SWIG_1(swigCPtr, this, TCollection_ExtendedString.getCPtr(other), other);
  }

  /**
   *  Returns TRUE if <me> is greater than <other>.
   */
  public long IsGreater(SWIGTYPE_p_Standard_ExtString other) {
    return OCCwrapJavaJNI.TCollection_ExtendedString_IsGreater__SWIG_0(swigCPtr, this, SWIGTYPE_p_Standard_ExtString.getCPtr(other));
  }

  public long IsGreater( TCollection_ExtendedString  other) {
    return OCCwrapJavaJNI.TCollection_ExtendedString_IsGreater__SWIG_1(swigCPtr, this, TCollection_ExtendedString.getCPtr(other), other);
  }

  /**
   *  Determines whether the beginning of this string instance matches the specified string.
   */
  public long StartsWith( TCollection_ExtendedString  theStartString) {
    return OCCwrapJavaJNI.TCollection_ExtendedString_StartsWith(swigCPtr, this, TCollection_ExtendedString.getCPtr(theStartString), theStartString);
  }

  /**
   *  Determines whether the end of this string instance matches the specified string.
   */
  public long EndsWith( TCollection_ExtendedString  theEndString) {
    return OCCwrapJavaJNI.TCollection_ExtendedString_EndsWith(swigCPtr, this, TCollection_ExtendedString.getCPtr(theEndString), theEndString);
  }

  /**
   *  Returns True if the ExtendedString contains only
   *  "Ascii Range" characters .
   */
  public long IsAscii() {
    return OCCwrapJavaJNI.TCollection_ExtendedString_IsAscii(swigCPtr, this);
  }

  /**
   *  Returns the number of 16-bit code units
   *  (might be greater than number of Unicode symbols if string contains surrogate pairs).
   */
  public int Length() {
    return OCCwrapJavaJNI.TCollection_ExtendedString_Length(swigCPtr, this);
  }

  /**
   *  Displays <me> .
   */
  public void Print(SWIGTYPE_p_Standard_OStream astream) {
    OCCwrapJavaJNI.TCollection_ExtendedString_Print(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(astream));
  }

  /**
   *  Removes every <what> characters from <me>.
   */
  public void RemoveAll(short what) {
    OCCwrapJavaJNI.TCollection_ExtendedString_RemoveAll(swigCPtr, this, what);
  }

  /**
   *  Erases <ahowmany> characters from position <where>,<where> included.
   */
  public void Remove(int where, int ahowmany) {
    OCCwrapJavaJNI.TCollection_ExtendedString_Remove__SWIG_0(swigCPtr, this, where, ahowmany);
  }

  public void Remove(int where) {
    OCCwrapJavaJNI.TCollection_ExtendedString_Remove__SWIG_1(swigCPtr, this, where);
  }

  /**
   *  Searches a ExtendedString in <me> from the beginning
   *  and returns position of first item <what> matching.
   *  it returns -1 if not found.
   */
  public int Search( TCollection_ExtendedString  what) {
    return OCCwrapJavaJNI.TCollection_ExtendedString_Search(swigCPtr, this, TCollection_ExtendedString.getCPtr(what), what);
  }

  /**
   *  Searches a ExtendedString in another ExtendedString from the
   *  end and returns position of first item <what> matching.
   *  it returns -1 if not found.
   */
  public int SearchFromEnd( TCollection_ExtendedString  what) {
    return OCCwrapJavaJNI.TCollection_ExtendedString_SearchFromEnd(swigCPtr, this, TCollection_ExtendedString.getCPtr(what), what);
  }

  /**
   *  Replaces one character in the ExtendedString at position <where>.
   *  If <where> is less than zero or greater than the length of <me>
   *  an exception is raised.
   */
  public void SetValue(int where, short what) {
    OCCwrapJavaJNI.TCollection_ExtendedString_SetValue__SWIG_0(swigCPtr, this, where, what);
  }

  /**
   *  Replaces a part of <me> by another ExtendedString see above.
   */
  public void SetValue(int where,  TCollection_ExtendedString  what) {
    OCCwrapJavaJNI.TCollection_ExtendedString_SetValue__SWIG_1(swigCPtr, this, where, TCollection_ExtendedString.getCPtr(what), what);
  }

  /**
   *  Splits this extended string into two sub-strings at position where.
   *  -   The second sub-string (from position
   *  where + 1 of this string to the end) is
   *  returned in a new extended string.
   *  -   this extended string is modified: its last
   *  characters are removed, it becomes equal to
   *  the first sub-string (from the first character to position where).
   *  Example:
   *  aString contains "abcdefg"
   *  aString.Split(3) gives <me> = "abc" and returns "defg"
   */
  public TCollection_ExtendedString Split(int where) {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.TCollection_ExtendedString_Split(swigCPtr, this, where), true);
  }

  /**
   *  Extracts <whichone> token from <me>.
   *  By default, the <separators> is set to space and tabulation.
   *  By default, the token extracted is the first one (whichone = 1).
   *  <separators> contains all separators you need.
   *  If no token indexed by <whichone> is found, it returns an empty AsciiString.
   *  Example:
   *  aString contains "This is a     message"
   *  aString.Token()  returns "This"
   *  aString.Token(" ",4) returns "message"
   *  aString.Token(" ",2) returns "is"
   *  aString.Token(" ",9) returns ""
   *  Other separators than space character and tabulation are allowed :
   *  aString contains "1234; test:message   , value"
   *  aString.Token("; :,",4) returns "value"
   *  aString.Token("; :,",2) returns "test"
   */
  public TCollection_ExtendedString Token(SWIGTYPE_p_Standard_ExtString separators, int whichone) {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.TCollection_ExtendedString_Token__SWIG_0(swigCPtr, this, SWIGTYPE_p_Standard_ExtString.getCPtr(separators), whichone), true);
  }

  public TCollection_ExtendedString Token(SWIGTYPE_p_Standard_ExtString separators) {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.TCollection_ExtendedString_Token__SWIG_1(swigCPtr, this, SWIGTYPE_p_Standard_ExtString.getCPtr(separators)), true);
  }

  /**
   *  Returns pointer to ExtString
   */
  public SWIGTYPE_p_Standard_ExtString ToExtString() {
    return new SWIGTYPE_p_Standard_ExtString(OCCwrapJavaJNI.TCollection_ExtendedString_ToExtString(swigCPtr, this), true);
  }

  /**
   *  Truncates <me> to <ahowmany> characters.
   *  Example:  me = "Hello Dolly" -> Trunc(3) -> me = "Hel"
   *  Exceptions
   *  Standard_OutOfRange if ahowmany is greater
   *  than the length of this string.
   */
  public void Trunc(int ahowmany) {
    OCCwrapJavaJNI.TCollection_ExtendedString_Trunc(swigCPtr, this, ahowmany);
  }

  /**
   *  Returns character at position <where> in <me>.
   *  If <where> is less than zero or greater than the lenght of
   *  <me>, an exception is raised.
   *  Example:
   *  aString contains "Hello"
   *  aString.Value(2) returns 'e'
   *  Exceptions
   *  Standard_OutOfRange if where lies outside
   *  the bounds of this extended string.
   */
  public short Value(int where) {
    return OCCwrapJavaJNI.TCollection_ExtendedString_Value(swigCPtr, this, where);
  }

  /**
   *  Returns a hashed value for the extended string within the range 1..theUpper.
   *  Note: if string is ASCII, the computed value is the same as the value computed with the HashCode function on a
   *  TCollection_AsciiString string composed with equivalent ASCII characters.
   */
  public static int HashCode( TCollection_ExtendedString  theString, int theUpper) {
    return OCCwrapJavaJNI.TCollection_ExtendedString_HashCode(TCollection_ExtendedString.getCPtr(theString), theString, theUpper);
  }

  /**
   *  Returns expected CString length in UTF8 coding.
   *  It can be used for  memory  calculation  before converting
   *  to CString containing symbols in UTF8 coding.
   */
  public int LengthOfCString() {
    return OCCwrapJavaJNI.TCollection_ExtendedString_LengthOfCString(swigCPtr, this);
  }

}
