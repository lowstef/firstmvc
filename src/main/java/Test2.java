/**
 * @author lowstef
 * @create 2018/8/9
 * @since 1.0.0
 */

public class Test2 {
    public static void main(String[] args) {
        String[][] a = new String[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                a[i][j] = (i+1) +"*"+(j+1)+"="+((i+1)*(j+1));
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();

        }






    }






}
