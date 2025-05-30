package edu.uepb.cct.cc;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapFromListAdapter<K, V> implements Map<K, V> {
    private final List<V> list;

    public MapFromListAdapter(List<V> list) {
        this.list = list;
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public boolean containsKey(Object key) {
        if (!(key instanceof Integer)) {
            return false;
        }
        int index = (Integer) key;
        return index >= 0 && index < list.size();
    }

    @Override
    public boolean containsValue(Object value) {
        return list.contains(value);
    }

    @Override
    public V get(Object key) {
        if (!(key instanceof Integer)) {
            throw new IllegalArgumentException("A chave deve ser um Integer");
        }
        int index = (Integer) key;
        return index >= 0 && index < list.size() ? list.get(index) : null;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0; // Use o novo método size
    }

    @Override
    public V put(K key, V value) {
        if (!(key instanceof Integer)) {
            throw new IllegalArgumentException("A chave deve ser um Integer");
        }
        int index = (Integer) key;
        
        // Expande a lista se necessário
        while (index >= list.size()) {
            list.add(null);
        }
        
        return list.set(index, value); // Isso substitui o valor antigo ou coloca null
    }

    @Override
    public V remove(Object key) {
        if (!(key instanceof Integer)) {
            throw new IllegalArgumentException("A chave deve ser um Integer");
        }
        int index = (Integer) key;
        return index >= 0 && index < list.size() ? list.remove(index) : null;
    }

    @Override
    public int size() {
        int count = 0;
        for (V value : list) {
            if (value != null) {
                count++;
            }
        }
        return count; // Retorna apenas o número de entradas válidas
    }

    @Override
    public Collection<V> values() {
        return list;
    }

    @Override
    public Set<K> keySet() {
        throw new UnsupportedOperationException("Método não implementado");
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException("Método não implementado");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MapFromListAdapter)) return false;

        MapFromListAdapter<?, ?> that = (MapFromListAdapter<?, ?>) o;

        // Check size first
        if (this.size() != that.size()) return false;

        // Check key-value pairs
        for (int i = 0; i < this.size(); i++) {
            if (!this.get(i).equals(that.get(i))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return list.hashCode();
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        throw new UnsupportedOperationException("Método não implementado");
    }
}
