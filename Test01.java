//김가원

public class Test01 {
        public static void main(String[] args) {
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    System.out.print(String.format("%02d x %02d = %02d", i, j, i * j));
                    System.out.println(  );
                }
                System.out.println();
            }
        }
    }
