package d0327.jessie;

import java.util.*;

/**
 * Created by Administrator on 2017/3/27.
 */
public class SetDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("abc");
        c.add("123");
        c.add("dfg");
        c.add("aaaabc");
//        String str = new String("abc");
//
//        for (String string : c) {
//            System.out.println(string);
//        }
//
//        System.out.println(c.contains(str));
//        System.out.println(c.size());
//        c.clear();
//        System.out.println(c.isEmpty());
//        System.out.println(c.size());

        //adAll, containsAll方法
        Collection<String> c2 = new ArrayList<>();
        c2.add("xxx");
        c2.add("yyy");
        c2.add("zzz");
        c.addAll(c2);
        System.out.println(c);

        //利用iterator实现遍历
        Iterator<String> iterator = c2.iterator();//定义一个迭代器
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println("------------------------------");
        Iterator<String> iterator1 = c2.iterator();
        while (iterator1.hasNext()){
            String str1 = iterator1.next();
            if (str1.equals("xxx")){
                iterator1.remove();
                System.out.println(str1);
                System.out.println("------------------------------");

            }
            System.out.println(str1);
        }
        System.out.println("------------------------------");
        System.out.println(c2);

        System.out.println("------------------------------");
        List<String> list1 = new ArrayList<String>();
        list1.add("xxx");
        list1.add("yyy");
        list1.add("zzz");
        list1.add("aaaabc");
        System.out.println(list1.get(2));
        list1.set(2,"MMM");
        System.out.println(list1.get(2));
        System.out.println("------------------------------");
        System.out.println(list1);
        List<String> subList = list1.subList(0,2);
        System.out.println(subList);
        System.out.println("------------------------------");
        String[] strArr = list1.toArray(new String[list1.size()]);
        System.out.println(Arrays.toString(strArr));

//        for (String string : c) {
//            System.out.println(string);
//        }
//        System.out.println(c.containsAll(c2));
    }
}
