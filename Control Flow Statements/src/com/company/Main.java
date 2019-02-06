package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 1;
//      switch statements
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.00, 2.0));

//       for statements
        public static double calculateInterest(double amount, double interestRate) {
            return(amount * (interestRate/100));
        }

        for(int i=0; i<5; i++) {
            System.out.println("Loop" + i);
        }

//        while and do while statements, use continue and break
        int count = 0;
        while(count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

    }
}
