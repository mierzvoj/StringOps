package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringOperations {

    public String reverse(String a) {
        List<String> tempArray = new ArrayList<String>(a.length());
        for (int i = 0; i < a.length(); i++) {
            tempArray.add(a.substring(i, i + 1));
        }
        StringBuilder reversedString = new StringBuilder(a.length());
        for (int i = tempArray.size() - 1; i >= 0; i--) {
            reversedString.append(tempArray.get(i));
        }
        System.out.println(reversedString);
        return reversedString.toString();
    }

    public String concat(String a, String b) {
        String retVal = null;
        if (a != null && a.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            if (b != null) {
                sb.append(b);
            }
            retVal = sb.toString();
            System.out.println(retVal);
        }

        return retVal;
    }

    public boolean isPalindrome(String a) {
        String str = a.toLowerCase().replaceAll("\\s+", "");
        if (str.length() <= 1) {
            return true;
        }
        if (!(str.charAt(0)+"").equals(str.charAt(str.length() - 1)+""))
            return false;
        else
            return isPalindrome(str.substring(1, str.length() - 1));

    }


}

