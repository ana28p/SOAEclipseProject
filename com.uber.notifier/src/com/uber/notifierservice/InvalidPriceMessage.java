
/**
 * InvalidPriceMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package com.uber.notifierservice;

public class InvalidPriceMessage extends java.lang.Exception{

    private static final long serialVersionUID = 1555259488519L;
    
    private com.uber.datatypes.FaultMessage faultMessage;

    
        public InvalidPriceMessage() {
            super("InvalidPriceMessage");
        }

        public InvalidPriceMessage(java.lang.String s) {
           super(s);
        }

        public InvalidPriceMessage(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public InvalidPriceMessage(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.uber.datatypes.FaultMessage msg){
       faultMessage = msg;
    }
    
    public com.uber.datatypes.FaultMessage getFaultMessage(){
       return faultMessage;
    }
}
    