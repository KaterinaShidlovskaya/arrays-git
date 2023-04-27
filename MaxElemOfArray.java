public class MaxElemOfArray {
    public static void main(String[] args) {
        int[] array = {1, -10, 5, 8, 9, 10, 0, 9, -3};
        int max = array[0];
        int min = array[0];
        for(int i = 1; i< array.length; i++){
            if(max<array[i])
                max=array[i];
            if(min>array[i])
                min=array[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}
