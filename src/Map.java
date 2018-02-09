import java.util.ArrayList;

//	Implementation of a hash table
class HashNode<K, V> {
	K key;
	V value;
	HashNode<K, V> next;
	
	public HashNode(K key, V value) {
		this.key = key;
		this.value = value;
	}
}

public class Map<K, V> {
	ArrayList<HashNode<K, V>> buckets;
	int numBuckets;
	int size;
	
	public Map() {
		buckets = new ArrayList<>();
		numBuckets = 10;
		size = 0;
		for (int i = 0; i < numBuckets; i++)
			buckets.add(null);
	}
	
	private int getBucketIndex(K key) {
		int hashCode = key.hashCode();
		return hashCode % numBuckets;
	}
	
	public int size() {
		return size;
	}
	
	public V get(K key) {
		int bucketIndex = getBucketIndex(key);
		HashNode<K, V> head = buckets.get(bucketIndex);
		while (head != null) {
			if (head.key.equals(key))
				return head.value;
			head = head.next;
		}
		return null;
	}
	
	public V remove(K key) {
		int bucketIndex = getBucketIndex(key);
		HashNode<K, V> head = buckets.get(bucketIndex);
		HashNode<K, V> prev = null;
		while (head != null && !head.key.equals(key)) {
			prev = head;
			head = head.next;		
		}
		if (head == null)
			return null;
		if (prev != null)
			prev.next = head.next;
		else
			buckets.set(bucketIndex, head.next);
		size--;
		return head.value;
	}
	
	public void add(K key, V value) {
		int bucketIndex = getBucketIndex(key);
		HashNode<K, V> head = buckets.get(bucketIndex);
		while (head != null) {
			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		head = buckets.get(bucketIndex);
		HashNode<K, V> newNode = new HashNode<K, V>(key, value);
		newNode.next = head;
		buckets.set(bucketIndex, newNode);
		size++;
		if ((1.0 * size) / numBuckets >= 0.7) {
			ArrayList<HashNode<K, V>> temp = buckets;
			buckets = new ArrayList<>();
			numBuckets = 2 * numBuckets;
			size = 0;
			for (int i = 0; i < numBuckets; i++) 
				buckets.add(null);
			for (HashNode<K, V> headNode : temp) {
				while (headNode != null) {
					add(headNode.key, headNode.value);
					headNode = headNode.next;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		Map<String, Integer> map = new Map<>();
		for (int i = 0; i < 20; i++) {
			map.add("abc" + i, i + 1);
			System.out.println("i = " + i + " loadFactor = " + (1.0 * map.size) / map.numBuckets);
		}
		map.remove("abc3");
		map.remove("abc7");
		for (int i = 0; i < 20; i++)
			System.out.println("abc" + i + ": " + map.get("abc" + i));
	}
}
