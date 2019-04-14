
/**
 * DatabaseServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
        package com.uber.databaseservice;

        /**
        *  DatabaseServiceMessageReceiverInOut message receiver
        */

        public class DatabaseServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        DatabaseServiceSkeletonInterface skel = (DatabaseServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getDriver".equals(methodName)){
                
                com.uber.elements.GetDriverResponse getDriverResponse31 = null;
	                        com.uber.elements.GetDriverRequest wrappedParam =
                                                             (com.uber.elements.GetDriverRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.uber.elements.GetDriverRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDriverResponse31 =
                                                   
                                                   
                                                         skel.getDriver(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDriverResponse31, false, new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                                                    "getDriver"));
                                    } else 

            if("giveFeedback".equals(methodName)){
                
                com.uber.datatypes.SuccessMessage successMessage33 = null;
	                        com.uber.elements.GiveFeedbackRequest wrappedParam =
                                                             (com.uber.elements.GiveFeedbackRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.uber.elements.GiveFeedbackRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               successMessage33 =
                                                   
                                                   
                                                         skel.giveFeedback(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), successMessage33, false, new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                                                    "giveFeedback"));
                                    } else 

            if("getCustomers".equals(methodName)){
                
                com.uber.elements.GetCustomersResponse getCustomersResponse35 = null;
	                        com.uber.elements.GetCustomersRequest wrappedParam =
                                                             (com.uber.elements.GetCustomersRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.uber.elements.GetCustomersRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCustomersResponse35 =
                                                   
                                                   
                                                         skel.getCustomers(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCustomersResponse35, false, new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                                                    "getCustomers"));
                                    } else 

            if("getCustomer".equals(methodName)){
                
                com.uber.elements.GetCustomerResponse getCustomerResponse37 = null;
	                        com.uber.elements.GetCustomerRequest wrappedParam =
                                                             (com.uber.elements.GetCustomerRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.uber.elements.GetCustomerRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCustomerResponse37 =
                                                   
                                                   
                                                         skel.getCustomer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCustomerResponse37, false, new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                                                    "getCustomer"));
                                    } else 

            if("getDrivers".equals(methodName)){
                
                com.uber.elements.GetDriversResponse getDriversResponse39 = null;
	                        com.uber.elements.GetDriversRequest wrappedParam =
                                                             (com.uber.elements.GetDriversRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.uber.elements.GetDriversRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDriversResponse39 =
                                                   
                                                   
                                                         skel.getDrivers(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDriversResponse39, false, new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                                                    "getDrivers"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (PersonNotFoundMessage e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"FaultMessage");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
        
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(com.uber.elements.GetDriverRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.uber.elements.GetDriverRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.uber.elements.GetDriverResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.uber.elements.GetDriverResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.uber.datatypes.FaultMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.uber.datatypes.FaultMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.uber.elements.GiveFeedbackRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.uber.elements.GiveFeedbackRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.uber.datatypes.SuccessMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.uber.datatypes.SuccessMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.uber.elements.GetCustomersRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.uber.elements.GetCustomersRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.uber.elements.GetCustomersResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.uber.elements.GetCustomersResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.uber.elements.GetCustomerRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.uber.elements.GetCustomerRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.uber.elements.GetCustomerResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.uber.elements.GetCustomerResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.uber.elements.GetDriversRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.uber.elements.GetDriversRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.uber.elements.GetDriversResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.uber.elements.GetDriversResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.uber.elements.GetDriverResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.uber.elements.GetDriverResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.uber.elements.GetDriverResponse wrapGetDriver(){
                                com.uber.elements.GetDriverResponse wrappedElement = new com.uber.elements.GetDriverResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.uber.datatypes.SuccessMessage param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.uber.datatypes.SuccessMessage.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.uber.datatypes.SuccessMessage wrapGiveFeedback(){
                                com.uber.datatypes.SuccessMessage wrappedElement = new com.uber.datatypes.SuccessMessage();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.uber.elements.GetCustomersResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.uber.elements.GetCustomersResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.uber.elements.GetCustomersResponse wrapGetCustomers(){
                                com.uber.elements.GetCustomersResponse wrappedElement = new com.uber.elements.GetCustomersResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.uber.elements.GetCustomerResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.uber.elements.GetCustomerResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.uber.elements.GetCustomerResponse wrapGetCustomer(){
                                com.uber.elements.GetCustomerResponse wrappedElement = new com.uber.elements.GetCustomerResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.uber.elements.GetDriversResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.uber.elements.GetDriversResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.uber.elements.GetDriversResponse wrapGetDrivers(){
                                com.uber.elements.GetDriversResponse wrappedElement = new com.uber.elements.GetDriversResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.uber.datatypes.FaultMessage.class.equals(type)){
                
                        return com.uber.datatypes.FaultMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (com.uber.datatypes.SuccessMessage.class.equals(type)){
                
                        return com.uber.datatypes.SuccessMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (com.uber.elements.GetCustomerRequest.class.equals(type)){
                
                        return com.uber.elements.GetCustomerRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (com.uber.elements.GetCustomerResponse.class.equals(type)){
                
                        return com.uber.elements.GetCustomerResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (com.uber.elements.GetCustomersRequest.class.equals(type)){
                
                        return com.uber.elements.GetCustomersRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (com.uber.elements.GetCustomersResponse.class.equals(type)){
                
                        return com.uber.elements.GetCustomersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (com.uber.elements.GetDriverRequest.class.equals(type)){
                
                        return com.uber.elements.GetDriverRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (com.uber.elements.GetDriverResponse.class.equals(type)){
                
                        return com.uber.elements.GetDriverResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (com.uber.elements.GetDriversRequest.class.equals(type)){
                
                        return com.uber.elements.GetDriversRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (com.uber.elements.GetDriversResponse.class.equals(type)){
                
                        return com.uber.elements.GetDriversResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (com.uber.elements.GiveFeedbackRequest.class.equals(type)){
                
                        return com.uber.elements.GiveFeedbackRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    