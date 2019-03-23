package opencascade;

/**
 *  A variable-length sequence of ASCII characters
 *  (normal 8-bit character type). It provides editing
 *  operations with built-in memory management to
 *  make HAsciiString objects easier to use than ordinary character arrays.
 *  HAsciiString objects are handles to strings.
 *  -   HAsciiString strings may be shared by several objects.
 *  -   You may use an AsciiString object to get the actual string.
 *  Note: HAsciiString objects use an AsciiString string as a field.
 */
public class TCollection_HAsciiString extends Standard_Transient {
  TCollection_HAsciiString(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Initializes a HAsciiString to an empty AsciiString.
   */
  public TCollection_HAsciiString() {
    this(OCCwrapJavaJNI.new_TCollection_HAsciiString__SWIG_0(), true);
  }

  /**
   *  Initializes a HAsciiString with a CString.
   */
  public TCollection_HAsciiString(String message) {
    this(OCCwrapJavaJNI.new_TCollection_HAsciiString__SWIG_1(message), true);
  }

  /**
   *  Initializes a HAsciiString with a single character.
   */
  public TCollection_HAsciiString(char aChar) {
    this(OCCwrapJavaJNI.new_TCollection_HAsciiString__SWIG_2(aChar), true);
  }

  /**
   *  Initializes a HAsciiString with <length> space allocated.
   *  and filled with <filler>.This is useful for buffers.
   */
  public TCollection_HAsciiString(int length, char filler) {
    this(OCCwrapJavaJNI.new_TCollection_HAsciiString__SWIG_3(length, filler), true);
  }

  /**
   *  Initializes a HAsciiString with an integer value
   */
  public TCollection_HAsciiString(int value) {
    this(OCCwrapJavaJNI.new_TCollection_HAsciiString__SWIG_4(value), true);
  }

  /**
   *  Initializes a HAsciiString with a real value
   */
  public TCollection_HAsciiString(double value) {
    this(OCCwrapJavaJNI.new_TCollection_HAsciiString__SWIG_5(value), true);
  }

  /**
   *  Initializes a HAsciiString with a HAsciiString.
   */
  public TCollection_HAsciiString( TCollection_AsciiString  aString) {
    this(OCCwrapJavaJNI.new_TCollection_HAsciiString__SWIG_6(TCollection_AsciiString.getCPtr(aString), aString), true);
  }

  /**
   *  Initializes a HAsciiString with a HAsciiString.
   */
  public TCollection_HAsciiString( TCollection_HAsciiString  aString) {
    this(OCCwrapJavaJNI.new_TCollection_HAsciiString__SWIG_7( TCollection_HAsciiString.getCPtr(aString) , aString), true);
  }

  /**
   *  Initializes a HAsciiString with a HAsciiString.
   *  If replaceNonAscii is non-null charecter, it will be used
   *  in place of any non-ascii character found in the source string.
   *  Otherwise, raises OutOfRange exception if at least one character
   *  in the source string is not in the "Ascii range".
   */
  public TCollection_HAsciiString( TCollection_HExtendedString  aString, char replaceNonAscii) {
    this(OCCwrapJavaJNI.new_TCollection_HAsciiString__SWIG_8( TCollection_HExtendedString.getCPtr(aString) , aString, replaceNonAscii), true);
  }

  /**
   *  Appends <other>  to me.
   */
  public void AssignCat(String other) {
    OCCwrapJavaJNI.TCollection_HAsciiString_AssignCat__SWIG_0(swigCPtr, this, other);
  }

  /**
   *  Appends <other>  to me.
   *  Example:  aString = aString + anotherString
   */
  public void AssignCat( TCollection_HAsciiString  other) {
    OCCwrapJavaJNI.TCollection_HAsciiString_AssignCat__SWIG_1(swigCPtr, this,  TCollection_HAsciiString.getCPtr(other) , other);
  }

  /**
   *  Converts the first character into its corresponding
   *  upper-case character and the other characters into lowercase.
   *  Example:
   *  before
   *  me = "hellO "
   *  after
   *  me = "Hello "
   */
  public void Capitalize() {
    OCCwrapJavaJNI.TCollection_HAsciiString_Capitalize(swigCPtr, this);
  }

  public  TCollection_HAsciiString  Cat(String other) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.TCollection_HAsciiString_Cat__SWIG_0(swigCPtr, this, other), true );
  }

  public  TCollection_HAsciiString  Cat( TCollection_HAsciiString  other) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.TCollection_HAsciiString_Cat__SWIG_1(swigCPtr, this,  TCollection_HAsciiString.getCPtr(other) , other), true );
  }

  /**
   *  Modifies this ASCII string so that its length
   *  becomes equal to Width and the new characters
   *  are equal to Filler. New characters are added
   *  both at the beginning and at the end of this string.
   *  If Width is less than the length of this ASCII string, nothing happens.
   *  Example
   *  Handle(TCollection_HAsciiString)
   *  myAlphabet
   *  = new
   *  TCollection_HAsciiString
   *  ("abcdef");
   *  myAlphabet->Center(9,' ');
   *  assert ( !strcmp(
   *  myAlphabet->ToCString(),
   *  " abcdef ") );
   */
  public void Center(int Width, char Filler) {
    OCCwrapJavaJNI.TCollection_HAsciiString_Center(swigCPtr, this, Width, Filler);
  }

  /**
   *  Replaces all characters equal to aChar by
   *  NewChar in this ASCII string. The substitution is
   *  case sensitive if CaseSensitive is true (default value).
   *  If you do not use the default case sensitive
   *  option, it does not matter whether aChar is upper-case or not.
   *  Example
   *  Handle(TCollection_HAsciiString)
   *  myMistake = new
   *  TCollection_HAsciiString
   *  ("Hather");
   *  myMistake->ChangeAll('H','F');
   *  assert ( !strcmp(
   *  myMistake->ToCString(),
   *  "Father") );
   */
  public void ChangeAll(char aChar, char NewChar, long CaseSensitive) {
    OCCwrapJavaJNI.TCollection_HAsciiString_ChangeAll__SWIG_0(swigCPtr, this, aChar, NewChar, CaseSensitive);
  }

  public void ChangeAll(char aChar, char NewChar) {
    OCCwrapJavaJNI.TCollection_HAsciiString_ChangeAll__SWIG_1(swigCPtr, this, aChar, NewChar);
  }

  /**
   *  Removes all characters contained in <me>.
   *  This produces an empty HAsciiString.
   */
  public void Clear() {
    OCCwrapJavaJNI.TCollection_HAsciiString_Clear(swigCPtr, this);
  }

  /**
   *  Returns the index of the first character of <me> that is
   *  present in <Set>.
   *  The search begins to the index FromIndex and ends to the
   *  the index ToIndex.
   *  Returns zero if failure.
   *  Raises an exception if FromIndex or ToIndex is out of range
   *  Example:
   *  before
   *  me = "aabAcAa", S = "Aa", FromIndex = 1, Toindex = 7
   *  after
   *  me = "aabAcAa"
   *  returns
   *  1
   */
  public int FirstLocationInSet( TCollection_HAsciiString  Set, int FromIndex, int ToIndex) {
    return OCCwrapJavaJNI.TCollection_HAsciiString_FirstLocationInSet(swigCPtr, this,  TCollection_HAsciiString.getCPtr(Set) , Set, FromIndex, ToIndex);
  }

  /**
   *  Returns the index of the first character of <me>
   *  that is not present in the set <Set>.
   *  The search begins to the index FromIndex and ends to the
   *  the index ToIndex in <me>.
   *  Returns zero if failure.
   *  Raises an exception if FromIndex or ToIndex is out of range.
   *  Example:
   *  before
   *  me = "aabAcAa", S = "Aa", FromIndex = 1, Toindex = 7
   *  after
   *  me = "aabAcAa"
   *  returns
   *  3
   */
  public int FirstLocationNotInSet( TCollection_HAsciiString  Set, int FromIndex, int ToIndex) {
    return OCCwrapJavaJNI.TCollection_HAsciiString_FirstLocationNotInSet(swigCPtr, this,  TCollection_HAsciiString.getCPtr(Set) , Set, FromIndex, ToIndex);
  }

  /**
   *  Insert a Character at position <where>.
   *  Example:
   *  aString contains "hy not ?"
   *  aString.Insert(1,'W'); gives "Why not ?"
   *  aString contains "Wh"
   *  aString.Insert(3,'y'); gives "Why"
   *  aString contains "Way"
   *  aString.Insert(2,'h'); gives "Why"
   */
  public void Insert(int where, char what) {
    OCCwrapJavaJNI.TCollection_HAsciiString_Insert__SWIG_0(swigCPtr, this, where, what);
  }

  /**
   *  Insert a HAsciiString at position <where>.
   */
  public void Insert(int where, String what) {
    OCCwrapJavaJNI.TCollection_HAsciiString_Insert__SWIG_1(swigCPtr, this, where, what);
  }

  /**
   *  Insert a HAsciiString at position <where>.
   */
  public void Insert(int where,  TCollection_HAsciiString  what) {
    OCCwrapJavaJNI.TCollection_HAsciiString_Insert__SWIG_2(swigCPtr, this, where,  TCollection_HAsciiString.getCPtr(what) , what);
  }

  /**
   *  Inserts the other ASCII string a after a specific index in the string <me>
   *  Example:
   *  before
   *  me = "cde" , Index = 0 , other = "ab"
   *  after
   *  me = "abcde" , other = "ab"
   */
  public void InsertAfter(int Index,  TCollection_HAsciiString  other) {
    OCCwrapJavaJNI.TCollection_HAsciiString_InsertAfter(swigCPtr, this, Index,  TCollection_HAsciiString.getCPtr(other) , other);
  }

  /**
   *  Inserts the other ASCII string a before a specific index in the string <me>
   *  Raises an exception if Index is out of bounds
   *  Example:
   *  before
   *  me = "cde" , Index = 1 , other = "ab"
   *  after
   *  me = "abcde" , other = "ab"
   */
  public void InsertBefore(int Index,  TCollection_HAsciiString  other) {
    OCCwrapJavaJNI.TCollection_HAsciiString_InsertBefore(swigCPtr, this, Index,  TCollection_HAsciiString.getCPtr(other) , other);
  }

  /**
   *  Returns True if the string <me> contains zero character
   */
  public long IsEmpty() {
    return OCCwrapJavaJNI.TCollection_HAsciiString_IsEmpty(swigCPtr, this);
  }

  /**
   *  Returns TRUE if <me> is 'ASCII' less than <other>.
   */
  public long IsLess( TCollection_HAsciiString  other) {
    return OCCwrapJavaJNI.TCollection_HAsciiString_IsLess(swigCPtr, this,  TCollection_HAsciiString.getCPtr(other) , other);
  }

  /**
   *  Returns TRUE if <me> is 'ASCII' greater than <other>.
   */
  public long IsGreater( TCollection_HAsciiString  other) {
    return OCCwrapJavaJNI.TCollection_HAsciiString_IsGreater(swigCPtr, this,  TCollection_HAsciiString.getCPtr(other) , other);
  }

  /**
   *  Converts a HAsciiString containing a numeric expression to
   *  an Integer.
   *  Example: "215" returns 215.
   */
  public int IntegerValue() {
    return OCCwrapJavaJNI.TCollection_HAsciiString_IntegerValue(swigCPtr, this);
  }

  /**
   *  Returns True if the string contains an integer value.
   */
  public long IsIntegerValue() {
    return OCCwrapJavaJNI.TCollection_HAsciiString_IsIntegerValue(swigCPtr, this);
  }

  /**
   *  Returns True if the string contains a real value.
   */
  public long IsRealValue() {
    return OCCwrapJavaJNI.TCollection_HAsciiString_IsRealValue(swigCPtr, this);
  }

  /**
   *  Returns True if the string contains only ASCII characters
   *  between ' ' and '~'.
   *  This means no control character and no extended ASCII code.
   */
  public long IsAscii() {
    return OCCwrapJavaJNI.TCollection_HAsciiString_IsAscii(swigCPtr, this);
  }

  /**
   *  Returns True if the string S not contains same characters than
   *  the string <me>.
   */
  public long IsDifferent( TCollection_HAsciiString  S) {
    return OCCwrapJavaJNI.TCollection_HAsciiString_IsDifferent(swigCPtr, this,  TCollection_HAsciiString.getCPtr(S) , S);
  }

  /**
   *  Returns True if the string S contains same characters than the
   *  string <me>.
   */
  public long IsSameString( TCollection_HAsciiString  S) {
    return OCCwrapJavaJNI.TCollection_HAsciiString_IsSameString__SWIG_0(swigCPtr, this,  TCollection_HAsciiString.getCPtr(S) , S);
  }

  /**
   *  Returns True if the string S contains same characters than the
   *  string <me>.
   */
  public long IsSameString( TCollection_HAsciiString  S, long CaseSensitive) {
    return OCCwrapJavaJNI.TCollection_HAsciiString_IsSameString__SWIG_1(swigCPtr, this,  TCollection_HAsciiString.getCPtr(S) , S, CaseSensitive);
  }

  /**
   *  Removes all space characters in the begining of the string
   */
  public void LeftAdjust() {
    OCCwrapJavaJNI.TCollection_HAsciiString_LeftAdjust(swigCPtr, this);
  }

  /**
   *  Left justify.
   *  Length becomes equal to Width and the new characters are
   *  equal to Filler
   *  if Width < Length nothing happens
   *  Raises an exception if Width is less than zero
   *  Example:
   *  before
   *  me = "abcdef" , Width = 9 , Filler = ' '
   *  after
   *  me = "abcdef   "
   */
  public void LeftJustify(int Width, char Filler) {
    OCCwrapJavaJNI.TCollection_HAsciiString_LeftJustify(swigCPtr, this, Width, Filler);
  }

  /**
   *  Returns number of characters in <me>.
   *  This is the same functionality as 'strlen' in C.
   */
  public int Length() {
    return OCCwrapJavaJNI.TCollection_HAsciiString_Length(swigCPtr, this);
  }

  /**
   *  returns an index in the string <me> of the first occurence
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
  public int Location( TCollection_HAsciiString  other, int FromIndex, int ToIndex) {
    return OCCwrapJavaJNI.TCollection_HAsciiString_Location__SWIG_0(swigCPtr, this,  TCollection_HAsciiString.getCPtr(other) , other, FromIndex, ToIndex);
  }

  /**
   *  Returns the index of the nth occurence of the character C
   *  in the string <me> from the starting index FromIndex to the
   *  ending index ToIndex.
   *  Returns zero if failure.
   *  Raises an exception if FromIndex or ToIndex is out of range
   *  Example:
   *  before
   *  me = "aabAa", N = 3, C = 'a', FromIndex = 1, ToIndex = 5
   *  after
   *  me = "aabAa"
   *  returns 5
   */
  public int Location(int N, char C, int FromIndex, int ToIndex) {
    return OCCwrapJavaJNI.TCollection_HAsciiString_Location__SWIG_1(swigCPtr, this, N, C, FromIndex, ToIndex);
  }

  /**
   *  Converts <me> to its lower-case equivalent.
   */
  public void LowerCase() {
    OCCwrapJavaJNI.TCollection_HAsciiString_LowerCase(swigCPtr, this);
  }

  /**
   *  Inserts the other string at the begining of the string <me>
   *  Example:
   *  before
   *  me = "cde" , S = "ab"
   *  after
   *  me = "abcde" , S = "ab"
   */
  public void Prepend( TCollection_HAsciiString  other) {
    OCCwrapJavaJNI.TCollection_HAsciiString_Prepend(swigCPtr, this,  TCollection_HAsciiString.getCPtr(other) , other);
  }

  /**
   *  Prints this string on the stream <astream>.
   */
  public void Print(SWIGTYPE_p_Standard_OStream astream) {
    OCCwrapJavaJNI.TCollection_HAsciiString_Print(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(astream));
  }

  /**
   *  Converts a string containing a numeric expression to a Real.
   *  Example:
   *  "215" returns 215.0.
   *  "3.14159267" returns 3.14159267.
   */
  public double RealValue() {
    return OCCwrapJavaJNI.TCollection_HAsciiString_RealValue(swigCPtr, this);
  }

  /**
   *  Remove all the occurences of the character C in the string
   *  Example:
   *  before
   *  me = "HellLLo", C = 'L' , CaseSensitive = True
   *  after
   *  me = "Hello"
   */
  public void RemoveAll(char C, long CaseSensitive) {
    OCCwrapJavaJNI.TCollection_HAsciiString_RemoveAll__SWIG_0(swigCPtr, this, C, CaseSensitive);
  }

  /**
   *  Removes every <what> characters from <me>
   */
  public void RemoveAll(char what) {
    OCCwrapJavaJNI.TCollection_HAsciiString_RemoveAll__SWIG_1(swigCPtr, this, what);
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
    OCCwrapJavaJNI.TCollection_HAsciiString_Remove__SWIG_0(swigCPtr, this, where, ahowmany);
  }

  public void Remove(int where) {
    OCCwrapJavaJNI.TCollection_HAsciiString_Remove__SWIG_1(swigCPtr, this, where);
  }

  /**
   *  Removes all space characters at the end of the string.
   */
  public void RightAdjust() {
    OCCwrapJavaJNI.TCollection_HAsciiString_RightAdjust(swigCPtr, this);
  }

  /**
   *  Right justify.
   *  Length becomes equal to Width and the new characters are
   *  equal to Filler
   *  if Width < Length nothing happens
   *  Raises an exception if Width is less than zero
   *  Example:
   *  before
   *  me = "abcdef" , Width = 9 , Filler = ' '
   *  after
   *  me = "   abcdef"
   */
  public void RightJustify(int Width, char Filler) {
    OCCwrapJavaJNI.TCollection_HAsciiString_RightJustify(swigCPtr, this, Width, Filler);
  }

  /**
   *  Searches a CString in <me> from the beginning
   *  and returns position of first item <what> matching.
   *  It returns -1 if not found.
   *  Example:
   *  aString contains "Sample single test"
   *  aString.Search("le") returns 5
   */
  public int Search(String what) {
    return OCCwrapJavaJNI.TCollection_HAsciiString_Search__SWIG_0(swigCPtr, this, what);
  }

  /**
   *  Searches a String in <me> from the beginning
   *  and returns position of first item <what> matching.
   *  it returns -1 if not found.
   */
  public int Search( TCollection_HAsciiString  what) {
    return OCCwrapJavaJNI.TCollection_HAsciiString_Search__SWIG_1(swigCPtr, this,  TCollection_HAsciiString.getCPtr(what) , what);
  }

  /**
   *  Searches a CString in a String from the end
   *  and returns position of first item <what> matching.
   *  It returns -1 if not found.
   *  Example:
   *  aString contains "Sample single test"
   *  aString.SearchFromEnd("le") returns 12
   */
  public int SearchFromEnd(String what) {
    return OCCwrapJavaJNI.TCollection_HAsciiString_SearchFromEnd__SWIG_0(swigCPtr, this, what);
  }

  /**
   *  Searches a HAsciiString in another HAsciiString from the end
   *  and returns position of first item <what> matching.
   *  It returns -1 if not found.
   */
  public int SearchFromEnd( TCollection_HAsciiString  what) {
    return OCCwrapJavaJNI.TCollection_HAsciiString_SearchFromEnd__SWIG_1(swigCPtr, this,  TCollection_HAsciiString.getCPtr(what) , what);
  }

  /**
   *  Replaces one character in the string at position <where>.
   *  If <where> is less than zero or greater than the length of <me>
   *  an exception is raised.
   *  Example:
   *  aString contains "Garbake"
   *  astring.Replace(6,'g')  gives <me> = "Garbage"
   */
  public void SetValue(int where, char what) {
    OCCwrapJavaJNI.TCollection_HAsciiString_SetValue__SWIG_0(swigCPtr, this, where, what);
  }

  /**
   *  Replaces a part of <me> in the string at position <where>.
   *  If <where> is less than zero or greater than the length of <me>
   *  an exception is raised.
   *  Example:
   *  aString contains "Garbake"
   *  astring.Replace(6,'g')  gives <me> = "Garbage"
   */
  public void SetValue(int where, String what) {
    OCCwrapJavaJNI.TCollection_HAsciiString_SetValue__SWIG_1(swigCPtr, this, where, what);
  }

  /**
   *  Replaces a part of <me> by another string.
   */
  public void SetValue(int where,  TCollection_HAsciiString  what) {
    OCCwrapJavaJNI.TCollection_HAsciiString_SetValue__SWIG_2(swigCPtr, this, where,  TCollection_HAsciiString.getCPtr(what) , what);
  }

  public  TCollection_HAsciiString  Split(int where) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.TCollection_HAsciiString_Split(swigCPtr, this, where), true );
  }

  public  TCollection_HAsciiString  SubString(int FromIndex, int ToIndex) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.TCollection_HAsciiString_SubString(swigCPtr, this, FromIndex, ToIndex), true );
  }

  /**
   *  Returns pointer to string (char *)
   *  This is useful for some casual manipulations
   *  Because this "char *" is 'const', you can't modify its contents.
   */
  public String ToCString() {
    return OCCwrapJavaJNI.TCollection_HAsciiString_ToCString(swigCPtr, this);
  }

  public  TCollection_HAsciiString  Token(String separators, int whichone) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.TCollection_HAsciiString_Token__SWIG_0(swigCPtr, this, separators, whichone), true );
  }

  public  TCollection_HAsciiString  Token(String separators) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.TCollection_HAsciiString_Token__SWIG_1(swigCPtr, this, separators), true );
  }

  public  TCollection_HAsciiString  Token() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.TCollection_HAsciiString_Token__SWIG_2(swigCPtr, this), true );
  }

  /**
   *  Truncates <me> to <ahowmany> characters.
   *  Example:  me = "Hello Dolly" -> Trunc(3) -> me = "Hel"
   */
  public void Trunc(int ahowmany) {
    OCCwrapJavaJNI.TCollection_HAsciiString_Trunc(swigCPtr, this, ahowmany);
  }

  /**
   *  Converts <me> to its upper-case equivalent.
   */
  public void UpperCase() {
    OCCwrapJavaJNI.TCollection_HAsciiString_UpperCase(swigCPtr, this);
  }

  /**
   *  Length of the string ignoring all spaces (' ') and the
   *  control character at the end.
   */
  public int UsefullLength() {
    return OCCwrapJavaJNI.TCollection_HAsciiString_UsefullLength(swigCPtr, this);
  }

  /**
   *  Returns character at position <where> in <me>.
   *  If <where> is less than zero or greater than the lenght of
   *  <me>, an exception is raised.
   *  Example:
   *  aString contains "Hello"
   *  aString.Value(2) returns 'e'
   */
  public char Value(int where) {
    return OCCwrapJavaJNI.TCollection_HAsciiString_Value(swigCPtr, this, where);
  }

  /**
   *  Returns the field myString.
   */
  public  TCollection_AsciiString  String() {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TCollection_HAsciiString_String(swigCPtr, this), true);
    return ret;
  }

  public long IsSameState( TCollection_HAsciiString  other) {
    return OCCwrapJavaJNI.TCollection_HAsciiString_IsSameState(swigCPtr, this,  TCollection_HAsciiString.getCPtr(other) , other);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TCollection_HAsciiString_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TCollection_HAsciiString_get_type_descriptor(), true );
  }

  public static  TCollection_HAsciiString  DownCast( Standard_Transient  T) {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.TCollection_HAsciiString_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TCollection_HAsciiString_TypeOf(), true );
  }

}
