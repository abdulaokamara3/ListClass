package com.example.Sample.ProjectAndrewJar;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        List<String> name = List.of("andrew","mose","peter","ojuku");
//        List<String> names= new LinkedList<>();
      //  names.add("fanta");
      //  names.add("james");
     //   names.addAll(name);
    //    String last =name.get(name.size()-2);
   //     System.out.println("the last element is: " +last);
//        for (Object pp:name){
//            System.out.println("this is the name: "+ pp);
            List<Person> jj =new LinkedList<>();
             jj.add(new Person("andrew",34));
             jj.add(new Person("zainba",12));
             jj.add(new Person("david",78));
             jj.add(new Person("mary",10));
             jj.add(new Person("ojuku",13));
//copy of a list from one list to and other
             List<String> tt =new LinkedList<>();
             tt.add("hassan");
             tt.add("mohamed");
             tt.add("sheriffie");
             tt.add("andrew");
             tt.add("david");
             tt.add("tom");
             tt.add("kamara");

        System.out.println("before: " +tt);
        List<String> ttk = List.of("aminata","john","joe");

        Collections.copy(tt,ttk);
        System.out.println("after: "+tt);

        List<String> ttkh = List.of("aminata","john","joe","peter");

        Collections.copy(tt,ttkh);
        System.out.println("second after: "+tt);


//      Collections.sort(jj);
//       System.out.println("after: " + jj);
//      List<Person> kk = new LinkedList<>();
//       kk.add(new Person("Agnes",56) );
//       System.out.println(kk);
//        }
//        List<people> kk = new LinkedList<>();
//        kk.add(new people("hannah",12));
//        kk.add(new people("andrew",34));
//        kk.add(new people("ojuku",50));
//        kk.add(new people("mary",90));
//        kk.add(new people("jane",16));
//        System.out.println("before " + kk);
//
//        Collections.sort(kk);
//        System.out.println("after "+kk);
    }
}
