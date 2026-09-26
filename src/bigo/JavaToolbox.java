package bigo;


public class JavaToolbox {
    static void main() {
        /* ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        int x = list.get(2);
        list.set(0,99);
        int size = list.size();
        System.out.println(x);
        System.out.println(list);
        System.out.println(size);
         */

        /*HashMap<Integer, Integer> count = new HashMap<>();
        int[] arr = {10,20,30,20,10};
        for(int num:arr){
            count.put(num ,count.getOrDefault(num,0)+1);
        }
        System.out.println(count);
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(10,1);
        map.put(5,2);
        map.put(3,5);
        map.put(4,2);
        int x =map.get(5);
        int[] arr={10,10,20,30,30,40,40};
        for(int num:arr){
            map.put(num , map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
        boolean mapHas = map.containsKey(6);
        System.out.println(mapHas);

         */


        /*HashSet<Integer> set= new HashSet<>();
        set.add(5);
        set.add(6);
        System.out.println(set);
        set.add(6);
        System.out.println(set);
        boolean has = set.contains(6);
        System.out.println(has);

        HashSet<Integer> seen = new HashSet<>();
        int[] arr={2,3,4,5,4,5};
        for(int num:arr){
            if(seen.contains(num)){
                System.out.println("duplicate number: " +num);
            }
            seen.add(num);
        }
        System.out.println(seen);

         */
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<=4;i++){
            sb.append(i);
            sb.append("-");
        }
        System.out.println(sb.length());
        System.out.println(sb.charAt(1));
        sb.deleteCharAt(sb.length()-1);

        String result = sb.toString();
        System.out.println(result);

        StringBuilder sb2= new StringBuilder();
        sb2.append("hello");
        sb2.reverse();
        String result2= sb2.toString();
        System.out.println(result2);



    }

}
