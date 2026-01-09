package a0109.product;

public class Product {
    // 필드
    private String name;
    private int price;
    private int quantify; 
    private double discountRate;

    public Product(String name, int price, int quantify) {
        this.name = name;
        this.price = price;
        this.quantify = quantify;
        this.discountRate = 0.0; //기본할인율 0%
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantify() {
        return quantify;
    }

    
    public void setQuantify(int quantify) {
        this.quantify = quantify;
    }

    public double getDiscountRate() {
        return discountRate;
    }
    // 할인율 설정(유효성검사)
    public void setDiscountRate(double discountRate) {
        if(discountRate < 0 || discountRate >1){
            System.out.println("할인율을 0.0 ~ 1.0 사이여야 합니다.");
            return;
        }
        this.discountRate = discountRate;
    }

    public void printProductInfor() {
        System.out.println("======== 영수증 ========");
        System.out.println("=== 상품 정보 ===");
        System.out.println("상품명 : " + name);
        System.out.println("단가 : " + String.format("%,d", price) + "원");
        System.out.println("수량 : " + quantify + "개");
         System.out.println("총금액 : " + String.format("%,d", calcTotalPrice()) + "원");
         if(discountRate > 0){
            System.out.println("할인율: " + (discountRate * 100) + "%");
            System.out.println("할인금액: " + String.format("%,d", calcDiscount()) + "원");
            System.out.println("할인 후 금액: " + String.format("%,d", calcFinalPrice()) + "원");
         }else{
            System.out.println("할인 후 금액: " + String.format("%,d", calcFinalPrice()) + "원");
         }
         System.out.println("부가세: " + String.format("%,d", calcTax()) +"원");
         System.out.println("최종 결제 금액: " + String.format("%,d", calcTaxPrice()) +"원");
         System.out.println("===========================");
    }
    
    private int calcTaxPrice() {
        return calcFinalPrice()+calcTax();
    }

    private int calcTax() { 
        return (int)(calcFinalPrice() * 0.1);
    }

    private int calcFinalPrice() {
        return calcTotalPrice() - calcDiscount();
    }

    private int calcDiscount() {
        return (int)(calcTotalPrice()*discountRate);
    }

    private int calcTotalPrice() {
       return price * quantify;
    }
    
    
}
