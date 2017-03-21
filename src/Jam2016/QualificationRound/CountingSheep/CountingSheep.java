package Jam2016.QualificationRound.CountingSheep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountingSheep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalInput = scanner.nextInt();
        int caseNo = 1;
        while (scanner.hasNextLine()) {
            int value = scanner.nextInt();
            if (value == 0) System.out.println(String.format("Case #%d: INSOMNIA", caseNo));
            else System.out.println(String.format("Case #%d: %d", caseNo, FindNCount(value)));
            caseNo++;
        }

    }

    private static int FindNCount(int value) {
        ArrayList<Integer> remainingNumbers = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        int count = 1;
        int baseValue = value;
        while (!remainingNumbers.isEmpty()) {
            int tempValue = value;
            while (tempValue > 0) {
                int lastDigit = tempValue % 10;
                remainingNumbers.remove(new Integer(lastDigit));
                tempValue /= 10;
            }
            count++;
            value = count * baseValue;
        }
        return baseValue * (count - 1);
    }

}
