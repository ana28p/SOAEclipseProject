
/**
 * DistanceNotFoundMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package com.order.navigationservice;

public class DistanceNotFoundMessage extends java.lang.Exception{

    private static final long serialVersionUID = 1551647154262L;
    
    private com.order.elements.GetDistanceFault faultMessage;

    
        public DistanceNotFoundMessage() {
            super("DistanceNotFoundMessage");
        }

        public DistanceNotFoundMessage(java.lang.String s) {
           super(s);
        }

        public DistanceNotFoundMessage(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DistanceNotFoundMessage(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.order.elements.GetDistanceFault msg){
       faultMessage = msg;
    }
    
    public com.order.elements.GetDistanceFault getFaultMessage(){
       return faultMessage;
    }
}
    