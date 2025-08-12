package Range_2438;

import java.util.HashMap;
import java.util.Map;

public class LC12_DecimalToRoman {
    public static void main(String[] args) {
        LC12_DecimalToRoman decimalToRoman = new LC12_DecimalToRoman();
        System.out.println(decimalToRoman.intToRoman(58));
    }
    public String intToRoman(int num) {

        StringBuilder builder = new StringBuilder();
        if(num >= 1000) {
            append(num / 1000, builder, 1000);
            num = num % 1000;
        }
        if(num >= 100) {
            append(num / 100, builder, 100);
            num = num % 100;
        }
        if(num >= 10) {
            append(num / 10, builder, 10);
            num = num % 10;
        }
        if(num > 0) {
            append(num, builder, 0);
        }
        return builder.toString();
    }
    private void append(int num, StringBuilder builder, int range) {
        if(range == 1000) {
            for (int i = 0; i < num; i++) {
                builder.append('M');
            }
        }else if(range == 100) {
            if(num == 9) {
                builder.append("CM");
            } else if (num == 5) {
                builder.append('D');
            } else if(num > 5) {
                builder.append('D');
                for (int i = 5; i < num; i++) {
                    builder.append('C');
                }
            }else if(num == 4) {
                builder.append("CD");
            } else {
                for (int i = 0; i < num; i++) {
                    builder.append('C');
                }
            }
        }else if(range == 10) {
            if(num == 9) {
                builder.append("XC");
            } else if(num == 5) {
                builder.append('L');
            }
            else if(num > 5) {
                builder.append('L');
                for (int i = 5; i < num; i++) {
                    builder.append('X');
                }
            }else if(num == 4) {
                builder.append("XL");
            } else {
                for (int i = 0; i < num; i++) {
                    builder.append('X');
                }
            }
        } else {
            if(num == 9) {
                builder.append("IX");
            }else if(num == 5) {
                builder.append('L');
            }
            else if(num > 5) {
                builder.append('V');
                for (int i = 5; i < num; i++) {
                    builder.append('I');
                }
            }else if(num == 4) {
                builder.append("IV");
            } else {
                for (int i = 0; i < num; i++) {
                    builder.append('I');
                }
            }
        }

    }

    public int romanToInt(String s) {
        String[] array = { "M", "D", "C", "L" , "X" , "V", "I" };
        String[] numArray = {
                "1000" , "9" , "8", "7", "6" ,"5" , "4" , "3" ,"2" , "1", "9" , "8", "7", "6" ,"5" , "4" , "3" ,"2" , "1", "9" , "8", "7", "6" ,"5" , "4" , "3" ,"2" , "1"
        };
        StringBuilder builder = new StringBuilder();
        while (!s.isEmpty()) {
            int counter = 0;
            while (s.startsWith("M")) {
                counter++;
                s = s.substring(1);
            }
            builder.append(counter);
            if(s.startsWith("CM")) {
                builder.append("9");
                s = s.substring(2);
            }

        }
    }
}
