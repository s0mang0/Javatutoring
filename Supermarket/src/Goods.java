public class Goods {
    public static int index = 0;
    public int id;
    private String name;
    public String pDate;
    public int price;
    public float discount;

    Goods() {
        this(0, "비어있음", "0000/00/00", 0 ,0);
    }

    Goods(int id , String name, int price){

        this(id, name, "0000/00/00", price,0);
    }

    Goods(int id, String name, String pDate, int price, float discount) {
      this.id = id;
      this.name = name;
      this.pDate = pDate;
      this.price = price;
      this.discount = discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void inform(){
        System.out.println("상품번호: " + this.id + " | 상품명: " + name + " | 가격: " + price);
        System.out.println("생산일자: " + pDate + "| 할인율 : " + discount);
        System.out.println("--------------------------------------------------");
    }

    public int discountPrice() {

        return (int) (price - price * (discount / 100));
    }
}



//상속
class FreshFood extends Goods{
    public String eDate;
    FreshFood(){
        super();
        this.eDate = "0000/00/00";
    }
    FreshFood(int id, String name, String pDate, int price, float discount, String eDate){
        super(id, name, pDate, price, discount); // 부모 생성자 호출
        this.eDate = eDate;
    }

    //메소드 오버라이딩
    public void inform() {
        System.out.println("상품번호: " + this.id + " | 상품명: " + this.getName() + " | 가격: " + price);
        System.out.println("생산일자: " + pDate + " | 유통기한:" + eDate + " | 할인율 : " + discount);
        System.out.println("--------------------------------------------------");
    }
}