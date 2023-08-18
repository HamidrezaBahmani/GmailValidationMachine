package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int [][] matrix = new int [3][2];

        String letterAray[];






        matrix[0][0] =0;
        matrix[0][1] =1;
        matrix[1][0] =2;
        matrix[1][1] =0;
        matrix[2][0] =1;
        matrix[2][1] =2;
        while (true) {
            String Accepted ="false";
            int currentState=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter input string to check in machin");
            String inputstring=sc.nextLine();
            letterAray=inputstring.split("");



            for (int i = 0; i < letterAray.length; i++) {
                if ( letterAray[i].equals("0")) {  if (currentState == 0 && i == letterAray.length - 1) {

                    Accepted = "true";
                    break;
                }
                    currentState = matrix[currentState][0];
                } else if (letterAray[i].equals("1")) {
                    if (currentState == 1 && i == letterAray.length - 1) {

                        Accepted = "true";
                        break;
                    }

                    currentState = matrix[currentState][1];
                }
               else if (!letterAray[i].equals(" ")) {

                    Accepted = "Invalid";
                    break;
                }


            }
            if (Accepted.equals("true")) {
                System.out.println("String is accepted");
            } else if (Accepted.equals("false")) {
                System.out.println("String is not accepted");
            } else {
                System.out.println("String Contains Invalid character(s)");
            }
        }
    }
}
