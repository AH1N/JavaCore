package HWJD4;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
public class Order {
    public Product product;
    public ShopoGolic shopoGolic;
    public int quantity;

    public Order() {
        this.product = product;
        this.shopoGolic = shopoGolic;
        this.quantity = quantity;
    }
    public String getQuantity(){
        return String.valueOf(quantity);
    }
    public void printOrder(){
        System.out.println(this.product.printProduct());
        System.out.println(this.shopoGolic.printShopogolic());
        System.out.println(this.quantity);
    }
}