import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner scan = new Scanner(new File("/Users/tristandesoto/Documents/GitHub/Advent-Of-Code-2023/Untitled/Day 1/Codes.txt"));
        int total = 0;
        while(scan.hasNextLine()){
            String current = scan.nextLine();
            int currentNum = firstAndLastNum(current);
            System.out.println(current + " " + currentNum);
            total += currentNum;
        }
        System.out.println(total);
        scan.close();
        
    }

    private static int firstAndLastNum(String input){
        int left = 0;
        int right = input.length() - 1;
        while(!Character.isDigit(input.charAt(left))){
            left++;
        }
        while(!Character.isDigit(input.charAt(right))){
            right--;
        }
        return Integer.parseInt("" + input.charAt(left) + input.charAt(right));
    }
}