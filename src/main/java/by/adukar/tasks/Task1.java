package by.adukar.tasks;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5};

        int summ = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2 == 0 && arr[i] > 0) {
                summ += arr[i];
            }
        }
        System.out.println(summ);
    }
}
