public class Main {

    public static void reverseArray(int[] numbers, int start, int end){

        while(start < end) {
            int temp =  numbers[start];
           numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] numbers = {8, 11, 5, 10, 7, 2};
        printArray(numbers);

        reverseArray(numbers, 0, numbers.length - 1);
        
        printArray(numbers);
    }
}