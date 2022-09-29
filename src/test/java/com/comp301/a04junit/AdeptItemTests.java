package com.comp301.a04junit;

import com.comp301.a04junit.adventure.Item;
import com.comp301.a04junit.adventure.ItemImpl;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/** Write unit tests for the ItemImpl class here */
public class  AdeptItemTests {
  @Test
  public void testConstructor() {
    ItemImpl itemtest = new ItemImpl("water bottle");
    try {
      ItemImpl nulltest = new ItemImpl(null);
      Assert.fail("Exception should have been thrown");
    } catch (IllegalArgumentException iae) {
      Assert.assertTrue(true);
    }
  }

  @Test
  public void testGetName() {
    Item test = new ItemImpl("phone");
    Assert.assertEquals("phone", test.getName());
  }

  @Test
  public void testEquals() {
    Item phone1 = new ItemImpl("phone");
    Item phone2 = new ItemImpl("phone");
    assertTrue(phone1.equals(phone2));
  }

  @Test
  public void testToString() {
    Item phone1 = new ItemImpl("phone");
    Assert.assertEquals("phone", phone1.toString());
  }


}
