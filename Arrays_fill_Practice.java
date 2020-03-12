// Arrays.fill() 사용하기 //

// https://zetawiki.com/wiki/%EC%9E%90%EB%B0%94_Arrays.fill() //

/* 기본 채우기 
import java.util.Arrays;
public class MyClass {
    public static void main(String args[]) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        Arrays.fill(arr, 100);
        System.out.println( Arrays.toString(arr) );
        // [100, 100, 100, 100, 100]
    }
}
*/

/* 구간 지정하여 채우기
import java.util.Arrays;
public class MyClass {
    public static void main(String args[]) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
     ★★   Arrays.fill(arr, 2, 4, 100);  -> 2<= index < 4 라는 뜻 
        System.out.println( Arrays.toString(arr) );
        // [1, 2, 100, 100, 5]
    }
}
*/

/* 2차원 배열 채우기
import java.util.Arrays;
public class MyClass {
    public static void main(String args[]) {
        int[][] arr = new int[3][5];
        for(int[] row: arr) {
            Arrays.fill(row, 10);
        }
        for(int[] row: arr) {
            System.out.println( Arrays.toString(row) );
        }
        // [10, 10, 10, 10, 10]
        // [10, 10, 10, 10, 10]
        // [10, 10, 10, 10, 10]
    }
}
*/

/* 3차원 배열 채우기
import java.util.Arrays;
public class MyClass {
    public static void main(String args[]) {
        int[][][] arr = new int[3][5][2];
        for(int[][] row2: arr) {
            for(int[] row: row2) {
                Arrays.fill(row, 10);
            }
        }
        for(int[][] row2: arr) {
            for(int[] row: row2) {
                System.out.print( Arrays.toString(row) );
            }
            System.out.println();
        }
        // [10, 10][10, 10][10, 10][10, 10][10, 10]
        // [10, 10][10, 10][10, 10][10, 10][10, 10]
        // [10, 10][10, 10][10, 10][10, 10][10, 10]
    }
}
*/