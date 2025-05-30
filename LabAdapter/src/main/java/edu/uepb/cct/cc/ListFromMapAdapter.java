package edu.uepb.cct.cc;

import java.util.*;

public class ListFromMapAdapter<T> implements List<T> {
    private Map<Integer, T> map;

    public ListFromMapAdapter(Map<Integer, T> map) {
        this.map = map;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        Iterator<Map.Entry<Integer, T>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            T element = iterator.next().getValue();
            if (!c.contains(element)) {
                iterator.remove();
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        Iterator<Map.Entry<Integer, T>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            T element = iterator.next().getValue();
            if (c.contains(element)) {
                iterator.remove();
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsValue(o);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public T get(int index) {
        return map.get(index);
    }

    @Override
    public T set(int index, T element) {
        return map.put(index, element);
    }

    @Override
    public void add(int index, T element) {
        map.put(index, element);
    }

    @Override
    public boolean add(T e) {
        map.put(map.size(), e); 
        return true;
    }

    @Override
    public T remove(int index) {
        return map.remove(index);
    }

    @Override
    public boolean remove(Object o) {
        Integer keyToRemove = null;
        for (Map.Entry<Integer, T> entry : map.entrySet()) {
            if (entry.getValue().equals(o)) {
                keyToRemove = entry.getKey();
                break;
            }
        }
        if (keyToRemove != null) {
            map.remove(keyToRemove);
            return true;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return map.values().iterator();
    }

    @Override
    public Object[] toArray() {
        return map.values().toArray();
    }

    @Override
    public <E> E[] toArray(E[] a) { 
        return map.values().toArray(a);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException("Método não implementado");
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException("Método não implementado");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Método não implementado");
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Método não implementado");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Método não implementado");
    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException("Método não implementado");
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException("Método não implementado");
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Método não implementado");
    }
}