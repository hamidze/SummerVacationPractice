package chainOfResponsibility;

import chainOfResponsibility.handler.PriceHandler;
import chainOfResponsibility.handler.PriceHandlerFactory;

import java.util.Random;

/**
 * Created by Thpffcj on 2017/10/13.
 * 客户，请求折扣
 */
public class Customer {

    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public void requestDiscount(float discount){
        priceHandler.processDiscount(discount);
    }


    public static void main(String[] args){
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());

        Random rand = new Random();

        for (int i=1;i<=100;i++) {
            System.out.print(i+":");
            customer.requestDiscount(rand.nextFloat());
        }
    }

}
