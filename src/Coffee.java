import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


import static java.lang.Math.exp;
import static java.lang.Math.min;

public class Coffee {
    public static void main(String[] args) throws IOException {
       /* int water = 200;
        int milk = 50;
        int beans = 15;

        Scanner sc = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has: ");
        int waterLevel = sc.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkLevel = sc.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beansLevel = sc.nextInt();

        System.out.println("Write how many cups of coffee you will need: ");
        int cupsOfCoffee = sc.nextInt();

        int minCups = Math.min(waterLevel / water, milkLevel / milk);
        int minCups2 = Math.min(minCups,beansLevel/ beans);

        if (beansLevel + milkLevel + waterLevel + cupsOfCoffee == 0) {
            System.out.println("Yes, I can make that amount of coffee");
        }
        if (minCups < beansLevel / beans && cupsOfCoffee == 1) {
            System.out.println("Yes, I can make that amount of coffee");
        }
        if (minCups <= beansLevel/beans && cupsOfCoffee > minCups) {
            System.out.println("No, I can make only " + minCups + " cup(s) of coffee");
        }
        if(minCups2 < minCups && cupsOfCoffee < minCups2){
            System.out.println("No, I can make only " + (minCups2 - cupsOfCoffee) + " cup(s) of coffee");
        }
        if (minCups <= beansLevel / beans && cupsOfCoffee < minCups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (minCups - cupsOfCoffee) + " more than that)");
        }
        System.out.println(Math.pow(2,1));
        float f = (float) (20d + 20.02f);
        long n = 10 + 2L;
        byte b = (byte) (n + 5);

        long lo = Integer.MAX_VALUE; // (1)
        int i = (int) lo; // (2)
        char ch = (char) i; // (3)
        double d = ch; // (4)
        float fi = (float) d; // (5) */

      /*  String number = sc.next();

        switch (number) {
            case "one":
                System.out.println(1);
                break;
            case "two":
                System.out.println(2);
                break;
            case "three":
                System.out.println(3);
                break;
            case "four":
                System.out.println(4);
                break;
            case "five":
                System.out.println(5);
                break;
            case "six":
                System.out.println(6);
                break;
            case "seven":
                System.out.println(7);
                break;
            case "eight":
                System.out.println(8);
                break;
            case "nine":
                System.out.println(9);
                break;
            default:
                System.out.println("Wrong input");
        }
    } */

     /*   int firstNumber = sc.nextInt();
        String sign = sc.next();
        int secondNumber = sc.nextInt();

        switch (sign) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(firstNumber / secondNumber);
                }
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            default:
                System.out.println("Unknown operator");
        }
    } */

       /* int firstNumber = Integer.parseInt(sc.next());
        int secondNumber = Integer.parseInt(sc.next());
        int thirdNumber = Integer.parseInt(sc.next());
        boolean isPositive = true;
        if (firstNumber > 0 && secondNumber <= 0 && thirdNumber <= 0 || secondNumber > 0 && firstNumber <= 0 && thirdNumber <= 0
                || thirdNumber > 0 && secondNumber <= 0 && firstNumber <= 0) {
            System.out.println(isPositive);
            }else{
            System.out.println(!isPositive);
        }
    } */
       /* int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    } */
      /*  int number1 = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < number1; i++) {
            int var = sc.nextInt();
            if (var % 6 == 0) {
                System.out.println(var+= sum);
            }
        }*/

      /*  int howManyNumbers = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < howManyNumbers ; i++) {
            int userInput = sc.nextInt();
            if (userInput % 6 == 0) {
                sum = userInput + sum;
            }
        }
            System.out.println(sum);
        // put your code here
    } */

    
   /* int numbers = sc.nextInt();
    int max  =0;
        for (int i = 0; i < numbers && numbers < 1000; i++) {
           int userInput = sc.nextInt();
           if(userInput < 30000 && userInput % 4 == 0){
               max = userInput;
               }
            System.out.println(max);
            }*/


        /* for (int i = 0; i < 4; i++) {
          int  number = Integer.parseInt(sc.next());
            System.out.println(number);
        }

        } */

    /* int number = sc.nextInt();

    int smallest = 0;
    int largest = 0;
        for (int i = 0; i < number && i < 1000 ; i++) {
        int numbers = sc.nextInt();
        if(numbers < 30000 && numbers % 4 == 0){
            if(numbers > largest){
                largest = numbers;
            }else if(numbers < smallest){
                smallest = numbers;
            }
        }
    }
        System.out.println(largest); */
       /* int value;
        int largest = 0;
        int smalest = 0;
        do {
            value = sc.nextInt();
            if (value > largest) {
                largest = value;
            } else if (value < smalest) {
                smalest = value;
            }
        } while (value != 0);
                System.out.println(largest);
    } */
      /*  int input = sc.nextInt();
        System.out.print(input + " ");
        while (input != 1) {
            if (input % 2 == 0) {
                input = input / 2;
            } else {
                input = 3 * input + 1;
            }
                System.out.print(input + " ");

        } */
        /* long input = sc.nextLong();
        int sum = 1;
        int wynik = 1;

        while (sum <= input) {
            if(wynik > input){
                System.out.print(sum - 1);
                break;
            }
            wynik = sum * wynik;
            sum++;
        } */


        Scanner sc = new Scanner(System.in);

       /* long input = sc.nextLong();
        int sum = 1;
        int wynik = 1;
        do {
                wynik = sum * wynik;
                sum++;
        System.out.println(sum);
        }
            while (wynik < input) ;
            } */

     /*   long input = sc.nextLong();
        long sum = 1;
        long wynik = 1;

        while (wynik <= input) {
            wynik = sum * wynik;
            sum++;
        }
        System.out.println(sum - 1);
    } */

        /* int n = 10;
        for (int i = 0; i < n; i++) {
            if (i * i < 36) {
                continue;
            }
            System.out.print(i + " ");
        } */

       /* int input = Integer.parseInt(sc.next());

        while (input == input) {
            if (input == 0) {
                break;
            } else if (input % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
            input = sc.nextInt();
        }
    } */

     /*   int highOfBus = sc.nextInt();
        int numberOfBridges = sc.nextInt();


        for (int i = 0; i < numberOfBridges; i++) {
            int highOfBridges = sc.nextInt();
            if (highOfBus >= highOfBridges) {
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            }
            if (numberOfBridges == i + 1 && highOfBus <= highOfBridges) {
                System.out.println("Will not crash");

            }
        }
    }*/
      /*  int input = sc.nextInt();
        int count = 0;

        for (int i = 0; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                if (count < input) {
                    System.out.print(i + " ");
                    count++;

                }
            }
        } */
        int firstClass = sc.nextInt();
        int secondClass = sc.nextInt();
        int thirdClass = sc.nextInt();
        int firstClassTable = firstClass / 2;
        int secondClassTable = secondClass / 2;
        int thirdClassTable = thirdClass / 2;
        int firstModulo = firstClass % 2;
        int secondModulo = secondClass % 2;
        int thirdModulo = thirdClass % 2;


        if (firstClass > 0 && firstClass <= 1000 && secondClass > 0 && secondClass <= 1000 && thirdClass > 0 && secondClass <= 1000) {
            System.out.println(firstClassTable + firstModulo + secondClassTable + secondModulo + thirdClassTable + thirdModulo);

        }

    }
    // put your code here
}














     /*  do {
            if (wynik > input) {
            System.out.print(sum);
            }
                wynik = sum * wynik;
                sum++;
        }
            while (sum <= input) ;
        } */















