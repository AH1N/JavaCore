package HWJD4;

import java.util.ArrayList;

public class Shop {
    public  ArrayList<Product> productList = new ArrayList<Product>();
    public  ArrayList<ShopoGolic> shopoGolicsList = new ArrayList<ShopoGolic>();

    public ArrayList<Order> orderlist = new ArrayList<>();
    public Shop(){
        this.productList = productList;
        this.shopoGolicsList = shopoGolicsList;
        this.orderlist = orderlist;
    }

    public  ArrayList<Product> getProductList() {
        return this.productList;
    }

    public  ArrayList<ShopoGolic> getShopoGolicsList() {
        return this.shopoGolicsList;
    }

    public void printOrderList(){
        for (Order item: orderlist) {
            item.printOrder();
        }
    }

    public void printProdList(){
        for (Product item: this.productList) {

            System.out.println(item.printProduct());
        }
    }
    public boolean checkShopProductList(String product) throws ProductException {
        boolean flag = false;
        for (Product item: this.productList)
            if (!item.checkProduct(product)) {
                flag = false;
            } else {
                flag = true;
            }
        return flag;
    }

    private boolean checkShopoGolics(String shopogolic) throws CustomerException {
        boolean flag = false;
        for (ShopoGolic item: this.shopoGolicsList)
            if (item.checkShopogolicFio(shopogolic)) {
                flag = true;
            } else flag = false;
        return flag;
    }


    public boolean checkShop(String product, String shopogolic) throws CustomerException, ProductException {
        boolean flag = false;
        if(checkShopProductList(product) && checkShopoGolics(shopogolic)){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }
    public Product getProductFromShop(String product){
        for (Product item: this.productList){
            if(item.getProductName().equalsIgnoreCase(product)){
                return item;
            }
        }
        return null;
    }

    public ShopoGolic getShopogolicFromShop(String shopogolic){
        for (ShopoGolic consumptionMachine: this.shopoGolicsList){
            if(consumptionMachine.getFio().equalsIgnoreCase(shopogolic)){
                return consumptionMachine;
            }
        }
        return null;
    }



}
