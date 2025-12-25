package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Reverse {

    public static String reverseWord(String str) {
        StringBuilder sb = new StringBuilder(str);
        return String.valueOf(sb.reverse());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(read.readLine());
        while (num-- > 0)
            System.out.println(reverseWord(read.readLine()));
    }
}