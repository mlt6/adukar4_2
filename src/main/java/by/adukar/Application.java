package by.adukar;

public class Application {
    public static void main(String[] args) {
        //System.out.println("Hello world");

        int num = 2;
        int s = 2;

        int[] myNumbers = new int[10];
        for(int i=0;i<=9;i++){
            myNumbers[i] = s * num ;
            s = s * 2;
        }
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.print(myNumbers[i] + " ");
        }
    }




}
