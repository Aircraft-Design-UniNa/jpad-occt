package opencascade;

/**
 *  Identifies various topological shapes. This
 *  enumeration allows you to use dynamic typing of shapes.
 *  The values are listed in order of complexity, from the
 *  most complex to the most simple i.e.
 *  COMPOUND > COMPSOLID > SOLID > .... > VERTEX > SHAPE.
 *  Any shape can contain simpler shapes in its definition.
 *  Abstract topological data structure describes a basic
 *  entity, the shape (present in this enumeration as the
 *  SHAPE value), which can be divided into the following
 *  component topologies:
 *  - COMPOUND: A group of any of the shapes below.
 *  - COMPSOLID: A set of solids connected by their
 *  faces. This expands the notions of WIRE and SHELL to solids.
 *  - SOLID: A part of 3D space bounded by shells.
 *  - SHELL: A set of faces connected by some of the
 *  edges of their wire boundaries. A shell can be open or closed.
 *  - FACE: Part of a plane (in 2D geometry) or a surface
 *  (in 3D geometry) bounded by a closed wire. Its
 *  geometry is constrained (trimmed) by contours.
 *  - WIRE: A sequence of edges connected by their
 *  vertices. It can be open or closed depending on
 *  whether the edges are linked or not.
 *  - EDGE: A single dimensional shape corresponding
 *  to a curve, and bound by a vertex at each extremity.
 *  - VERTEX: A zero-dimensional shape corresponding to a point in geometry.
 */
public enum TopAbs_ShapeEnum {
  TopAbs_COMPOUND,
  TopAbs_COMPSOLID,
  TopAbs_SOLID,
  TopAbs_SHELL,
  TopAbs_FACE,
  TopAbs_WIRE,
  TopAbs_EDGE,
  TopAbs_VERTEX,
  TopAbs_SHAPE;

  public final int swigValue() {
    return swigValue;
  }

  public static TopAbs_ShapeEnum swigToEnum(int swigValue) {
    TopAbs_ShapeEnum[] swigValues = TopAbs_ShapeEnum.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (TopAbs_ShapeEnum swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + TopAbs_ShapeEnum.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private TopAbs_ShapeEnum() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private TopAbs_ShapeEnum(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private TopAbs_ShapeEnum(TopAbs_ShapeEnum swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

