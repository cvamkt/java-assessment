public class compare {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        String str3 = "hello";
        
        // we can compare string in java using ".equal" and "==" but diff is .equal compare the content inside the variable and "==" compare the refrence

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1==str3);
    }
}
