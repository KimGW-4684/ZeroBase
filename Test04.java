// 김가원

import java.util.Random;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

        System.out.println("[주민등록번호 계산]");
        Scanner sc = new Scanner(System.in);
        System.out.println("출생년도를 입력해 주세요. (yyyy) : ");
        int year = sc.nextInt();
        System.out.println("출생월를 입력해 주세요. (mm) : ");
        int month = sc.nextInt();
        System.out.println("출생일를 입력해 주세요. (dd) : ");
        int date = sc.nextInt();
        System.out.println("성별를 입력해 주세요. (m/f) : ");
        char sex = sc.next().charAt(0);

        String sexNumber = null;
        if (sex == 'm'){
            sexNumber = (String)"3";
        } else if (sex == 'f') {
            sexNumber = (String)"4";
        }

        Random random = new Random();
        String randomNumber = "";

        for (int i = 0; i < 6; i++) {
            randomNumber = randomNumber + random.nextInt(9);
        }

        String number = String.format("%d%02d%02d", year,month,date).substring(2);
        System.out.println(number + "-" + sexNumber + randomNumber);
    }


}
