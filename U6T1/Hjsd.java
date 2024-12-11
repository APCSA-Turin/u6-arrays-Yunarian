public class Hjsd {

    public static void main(String[] args) {
        // problem 1
        int[] heights = new int[3];
        System.out.println(heights[0] + " " + heights[1] + " " + heights[2] );
        heights[0] = 78;
        heights[1] = 72;
        heights[2] = 69;
        System.out.println(heights[0] + " " + heights[1] + " " + heights[2] );

        // problem 2
        boolean[] bools = {true, false, true, false, true, false};
        bools[0] = bools[3];
        System.out.println(bools.length);
        System.out.println(bools[0] + " " + bools[5]);

        // problem 3
        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};
        String temp = alphabeticalNames[1];
        alphabeticalNames[1] = alphabeticalNames[2];
        alphabeticalNames[2] = temp;
        System.out.println(alphabeticalNames[0] + " " + alphabeticalNames[1] + " " + alphabeticalNames[2] + " " + alphabeticalNames[3]);

        // problem 4
        double[] array1 = {7.5, 10.0};
        double[] array2 = {8.2, 14.8};
        double[] array3 = {array1[0] + array2[0], array1[1] * array2[1]};
        System.out.println(array3[0] + " " + array3[1]);

        // problem 5
        String[] animals = new String[4];
        System.out.println(animals[0] + " " + animals[1] + " " + animals[2] + " " + animals[3]);
        animals[0] = "dog";
        animals[1] = "camel";
        animals[2] = "aardvark";
        animals[3] = "bunny";
        System.out.println(animals[0] + " " + animals[1] + " " + animals[2] + " " + animals[3]);
        animals[2] += "s";
        System.out.println(animals[2]);
        System.out.println(animals.length);
        System.out.println(animals[2].length());
    }
}