package java8Feature;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Sort2DMatrix {
    public static void main(String[] args) {
        int[] start = {0,1,3,5,5,8};
        int[] end = {6,2,4,7,9,9};
        int[][] activities = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        System.out.println("Before sorting");
        for(int i=0;i<start.length;i++){
            System.out.println(activities[i][0]+" "+activities[i][1]+" "+activities[i][2]);
        }
        //lambda expression
        Arrays.sort(activities,(a,b)->(a[2]-b[2])); //
        Arrays.sort(activities, Comparator.comparing(o->o[2])); //another variation

        System.out.println("After sorting");
        for(int i=0;i<start.length;i++){
            System.out.println(activities[i][0]+" "+activities[i][1]+" "+activities[i][2]);
        }

    }
}
