package com.yashon.design.structural.facade;

/**
 * @ClassName PointGiftFace
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/5 下午1:59
 * @Version 1.0
 **/
public class PointGiftFacade {

    private QualifyService qualifyService = new QualifyService();

    private PointPaymentService pointPaymentService = new PointPaymentService();

    private ShippingService shippingService = new ShippingService();

    public void exchangeGift(PointGift gift){

        if(qualifyService.qualify(gift)){

            if(pointPaymentService.pay(gift)){

                String number = shippingService.shipping(gift);
                System.out.println("物流单号：" + number);
            }
        }
    }
}
