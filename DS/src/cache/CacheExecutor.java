package cache;

public class CacheExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LRUCache lruCache = new LRUCache(2);
		lruCache.put(1, 4);
		lruCache.put(2, 5);
		lruCache.put(4, 7);
		lruCache.put(3, 6);
		
		
		System.out.println(lruCache.getOrDefault(1, -1));
		System.out.println(lruCache.getOrDefault(2, -1));
		System.out.println(lruCache.getOrDefault(3, -1));
		System.out.println(lruCache.getOrDefault(4, -1));
	}

}
