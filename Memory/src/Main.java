import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer value[] = new Integer[]{3,4};
        changeValue(value);
        System.out.println(Arrays.toString(value));

    }
    private static void changeValue(Integer[] value)
    {
        value [0]= 99;
    }
}