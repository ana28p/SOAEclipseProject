
/**
 * InvalidDriverMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package com.order.invoicingservice;

public class InvalidDriverMessage extends java.lang.Exception{

    private static final long serialVersionUID = 1553382176712L;
    
    private com.order.datatypes.FaultMessage faultMessage;

    
        public InvalidDriverMessage() {
            super("InvalidDriverMessage");
        }

        public InvalidDriverMessage(java.lang.String s) {
           super(s);
        }

        public InvalidDriverMessage(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public InvalidDriverMessage(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.order.datatypes.FaultMessage msg){
       faultMessage = msg;
    }
    
    public com.order.datatypes.FaultMessage getFaultMessage(){
       return faultMessage;
    }
}
    