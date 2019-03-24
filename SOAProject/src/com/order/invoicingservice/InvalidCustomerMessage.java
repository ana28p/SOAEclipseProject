
/**
 * InvalidCustomerMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package com.order.invoicingservice;

public class InvalidCustomerMessage extends java.lang.Exception{

    private static final long serialVersionUID = 1553427790260L;
    
    private com.order.datatypes.FaultMessage faultMessage;

    
        public InvalidCustomerMessage() {
            super("InvalidCustomerMessage");
        }

        public InvalidCustomerMessage(java.lang.String s) {
           super(s);
        }

        public InvalidCustomerMessage(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public InvalidCustomerMessage(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.order.datatypes.FaultMessage msg){
       faultMessage = msg;
    }
    
    public com.order.datatypes.FaultMessage getFaultMessage(){
       return faultMessage;
    }
}
    