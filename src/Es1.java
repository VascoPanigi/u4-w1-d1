import java.util.Arrays;


public class Es1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        System.out.println(sum(2,3));
        System.out.println(numStrConcat("hello number ", 23));


        String[] testArray = {"hello", "how", "are", "doing", "belandi"};
        String testStr = "you";

        System.out.println((Arrays.toString(insertInArray( testArray, testStr))));

    }

    public static int sum(int num1, int num2){
        return num1+num2;
    }

    public static String numStrConcat(String value1,  int value2){
        System.out.println(value1 + value2);
        System.out.println(value1.concat(String.valueOf(value2)));
        return "operation completed";
    }

    public static String[] insertInArray(String[] startingArr, String strToInsert){
        String[] newArray = new String[6];
        System.arraycopy(startingArr, 0, newArray, 0,3);
        newArray[3] = strToInsert;


        System.arraycopy(startingArr, 3, newArray, 4, 2);


        return newArray;

    }
}
