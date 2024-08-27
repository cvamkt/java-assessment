public class dbl {
    

    public int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public int add(int n1, int n2, int n3) {
        int result = n1 + n2 + n3;
        return result;
    }

    public double add(double n1, double n2, double n3){
        double result = n1 + n2+ n3;
        return result;
    }


    public static void main(String[] args) {
        dbl obj = new dbl();
       int result =  obj.add(7,8);
       int res1 = (int) obj.add(8,9,9);
       System.out.println(result);
       System.out.println(res1);

       double res2 = obj.add(8.8,8.8,8.8);
       System.out.println(res2);

    }
}

