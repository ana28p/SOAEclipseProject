
/**
 * PersonNotFoundMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package com.order.feedbackservice;

public class PersonNotFoundMessage extends java.lang.Exception{

    private static final long serialVersionUID = 1551725682824L;
    
    private com.order.elements.RatePersonFault faultMessage;

    
        public PersonNotFoundMessage() {
            super("PersonNotFoundMessage");
        }

        public PersonNotFoundMessage(java.lang.String s) {
           super(s);
        }

        public PersonNotFoundMessage(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public PersonNotFoundMessage(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.order.elements.RatePersonFault msg){
       faultMessage = msg;
    }
    
    public com.order.elements.RatePersonFault getFaultMessage(){
       return faultMessage;
    }
}
    