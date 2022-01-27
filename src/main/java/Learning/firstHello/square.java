package Learning.firstHello;

public class square {


    public static void main(String[] a){

        //Create two objects of Square class 's1' and 's2'
            Squared s1 = new Squared();
            Squared s2 = new Squared();
        //Calculate and print their areas after assigning values to their side lengths

                s1.length = 10f;
                s2.length = 20f;
        System.out.println("Area of the Square 1 is " + s1.area());
        System.out.println("Area of the Square 2 is " + s2.area());

    }
}

class Squared{
    public float length;
    public float area(){
        return length * length;
    }

}
