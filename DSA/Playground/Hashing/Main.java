package DSA.Playground.Hashing;

import java.io.*;
import java.util.*;

public class Main {

  public static class HashMap<k, v> {

    private class HMnode {

      k key;
      v value;

      HMnode(k key, v value) {
        this.key = key;
        this.value = value;
      }
    }

    private int size; //n
    private LinkedList<HMnode>[] buckets; //N=buckets.length

    public HashMap() {
      initbuckets(4);
      size = 0;
    }

    private void initbuckets(int N) {
      buckets = new LinkedList[N];
      for (int bi = 0; bi < buckets.length; bi++) {
        buckets[bi] = new LinkedList<>();
      }
    }

    public void put(k key, v value) throws Exception {
      int bi = hashfn(key);
      int di = getIndexWithinBucket(key, bi);

      if (di != -1) {
        HMnode node = buckets[bi].get(di);
        node.value = value;
      } else {
        HMnode node = new HMnode(key, value);
        buckets[bi].add(node);
        size++;
      }
      double lambda = size * 1.0 / buckets.length;
      if (lambda > 2.0) {
        rehash();
      }
    }

    private void rehash() throws Exception {
      LinkedList<HMnode>[] oba = buckets;

      initbuckets(oba.length * 2);
      size = 0;

      for (int i = 0; i < oba.length; i++) {
        for (HMnode node : oba[i]);
        size++;
      }
    }

    private int hashfn(k key) {
      int hc = key.hashCode();
      return Math.abs(hc) % buckets.length;
    }

    private int getIndexWithinBucket(k key, int bi) {
      int di = 0;
      for (HMnode node : buckets[bi]) {
        if (node.key.equals(key)) {
          return di;
        }
        di++;
      }
      return -1;
    }

    public v get(k key) throws Exception {
      int bi = hashfn(key);
      int di = getIndexWithinBucket(key, bi);

      if (di != -1) {
        HMnode node = buckets[di].get(di);
        return node.value;
      } else {
        return null;
      }
    }

    public boolean cantainsKey(k key) {
      int bi = hashfn(key);
      int di = getIndexWithinBucket(key, bi);

      if (di != -1) {
        return true;
      } else {
        return false;
      }
    }

    public v remove(k key) throws Exception {
      int bi = hashfn(key);
      int di = getIndexWithinBucket(key, bi);

      if (di != -1) {
        HMnode node = buckets[di].remove(di);
        size--;
        return node.value;
      } else {
        return null;
      }
    }

    public ArrayList<k> keyset() throws Exception {
      ArrayList<k> keys = new ArrayList<>();
      for (int i = 0; i < buckets.length; i++) {
        for (HMnode node : buckets[i]) {
          keys.add(node.key);
        }
      }
      return keys;
    }

    public int size() {
      return size;
    }

    public void display() {
      System.out.println("Display Begins");
      for (int bi = 0; bi < buckets.length; bi++) {
        System.out.println("Buckets" + bi + " ");
        for (HMnode node : buckets[bi]) {
          System.out.println(node.key + "@" + node.value + " ");
        }
      }
    }

    public static void main(String[] args) throws Exception {}
  }
}
