//김가원

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("[캐시백 계산]");
        Scanner sc = new Scanner(System.in);
        int price;
        System.out.println("결제 금액을 입력해주세요.(금액) : ");
        price = sc.nextInt();

        float cashback_ri = (float)0.1;
        float cashback = (float) (Math.floor((price * cashback_ri)/100)*100);
        

        if (price < 3000){

         System.out.println("결제 금액은 " + price + "원 이고, 캐시백은 " + cashback + " 원 입니다.");

        } else {
            System.out.println("결제 금액은" + price + "원 이고, 캐시백은 300원 입니다.");

        }
        
    }
}
