package by.adukar.tasks;

public class Task2 {
    //Среднее арифметическое положительных элементов массива

    public static void main(String[] args) {
        int arr[] = new int[] {1,1,1,1,1,1,-3,1};
        int amount = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i]>0){
                amount++;
                sum=sum+arr[i];
            }
        }
        System.out.println(sum/amount + " " +  amount);
    }
}
