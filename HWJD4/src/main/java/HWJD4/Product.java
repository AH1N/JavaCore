package HWJD4;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    public String productName;
    public Integer productCost;


    public Integer getProductCost() {
        return productCost;
    }

    public String printProduct() {
        return String.format("Название: %s%nСтоимость: %d%n",
                productName, productCost);
    }

    public String getProductName() {
        return productName;
    }

    public boolean checkProduct(String productName) throws ProductException {
        if (this.productName.equalsIgnoreCase(productName)) {
            System.out.println(this.productName + " -- " + productName);
            return true;
        } else {
            throw new ProductException("Товар не найден: " + productName);
        }
    }




}