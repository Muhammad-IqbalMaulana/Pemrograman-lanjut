package SourceCodeSoloLearn.ClassesAndObjects;

 import java.util.Scanner;

// your code goes here

class BinaryConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(conve.toBinary(x));
    }
}

class conve {
    public static String toBinary(int num) {
        String binary = "";
        while(num > 0) {
            binary = (num % 2) + binary; num /= 2; }
        return binary;
    }
}
