package edu.uepb.cct.cc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestMapFromListAdapter {
    private MapFromListAdapter<Integer, String> adapter;
    private List<String> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
        adapter = new MapFromListAdapter<>(list);
    }

    @Test
    void testPutAndGet() {
        adapter.put(0, "value0");
        assertEquals("value0", adapter.get(0));

        adapter.put(1, "value1");
        assertEquals("value1", adapter.get(1));
        assertNull(adapter.get(2)); // index 2 should be null
    }

    @Test
    void testPutAtHigherIndex() {
        adapter.put(5, "value5");
        assertEquals("value5", adapter.get(5));
        assertNull(adapter.get(1)); // index 1 should still be null
    }

    @Test
    void testRemove() {
        adapter.put(0, "value0");
        assertEquals("value0", adapter.remove(0));
        assertNull(adapter.get(0)); // index 0 should now be null
    }

    @Test
    void testContainsKey() {
        adapter.put(0, "value0");
        assertTrue(adapter.containsKey(0));
        assertFalse(adapter.containsKey(1)); // no value at index 1
        assertFalse(adapter.containsKey(-1)); // negative index
    }

    @Test
    void testContainsValue() {
        adapter.put(0, "value0");
        assertTrue(adapter.containsValue("value0"));
        assertFalse(adapter.containsValue("value1")); // not in the list
    }

    @Test
    void testClear() {
        adapter.put(0, "value0");
        adapter.clear();
        assertTrue(adapter.isEmpty());
    }

    @Test
    void testIsEmpty() {
        assertTrue(adapter.isEmpty());
        adapter.put(0, "value0");
        assertFalse(adapter.isEmpty());
    }

    @Test
    void testSize() {
        assertEquals(0, adapter.size());
        adapter.put(0, "value0");
        adapter.put(1, "value1");
        assertEquals(2, adapter.size());
        adapter.remove(0);
    }

    @Test
    void testEquals() {
        MapFromListAdapter<Integer, String> anotherAdapter = new MapFromListAdapter<>(new ArrayList<>());
        anotherAdapter.put(0, "value0");
        adapter.put(0, "value0");
        assertTrue(adapter.equals(anotherAdapter));
        
        anotherAdapter.put(1, "value1");
        adapter.put(1, "value1");
        assertTrue(adapter.equals(anotherAdapter));
        
        anotherAdapter.put(1, "different");
        assertFalse(adapter.equals(anotherAdapter)); // values differ
    }

    @Test
    void testHashCode() {
        adapter.put(0, "value0");
        MapFromListAdapter<Integer, String> anotherAdapter = new MapFromListAdapter<>(new ArrayList<>());
        anotherAdapter.put(0, "value0");
        assertEquals(adapter.hashCode(), anotherAdapter.hashCode());
    }
}
