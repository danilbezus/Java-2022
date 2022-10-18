public class Lab1 {

    public static void main(String[] args) {
          /*
        0302
        C2 = 0 -> "+"
        C3 = 2 -> C = 2
        C5 = 2 -> "%"
        C7 = 1 -> "short"
        */

        final int C = 2;
        short a, b, m, n;
        a = 1;
        b = 1;
        m = 10;
        n = 10;
        double S = 0; //результат

        if(a <= -C && n >= -C) {
            System.out.println("Ділення на нуль");
        } else {
            for (int i = a; i <= n; i++) {
                for (int j = b; j <=m; j++) {
                    S += (double)(i % j) / (i + C);
                }
            }
        }
        System.out.println(S);
    }
}
