import java.util.Arrays;

public class retangle {
    public static void main(String[] args) {
        int[][] v = { { 1, 4 }, { 3, 4 }, { 3, 10 } };
        int[] answer = new int[2];

        if (v[0][0] == v[1][0]) {
            answer[0] = v[2][0];
        } else if (v[0][0] == v[2][0]) {
            answer[0] = v[1][0];
        } else if (v[1][0] == v[2][0]) {
            answer[0] = v[0][0];
        }
        if (v[0][1] == v[1][1]) {
            answer[1] = v[2][1];
        } else if (v[0][1] == v[2][1]) {
            answer[1] = v[1][1];
        } else if (v[1][1] == v[2][1]) {
            answer[1] = v[0][1];
        }
        System.out.println(Arrays.toString(answer));

    }

}