
/**
 * PersonNotFoundMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package com.uber.databaseservice;

public class PersonNotFoundMessage extends java.lang.Exception{

    private static final long serialVersionUID = 1555252670113L;
    
    private com.uber.datatypes.FaultMessage faultMessage;

    
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
    

    public void setFaultMessage(com.uber.datatypes.FaultMessage msg){
       faultMessage = msg;
    }
    
    public com.uber.datatypes.FaultMessage getFaultMessage(){
       return faultMessage;
    }
}
    