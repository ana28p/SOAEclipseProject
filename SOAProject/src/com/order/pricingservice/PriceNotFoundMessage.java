
/**
 * PriceNotFoundMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package com.order.pricingservice;

public class PriceNotFoundMessage extends java.lang.Exception{

    private static final long serialVersionUID = 1553284400416L;
    
    private com.order.elements.GetPriceFault faultMessage;

    
        public PriceNotFoundMessage() {
            super("PriceNotFoundMessage");
        }

        public PriceNotFoundMessage(java.lang.String s) {
           super(s);
        }

        public PriceNotFoundMessage(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public PriceNotFoundMessage(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.order.elements.GetPriceFault msg){
       faultMessage = msg;
    }
    
    public com.order.elements.GetPriceFault getFaultMessage(){
       return faultMessage;
    }
}
    