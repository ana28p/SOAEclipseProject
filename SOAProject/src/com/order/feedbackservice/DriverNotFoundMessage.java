
/**
 * DriverNotFoundMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package com.order.feedbackservice;

public class DriverNotFoundMessage extends java.lang.Exception{

    private static final long serialVersionUID = 1551647079872L;
    
    private com.order.elements.RateDriverFault faultMessage;

    
        public DriverNotFoundMessage() {
            super("DriverNotFoundMessage");
        }

        public DriverNotFoundMessage(java.lang.String s) {
           super(s);
        }

        public DriverNotFoundMessage(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DriverNotFoundMessage(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.order.elements.RateDriverFault msg){
       faultMessage = msg;
    }
    
    public com.order.elements.RateDriverFault getFaultMessage(){
       return faultMessage;
    }
}
    