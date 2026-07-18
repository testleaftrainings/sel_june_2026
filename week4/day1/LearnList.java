package org.testleaf.week4.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

public static void main(String[]args){
//syntax:Interface<generictype> objReference=new Imp.class<Generictype>();
List<String> Learners=new ArrayList <String>();
List<String> Trainer=new ArrayList<String>();
Trainer.add("saranya");
//add the items in the list
Learners.add("sabarish");
Learners.add("Arthi");
System.out.println(Learners);
//Learners.add(2, "sruthi");
Learners.add(1, "swarna");
Learners.add("sruthi");
Learners.add("vchithra");
Learners.add(0, "Prashanth");
System.out.println(Learners);
for (int i = 0; i < Learners.size(); i++) {
    System.out.println(Learners.get(i));//index starts from 0
}
//to find the size of list
int size = Learners.size();//6
System.out.println(size);//it starts from 1
//lastindex=size-1
System.out.println(Learners.get(size-1));
//to remove an item from list
Learners.remove(2);
System.out.println(Learners);
boolean remove = Learners.remove("vchithra");
System.out.println(remove);
System.out.println(Learners);
//clear the list
//Learners.clear();
System.out.println(Learners);
//add onelist to anotherlist
Trainer.addAll(Learners);
System.out.println(Trainer);


}
}
