package collectionFramework.map;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {

        Map map = new HashMap();

        map.put(1,2);
        map.put("name","Nitish Kr");
        map.put(12.1,12);
        map.put(12.1,890);
        map.put(null,12);
        map.put(null,121);
        System.out.println(map.get(12));
        System.out.println(map);
        System.out.println(map.containsKey(1));
        Map map1 = new HashMap();
        map1.put(101,189);
        map1.put(102,2);
        map.putAll(map1);
        System.out.println(map);

        HashMap hashMap = new HashMap(); // intial capacity: 16, Load factor 0.75
        hashMap.put(101,12);//entry
        hashMap.put(102,23);
        hashMap.put(103,25);
        hashMap.put(null,123);
        System.out.println(hashMap);

//        for(Map.Entry entry = hashMap.entrySet()){ // if we give Generic in HashMap<Intgere, String>
//            System.out.println(entry.getKey()+" ->"+entry.getValue());
//        }

        Set set = hashMap.entrySet();
        System.out.println(set);

        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

        System.out.println(hashMap.containsValue(123));

        TreeMap treeMap = new TreeMap();//(Comparator.reverseOrder());//sorting DESC

        treeMap.put(101,1);
        treeMap.put(102,2);
        treeMap.put(107,3);
        treeMap.put(104,4);

        System.out.println(treeMap);
        System.out.println(treeMap.ceilingEntry(100));
        System.out.println(treeMap.ceilingKey(105));
        System.out.println(treeMap.floorEntry(1007));

        Set entrySet = treeMap.entrySet();
        System.out.println(entrySet);

        System.out.println(treeMap.headMap(102));

        System.out.println(treeMap.keySet());
        System.out.println(treeMap.values());
        System.out.println(treeMap.pollFirstEntry());
        System.out.println(treeMap.pollLastEntry());
        System.out.println(treeMap);
        System.out.println(treeMap.remove(102));
        System.out.println(treeMap);






    }
}
