// 김가원

import java.time.LocalDate;
import java.util.Scanner;

public class Test05 {

    public static void main(String[] args) {
        int year;
        int month;
        int lastday;

        Scanner sc = new Scanner(System.in);
        System.out.println("[달력 출력 프로그램]");
        System.out.println("달력의 년도를 입력해 주세요. (yyyy) : ");
        year = sc.nextInt();
        System.out.println("달력의 월을 입력해 주세요. (mm) : ");
        month = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);
        lastday = date.lengthOfMonth();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.printf("[%d년 %02d월]", year, month);
        System.out.println();
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        int empty = date.atStartOfDay().getDayOfWeek().getValue();
        if(empty < 7){
            for (int i = 1; i <= empty ; i++) {
                System.out.print("\t");
            }
        }

        String week;

        for (int j = 1; j <= lastday; j++) {
        date =  LocalDate.of(year, month, j);
        week = String.valueOf(date.getDayOfWeek());
        if(week.equals("SATURDAY")) {
            System.out.printf("%02d\n", j);
        } else {
            System.out.printf("%02d\t", j);
        }

        }
    }

}
