import java.util.InputMismatchException;
import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        System.out.println("은서마켓에 온 것을 환영합니다 ~~!");
        Scanner scanner = new Scanner(System.in);
        String goods[] = new String[5];
        int price[] = new int[5];
        int index = 1;
        boolean onOFF = true;
        int menu = 4;
        goods[0] ="삼다수";
        price[0] = 500;

        while(onOFF) {
            try {
                menu = 0;
                System.out.println("\n1 . 상품등록 / 2. 상품조회 / 3. 결제 / 4.사용종료");
                System.out.print("메뉴를 선택하세요. >> ");
                menu = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("숫자만 입력해주세요.");
                scanner.next();
            }

            switch (menu) {
                case 1:
                    if(index >= 5){
                        System.out.println("등록 칸이 다 찼습니다.");
                        continue;}
                    else {
                        System.out.print("상품을 등록해주세요>>");
                        goods[index] = scanner.next();
                        System.out.print(goods[index] + "원가를 입력해주세요 >>");
                        price[index] = scanner.nextInt();
                        index++;
                    }
                    break;
                case 2:
                    for(int i = 0; i<index; i++){ // index price.
                        System.out.println("상품 ID: " + i  + "|" + goods[i] + "의 원가는 " + price[i] + "원 입니다.");
                    }
                    break;
                case 3:
                    System.out.println("상품ID를 입력해주세요");
                    int select = scanner.nextInt();
                    if(select >= index) {
                        System.out.println("해당하신 물품은 존재하지 않습니다.");
                        break;
                    }
                    else{
                        System.out.print("할인율을 입력해주세요.");
                        float discount = scanner.nextFloat();
                        int dprice = (int)(price[select]*(100-discount)/100);
                        System.out.println(goods[select] + "의 가격은 " + dprice + "원 입니다.");
                    }

                case 4:
                    onOFF = false;
                    break;
            }
        }

        System.out.println("이용해주셔서 감사합니다.");
        scanner.close();
    }
}
