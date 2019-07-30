/**
 * DummyComparator.java
 */

package uk.co.bluettduncanj;

import java.io.Serializable;
import java.util.Comparator;


/**
 * 
 */
public class DummyComparator implements Comparator<DummyObject>, Serializable {

  /**
   * @param o1
   * @param o2
   * @return
   *
   * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
   */
  @Override
  public int compare(DummyObject o1, DummyObject o2) {
    if (o1.dummyCalc() < o2.dummyCalc()) return -1;
    if (o1.dummyCalc() > o2.dummyCalc()) return 1;
    return 0;
  }

}
