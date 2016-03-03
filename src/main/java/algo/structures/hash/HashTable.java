package algo.structures.hash;

import java.util.ArrayList;
import java.util.List;

/**
 * HashTable interface
 *
 * Created by akhalikov on 01/03/16
 */
public class HashTable<K, V> {
  private List<Node<K, V>> data;

  public HashTable() {
    this.data = new ArrayList<>();
  }

  /**
   * Put key, value pair into the table and return value
   */
  public V put(K key, V value) {
    Node<K, V> node = getNodeForKey(key);
    if (node != null) {
      // if key is already exist, just update the value
      V oldValue = node.value;
      node.value = value;
      return oldValue;
    }
    node = new Node<>(key, value);
    int index = getIndex(key);
    if (data.get(index) != null) {
      node.next = data.get(index);
      node.next.prev = node;
    }
    data.set(index, node);
    return value;
  }

  /**
   * Find value of a key
   */
  public V get(K key) {
    final Node<K, V> node = getNodeForKey(key);
    return node != null ? node.value : null;
  }

  /**
   * Remove key and return value
   * @return value of removed entry or null if it is not exist
   */
  public V remove(K key) {
    Node<K, V> node = getNodeForKey(key);
    if (node == null)
      return null;
    V removedValue = node.value;
    if (node.prev != null) {
      node.prev.next = node.next;
    } else {
      int index = getIndex(key);
      data.set(index, node.next);
    }
    if (node.next != null) {
      node.next.prev = node.prev;
    }
    return removedValue;
  }

  private Node<K, V> getNodeForKey(K key) {
    int index = getIndex(key);
    Node<K, V> node = data.get(index);
    while (node != null) {
      if (node.key == key)
        return node;
      node = node.next;
    }
    return null;
  }

  private int getIndex(K key) {
    return Math.abs(key.hashCode() % data.size());
  }

  public static class Node<K, V> {
    K key;
    V value;
    Node<K, V> next;
    Node<K, V> prev;

    public Node(K key, V value) {
      this.key = key;
      this.value = value;
    }
  }
}
