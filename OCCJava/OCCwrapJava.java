package opencascade;

public class OCCwrapJava implements OCCwrapJavaConstants {
  public static int HashCode(Standard_Transient theObject, int theUpper) {
    return OCCwrapJavaJNI.HashCode__SWIG_0(Standard_Transient.getCPtr(theObject), theObject, theUpper);
  }

  public static int HashCode( TCollection_ExtendedString  theString, int theUpper) {
    return OCCwrapJavaJNI.HashCode__SWIG_1(TCollection_ExtendedString.getCPtr(theString), theString, theUpper);
  }

  public static  Message_Messenger  endl( Message_Messenger  theMessenger) {
    return new Message_Messenger ( OCCwrapJavaJNI.endl( Message_Messenger.getCPtr(theMessenger) , theMessenger), true );
  }

  public static int HashCode( TopLoc_Location  me, int Upper) {
    return OCCwrapJavaJNI.HashCode__SWIG_2(TopLoc_Location.getCPtr(me), me, Upper);
  }

  public static int HashCode( TopoDS_Shape  me, int Upper) {
    return OCCwrapJavaJNI.HashCode__SWIG_3(TopoDS_Shape.getCPtr(me), me, Upper);
  }

}
