package org.example;

public class Main {
    public static void main(String[] args) {
        StringOperations so = new StringOperations();

        so.concat("ala ma kota", "kot ma ale");
        so.reverse("A B C D E F G H I J K L M N O P Q R S T V X Y Z");
        String str = "RacE fast safe car";
        if (so.isPalindrome(str))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }

}

