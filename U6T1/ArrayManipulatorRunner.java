public class ArrayManipulatorRunner {
    public static void main(String[] args) {
        int[] even = {1, 2, 3, 4, 5, 6};
        ArrayManipulator.reverseInPlace(even);
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
        int[] odd = {1, 2, 3, 4, 5, 6, 7};
        ArrayManipulator.reverseInPlace(odd);
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
        int[] even2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        ArrayManipulator.reverseInPlace(even2);
        for (int i = 0; i < even2.length; i++) {
            System.out.print(even2[i] + " ");
        }
        System.out.println();
        int[] odd2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        ArrayManipulator.reverseInPlace(odd2);
        for (int i = 0; i < odd2.length; i++) {
            System.out.print(odd2[i] + " ");
        }
        System.out.println();
    }
}
