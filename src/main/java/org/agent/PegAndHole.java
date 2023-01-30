package org.agent;

public class PegAndHole {
    public static void main(String[] args) {
        int arr[] = new int[11];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 1;
        arr[5] = 0;
        arr[6] = 2;
        arr[7] = 2;
        arr[8] = 2;
        arr[9] = 2;
        arr[10] = 2;
        int h = 5;

        while (isNotTheGoalState(arr)) {
            int x = findBestX(arr, h);
            move(arr, x, h);
            h = x;
        }


    }

    private static int findBestX(int[] arr, int h) {
    }

    private static void move(int[] arr, int x, int y) {
       arr[y] = arr[x];
       arr[x] = 0;
    }

    private static boolean isNotTheGoalState(int[] arr) {
        return arr[0] != 2 || arr[1] != 2 || arr[2] != 2 || arr[3] != 2 || arr[4] != 2;
    }
}