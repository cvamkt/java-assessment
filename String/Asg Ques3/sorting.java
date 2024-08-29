import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String str = "SHIVAM";
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sortedstr = new String(charArray);
        System.out.println(sortedstr);
    }
}
