package com.intuit.v4.workforcewfmgmt.widslocationapp.common.offlineticket;

import java.io.*;

/*
 * Score 100
 */
public class PrimeRange {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int test_count = Integer.parseInt(br.readLine());
            int [][] numbers = new int [test_count][2];
            String input;
            for(int index = 0; index < test_count; index++){
                input = br.readLine();
                String inputs[] = input.split(" ");
                int range[] = new int[2];
                range[0] = Integer.parseInt(inputs[0]);
                range[1] = Integer.parseInt(inputs[1]);
                numbers[index] = range;
            }
            handleTests(numbers);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    private static void handleTests(int[][] numbers) {
        int test_count = numbers.length;

        for(int index = 0; index < test_count; index++){
            handleTest(numbers[index]);
        }
    }

    private static void handleTest(int [] numbers) {
        int firstNumber = numbers[0];
        int secondNumber = numbers[1];

        int output = -1;
        if(firstNumber == secondNumber){
            output = 0;
        }else {
            //Check if firstNumber is prime
            boolean isPrime = isPrime(firstNumber);
            while(!isPrime && firstNumber < secondNumber){
                firstNumber++;
                isPrime = isPrime(firstNumber);
            }

            //If flag is false, no primes were found in the range.
            if (!isPrime) {
                output = -1;
            } else if (firstNumber == secondNumber) {
                output = 0;
            } else {
                isPrime = isPrime(secondNumber);

                while(!isPrime && secondNumber > firstNumber){
                    secondNumber--;
                    isPrime = isPrime(secondNumber);
                }

                output = secondNumber - firstNumber;
            }
        }
        System.out.println(output);
    }

    public static void main2(String[] args) {
        for (int i =2; i < 21; i++){
            System.out.println(i + ":" + isPrime(i));
        }
    }

    private static boolean isPrime(int number){
        if(number == 2)
            return true;
        else{
            for(int divisor = 2; divisor <= number/divisor; divisor++){
                if(number % divisor == 0)
                    return false;
            }
            return true;
        }
    }

}
