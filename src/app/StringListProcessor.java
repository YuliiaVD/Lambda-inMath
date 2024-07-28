package app;

public class StringListProcessor {

    static int countUppercase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
        if (Character.isUpperCase(str.charAt(i)))
            count++;
        } return  count;
    }
}
