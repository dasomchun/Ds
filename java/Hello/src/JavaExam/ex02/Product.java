package JavaExam.ex02;

public class Product {
    String name;
    int price;
    int quantity;
    
    public Product(String name, int price, int quantify) {
        this.name = name;
        this.price = price;
        this.quantity = quantify;
    }

    @Override
    public String toString() {
        return "상품명: " + name + ", 가격: " + price + "원, 수량: " + quantity + "개";
    }
    public int getTotalPrice() {
        return price * quantity;
    }
 

    
}
