package DSA.Java.HashMap;

import java.util.LinkedList;

public class HashMap<k, v> {

  private class HMNode {

    k key;
    v value;

    //constructor
    public HMNode(k key, v value) {
      this.key = key;
      this.value = value;
    }

    @Override
    public String toString() {
      return this.key + "@" + this.value;
    }
  }

  //making an Array of LinkedList
  private LinkedList<HMNode>[] bucketArray;
  private int size;

  public HashMap() {
    this(5);
  }

  public HashMap(int cap) {
    this.bucketArray = (LinkedList<HMNode>[]) new LinkedList[cap];
    this.size = 0;
    for (int i = 0; i < bucketArray.length; i++) {
      bucketArray[i] = new LinkedList<HMNode>();
    }
  }

  public void put(k key, v value) {
    // This Key will be a unique index in the array
    int bi = hashFunction(key);

    //get the linkedlist at the index bi
    LinkedList<HMNode> bucket = bucketArray[bi];

    //check if the is present in the Hashmap or Not
    int fi = findInBucket(bucket, key);

    if (fi == -1) {
      HMNode nn = new HMNode(key, value);
      this.size++;
      //adding the new node to the end of the LinkedList
      bucket.addLast(nn);
    } else {
      //get the node
      HMNode ntbu = bucket.get(fi);
      //Updating the value at the node.
      ntbu.value = value;
    }
    //calculate the load facter again
    //add if the value of load facter is greater then 1,
    //then do rehashing hrae

    //Load facter denotes the ratio of no of elements in the hashmap
    //divided by size of hashmap;

    double loadFactor = (double) this.size / this.bucketArray.length;
    if (loadFactor > 1) {
      rehassh();
    }
  }

  private void rehassh() {
    //store the previous array first
    LinkedList<HMNode>[] oba = this.bucketArray;
    //create a new array of double size
    this.bucketArray = (LinkedList<HMNode>[]) new LinkedList[2 * oba.length];

    //size of a new array is currently 0;
    this.size = 0;
    for (int i = 0; i < bucketArray.length; i++) {
      bucketArray[i] = new LinkedList<HMNode>();
    }
    for (int i = 0; i < oba.length; i++) {
      LinkedList<HMNode> bucket = oba[i];

      //for every LinkedList we are iterating over every node
      for (int j = 0; j < bucket.size(); j++) {
        HMNode node = bucket.get(i);
        put(node.key, node.value);
      }
    }
  }

  private int findInBucket(LinkedList<HMNode> bucket, k key) {
    //iterating over the given LinkedList
    //to check if the given key
    //it already present or not
    for (int i = 0; i < bucket.size(); i++) {
      HMNode pn = bucket.get(i);
      if (pn.key.equals(key)) {
        return i;
      }
    }
    return -1;
  }

  private int hashFunction(k key) {
    // Now there is an inbuilt function hashcode() in java, where
    //we can simply given a value and it return a uniqe key for that value
    int hc = key.hashCode();

    int bi = Math.abs(hc) % bucketArray.length;

    return bi;
  }

  public void display() {
    System.out.println("_________________________________");
    for (int i = 0; i < bucketArray.length; i++) {
      LinkedList<HMNode> bucket = bucketArray[i];
      System.out.print("B" + "=>");
      for (int j = 0; j < bucket.size(); j++) {
        HMNode node = bucket.get(j);
        System.out.print(node + " , ");
      }
      System.out.println(".");
    }
    System.out.println("_________________________________");
  }

  public v get(k key) {
    int bi = hashFunction(key);
    LinkedList<HMNode> bucket = bucketArray[bi];

    //Cheking if the key is present in the linked list or Not
    int fi = findInBucket(bucket, key);

    if (fi == -1) {
      return null;
    } else {
      return bucket.get(fi).value;
    }
  }
}
