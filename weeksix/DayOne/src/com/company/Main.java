package com.company;


import java.util.Random;

public class Main {


    public static void main(String[] args) {


//    int count;
//    count = 55;
//
//    String msg;
//
//    if(count > 20){
//        msg = "Large count";
//        // sout tab
//        System.out.println(msg);
//        }
//
//    if(count > 50){
//        msg = "A larger number";
//        System.out.println(msg);
//        }

//     nested statement
//      int count;
//    count = 55;
//
//    String msg;
//
//    if(count > 20){
//        msg="Large count";
//        // sout tab
//        System.out.println(msg);
//
//        if(count>50){
//            msg="A larger count";
//            System.out.println(msg);
//        }
//    }
//
//
//    System.out.println("Finish");

//
//    int Is checked = CheckId(true, 22, false);
//    System.out.println(IsChecked);


//        int grade = 100;
//        String letterGrade;
//
//        if (grade > 90) {
//            letterGrade = "A"
//        } else if (grade < 90 && grade > 80) {
//            letterGrade = "B"
//        } else if (letterGrade < 80 && grade > 70) {
//            letterGrade = "C"
//        } else if (grade < 70 && grade > 60) {
//            letterGrade = "D"
//        } else {
//            letterGrade = "F"
//        }
//
//
//        System.out.println(letterGrade);
//
//        String shirt = null;
//        switch (shirt) {
//            case "s":
//                System.out.println("small");
//                break;
//            case "m"
//                ;
//                System.out.println("medium");
//                break;
//            case "l"
//                ;
//                System.out.println("large");
//                break;
//            defualt:
//            System.out.println("out of stock");
//        }


//
//    ///side challenge
//    public static int CheckId(boolean isValidId, int age, boolean buyingAlc){
//        if(isValidId){
//            System.out.println("Is id presented");
//            if((age > 21) && (buyingAlc)){
//                System.out.println("They are able to buy");
//            }
//        }
//        return 0;
//    }

//    public static int CheckId(boolean isValidId, int age, boolean buyingAlc){
//        if(isValidId){
//            System.out.println("Is id presented");
//            if((age > 21) && (buyingAlc)){
//                System.out.println("They are able to buy");
//            }else{
//                System.out.println("Not over 21");
//            }
//        }else{
//            System.out.println("Error: Invalid id");
//        }
//        return 0;
//    }


        //Integer
        //int
//        int x = 30;
//        if(x < 40)
//            System.out.println("Just print")




//        for(int i = 0; i < 10; i++){
//            System.out.println("i is: "+ i);
//        }



//    int[] numbers = {1,2,3,4,5};
//        for(int i : numbers){
//            System.out.println(i);
//        }
//
//
//
//        while(expression){
//            // does things
//        }
//
//
//        Scanner userInput = new Scanner(System.in);
//        char character = "y"
//        boolean flag = true;

//        do{
//            System.out.println("Enter q to quit");
//
//            character = userInput.next().charAt(0);
//
//        }while(character != q || character != 'Q');
//
//            System.out.println("quit program");

        // while statemnet for quitting a program
//        while(flag){
//            System.out.println("Enter q to quit");
//            character = userInput.next().charAt(0);
//
//            if(character == 'q' || character == 'Q'){
//                flag = false;
//            }
//        }


//        BufferReader reader = new BufferReader(new FileReader("myText.txt"));
//        String line = reader.readerLine();
//        while(line != null){
//            System.out.println(line);
//            line = reader.readLine();
//        }


//        Random random = new Random();
//        int breakAt = random.nextInt(100);

//        for(int i = 0; i < 100; i++){
//            if(i == breakAt){
//                System.out.println("random number was " + breakAt);
//                break;
//            }
//            System.out.println("index" + i);
//        }
//        System.out.println("After loop");



//        for(int i = 0; i <= 10; i++){
//            if(i == breakAt){
//                System.out.println("Random num was " + breakAt);
//                break;
//            }
//
//            if(i % 2 == 0){
//                continue;
//            }
//            System.out.println("idx "+i);
//        }
//        System.out.println("After");


//        outer:
//        for(int i = 0; i < 5; i++){
//            System.out.println("List number: " + i);
//            // inner for(loop)
//            for(int i = 0; i < 25; i++){
//                if(i == 12){
//                    continue outer;
//                }
//            }
//        }



        int[] number = {1,2,3,4,5};

        int result = sumArr(number);
        System.out.println(result);


        public void insertOddNumber(int num){
            if(num == 0){
                return num;
            }
            if(num < 0){
                return num;
            }
            if(num % 2 == 0){
                return num;
            }

            System.out.println("odds");
            return;
        }


        public int sumArr (int[] arr){
            int sum = 0;

            if(arr.length > 0){
                for(int n : arr){
                    sum += n;
                }
            }
            return sum;
        }


    }

}

