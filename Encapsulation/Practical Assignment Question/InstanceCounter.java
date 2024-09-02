//1.Create a class that keeps track of the number of instances created. Implement a static 
//variable and method to accomplish this. 


public class InstanceCounter {


    private static  int counter = 0;

    InstanceCounter(){
        counter ++;
    }

    public static int getInstanceCounter(){
        return counter;
    }

    public static void main(String[] args) {
        InstanceCounter i1 = new InstanceCounter();
        InstanceCounter i2 = new InstanceCounter();
        InstanceCounter i3 = new InstanceCounter();
        System.out.println("cureent number is "+InstanceCounter.getInstanceCounter());

    }
    
}
