package Range_2438;

import java.util.Arrays;

public class ZigzagConversation {
    public static void main(String[] args) {
        ZigzagConversation zigzagConversation = new ZigzagConversation();
        System.out.println(zigzagConversation.convert("PAYPALISHIRING", 3));
    }
    public String convert(String s, int numRows) {
        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        for (int i = 0; i < stringBuilders.length; i++) {
            stringBuilders[i] = new StringBuilder();
        }
        int counter = 0;
        boolean isVertical = true;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder stringBuilder = stringBuilders[counter];
            stringBuilder.append(s.charAt(i));
            if(isVertical) {
                counter++;
                if(counter == numRows - 1) {
                    isVertical = false;
                }
            }else {
                counter--;
                if(counter == 0) {
                    isVertical = true;
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for (StringBuilder stringBuilder : stringBuilders) {
            builder.append(stringBuilder.toString());
        }
        return builder.toString();
    }
}
