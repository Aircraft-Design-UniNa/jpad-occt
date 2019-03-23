package opencascade;

/**
 *  Class defines a variable-length sequence of 8-bit characters.
 *  Despite class name (kept for historical reasons), it is intended to store UTF-8 string, not just ASCII characters.
 *  However, multi-byte nature of UTF-8 is not considered by the following methods:
 *  - Method ::Length() return the number of bytes, not the number of Unicode symbols.
 *  - Methods taking/returning symbol index work with 8-bit code units, not true Unicode symbols,
 *    including ::Remove(), ::SetValue(), ::Value(), ::Search(), ::Trunc() and others.
 *  If application needs to process multi-byte Unicode symbols explicitly, NCollection_Utf8Iter class can be used
 *  for iterating through Unicode string (UTF-32 code unit will be returned for each position).
 * 
 *  Class provides editing operations with built-in memory management to make AsciiString objects easier to use than ordinary character arrays.
 *  AsciiString objects follow value semantics; in other words, they are the actual strings,
 *  not handles to strings, and are copied through assignment.
 *  You may use HAsciiString objects to get handles to strings.
 */
public class TCollection_AsciiString {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TCollection_AsciiString(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TCollection_AsciiString(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TCollection_AsciiString obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (TCollection_AsciiString ptr) { Ptr = ptr; }
    public TCollection_AsciiString AsReference () { return Ptr; }
    public TCollection_AsciiString AsCopy () { return Ptr.MakeCopy(); }
    public TCollection_AsciiString Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TCollection_AsciiString(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Initializes a AsciiString to an empty AsciiString.
   */
  public TCollection_AsciiString() {
    this(OCCwrapJavaJNI.new_TCollection_AsciiString__SWIG_0(), true);
  }

  /**
   *  Initializes a AsciiString with a CString.
   */
  public TCollection_AsciiString(String message) {
    this(OCCwrapJavaJNI.new_TCollection_AsciiString__SWIG_1(message), true);
  }

  /**
   *  Initializes a AsciiString with a CString.
   */
  public TCollection_AsciiString(String message, int aLen) {
    this(OCCwrapJavaJNI.new_TCollection_AsciiString__SWIG_2(message, aLen), true);
  }

  /**
   *  Initializes a AsciiString with a single character.
   */
  public TCollection_AsciiString(char aChar) {
    this(OCCwrapJavaJNI.new_TCollection_AsciiString__SWIG_3(aChar), true);
  }

  /**
   *  Initializes an AsciiString with <length> space allocated.
   *  and filled with <filler>. This is usefull for buffers.
   */
  public TCollection_AsciiString(int length, char filler) {
    this(OCCwrapJavaJNI.new_TCollection_AsciiString__SWIG_4(length, filler), true);
  }

  /**
   *  Initializes an AsciiString with an integer value
   */
  public TCollection_AsciiString(int value) {
    this(OCCwrapJavaJNI.new_TCollection_AsciiString__SWIG_5(value), true);
  }

  /**
   *  Initializes an AsciiString with a real value
   */
  public TCollection_AsciiString(double value) {
    this(OCCwrapJavaJNI.new_TCollection_AsciiString__SWIG_6(value), true);
  }

  /**
   *  Initializes a AsciiString with another AsciiString.
   */
  public TCollection_AsciiString( TCollection_AsciiString  astring) {
    this(OCCwrapJavaJNI.new_TCollection_AsciiString__SWIG_7(TCollection_AsciiString.getCPtr(astring), astring), true);
  }

  /**
   *  Move constructor
   */
  public TCollection_AsciiString( TCollection_AsciiString  astring, char message) {
    this(OCCwrapJavaJNI.new_TCollection_AsciiString__SWIG_9(TCollection_AsciiString.getCPtr(astring), astring, message), true);
  }

  /**
   *  Initializes a AsciiString with copy of another AsciiString
   *  concatenated with the message character.
   */
  public TCollection_AsciiString( TCollection_AsciiString  astring, String message) {
    this(OCCwrapJavaJNI.new_TCollection_AsciiString__SWIG_10(TCollection_AsciiString.getCPtr(astring), astring, message), true);
  }

  /**
   *  Initializes a AsciiString with copy of another AsciiString
   *  concatenated with the message string.
   */
  public TCollection_AsciiString( TCollection_AsciiString  astring,  TCollection_AsciiString  message) {
    this(OCCwrapJavaJNI.new_TCollection_AsciiString__SWIG_11(TCollection_AsciiString.getCPtr(astring), astring, TCollection_AsciiString.getCPtr(message), message), true);
  }

  /**
   *  Initializes a AsciiString with copy of another AsciiString
   *  concatenated with the message string.
   */
  public TCollection_AsciiString(TCollection_ExtendedString astring, char replaceNonAscii) {
    this(OCCwrapJavaJNI.new_TCollection_AsciiString__SWIG_12(TCollection_ExtendedString.getCPtr(astring), astring, replaceNonAscii), true);
  }

  /**
   *  Creation by converting an extended string to an ascii string.
   *  If replaceNonAscii is non-null charecter, it will be used
   *  in place of any non-ascii character found in the source string.
   *  Otherwise, creates UTF-8 unicode string.
   */
  public TCollection_AsciiString(TCollection_ExtendedString astring) {
    this(OCCwrapJavaJNI.new_TCollection_AsciiString__SWIG_13(TCollection_ExtendedString.getCPtr(astring), astring), true);
  }

  /**
   *  Initialize UTF-8 Unicode string from wide-char string considering it as Unicode string
   *  (the size of wide char is a platform-dependent - e.g. on Windows wchar_t is UTF-16).
   * 
   *  This constructor is unavailable if application is built with deprecated msvc option "-Zc:wchar_t-",
   *  since OCCT itself is never built with this option.
   */
  public TCollection_AsciiString(SWIGTYPE_p_Standard_WideChar theStringUtf) {
    this(OCCwrapJavaJNI.new_TCollection_AsciiString__SWIG_14(SWIGTYPE_p_Standard_WideChar.getCPtr(theStringUtf)), true);
  }

  /**
   *  Appends <other>  to me. This is an unary operator.
   */
  public void AssignCat(char other) {
    OCCwrapJavaJNI.TCollection_AsciiString_AssignCat__SWIG_0(swigCPtr, this, other);
  }

  public void AssignCat(int other) {
    OCCwrapJavaJNI.TCollection_AsciiString_AssignCat__SWIG_1(swigCPtr, this, other);
  }

  /**
   *  Appends <other>  to me. This is an unary operator.
   */
  public void AssignCat(double other) {
    OCCwrapJavaJNI.TCollection_AsciiString_AssignCat__SWIG_2(swigCPtr, this, other);
  }

  public void AssignCat(String other) {
    OCCwrapJavaJNI.TCollection_AsciiString_AssignCat__SWIG_3(swigCPtr, this, other);
  }

  /**
   *  Appends <other>  to me. This is an unary operator.
   */
  public void AssignCat( TCollection_AsciiString  other) {
    OCCwrapJavaJNI.TCollection_AsciiString_AssignCat__SWIG_4(swigCPtr, this, TCollection_AsciiString.getCPtr(other), other);
  }

  /**
   *  Converts the first character into its corresponding
   *  upper-case character and the other characters into lowercase
   *  Example: before
   *  me = "hellO "
   *  after
   *  me = "Hello "
   */
  public void Capitalize() {
    OCCwrapJavaJNI.TCollection_AsciiString_Capitalize(swigCPtr, this);
  }

  /**
   *  Appends <other>  to me.
   *  Syntax:
   *  aString = aString + "Dummy"
   *  Example: aString contains "I say "
   *  aString = aString + "Hello " + "Dolly"
   *  gives "I say Hello Dolly"
   *  To catenate more than one CString, you must put a String before.
   *  So the following example is WRONG !
   *  aString = "Hello " + "Dolly"  THIS IS NOT ALLOWED
   *  This rule is applicable to AssignCat (operator +=) too.
   */
  public TCollection_AsciiString Cat(char other) {
    return new TCollection_AsciiString(OCCwrapJavaJNI.TCollection_AsciiString_Cat__SWIG_0(swigCPtr, this, other), true);
  }

  public TCollection_AsciiString Cat(int other) {
    return new TCollection_AsciiString(OCCwrapJavaJNI.TCollection_AsciiString_Cat__SWIG_1(swigCPtr, this, other), true);
  }

  /**
   *  Appends <other>  to me.
   *  Syntax:
   *  aString = aString + 15;
   *  Example: aString contains "I say "
   *  gives "I say 15"
   *  To catenate more than one CString, you must put a String before.
   *  So the following example is WRONG !
   *  aString = "Hello " + "Dolly"  THIS IS NOT ALLOWED
   *  This rule is applicable to AssignCat (operator +=) too.
   */
  public TCollection_AsciiString Cat(double other) {
    return new TCollection_AsciiString(OCCwrapJavaJNI.TCollection_AsciiString_Cat__SWIG_2(swigCPtr, this, other), true);
  }

  public TCollection_AsciiString Cat(String other) {
    return new TCollection_AsciiString(OCCwrapJavaJNI.TCollection_AsciiString_Cat__SWIG_3(swigCPtr, this, other), true);
  }

  /**
   *  Appends <other>  to me.
   *  Syntax:
   *  aString = aString + 15.15;
   *  Example: aString contains "I say "
   *  gives "I say 15.15"
   *  To catenate more than one CString, you must put a String before.
   *  So the following example is WRONG !
   *  aString = "Hello " + "Dolly"  THIS IS NOT ALLOWED
   *  This rule is applicable to AssignCat (operator +=) too.
   */
  public TCollection_AsciiString Cat( TCollection_AsciiString  other) {
    return new TCollection_AsciiString(OCCwrapJavaJNI.TCollection_AsciiString_Cat__SWIG_4(swigCPtr, this, TCollection_AsciiString.getCPtr(other), other), true);
  }

  /**
   *  Modifies this ASCII string so that its length
   *  becomes equal to Width and the new characters
   *  are equal to Filler. New characters are added
   *  both at the beginning and at the end of this string.
   *  If Width is less than the length of this ASCII string, nothing happens.
   *  Example
   *  TCollection_AsciiString
   *  myAlphabet("abcdef");
   *  myAlphabet.Center(9,' ');
   *  assert ( myAlphabet == "
   *  abcdef " );
   */
  public void Center(int Width, char Filler) {
    OCCwrapJavaJNI.TCollection_AsciiString_Center(swigCPtr, this, Width, Filler);
  }

  /**
   *  Substitutes all the characters equal to aChar by NewChar
   *  in the AsciiString <me>.
   *  The substitution can be case sensitive.
   *  If you don't use default case sensitive, no matter wether aChar
   *  is uppercase or not.
   *  Example: me = "Histake" -> ChangeAll('H','M',Standard_True)
   *  gives me = "Mistake"
   */
  public void ChangeAll(char aChar, char NewChar, long CaseSensitive) {
    OCCwrapJavaJNI.TCollection_AsciiString_ChangeAll__SWIG_0(swigCPtr, this, aChar, NewChar, CaseSensitive);
  }

  public void ChangeAll(char aChar, char NewChar) {
    OCCwrapJavaJNI.TCollection_AsciiString_ChangeAll__SWIG_1(swigCPtr, this, aChar, NewChar);
  }

  /**
   *  Removes all characters contained in <me>.
   *  This produces an empty AsciiString.
   */
  public void Clear() {
    OCCwrapJavaJNI.TCollection_AsciiString_Clear(swigCPtr, this);
  }

  /**
   *  Copy <fromwhere> to <me>.
   *  Used as operator =
   *  Example: aString = anotherCString;
   */
  public void Copy(String fromwhere) {
    OCCwrapJavaJNI.TCollection_AsciiString_Copy__SWIG_0(swigCPtr, this, fromwhere);
  }

  public void Copy( TCollection_AsciiString  fromwhere) {
    OCCwrapJavaJNI.TCollection_AsciiString_Copy__SWIG_1(swigCPtr, this, TCollection_AsciiString.getCPtr(fromwhere), fromwhere);
  }

  /**
   *  Exchange the data of two strings (without reallocating memory).
   */
  public void Swap(TCollection_AsciiString theOther) {
    OCCwrapJavaJNI.TCollection_AsciiString_Swap(swigCPtr, this, TCollection_AsciiString.getCPtr(theOther), theOther);
  }

  /**
   *  Returns the index of the first character of <me> that is
   *  present in <Set>.
   *  The search begins to the index FromIndex and ends to the
   *  the index ToIndex.
   *  Returns zero if failure.
   *  Raises an exception if FromIndex or ToIndex is out of range.
   *  Example: before
   *  me = "aabAcAa", S = "Aa", FromIndex = 1, Toindex = 7
   *  after
   *  me = "aabAcAa"
   *  returns
   *  1
   */
  public int FirstLocationInSet( TCollection_AsciiString  Set, int FromIndex, int ToIndex) {
    return OCCwrapJavaJNI.TCollection_AsciiString_FirstLocationInSet(swigCPtr, this, TCollection_AsciiString.getCPtr(Set), Set, FromIndex, ToIndex);
  }

  /**
   *  Returns the index of the first character of <me>
   *  that is not present in the set <Set>.
   *  The search begins to the index FromIndex and ends to the
   *  the index ToIndex in <me>.
   *  Returns zero if failure.
   *  Raises an exception if FromIndex or ToIndex is out of range.
   *  Example: before
   *  me = "aabAcAa", S = "Aa", FromIndex = 1, Toindex = 7
   *  after
   *  me = "aabAcAa"
   *  returns
   *  3
   */
  public int FirstLocationNotInSet( TCollection_AsciiString  Set, int FromIndex, int ToIndex) {
    return OCCwrapJavaJNI.TCollection_AsciiString_FirstLocationNotInSet(swigCPtr, this, TCollection_AsciiString.getCPtr(Set), Set, FromIndex, ToIndex);
  }

  /**
   *  Inserts a Character at position <where>.
   *  Example:
   *  aString contains "hy not ?"
   *  aString.Insert(1,'W'); gives "Why not ?"
   *  aString contains "Wh"
   *  aString.Insert(3,'y'); gives "Why"
   *  aString contains "Way"
   *  aString.Insert(2,'h'); gives "Why"
   */
  public void Insert(int where, char what) {
    OCCwrapJavaJNI.TCollection_AsciiString_Insert__SWIG_0(swigCPtr, this, where, what);
  }

  /**
   *  Inserts a CString at position <where>.
   *  Example:
   *  aString contains "O more"
   *  aString.Insert(2,"nce");  gives "Once more"
   */
  public void Insert(int where, String what) {
    OCCwrapJavaJNI.TCollection_AsciiString_Insert__SWIG_1(swigCPtr, this, where, what);
  }

  /**
   *  Inserts a AsciiString at position <where>.
   */
  public void Insert(int where,  TCollection_AsciiString  what) {
    OCCwrapJavaJNI.TCollection_AsciiString_Insert__SWIG_2(swigCPtr, this, where, TCollection_AsciiString.getCPtr(what), what);
  }

  /**
   *  Pushing a string after a specific index in the string <me>.
   *  Raises an exception if Index is out of bounds.
   *  -   less than 0 (InsertAfter), or less than 1 (InsertBefore), or
   *  -   greater than the number of characters in this ASCII string.
   *  Example:
   *  before
   *  me = "cde" , Index = 0 , other = "ab"
   *  after
   *  me = "abcde" , other = "ab"
   */
  public void InsertAfter(int Index,  TCollection_AsciiString  other) {
    OCCwrapJavaJNI.TCollection_AsciiString_InsertAfter(swigCPtr, this, Index, TCollection_AsciiString.getCPtr(other), other);
  }

  /**
   *  Pushing a string before a specific index in the string <me>.
   *  Raises an exception if Index is out of bounds.
   *  -   less than 0 (InsertAfter), or less than 1 (InsertBefore), or
   *  -   greater than the number of characters in this ASCII string.
   *  Example:
   *  before
   *  me = "cde" , Index = 1 , other = "ab"
   *  after
   *  me = "abcde" , other = "ab"
   */
  public void InsertBefore(int Index,  TCollection_AsciiString  other) {
    OCCwrapJavaJNI.TCollection_AsciiString_InsertBefore(swigCPtr, this, Index, TCollection_AsciiString.getCPtr(other), other);
  }

  /**
   *  Returns True if the string <me> contains zero character.
   */
  public long IsEmpty() {
    return OCCwrapJavaJNI.TCollection_AsciiString_IsEmpty(swigCPtr, this);
  }

  /**
   *  Returns true if the characters in this ASCII string
   *  are identical to the characters in ASCII string other.
   *  Note that this method is an alias of operator ==.
   */
  public long IsEqual(String other) {
    return OCCwrapJavaJNI.TCollection_AsciiString_IsEqual__SWIG_0(swigCPtr, this, other);
  }

  public long IsEqual( TCollection_AsciiString  other) {
    return OCCwrapJavaJNI.TCollection_AsciiString_IsEqual__SWIG_1(swigCPtr, this, TCollection_AsciiString.getCPtr(other), other);
  }

  /**
   *  Returns true if there are differences between the
   *  characters in this ASCII string and ASCII string other.
   *  Note that this method is an alias of operator !=
   */
  public long IsDifferent(String other) {
    return OCCwrapJavaJNI.TCollection_AsciiString_IsDifferent__SWIG_0(swigCPtr, this, other);
  }

  public long IsDifferent( TCollection_AsciiString  other) {
    return OCCwrapJavaJNI.TCollection_AsciiString_IsDifferent__SWIG_1(swigCPtr, this, TCollection_AsciiString.getCPtr(other), other);
  }

  /**
   *  Returns TRUE if <me> is 'ASCII' less than <other>.
   */
  public long IsLess(String other) {
    return OCCwrapJavaJNI.TCollection_AsciiString_IsLess__SWIG_0(swigCPtr, this, other);
  }

  public long IsLess( TCollection_AsciiString  other) {
    return OCCwrapJavaJNI.TCollection_AsciiString_IsLess__SWIG_1(swigCPtr, this, TCollection_AsciiString.getCPtr(other), other);
  }

  /**
   *  Returns TRUE if <me> is 'ASCII' greater than <other>.
   */
  public long IsGreater(String other) {
    return OCCwrapJavaJNI.TCollection_AsciiString_IsGreater__SWIG_0(swigCPtr, this, other);
  }

  public long IsGreater( TCollection_AsciiString  other) {
    return OCCwrapJavaJNI.TCollection_AsciiString_IsGreater__SWIG_1(swigCPtr, this, TCollection_AsciiString.getCPtr(other), other);
  }

  /**
   *  Determines whether the beginning of this string instance matches the specified string.
   */
  public long StartsWith( TCollection_AsciiString  theStartString) {
    return OCCwrapJavaJNI.TCollection_AsciiString_StartsWith(swigCPtr, this, TCollection_AsciiString.getCPtr(theStartString), theStartString);
  }

  /**
   *  Determines whether the end of this string instance matches the specified string.
   */
  public long EndsWith( TCollection_AsciiString  theEndString) {
    return OCCwrapJavaJNI.TCollection_AsciiString_EndsWith(swigCPtr, this, TCollection_AsciiString.getCPtr(theEndString), theEndString);
  }

  /**
   *  Converts a AsciiString containing a numeric expression to
   *  an Integer.
   *  Example: "215" returns 215.
   */
  public int IntegerValue() {
    return OCCwrapJavaJNI.TCollection_AsciiString_IntegerValue(swigCPtr, this);
  }

  /**
   *  Returns True if the AsciiString contains an integer value.
   *  Note: an integer value is considered to be a real value as well.
   */
  public long IsIntegerValue() {
    return OCCwrapJavaJNI.TCollection_AsciiString_IsIntegerValue(swigCPtr, this);
  }

  /**
   *  Returns True if the AsciiString contains a real value.
   *  Note: an integer value is considered to be a real value as well.
   */
  public long IsRealValue() {
    return OCCwrapJavaJNI.TCollection_AsciiString_IsRealValue(swigCPtr, this);
  }

  /**
   *  Returns True if the AsciiString contains only ASCII characters
   *  between ' ' and '~'.
   *  This means no control character and no extended ASCII code.
   */
  public long IsAscii() {
    return OCCwrapJavaJNI.TCollection_AsciiString_IsAscii(swigCPtr, this);
  }

  /**
   *  Removes all space characters in the begining of the string.
   */
  public void LeftAdjust() {
    OCCwrapJavaJNI.TCollection_AsciiString_LeftAdjust(swigCPtr, this);
  }

  /**
   *  left justify
   *  Length becomes equal to Width and the new characters are
   *  equal to Filler.
   *  If Width < Length nothing happens.
   *  Raises an exception if Width is less than zero.
   *  Example:
   *  before
   *  me = "abcdef" , Width = 9 , Filler = ' '
   *  after
   *  me = "abcdef   "
   */
  public void LeftJustify(int Width, char Filler) {
    OCCwrapJavaJNI.TCollection_AsciiString_LeftJustify(swigCPtr, this, Width, Filler);
  }

  /**
   *  Returns number of characters in <me>.
   *  This is the same functionality as 'strlen' in C.
   *  Example
   *  TCollection_AsciiString myAlphabet("abcdef");
   *  assert ( myAlphabet.Length() == 6 );
   *  -   1 is the position of the first character in this string.
   *  -   The length of this string gives the position of its last character.
   *  -   Positions less than or equal to zero, or
   *  greater than the length of this string are
   *  invalid in functions which identify a character
   *  of this string by its position.
   */
  public int Length() {
    return OCCwrapJavaJNI.TCollection_AsciiString_Length(swigCPtr, this);
  }

  /**
   *  Returns an index in the string <me> of the first occurence
   *  of the string S in the string <me> from the starting index
   *  FromIndex to the ending index ToIndex
   *  returns zero if failure
   *  Raises an exception if FromIndex or ToIndex is out of range.
   *  Example:
   *  before
   *  me = "aabAaAa", S = "Aa", FromIndex = 1, ToIndex = 7
   *  after
   *  me = "aabAaAa"
   *  returns
   *  4
   */
  public int Location( TCollection_AsciiString  other, int FromIndex, int ToIndex) {
    return OCCwrapJavaJNI.TCollection_AsciiString_Location__SWIG_0(swigCPtr, this, TCollection_AsciiString.getCPtr(other), other, FromIndex, ToIndex);
  }

  /**
   *  Returns the index of the nth occurence of the character C
   *  in the string <me> from the starting index FromIndex to the
   *  ending index ToIndex.
   *  Returns zero if failure.
   *  Raises an exception if FromIndex or ToIndex is out of range.
   *  Example:
   *  before
   *  me = "aabAa", N = 3, C = 'a', FromIndex = 1, ToIndex = 5
   *  after
   *  me = "aabAa"
   *  returns
   *  5
   */
  public int Location(int N, char C, int FromIndex, int ToIndex) {
    return OCCwrapJavaJNI.TCollection_AsciiString_Location__SWIG_1(swigCPtr, this, N, C, FromIndex, ToIndex);
  }

  /**
   *  Converts <me> to its lower-case equivalent.
   *  Example
   *  TCollection_AsciiString myString("Hello Dolly");
   *  myString.UpperCase();
   *  assert ( myString == "HELLO DOLLY" );
   *  myString.LowerCase();
   *  assert ( myString == "hello dolly" );
   */
  public void LowerCase() {
    OCCwrapJavaJNI.TCollection_AsciiString_LowerCase(swigCPtr, this);
  }

  /**
   *  Inserts the string other at the beginning of this ASCII string.
   *  Example
   *  TCollection_AsciiString myAlphabet("cde");
   *  TCollection_AsciiString myBegin("ab");
   *  myAlphabet.Prepend(myBegin);
   *  assert ( myAlphabet == "abcde" );
   */
  public void Prepend( TCollection_AsciiString  other) {
    OCCwrapJavaJNI.TCollection_AsciiString_Prepend(swigCPtr, this, TCollection_AsciiString.getCPtr(other), other);
  }

  /**
   *  Displays <me> on a stream.
   */
  public void Print(SWIGTYPE_p_Standard_OStream astream) {
    OCCwrapJavaJNI.TCollection_AsciiString_Print(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(astream));
  }

  /**
   *  Read <me> from a stream.
   */
  public void Read(SWIGTYPE_p_Standard_IStream astream) {
    OCCwrapJavaJNI.TCollection_AsciiString_Read(swigCPtr, this, SWIGTYPE_p_Standard_IStream.getCPtr(astream));
  }

  /**
   *  Converts an AsciiString containing a numeric expression.
   *  to a Real.
   *  Example: ex: "215" returns 215.0.
   *  ex: "3.14159267" returns 3.14159267.
   */
  public double RealValue() {
    return OCCwrapJavaJNI.TCollection_AsciiString_RealValue(swigCPtr, this);
  }

  /**
   *  Remove all the occurences of the character C in the string.
   *  Example:
   *  before
   *  me = "HellLLo", C = 'L' , CaseSensitive = True
   *  after
   *  me = "Hello"
   */
  public void RemoveAll(char C, long CaseSensitive) {
    OCCwrapJavaJNI.TCollection_AsciiString_RemoveAll__SWIG_0(swigCPtr, this, C, CaseSensitive);
  }

  /**
   *  Removes every <what> characters from <me>.
   */
  public void RemoveAll(char what) {
    OCCwrapJavaJNI.TCollection_AsciiString_RemoveAll__SWIG_1(swigCPtr, this, what);
  }

  /**
   *  Erases <ahowmany> characters from position <where>,
   *  <where> included.
   *  Example:
   *  aString contains "Hello"
   *  aString.Remove(2,2) erases 2 characters from position 2
   *  This gives "Hlo".
   */
  public void Remove(int where, int ahowmany) {
    OCCwrapJavaJNI.TCollection_AsciiString_Remove__SWIG_0(swigCPtr, this, where, ahowmany);
  }

  public void Remove(int where) {
    OCCwrapJavaJNI.TCollection_AsciiString_Remove__SWIG_1(swigCPtr, this, where);
  }

  /**
   *  Removes all space characters at the end of the string.
   */
  public void RightAdjust() {
    OCCwrapJavaJNI.TCollection_AsciiString_RightAdjust(swigCPtr, this);
  }

  /**
   *  Right justify.
   *  Length becomes equal to Width and the new characters are
   *  equal to Filler.
   *  if Width < Length nothing happens.
   *  Raises an exception if Width is less than zero.
   *  Example:
   *  before
   *  me = "abcdef" , Width = 9 , Filler = ' '
   *  after
   *  me = "   abcdef"
   */
  public void RightJustify(int Width, char Filler) {
    OCCwrapJavaJNI.TCollection_AsciiString_RightJustify(swigCPtr, this, Width, Filler);
  }

  /**
   *  Searches a CString in <me> from the beginning
   *  and returns position of first item <what> matching.
   *  it returns -1 if not found.
   *  Example:
   *  aString contains "Sample single test"
   *  aString.Search("le") returns 5
   */
  public int Search(String what) {
    return OCCwrapJavaJNI.TCollection_AsciiString_Search__SWIG_0(swigCPtr, this, what);
  }

  /**
   *  Searches an AsciiString in <me> from the beginning
   *  and returns position of first item <what> matching.
   *  It returns -1 if not found.
   */
  public int Search( TCollection_AsciiString  what) {
    return OCCwrapJavaJNI.TCollection_AsciiString_Search__SWIG_1(swigCPtr, this, TCollection_AsciiString.getCPtr(what), what);
  }

  /**
   *  Searches a CString in a AsciiString from the end
   *  and returns position of first item <what> matching.
   *  It returns -1 if not found.
   *  Example:
   *  aString contains "Sample single test"
   *  aString.SearchFromEnd("le") returns 12
   */
  public int SearchFromEnd(String what) {
    return OCCwrapJavaJNI.TCollection_AsciiString_SearchFromEnd__SWIG_0(swigCPtr, this, what);
  }

  /**
   *  Searches a AsciiString in another AsciiString from the end
   *  and returns position of first item <what> matching.
   *  It returns -1 if not found.
   */
  public int SearchFromEnd( TCollection_AsciiString  what) {
    return OCCwrapJavaJNI.TCollection_AsciiString_SearchFromEnd__SWIG_1(swigCPtr, this, TCollection_AsciiString.getCPtr(what), what);
  }

  /**
   *  Replaces one character in the AsciiString at position <where>.
   *  If <where> is less than zero or greater than the length of <me>
   *  an exception is raised.
   *  Example:
   *  aString contains "Garbake"
   *  astring.Replace(6,'g')  gives <me> = "Garbage"
   */
  public void SetValue(int where, char what) {
    OCCwrapJavaJNI.TCollection_AsciiString_SetValue__SWIG_0(swigCPtr, this, where, what);
  }

  /**
   *  Replaces a part of <me> by a CString.
   *  If <where> is less than zero or greater than the length of <me>
   *  an exception is raised.
   *  Example:
   *  aString contains "abcde"
   *  aString.SetValue(4,"1234567") gives <me> = "abc1234567"
   */
  public void SetValue(int where, String what) {
    OCCwrapJavaJNI.TCollection_AsciiString_SetValue__SWIG_1(swigCPtr, this, where, what);
  }

  /**
   *  Replaces a part of <me> by another AsciiString.
   */
  public void SetValue(int where,  TCollection_AsciiString  what) {
    OCCwrapJavaJNI.TCollection_AsciiString_SetValue__SWIG_2(swigCPtr, this, where, TCollection_AsciiString.getCPtr(what), what);
  }

  /**
   *  Splits a AsciiString into two sub-strings.
   *  Example:
   *  aString contains "abcdefg"
   *  aString.Split(3) gives <me> = "abc" and returns "defg"
   */
  public TCollection_AsciiString Split(int where) {
    return new TCollection_AsciiString(OCCwrapJavaJNI.TCollection_AsciiString_Split(swigCPtr, this, where), true);
  }

  /**
   *  Creation of a sub-string of the string <me>.
   *  The sub-string starts to the index Fromindex and ends
   *  to the index ToIndex.
   *  Raises an exception if ToIndex or FromIndex is out of bounds
   *  Example:
   *  before
   *  me = "abcdefg", ToIndex=3, FromIndex=6
   *  after
   *  me = "abcdefg"
   *  returns
   *  "cdef"
   */
  public TCollection_AsciiString SubString(int FromIndex, int ToIndex) {
    return new TCollection_AsciiString(OCCwrapJavaJNI.TCollection_AsciiString_SubString(swigCPtr, this, FromIndex, ToIndex), true);
  }

  /**
   *  Returns pointer to AsciiString (char *).
   *  This is useful for some casual manipulations.
   *  Warning: Because this "char *" is 'const', you can't modify its contents.
   */
  public String ToCString() {
    return OCCwrapJavaJNI.TCollection_AsciiString_ToCString(swigCPtr, this);
  }

  /**
   *  Extracts <whichone> token from <me>.
   *  By default, the <separators> is set to space and tabulation.
   *  By default, the token extracted is the first one (whichone = 1).
   *  <separators> contains all separators you need.
   *  If no token indexed by <whichone> is found, it returns empty AsciiString.
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
  public TCollection_AsciiString Token(String separators, int whichone) {
    return new TCollection_AsciiString(OCCwrapJavaJNI.TCollection_AsciiString_Token__SWIG_0(swigCPtr, this, separators, whichone), true);
  }

  public TCollection_AsciiString Token(String separators) {
    return new TCollection_AsciiString(OCCwrapJavaJNI.TCollection_AsciiString_Token__SWIG_1(swigCPtr, this, separators), true);
  }

  public TCollection_AsciiString Token() {
    return new TCollection_AsciiString(OCCwrapJavaJNI.TCollection_AsciiString_Token__SWIG_2(swigCPtr, this), true);
  }

  /**
   *  Truncates <me> to <ahowmany> characters.
   *  Example:  me = "Hello Dolly" -> Trunc(3) -> me = "Hel"
   */
  public void Trunc(int ahowmany) {
    OCCwrapJavaJNI.TCollection_AsciiString_Trunc(swigCPtr, this, ahowmany);
  }

  /**
   *  Converts <me> to its upper-case equivalent.
   */
  public void UpperCase() {
    OCCwrapJavaJNI.TCollection_AsciiString_UpperCase(swigCPtr, this);
  }

  /**
   *  Length of the string ignoring all spaces (' ') and the
   *  control character at the end.
   */
  public int UsefullLength() {
    return OCCwrapJavaJNI.TCollection_AsciiString_UsefullLength(swigCPtr, this);
  }

  /**
   *  Returns character at position <where> in <me>.
   *  If <where> is less than zero or greater than the lenght of <me>,
   *  an exception is raised.
   *  Example:
   *  aString contains "Hello"
   *  aString.Value(2) returns 'e'
   */
  public char Value(int where) {
    return OCCwrapJavaJNI.TCollection_AsciiString_Value(swigCPtr, this, where);
  }

  /**
   *  Hash function for AsciiString
   *  (returns the same Integer value that the hash function for ExtendedString)
   */
  public static int HashCode( TCollection_AsciiString  astring, int Upper) {
    return OCCwrapJavaJNI.TCollection_AsciiString_HashCode(TCollection_AsciiString.getCPtr(astring), astring, Upper);
  }

  /**
   *  Returns True if the strings contain same characters.
   */
  public static long IsSameString( TCollection_AsciiString  theString1,  TCollection_AsciiString  theString2, long theIsCaseSensitive) {
    return OCCwrapJavaJNI.TCollection_AsciiString_IsSameString(TCollection_AsciiString.getCPtr(theString1), theString1, TCollection_AsciiString.getCPtr(theString2), theString2, theIsCaseSensitive);
  }

}
