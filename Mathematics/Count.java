package Mathematics;

public class Count {

    public static int count(){


        int i = 234;
        int k = 0;

        while(i > 0){

            i = i/10;
            k++;

        }
        return k;
    }

    public static void main(String[] args){

        int k = count();
        System.out.println("Count of number 234 is"+ k );
        System.out.println("Hello");
    }


}
