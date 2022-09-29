package com.comp301.a04junit;

import com.comp301.a04junit.adventure.Inventory;
import com.comp301.a04junit.adventure.InventoryImpl;
import com.comp301.a04junit.adventure.Item;
import com.comp301.a04junit.adventure.ItemImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/** Write unit tests for the InventoryImpl class here */
public class JediInventoryTests {
  @Test
  public void testConstructor() {
    // code here
  }

  @Test
  public void testIsEmpty() {
    Inventory test1 = new InventoryImpl();
    Assert.assertTrue(test1.isEmpty());
    Item item1 = new ItemImpl("item1");
    test1.addItem(item1);
    Assert.assertFalse(test1.isEmpty());
  }

  @Test
  public void testGetNumItems() {
    Inventory test1 = new InventoryImpl();
    Item item1 = new ItemImpl("item1");
    test1.addItem(item1);
    Item item2 = new ItemImpl("item2");
    test1.addItem(item2);
    Item item3 = new ItemImpl("item3");
    test1.addItem(item3);
    Assert.assertEquals(3, test1.getNumItems());
  }

  @Test
  public void testGetItems() {
    // work on this
    Inventory test1 = new InventoryImpl();
    Item item1 = new ItemImpl("item1");
    test1.addItem(item1);
    Item item2 = new ItemImpl("item2");
    test1.addItem(item2);
    Item item3 = new ItemImpl("item3");
    test1.addItem(item3);
    List<Item> list = new ArrayList<Item>();
    list.add(item1);
    list.add(item2);
    list.add(item3);
    Assert.assertEquals(list, test1.getItems());
  }

  @Test
  public void testAddItem() {
    Inventory test1 = new InventoryImpl();
    Item item1 = new ItemImpl("item1");
    test1.addItem(item1);
    Item item2 = new ItemImpl("item2");
    test1.addItem(item2);
    Assert.assertEquals(2, test1.getNumItems());
  }

  @Test
  public void testRemoveItem() {
    Inventory test1 = new InventoryImpl();
    Item item1 = new ItemImpl("item1");
    test1.addItem(item1);
    Item item2 = new ItemImpl("item2");
    test1.addItem(item2);
    Item item3 = new ItemImpl("item3");
    test1.addItem(item3);
    test1.removeItem(item2);
    Assert.assertEquals(2, test1.getNumItems());
  }

  @Test
  public void testClear() {
    Inventory test1 = new InventoryImpl();
    Item item1 = new ItemImpl("item1");
    test1.addItem(item1);
    Item item2 = new ItemImpl("item2");
    test1.addItem(item2);
    Item item3 = new ItemImpl("item3");
    test1.addItem(item3);
    test1.clear();
    Assert.assertEquals(0, test1.getNumItems());
  }

  @Test
  public void testTransferFrom() {
    Inventory inventory1 = new InventoryImpl();
    Inventory inventory2 = new InventoryImpl();
    Item item1 = new ItemImpl("item1");
    inventory1.addItem(item1);
    Item item2 = new ItemImpl("item2");
    inventory1.addItem(item2);
    Item item3 = new ItemImpl("item3");
    inventory1.addItem(item3);
    inventory2.transferFrom(inventory1);
    Assert.assertEquals(0, inventory1.getNumItems());
    Assert.assertEquals(3, inventory2.getNumItems());

    Inventory inventory3 = new InventoryImpl();
    inventory3.transferFrom(null);
  }
}
