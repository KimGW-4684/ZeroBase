// 김가원

import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        int i;
        int vote;
        float user1  = 0;
        float user2  = 0;
        float user3  = 0;
        float user4  = 0;
        String name = "";
        Random random = new Random();

        for (i = 1; i <= 10000 ; i++) {
            vote = random.nextInt(4);
            if (vote == 0){
                user1 += 1;
                name = "이재명";
            } else if (vote == 1) {
                user2 += 1;
                name = "윤석열";
            } else if (vote == 2) {
                user3 += 1;
                name = "심상정";
            } else if (vote == 3) {
                user4 += 1;
                name = "안철수";
            }
            System.out.printf("[투표진행율] : %.2f", ((float) i / 10000 * 100));
            System.out.println("%, " + i + "명 투표 => " + name);
            System.out.printf("[기호:1] 이재명 : %.2f", user1 / 100);
            System.out.println("%, (투표수 : " + (int)user1 + ")");
            System.out.printf("[기호:2] 윤석열 : %.2f", user2 / 100);
            System.out.println("%, (투표수 : " + (int)user2 + ")");
            System.out.printf("[기호:3] 심상정 : %.2f", user3 / 100);
            System.out.println("%, (투표수 : " + (int)user3 + ")");
            System.out.printf("[기호:4] 안철수 : %.2f", user4 / 100);
            System.out.println("%, (투표수 : " + (int)user4 + ")");
            System.out.println();
            System.out.println();

            Map<String, Float> map = new HashMap<>();
            map.put("이재명", user1);
            map.put("윤석열", user2);
            map.put("심상정", user3);
            map.put("안철수", user4);

            
        }
    }
}
