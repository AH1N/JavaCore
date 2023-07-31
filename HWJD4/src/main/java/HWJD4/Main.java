package HWJD4;

import static HWJD4.Deal.makeDeal;

public class Main {
    public static void main(String[] args) throws CustomerException, AmountException, ProductException {


        Shop shop = new Shop();
        shop.shopoGolicsList.add(new ShopoGolic("Иван Иванов", "+123456789", 30));
        shop.shopoGolicsList.add(new ShopoGolic("Петр Петров", "+987654321", 31));

        shop.productList.add(new Product("Телефон", 1000));
        shop.productList.add(new Product("Ноутбук", 1500));
        shop.productList.add(new Product("Планшет", 800));
        shop.productList.add(new Product("Наушники", 100));
        shop.productList.add(new Product("Мышка", 50));
        System.out.println(shop.productList.size() + "<-----------------");



        shop.orderlist.add(makeDeal("Телефон", "Иван Иванов",shop, 2));
        shop.orderlist.add(makeDeal("Планшет", "Петр Петров",shop, -5));
        shop.orderlist.add(makeDeal("Клавиатура", "Михаил Светлов",shop, 1));
        shop.orderlist.add(makeDeal("Наушники", "Петр Петров",shop, 120));

        System.out.println("Совершенные покупки:");
        shop.printOrderList();


    }
}