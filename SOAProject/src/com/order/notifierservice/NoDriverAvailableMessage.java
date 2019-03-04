
/**
 * NoDriverAvailableMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package com.order.notifierservice;

public class NoDriverAvailableMessage extends java.lang.Exception{

    private static final long serialVersionUID = 1551727397543L;
    
    private com.order.elements.FindDriverFault faultMessage;

    
        public NoDriverAvailableMessage() {
            super("NoDriverAvailableMessage");
        }

        public NoDriverAvailableMessage(java.lang.String s) {
           super(s);
        }

        public NoDriverAvailableMessage(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NoDriverAvailableMessage(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.order.elements.FindDriverFault msg){
       faultMessage = msg;
    }
    
    public com.order.elements.FindDriverFault getFaultMessage(){
       return faultMessage;
    }
}
    