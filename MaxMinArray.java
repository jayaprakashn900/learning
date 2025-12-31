public class minmax {
    public static void main(String[] args) {
        int[] arr = {10, 50, 5, 80, 20};
        int min = arr[0], max = arr[0];
        for(int i : arr) {
            if(i < min) min = i;
            if(i > max) max = i;
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }
}
