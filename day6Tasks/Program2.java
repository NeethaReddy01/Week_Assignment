package day6Tasks;
public class Program2 {
    public static void main(String[] args) {
        int[] array = {4, 8, 6, 1, 9, 4};
        int numOfElements = array.length;
        int index = findMaxDistance(array, numOfElements);
        System.out.println(index);
    }

    public static int findMaxDistance(int[] array, int numOfElements) {
        int maxDifference = 0;
        int index = 0;

        for (int i = 0; i < numOfElements - 1; i++) {
            int difference = Math.abs(array[i] - array[i + 1]);
            if (difference > maxDifference) {
                maxDifference = difference;
                index = array[i] > array[i + 1] ? i : i + 1;
            }
        }

        return index;
    }
}

