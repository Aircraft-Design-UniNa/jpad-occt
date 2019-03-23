package opencascade;

public interface OCCwrapJavaConstants {
  public final static int OCC_VERSION_MAJOR = OCCwrapJavaJNI.OCC_VERSION_MAJOR_get();
  public final static int OCC_VERSION_MINOR = OCCwrapJavaJNI.OCC_VERSION_MINOR_get();
  public final static int OCC_VERSION_MAINTENANCE = OCCwrapJavaJNI.OCC_VERSION_MAINTENANCE_get();
  public final static double OCC_VERSION = OCCwrapJavaJNI.OCC_VERSION_get();
  public final static String OCC_VERSION_STRING = OCCwrapJavaJNI.OCC_VERSION_STRING_get();
  public final static String OCC_VERSION_COMPLETE = OCCwrapJavaJNI.OCC_VERSION_COMPLETE_get();
  public final static String OCC_VERSION_STRING_EXT = OCCwrapJavaJNI.OCC_VERSION_STRING_EXT_get();
  public final static int OCC_VERSION_HEX = OCCwrapJavaJNI.OCC_VERSION_HEX_get();
  public final static int Standard_GUID_SIZE = OCCwrapJavaJNI.Standard_GUID_SIZE_get();
  public final static int Standard_GUID_SIZE_ALLOC = OCCwrapJavaJNI.Standard_GUID_SIZE_ALLOC_get();
}
