package com.intuit.v4.workforcewfmgmt.widslocationapp.common.offlineticket;

/*
 * Enter your code here. Read input from STDIN. Print your output to STDOUT.
 * Your class should be named CandidateCode.
 * Score = 100/100
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubSequence {
    private static String VIRUS;

    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            VIRUS = br.readLine();
            int test_count = Integer.parseInt(br.readLine());
            String [] bloodSamples = new String[test_count];
            for(int index = 0; index < test_count; index++){
                bloodSamples[index] = br.readLine();
            }
            handleTests(bloodSamples);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }

        handleTests(args);

    }

    private static void handleTests(String[] bloodSamples) {
        int test_count = bloodSamples.length;

        for(int index = 0; index < test_count; index++){
            handleTest(bloodSamples[index]);
        }
    }

    private static void handleTest(String blood) {
        String output = (isSubsequence(blood, VIRUS)) ? "POSITIVE" : "NEGATIVE";
        System.out.println(output);
    }

    private static boolean isSubsequence(String str1, String str2) {
        //If first string is longer than second return false
        if(str1.length() > str2.length())
            return false;

        //If str1 is present as is within str2 return true
        if(str2.contains(str1))
            return true;

        char firstLetter = str1.charAt(0);
        int firstLetterIndex = str2.indexOf(firstLetter);
        if (firstLetterIndex >= 0){
            return isSubsequence(str1.substring(1), str2.substring(firstLetterIndex, str2.length()));
        }else{
            return false;
        }
    }
}
