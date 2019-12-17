package interpolationsearch;

public class InterpolationSearch {

    public static void main(String[] args) {
        int[] array = {10, 13, 19, 20, 24, 26, 30, 34, 35, 56, 57, 60, 61};
        int index = interpolation_Search(array, 35);
        System.out.println("index="+index);
    }

    public static int interpolation_Search(int a[], int key) {
        int low = 0;//, high = (n - 1);
        int high = a.length-1;
        while (low <= high && key >= a[low] && key <= a[high]) {
            if (low == high) {
                if (a[high] == key) {
                    return high;
                } else {
                    return -1;
                }
            }
            int position = low + (((high - low) / (a[high] - a[low])) * (key - a[low]));
            if (a[position] == key) {
                return position;
            } else if (a[position] < key) {
                low = position + 1;
            } else if (a[position] > key) {
                high = position - 1;
            }
        }
        return -1;
    }

}
