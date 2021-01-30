package by.adukar.tasks;

public class Task3 {

    //Найти сумму элемента с индексом размера массива и второго с конца элемента
    public static void main(String[] args) {
        int one = 0;
        int two = 0;
        int three = 0;

        int[] myList = new int[]{1, 2, 3, 4, 5, 6};

        one = myList.length;
        two = myList.length - 2;
        three = myList[two];

        System.out.println(one + three);
    }
}
