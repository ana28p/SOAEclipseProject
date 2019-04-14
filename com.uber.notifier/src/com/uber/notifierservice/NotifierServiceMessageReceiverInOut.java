
/**
 * NotifierServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
        package com.uber.notifierservice;

        /**
        *  NotifierServiceMessageReceiverInOut message receiver
        */

        public class NotifierServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        NotifierServiceSkeletonInterface skel = (NotifierServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("findDriver".equals(methodName)){
                
                com.uber.datatypes.SuccessMessage successMessage7 = null;
	                        com.uber.elements.FindDriverRequest wrappedParam =
                                                             (com.uber.elements.FindDriverRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.uber.elements.FindDriverRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               successMessage7 =
                                                   
                                                   
                                                         skel.findDriver(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), successMessage7, false, new javax.xml.namespace.QName("http://uber.com/NotifierService",
                                                    "findDriver"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (InvalidCustomerMessage e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"FaultMessage");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (InvalidLocationMessage e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"FaultMessage");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (InvalidPriceMessage e) {

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
            private  org.apache.axiom.om.OMElement  toOM(com.uber.elements.FindDriverRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.uber.elements.FindDriverRequest.MY_QNAME,
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
        
            private  org.apache.axiom.om.OMElement  toOM(com.uber.datatypes.FaultMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.uber.datatypes.FaultMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

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
                    
                         private com.uber.datatypes.SuccessMessage wrapFindDriver(){
                                com.uber.datatypes.SuccessMessage wrappedElement = new com.uber.datatypes.SuccessMessage();
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
            
                if (com.uber.elements.FindDriverRequest.class.equals(type)){
                
                        return com.uber.elements.FindDriverRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    