package HWJD4;

public class Deal {
    public static Order makeDeal(String product, String shopoGolic, Shop shop, int amount) throws CustomerException, ProductException, AmountException {
        Order order = new Order();
        if(amount <=0  && amount > 100){
            throw new AmountException("СЛИШКОМ МНОГО ПАБРАЛИ... ВОТ ВАМ ОДИН ТОВАР");
        }

        if(shop.checkShop(product, shopoGolic)){
            order.product = shop.getProductFromShop(product);
            order.shopoGolic = shop.getShopogolicFromShop(shopoGolic);
            order.quantity = amount;
            order.printOrder();
            return order;

        }else{
            return null;
        }
    }
}
