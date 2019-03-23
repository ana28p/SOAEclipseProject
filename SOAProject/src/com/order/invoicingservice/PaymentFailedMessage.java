
/**
 * PaymentFailedMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package com.order.invoicingservice;

public class PaymentFailedMessage extends java.lang.Exception{

    private static final long serialVersionUID = 1553284334431L;
    
    private com.order.elements.PayForRideFault faultMessage;

    
        public PaymentFailedMessage() {
            super("PaymentFailedMessage");
        }

        public PaymentFailedMessage(java.lang.String s) {
           super(s);
        }

        public PaymentFailedMessage(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public PaymentFailedMessage(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.order.elements.PayForRideFault msg){
       faultMessage = msg;
    }
    
    public com.order.elements.PayForRideFault getFaultMessage(){
       return faultMessage;
    }
}
    