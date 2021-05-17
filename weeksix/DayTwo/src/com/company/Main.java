package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] fruit;

        // int array
        int[]numArray;

        // boolean array
        boolean[] isToggle;




//        String[] names = {"John", "Sara", "Daryl", "Anna"};
//        int size = names.length;
//        System.out.print("names: "+ size);

//        List <Boolean> listOne = new ArrayList<>();
//        List <String> list2 = new LinkedList<>();
//        List <Integer> list3 = new Vector<>();
//        List <String> list4 = new Stack<>();


        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("Anna");
        names.add("Jill");


        names.add(1, "Finn");

        names.remove("Finn");
        System.out.println(names.get(1));


        Collections.reverse(names);


        boolean isMatch = names.contains("Heather");

        String str = "This is a String";

        String ArrStr[] = str.split(" ");

        List<String> arrList = new ArrayList<>();
        arrList = Arrays.asList(str);


        System.out.println(arrList);

        System.out.println(Arrays.toString(ArrStr));



    HashMap<String, Integer> person = new HashMap<>();
    // .put adds the item to the hash map

        person.put("Joan", 23);
        person.put("Erik", 83);
        person.put("Ali", 59);


        person.remove("Erik");

        boolean personKey =  person.containsKey("Joan");
        boolean personValue =  person.containsValue(576);

        boolean isClearArr = person.isEmpty();

        System.out.println(isClearArr);
        System.out.println(personKey);
        System.out.println(personValue);


        for(String name : names){
            System.out.println(name);
        }

        for(Map.Entry<String, Integer> entry : person.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }

        // for each variable
        for(String name: names){

        }

        LinkedList<String> animalList = new LinkedList<>();
        animalList.add("Frog");
        animalList.add("Tiger");
        animalList.add("Lion");
        animalList.add("Mongoose");

//        System.out.println(animalList);
        animalList.addFirst("Shark");


        animalList.addLast("Koala");
        System.out.println(animalList);

        animalList.add(3, "Bear");

        animalList.remove(2);

        animalList.removeFirst();

        animalList.removeLast();

        boolean listAnimals = animalList.contains("Lion");

        System.out.println(animalList.get(3));


        //// Queues
        Queue<Integer> myQ = new LinkedList<>();

        for(int i = 5; i < 10; i++){
            myQ.add(i);
        }

        System.out.println(myQ);


        int removeHead = myQ.remove();

        System.out.println("removeHead" + removeHead);

        int head = myQ.peek();
        System.out.println(head);

        int myQsize = myQ.size();
        System.out.println(myQsize);


        Stack<Integer> myStack = new Stack<>();

        myStack.push(1);
        myStack.push(4);
        myStack.push(9);


        System.out.println(myStack.pop());
        System.out.println(myStack);


    }
}
