package Jam2016.QualificationRound.RevengeOfPancakes;

import com.sun.deploy.util.StringUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FlipPancakes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int caseNo = 1;
        String totalInput = scanner.nextLine();

        while (scanner.hasNextLine()) {
            System.out.println(String.format("Case #%d: %d", caseNo, FindOptimalFlips(scanner.nextLine())));
            caseNo++;
        }
    }

    private static int FindOptimalFlips(String s) {
        int result = countSubstring("+-", s) + countSubstring("-+", s)+ 1;

        if (s.charAt(s.length()-1) == '-'){
            return result;
        }else
            return result-1;
    }

    private static int countSubstring(String subStr, String str){
        return (str.length() - str.replace(subStr, "").length()) / subStr.length();
    }
}
