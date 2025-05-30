package edu.uepb.cct.cc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestListFromMapAdapter {

    private ListFromMapAdapter<String> listAdapter;
    private Map<Integer, String> map;

    @BeforeEach
    public void setUp() {
        map = new HashMap<>();
        map.put(0, "A");
        map.put(1, "B");
        map.put(2, "C");
        listAdapter = new ListFromMapAdapter<>(map);
    }

    @Test
    public void testAdd() {
        listAdapter.add("D");
        assertEquals(4, listAdapter.size());
        assertTrue(listAdapter.contains("D"));
    }

    @Test
    public void testGet() {
        assertEquals("A", listAdapter.get(0));
        assertEquals("B", listAdapter.get(1));
        assertEquals("C", listAdapter.get(2));
    }

    @Test
    public void testSet() {
        listAdapter.set(1, "Z");
        assertEquals("Z", listAdapter.get(1));
    }

    @Test
    public void testRemoveByIndex() {
        String removedElement = listAdapter.remove(1);
        assertEquals("B", removedElement);
        assertFalse(listAdapter.contains("B"));
        assertEquals(2, listAdapter.size());
    }

    @Test
    public void testRemoveByValue() {
        assertTrue(listAdapter.remove("A"));
        assertFalse(listAdapter.contains("A"));
        assertEquals(2, listAdapter.size());
    }

    @Test
    public void testClear() {
        listAdapter.clear();
        assertTrue(listAdapter.isEmpty());
    }

    @Test
    public void testRetainAll() {
        List<String> toRetain = Arrays.asList("A", "C");
        boolean modified = listAdapter.retainAll(toRetain);
        assertTrue(modified);
        assertEquals(2, listAdapter.size());
        assertTrue(listAdapter.contains("A"));
        assertTrue(listAdapter.contains("C"));
        assertFalse(listAdapter.contains("B"));
    }

    @Test
    public void testRemoveAll() {
        List<String> toRemove = Arrays.asList("A", "B");
        boolean modified = listAdapter.removeAll(toRemove);
        assertTrue(modified);
        assertEquals(1, listAdapter.size());
        assertFalse(listAdapter.contains("A"));
        assertFalse(listAdapter.contains("B"));
    }

    @Test
    public void testContains() {
        assertTrue(listAdapter.contains("A"));
        assertFalse(listAdapter.contains("D"));
    }

    @Test
    public void testIsEmpty() {
        assertFalse(listAdapter.isEmpty());
        listAdapter.clear();
        assertTrue(listAdapter.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(3, listAdapter.size());
        listAdapter.add("D");
        assertEquals(4, listAdapter.size());
    }

    @Test
    public void testToArray() {
        Object[] array = listAdapter.toArray();
        assertEquals(3, array.length);
        assertTrue(Arrays.asList(array).contains("A"));
        assertTrue(Arrays.asList(array).contains("B"));
        assertTrue(Arrays.asList(array).contains("C"));
    }
}