
/**
 * DatabaseServiceStub.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.uber.databaseservice;



/*
 *  DatabaseServiceStub java implementation
 */


public class DatabaseServiceStub extends org.apache.axis2.client.Stub {
    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();

    private static int counter = 0;

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }
        counter = counter + 1;
        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
    }


    private void populateAxisService() throws org.apache.axis2.AxisFault {

        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService("DatabaseService" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[5];

        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://uber.com/DatabaseService", "getDriver"));
        _service.addOperation(__operation);


        _operations[0] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://uber.com/DatabaseService", "giveFeedback"));
        _service.addOperation(__operation);


        _operations[1] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://uber.com/DatabaseService", "getCustomers"));
        _service.addOperation(__operation);


        _operations[2] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://uber.com/DatabaseService", "getCustomer"));
        _service.addOperation(__operation);


        _operations[3] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://uber.com/DatabaseService", "getDrivers"));
        _service.addOperation(__operation);


        _operations[4] = __operation;


    }

    //populates the faults
    private void populateFaults() {

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://uber.com/DataTypes", "FaultMessage"), "GetDriver"), "com.uber.databaseservice.PersonNotFoundMessage");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://uber.com/DataTypes", "FaultMessage"), "GetDriver"), "com.uber.databaseservice.PersonNotFoundMessage");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://uber.com/DataTypes", "FaultMessage"), "GetDriver"), "com.uber.databaseservice.DatabaseServiceStub$FaultMessage");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://uber.com/DataTypes", "FaultMessage"), "GiveFeedback"), "com.uber.databaseservice.PersonNotFoundMessage");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://uber.com/DataTypes", "FaultMessage"), "GiveFeedback"), "com.uber.databaseservice.PersonNotFoundMessage");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://uber.com/DataTypes", "FaultMessage"), "GiveFeedback"), "com.uber.databaseservice.DatabaseServiceStub$FaultMessage");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://uber.com/DataTypes", "FaultMessage"), "GetCustomer"), "com.uber.databaseservice.PersonNotFoundMessage");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://uber.com/DataTypes", "FaultMessage"), "GetCustomer"), "com.uber.databaseservice.PersonNotFoundMessage");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://uber.com/DataTypes", "FaultMessage"), "GetCustomer"), "com.uber.databaseservice.DatabaseServiceStub$FaultMessage");


    }

    /**
     *Constructor that takes in a configContext
     */

    public DatabaseServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
                               java.lang.String targetEndpoint)
            throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }


    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public DatabaseServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
                               java.lang.String targetEndpoint, boolean useSeparateListener)
            throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);


        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);


    }

    /**
     * Default Constructor
     */
    public DatabaseServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {

        this(configurationContext, "http://localhost:9080/com.uber.database/services/DatabaseService");

    }

    /**
     * Default Constructor
     */
    public DatabaseServiceStub() throws org.apache.axis2.AxisFault {

        this("http://localhost:9080/com.uber.database/services/DatabaseService");

    }

    /**
     * Constructor taking the target endpoint
     */
    public DatabaseServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }


    /**
     * Auto generated method signature
     *
     * @see com.uber.databaseservice.DatabaseService#getDriver
     * @param getDriverRequest0

     * @throws com.uber.databaseservice.PersonNotFoundMessage :
     */


    public com.uber.databaseservice.DatabaseServiceStub.GetDriverResponse getDriver(

            com.uber.databaseservice.DatabaseServiceStub.GetDriverRequest getDriverRequest0)


            throws java.rmi.RemoteException


            , com.uber.databaseservice.PersonNotFoundMessage {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions().setAction("http://uber.com/DatabaseService/DatabasePortType/GetDriverRequest");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    getDriverRequest0,
                    optimizeContent(new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                            "getDriver")), new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                            "getDriver"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.uber.databaseservice.DatabaseServiceStub.GetDriverResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (com.uber.databaseservice.DatabaseServiceStub.GetDriverResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetDriver"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetDriver"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetDriver"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof com.uber.databaseservice.PersonNotFoundMessage) {
                            throw (com.uber.databaseservice.PersonNotFoundMessage) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see com.uber.databaseservice.DatabaseService#startgetDriver
     * @param getDriverRequest0

     */
    public void startgetDriver(

            com.uber.databaseservice.DatabaseServiceStub.GetDriverRequest getDriverRequest0,

            final com.uber.databaseservice.DatabaseServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
        _operationClient.getOptions().setAction("http://uber.com/DatabaseService/DatabasePortType/GetDriverRequest");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                getDriverRequest0,
                optimizeContent(new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                        "getDriver")), new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                        "getDriver"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            com.uber.databaseservice.DatabaseServiceStub.GetDriverResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetDriver(
                            (com.uber.databaseservice.DatabaseServiceStub.GetDriverResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetDriver(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetDriver"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetDriver"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetDriver"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});

                                if (ex instanceof com.uber.databaseservice.PersonNotFoundMessage) {
                                    callback.receiveErrorgetDriver((com.uber.databaseservice.PersonNotFoundMessage) ex);
                                    return;
                                }


                                callback.receiveErrorgetDriver(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetDriver(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetDriver(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetDriver(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetDriver(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetDriver(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetDriver(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetDriver(f);
                            }
                        } else {
                            callback.receiveErrorgetDriver(f);
                        }
                    } else {
                        callback.receiveErrorgetDriver(f);
                    }
                } else {
                    callback.receiveErrorgetDriver(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetDriver(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[0].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see com.uber.databaseservice.DatabaseService#giveFeedback
     * @param giveFeedbackRequest2

     * @throws com.uber.databaseservice.PersonNotFoundMessage :
     */


    public com.uber.databaseservice.DatabaseServiceStub.SuccessMessage giveFeedback(

            com.uber.databaseservice.DatabaseServiceStub.GiveFeedbackRequest giveFeedbackRequest2)


            throws java.rmi.RemoteException


            , com.uber.databaseservice.PersonNotFoundMessage {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
            _operationClient.getOptions().setAction("http://uber.com/DatabaseService/DatabasePortType/GiveFeedbackRequest");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    giveFeedbackRequest2,
                    optimizeContent(new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                            "giveFeedback")), new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                            "giveFeedback"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.uber.databaseservice.DatabaseServiceStub.SuccessMessage.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (com.uber.databaseservice.DatabaseServiceStub.SuccessMessage) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GiveFeedback"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GiveFeedback"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GiveFeedback"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof com.uber.databaseservice.PersonNotFoundMessage) {
                            throw (com.uber.databaseservice.PersonNotFoundMessage) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see com.uber.databaseservice.DatabaseService#startgiveFeedback
     * @param giveFeedbackRequest2

     */
    public void startgiveFeedback(

            com.uber.databaseservice.DatabaseServiceStub.GiveFeedbackRequest giveFeedbackRequest2,

            final com.uber.databaseservice.DatabaseServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
        _operationClient.getOptions().setAction("http://uber.com/DatabaseService/DatabasePortType/GiveFeedbackRequest");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                giveFeedbackRequest2,
                optimizeContent(new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                        "giveFeedback")), new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                        "giveFeedback"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            com.uber.databaseservice.DatabaseServiceStub.SuccessMessage.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgiveFeedback(
                            (com.uber.databaseservice.DatabaseServiceStub.SuccessMessage) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgiveFeedback(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GiveFeedback"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GiveFeedback"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GiveFeedback"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});

                                if (ex instanceof com.uber.databaseservice.PersonNotFoundMessage) {
                                    callback.receiveErrorgiveFeedback((com.uber.databaseservice.PersonNotFoundMessage) ex);
                                    return;
                                }


                                callback.receiveErrorgiveFeedback(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgiveFeedback(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgiveFeedback(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgiveFeedback(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgiveFeedback(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgiveFeedback(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgiveFeedback(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgiveFeedback(f);
                            }
                        } else {
                            callback.receiveErrorgiveFeedback(f);
                        }
                    } else {
                        callback.receiveErrorgiveFeedback(f);
                    }
                } else {
                    callback.receiveErrorgiveFeedback(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgiveFeedback(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[1].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see com.uber.databaseservice.DatabaseService#getCustomers
     * @param getCustomersRequest4

     */


    public com.uber.databaseservice.DatabaseServiceStub.GetCustomersResponse getCustomers(

            com.uber.databaseservice.DatabaseServiceStub.GetCustomersRequest getCustomersRequest4)


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
            _operationClient.getOptions().setAction("http://uber.com/DatabaseService/DatabasePortType/GetCustomersRequest");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    getCustomersRequest4,
                    optimizeContent(new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                            "getCustomers")), new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                            "getCustomers"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.uber.databaseservice.DatabaseServiceStub.GetCustomersResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (com.uber.databaseservice.DatabaseServiceStub.GetCustomersResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetCustomers"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetCustomers"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetCustomers"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see com.uber.databaseservice.DatabaseService#startgetCustomers
     * @param getCustomersRequest4

     */
    public void startgetCustomers(

            com.uber.databaseservice.DatabaseServiceStub.GetCustomersRequest getCustomersRequest4,

            final com.uber.databaseservice.DatabaseServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
        _operationClient.getOptions().setAction("http://uber.com/DatabaseService/DatabasePortType/GetCustomersRequest");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                getCustomersRequest4,
                optimizeContent(new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                        "getCustomers")), new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                        "getCustomers"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            com.uber.databaseservice.DatabaseServiceStub.GetCustomersResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetCustomers(
                            (com.uber.databaseservice.DatabaseServiceStub.GetCustomersResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetCustomers(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetCustomers"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetCustomers"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetCustomers"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});


                                callback.receiveErrorgetCustomers(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCustomers(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCustomers(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCustomers(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCustomers(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCustomers(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCustomers(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCustomers(f);
                            }
                        } else {
                            callback.receiveErrorgetCustomers(f);
                        }
                    } else {
                        callback.receiveErrorgetCustomers(f);
                    }
                } else {
                    callback.receiveErrorgetCustomers(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetCustomers(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[2].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[2].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see com.uber.databaseservice.DatabaseService#getCustomer
     * @param getCustomerRequest6

     * @throws com.uber.databaseservice.PersonNotFoundMessage :
     */


    public com.uber.databaseservice.DatabaseServiceStub.GetCustomerResponse getCustomer(

            com.uber.databaseservice.DatabaseServiceStub.GetCustomerRequest getCustomerRequest6)


            throws java.rmi.RemoteException


            , com.uber.databaseservice.PersonNotFoundMessage {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
            _operationClient.getOptions().setAction("http://uber.com/DatabaseService/DatabasePortType/GetCustomerRequest");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    getCustomerRequest6,
                    optimizeContent(new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                            "getCustomer")), new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                            "getCustomer"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.uber.databaseservice.DatabaseServiceStub.GetCustomerResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (com.uber.databaseservice.DatabaseServiceStub.GetCustomerResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetCustomer"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetCustomer"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetCustomer"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof com.uber.databaseservice.PersonNotFoundMessage) {
                            throw (com.uber.databaseservice.PersonNotFoundMessage) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see com.uber.databaseservice.DatabaseService#startgetCustomer
     * @param getCustomerRequest6

     */
    public void startgetCustomer(

            com.uber.databaseservice.DatabaseServiceStub.GetCustomerRequest getCustomerRequest6,

            final com.uber.databaseservice.DatabaseServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
        _operationClient.getOptions().setAction("http://uber.com/DatabaseService/DatabasePortType/GetCustomerRequest");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                getCustomerRequest6,
                optimizeContent(new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                        "getCustomer")), new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                        "getCustomer"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            com.uber.databaseservice.DatabaseServiceStub.GetCustomerResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetCustomer(
                            (com.uber.databaseservice.DatabaseServiceStub.GetCustomerResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetCustomer(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetCustomer"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetCustomer"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetCustomer"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});

                                if (ex instanceof com.uber.databaseservice.PersonNotFoundMessage) {
                                    callback.receiveErrorgetCustomer((com.uber.databaseservice.PersonNotFoundMessage) ex);
                                    return;
                                }


                                callback.receiveErrorgetCustomer(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCustomer(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCustomer(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCustomer(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCustomer(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCustomer(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCustomer(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCustomer(f);
                            }
                        } else {
                            callback.receiveErrorgetCustomer(f);
                        }
                    } else {
                        callback.receiveErrorgetCustomer(f);
                    }
                } else {
                    callback.receiveErrorgetCustomer(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetCustomer(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[3].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[3].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see com.uber.databaseservice.DatabaseService#getDrivers
     * @param getDriversRequest8

     */


    public com.uber.databaseservice.DatabaseServiceStub.GetDriversResponse getDrivers(

            com.uber.databaseservice.DatabaseServiceStub.GetDriversRequest getDriversRequest8)


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
            _operationClient.getOptions().setAction("http://uber.com/DatabaseService/DatabasePortType/GetDriversRequest");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    getDriversRequest8,
                    optimizeContent(new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                            "getDrivers")), new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                            "getDrivers"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.uber.databaseservice.DatabaseServiceStub.GetDriversResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (com.uber.databaseservice.DatabaseServiceStub.GetDriversResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetDrivers"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetDrivers"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetDrivers"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see com.uber.databaseservice.DatabaseService#startgetDrivers
     * @param getDriversRequest8

     */
    public void startgetDrivers(

            com.uber.databaseservice.DatabaseServiceStub.GetDriversRequest getDriversRequest8,

            final com.uber.databaseservice.DatabaseServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
        _operationClient.getOptions().setAction("http://uber.com/DatabaseService/DatabasePortType/GetDriversRequest");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                getDriversRequest8,
                optimizeContent(new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                        "getDrivers")), new javax.xml.namespace.QName("http://uber.com/DatabaseService",
                        "getDrivers"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            com.uber.databaseservice.DatabaseServiceStub.GetDriversResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetDrivers(
                            (com.uber.databaseservice.DatabaseServiceStub.GetDriversResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetDrivers(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetDrivers"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetDrivers"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetDrivers"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});


                                callback.receiveErrorgetDrivers(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetDrivers(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetDrivers(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetDrivers(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetDrivers(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetDrivers(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetDrivers(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetDrivers(f);
                            }
                        } else {
                            callback.receiveErrorgetDrivers(f);
                        }
                    } else {
                        callback.receiveErrorgetDrivers(f);
                    }
                } else {
                    callback.receiveErrorgetDrivers(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetDrivers(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[4].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[4].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }


    /**
     *  A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }
        return returnMap;
    }


    private javax.xml.namespace.QName[] opNameArray = null;

    private boolean optimizeContent(javax.xml.namespace.QName opName) {


        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }
        return false;
    }

    //http://localhost:9080/com.uber.database/services/DatabaseService
    public static class Person
            implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = Person
                Namespace URI = http://uber.com/DataTypes
                Namespace Prefix = ns1
                */


        /**
         * field for Id
         */


        protected int localId;


        /**
         * Auto generated getter method
         * @return int
         */
        public int getId() {
            return localId;
        }


        /**
         * Auto generated setter method
         * @param param Id
         */
        public void setId(int param) {

            this.localId = param;


        }


        /**
         * field for Name
         */


        protected java.lang.String localName;


        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getName() {
            return localName;
        }


        /**
         * Auto generated setter method
         * @param param Name
         */
        public void setName(java.lang.String param) {

            this.localName = param;


        }


        /**
         * field for Age
         */


        protected int localAge;


        /**
         * Auto generated getter method
         * @return int
         */
        public int getAge() {
            return localAge;
        }


        /**
         * Auto generated setter method
         * @param param Age
         */
        public void setAge(int param) {

            this.localAge = param;


        }


        /**
         * field for Rating
         */


        protected double localRating;


        /**
         * Auto generated getter method
         * @return double
         */
        public double getRating() {
            return localRating;
        }


        /**
         * Auto generated setter method
         * @param param Rating
         */
        public void setRating(double param) {

            this.localRating = param;


        }


        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://uber.com/DataTypes");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":Person",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "Person",
                            xmlWriter);
                }


            }

            namespace = "";
            writeStartElement(null, namespace, "Id", xmlWriter);

            if (localId == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("Id cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "Name", xmlWriter);


            if (localName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localName);

            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "Age", xmlWriter);

            if (localAge == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("Age cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAge));
            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "Rating", xmlWriter);

            if (java.lang.Double.isNaN(localRating)) {

                throw new org.apache.axis2.databinding.ADBException("Rating cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRating));
            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://uber.com/DataTypes")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("",
                    "Id"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));

            elementList.add(new javax.xml.namespace.QName("",
                    "Name"));

            if (localName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("",
                    "Age"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAge));

            elementList.add(new javax.xml.namespace.QName("",
                    "Rating"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRating));


            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static Person parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                Person object =
                        new Person();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"Person".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Person) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Id").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Id" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setId(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Name").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Name" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setName(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Age").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Age" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setAge(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Rating").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Rating" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setRating(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ExtensionMapper {

        public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                     java.lang.String typeName,
                                                     javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {


            if (
                    "http://uber.com/DataTypes".equals(namespaceURI) &&
                            "Person".equals(typeName)) {

                return Person.Factory.parse(reader);


            }


            if (
                    "http://uber.com/DataTypes".equals(namespaceURI) &&
                            "Driver".equals(typeName)) {

                return Driver.Factory.parse(reader);


            }


            if (
                    "http://uber.com/DataTypes".equals(namespaceURI) &&
                            "Customer".equals(typeName)) {

                return Customer.Factory.parse(reader);


            }


            throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
        }

    }

    public static class SuccessMessage
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://uber.com/DataTypes",
                "SuccessMessage",
                "ns1");


        /**
         * field for SuccessMessage
         */


        protected java.lang.String localSuccessMessage;


        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSuccessMessage() {
            return localSuccessMessage;
        }


        /**
         * Auto generated setter method
         * @param param SuccessMessage
         */
        public void setSuccessMessage(java.lang.String param) {

            this.localSuccessMessage = param;


        }


        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it

            java.lang.String namespace = "http://uber.com/DataTypes";
            java.lang.String _localName = "SuccessMessage";

            writeStartElement(null, namespace, _localName, xmlWriter);

            // add the type details if this is used in a simple type
            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://uber.com/DataTypes");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":SuccessMessage",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "SuccessMessage",
                            xmlWriter);
                }
            }

            if (localSuccessMessage == null) {

                throw new org.apache.axis2.databinding.ADBException("SuccessMessage cannot be null !!");

            } else {

                xmlWriter.writeCharacters(localSuccessMessage);

            }

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://uber.com/DataTypes")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it
            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
                    new java.lang.Object[]{
                            org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuccessMessage)
                    },
                    null);

        }


        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static SuccessMessage parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                SuccessMessage object =
                        new SuccessMessage();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://uber.com/DataTypes", "SuccessMessage").equals(reader.getName())) {

                                nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                                if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                                    throw new org.apache.axis2.databinding.ADBException("The element: " + "SuccessMessage" + "  cannot be null");
                                }


                                java.lang.String content = reader.getElementText();

                                object.setSuccessMessage(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class GetDriversResponse
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://uber.com/Elements",
                "GetDriversResponse",
                "ns2");


        /**
         * field for DriverElement
         * This was an Array!
         */


        protected Driver[] localDriverElement;


        /**
         * Auto generated getter method
         * @return Driver[]
         */
        public Driver[] getDriverElement() {
            return localDriverElement;
        }


        /**
         * validate the array for DriverElement
         */
        protected void validateDriverElement(Driver[] param) {

            if ((param != null) && (param.length < 1)) {
                throw new java.lang.RuntimeException("Input values do not follow defined XSD restrictions");
            }

        }


        /**
         * Auto generated setter method
         * @param param DriverElement
         */
        public void setDriverElement(Driver[] param) {

            validateDriverElement(param);


            this.localDriverElement = param;
        }


        /**
         * Auto generated add method for the array for convenience
         * @param param Driver
         */
        public void addDriverElement(Driver param) {
            if (localDriverElement == null) {
                localDriverElement = new Driver[]{};
            }


            java.util.List list =
                    org.apache.axis2.databinding.utils.ConverterUtil.toList(localDriverElement);
            list.add(param);
            this.localDriverElement =
                    (Driver[]) list.toArray(
                            new Driver[list.size()]);

        }


        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://uber.com/Elements");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":GetDriversResponse",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetDriversResponse",
                            xmlWriter);
                }


            }

            if (localDriverElement != null) {
                for (int i = 0; i < localDriverElement.length; i++) {
                    if (localDriverElement[i] != null) {
                        localDriverElement[i].serialize(new javax.xml.namespace.QName("http://uber.com/DataTypes", "DriverElement"),
                                xmlWriter);
                    } else {

                        throw new org.apache.axis2.databinding.ADBException("DriverElement cannot be null!!");

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("DriverElement cannot be null!!");

            }

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://uber.com/Elements")) {
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            if (localDriverElement != null) {
                for (int i = 0; i < localDriverElement.length; i++) {

                    if (localDriverElement[i] != null) {
                        elementList.add(new javax.xml.namespace.QName("http://uber.com/DataTypes",
                                "DriverElement"));
                        elementList.add(localDriverElement[i]);
                    } else {

                        throw new org.apache.axis2.databinding.ADBException("DriverElement cannot be null !!");

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("DriverElement cannot be null!!");

            }


            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetDriversResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                GetDriversResponse object =
                        new GetDriversResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetDriversResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetDriversResponse) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();

                    java.util.ArrayList list1 = new java.util.ArrayList();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://uber.com/DataTypes", "DriverElement").equals(reader.getName())) {


                        // Process the array and step past its final element's end.
                        list1.add(Driver.Factory.parse(reader));

                        //loop until we find a start element that is not part of this array
                        boolean loopDone1 = false;
                        while (!loopDone1) {
                            // We should be at the end element, but make sure
                            while (!reader.isEndElement())
                                reader.next();
                            // Step out of this element
                            reader.next();
                            // Step to next element event.
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isEndElement()) {
                                //two continuous end elements means we are exiting the xml structure
                                loopDone1 = true;
                            } else {
                                if (new javax.xml.namespace.QName("http://uber.com/DataTypes", "DriverElement").equals(reader.getName())) {
                                    list1.add(Driver.Factory.parse(reader));

                                } else {
                                    loopDone1 = true;
                                }
                            }
                        }
                        // call the converter utility  to convert and set the array

                        object.setDriverElement((Driver[])
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                        Driver.class,
                                        list1));

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class FaultMessage
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://uber.com/DataTypes",
                "FaultMessage",
                "ns1");


        /**
         * field for FaultMessage
         */


        protected java.lang.String localFaultMessage;


        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getFaultMessage() {
            return localFaultMessage;
        }


        /**
         * Auto generated setter method
         * @param param FaultMessage
         */
        public void setFaultMessage(java.lang.String param) {

            this.localFaultMessage = param;


        }


        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it

            java.lang.String namespace = "http://uber.com/DataTypes";
            java.lang.String _localName = "FaultMessage";

            writeStartElement(null, namespace, _localName, xmlWriter);

            // add the type details if this is used in a simple type
            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://uber.com/DataTypes");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":FaultMessage",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "FaultMessage",
                            xmlWriter);
                }
            }

            if (localFaultMessage == null) {

                throw new org.apache.axis2.databinding.ADBException("FaultMessage cannot be null !!");

            } else {

                xmlWriter.writeCharacters(localFaultMessage);

            }

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://uber.com/DataTypes")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it
            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
                    new java.lang.Object[]{
                            org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFaultMessage)
                    },
                    null);

        }


        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static FaultMessage parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                FaultMessage object =
                        new FaultMessage();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://uber.com/DataTypes", "FaultMessage").equals(reader.getName())) {

                                nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                                if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                                    throw new org.apache.axis2.databinding.ADBException("The element: " + "FaultMessage" + "  cannot be null");
                                }


                                java.lang.String content = reader.getElementText();

                                object.setFaultMessage(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class GetCustomerRequest
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://uber.com/Elements",
                "GetCustomerRequest",
                "ns2");


        /**
         * field for Id
         */


        protected int localId;


        /**
         * Auto generated getter method
         * @return int
         */
        public int getId() {
            return localId;
        }


        /**
         * Auto generated setter method
         * @param param Id
         */
        public void setId(int param) {

            this.localId = param;


        }


        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://uber.com/Elements");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":GetCustomerRequest",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetCustomerRequest",
                            xmlWriter);
                }


            }

            namespace = "";
            writeStartElement(null, namespace, "Id", xmlWriter);

            if (localId == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("Id cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://uber.com/Elements")) {
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("",
                    "Id"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));


            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetCustomerRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                GetCustomerRequest object =
                        new GetCustomerRequest();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetCustomerRequest".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetCustomerRequest) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Id").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Id" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setId(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class GetCustomersResponse
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://uber.com/Elements",
                "GetCustomersResponse",
                "ns2");


        /**
         * field for CustomerElement
         * This was an Array!
         */


        protected Customer[] localCustomerElement;


        /**
         * Auto generated getter method
         * @return Customer[]
         */
        public Customer[] getCustomerElement() {
            return localCustomerElement;
        }


        /**
         * validate the array for CustomerElement
         */
        protected void validateCustomerElement(Customer[] param) {

            if ((param != null) && (param.length < 1)) {
                throw new java.lang.RuntimeException("Input values do not follow defined XSD restrictions");
            }

        }


        /**
         * Auto generated setter method
         * @param param CustomerElement
         */
        public void setCustomerElement(Customer[] param) {

            validateCustomerElement(param);


            this.localCustomerElement = param;
        }


        /**
         * Auto generated add method for the array for convenience
         * @param param Customer
         */
        public void addCustomerElement(Customer param) {
            if (localCustomerElement == null) {
                localCustomerElement = new Customer[]{};
            }


            java.util.List list =
                    org.apache.axis2.databinding.utils.ConverterUtil.toList(localCustomerElement);
            list.add(param);
            this.localCustomerElement =
                    (Customer[]) list.toArray(
                            new Customer[list.size()]);

        }


        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://uber.com/Elements");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":GetCustomersResponse",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetCustomersResponse",
                            xmlWriter);
                }


            }

            if (localCustomerElement != null) {
                for (int i = 0; i < localCustomerElement.length; i++) {
                    if (localCustomerElement[i] != null) {
                        localCustomerElement[i].serialize(new javax.xml.namespace.QName("http://uber.com/DataTypes", "CustomerElement"),
                                xmlWriter);
                    } else {

                        throw new org.apache.axis2.databinding.ADBException("CustomerElement cannot be null!!");

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("CustomerElement cannot be null!!");

            }

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://uber.com/Elements")) {
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            if (localCustomerElement != null) {
                for (int i = 0; i < localCustomerElement.length; i++) {

                    if (localCustomerElement[i] != null) {
                        elementList.add(new javax.xml.namespace.QName("http://uber.com/DataTypes",
                                "CustomerElement"));
                        elementList.add(localCustomerElement[i]);
                    } else {

                        throw new org.apache.axis2.databinding.ADBException("CustomerElement cannot be null !!");

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("CustomerElement cannot be null!!");

            }


            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetCustomersResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                GetCustomersResponse object =
                        new GetCustomersResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetCustomersResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetCustomersResponse) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();

                    java.util.ArrayList list1 = new java.util.ArrayList();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://uber.com/DataTypes", "CustomerElement").equals(reader.getName())) {


                        // Process the array and step past its final element's end.
                        list1.add(Customer.Factory.parse(reader));

                        //loop until we find a start element that is not part of this array
                        boolean loopDone1 = false;
                        while (!loopDone1) {
                            // We should be at the end element, but make sure
                            while (!reader.isEndElement())
                                reader.next();
                            // Step out of this element
                            reader.next();
                            // Step to next element event.
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isEndElement()) {
                                //two continuous end elements means we are exiting the xml structure
                                loopDone1 = true;
                            } else {
                                if (new javax.xml.namespace.QName("http://uber.com/DataTypes", "CustomerElement").equals(reader.getName())) {
                                    list1.add(Customer.Factory.parse(reader));

                                } else {
                                    loopDone1 = true;
                                }
                            }
                        }
                        // call the converter utility  to convert and set the array

                        object.setCustomerElement((Customer[])
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                        Customer.class,
                                        list1));

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class GetCustomersRequest
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://uber.com/Elements",
                "GetCustomersRequest",
                "ns2");


        /**
         * field for Limit
         */


        protected int localLimit;


        /**
         * Auto generated getter method
         * @return int
         */
        public int getLimit() {
            return localLimit;
        }


        /**
         * Auto generated setter method
         * @param param Limit
         */
        public void setLimit(int param) {

            this.localLimit = param;


        }


        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://uber.com/Elements");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":GetCustomersRequest",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetCustomersRequest",
                            xmlWriter);
                }


            }

            namespace = "";
            writeStartElement(null, namespace, "Limit", xmlWriter);

            if (localLimit == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("Limit cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLimit));
            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://uber.com/Elements")) {
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("",
                    "Limit"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLimit));


            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetCustomersRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                GetCustomersRequest object =
                        new GetCustomersRequest();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetCustomersRequest".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetCustomersRequest) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Limit").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Limit" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setLimit(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class GetDriverRequest
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://uber.com/Elements",
                "GetDriverRequest",
                "ns2");


        /**
         * field for Id
         */


        protected int localId;


        /**
         * Auto generated getter method
         * @return int
         */
        public int getId() {
            return localId;
        }


        /**
         * Auto generated setter method
         * @param param Id
         */
        public void setId(int param) {

            this.localId = param;


        }


        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://uber.com/Elements");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":GetDriverRequest",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetDriverRequest",
                            xmlWriter);
                }


            }

            namespace = "";
            writeStartElement(null, namespace, "Id", xmlWriter);

            if (localId == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("Id cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://uber.com/Elements")) {
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("",
                    "Id"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));


            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetDriverRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                GetDriverRequest object =
                        new GetDriverRequest();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetDriverRequest".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetDriverRequest) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Id").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Id" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setId(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class Driver extends Person
            implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = Driver
                Namespace URI = http://uber.com/DataTypes
                Namespace Prefix = ns1
                */


        /**
         * field for CarNumber
         */


        protected java.lang.String localCarNumber;


        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getCarNumber() {
            return localCarNumber;
        }


        /**
         * Auto generated setter method
         * @param param CarNumber
         */
        public void setCarNumber(java.lang.String param) {

            this.localCarNumber = param;


        }


        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);


            java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://uber.com/DataTypes");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":Driver",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Driver",
                        xmlWriter);
            }


            namespace = "";
            writeStartElement(null, namespace, "Id", xmlWriter);

            if (localId == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("Id cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "Name", xmlWriter);


            if (localName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localName);

            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "Age", xmlWriter);

            if (localAge == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("Age cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAge));
            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "Rating", xmlWriter);

            if (java.lang.Double.isNaN(localRating)) {

                throw new org.apache.axis2.databinding.ADBException("Rating cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRating));
            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "CarNumber", xmlWriter);


            if (localCarNumber == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CarNumber cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localCarNumber);

            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://uber.com/DataTypes")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance", "type"));
            attribList.add(new javax.xml.namespace.QName("http://uber.com/DataTypes", "Driver"));

            elementList.add(new javax.xml.namespace.QName("",
                    "Id"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));

            elementList.add(new javax.xml.namespace.QName("",
                    "Name"));

            if (localName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("",
                    "Age"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAge));

            elementList.add(new javax.xml.namespace.QName("",
                    "Rating"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRating));

            elementList.add(new javax.xml.namespace.QName("",
                    "CarNumber"));

            if (localCarNumber != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCarNumber));
            } else {
                throw new org.apache.axis2.databinding.ADBException("CarNumber cannot be null!!");
            }


            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static Driver parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                Driver object =
                        new Driver();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"Driver".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Driver) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Id").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Id" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setId(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Name").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Name" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setName(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Age").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Age" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setAge(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Rating").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Rating" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setRating(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "CarNumber").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "CarNumber" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setCarNumber(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class CustomerElement
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://uber.com/DataTypes",
                "CustomerElement",
                "ns1");


        /**
         * field for CustomerElement
         */


        protected Customer localCustomerElement;


        /**
         * Auto generated getter method
         * @return Customer
         */
        public Customer getCustomerElement() {
            return localCustomerElement;
        }


        /**
         * Auto generated setter method
         * @param param CustomerElement
         */
        public void setCustomerElement(Customer param) {

            this.localCustomerElement = param;


        }


        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it

            if (localCustomerElement == null) {
                throw new org.apache.axis2.databinding.ADBException("CustomerElement cannot be null!");
            }
            localCustomerElement.serialize(MY_QNAME, xmlWriter);


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://uber.com/DataTypes")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it
            return localCustomerElement.getPullParser(MY_QNAME);

        }


        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static CustomerElement parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                CustomerElement object =
                        new CustomerElement();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://uber.com/DataTypes", "CustomerElement").equals(reader.getName())) {

                                object.setCustomerElement(Customer.Factory.parse(reader));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class Customer extends Person
            implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = Customer
                Namespace URI = http://uber.com/DataTypes
                Namespace Prefix = ns1
                */


        /**
         * field for CardNumber
         */


        protected java.lang.String localCardNumber;


        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getCardNumber() {
            return localCardNumber;
        }


        /**
         * Auto generated setter method
         * @param param CardNumber
         */
        public void setCardNumber(java.lang.String param) {

            this.localCardNumber = param;


        }


        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);


            java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://uber.com/DataTypes");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":Customer",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Customer",
                        xmlWriter);
            }


            namespace = "";
            writeStartElement(null, namespace, "Id", xmlWriter);

            if (localId == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("Id cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "Name", xmlWriter);


            if (localName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localName);

            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "Age", xmlWriter);

            if (localAge == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("Age cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAge));
            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "Rating", xmlWriter);

            if (java.lang.Double.isNaN(localRating)) {

                throw new org.apache.axis2.databinding.ADBException("Rating cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRating));
            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "CardNumber", xmlWriter);


            if (localCardNumber == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CardNumber cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localCardNumber);

            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://uber.com/DataTypes")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance", "type"));
            attribList.add(new javax.xml.namespace.QName("http://uber.com/DataTypes", "Customer"));

            elementList.add(new javax.xml.namespace.QName("",
                    "Id"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));

            elementList.add(new javax.xml.namespace.QName("",
                    "Name"));

            if (localName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("",
                    "Age"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAge));

            elementList.add(new javax.xml.namespace.QName("",
                    "Rating"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRating));

            elementList.add(new javax.xml.namespace.QName("",
                    "CardNumber"));

            if (localCardNumber != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardNumber));
            } else {
                throw new org.apache.axis2.databinding.ADBException("CardNumber cannot be null!!");
            }


            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static Customer parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                Customer object =
                        new Customer();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"Customer".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Customer) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Id").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Id" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setId(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Name").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Name" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setName(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Age").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Age" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setAge(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Rating").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Rating" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setRating(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "CardNumber").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "CardNumber" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setCardNumber(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class DriverElement
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://uber.com/DataTypes",
                "DriverElement",
                "ns1");


        /**
         * field for DriverElement
         */


        protected Driver localDriverElement;


        /**
         * Auto generated getter method
         * @return Driver
         */
        public Driver getDriverElement() {
            return localDriverElement;
        }


        /**
         * Auto generated setter method
         * @param param DriverElement
         */
        public void setDriverElement(Driver param) {

            this.localDriverElement = param;


        }


        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it

            if (localDriverElement == null) {
                throw new org.apache.axis2.databinding.ADBException("DriverElement cannot be null!");
            }
            localDriverElement.serialize(MY_QNAME, xmlWriter);


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://uber.com/DataTypes")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it
            return localDriverElement.getPullParser(MY_QNAME);

        }


        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static DriverElement parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                DriverElement object =
                        new DriverElement();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://uber.com/DataTypes", "DriverElement").equals(reader.getName())) {

                                object.setDriverElement(Driver.Factory.parse(reader));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class GetCustomerResponse
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://uber.com/Elements",
                "GetCustomerResponse",
                "ns2");


        /**
         * field for Customer
         */


        protected Customer localCustomer;


        /**
         * Auto generated getter method
         * @return Customer
         */
        public Customer getCustomer() {
            return localCustomer;
        }


        /**
         * Auto generated setter method
         * @param param Customer
         */
        public void setCustomer(Customer param) {

            this.localCustomer = param;


        }


        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://uber.com/Elements");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":GetCustomerResponse",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetCustomerResponse",
                            xmlWriter);
                }


            }

            if (localCustomer == null) {
                throw new org.apache.axis2.databinding.ADBException("Customer cannot be null!!");
            }
            localCustomer.serialize(new javax.xml.namespace.QName("", "Customer"),
                    xmlWriter);

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://uber.com/Elements")) {
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("",
                    "Customer"));


            if (localCustomer == null) {
                throw new org.apache.axis2.databinding.ADBException("Customer cannot be null!!");
            }
            elementList.add(localCustomer);


            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetCustomerResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                GetCustomerResponse object =
                        new GetCustomerResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetCustomerResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetCustomerResponse) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Customer").equals(reader.getName())) {

                        object.setCustomer(Customer.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class GetDriverResponse
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://uber.com/Elements",
                "GetDriverResponse",
                "ns2");


        /**
         * field for Driver
         */


        protected Driver localDriver;


        /**
         * Auto generated getter method
         * @return Driver
         */
        public Driver getDriver() {
            return localDriver;
        }


        /**
         * Auto generated setter method
         * @param param Driver
         */
        public void setDriver(Driver param) {

            this.localDriver = param;


        }


        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://uber.com/Elements");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":GetDriverResponse",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetDriverResponse",
                            xmlWriter);
                }


            }

            if (localDriver == null) {
                throw new org.apache.axis2.databinding.ADBException("Driver cannot be null!!");
            }
            localDriver.serialize(new javax.xml.namespace.QName("", "Driver"),
                    xmlWriter);

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://uber.com/Elements")) {
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("",
                    "Driver"));


            if (localDriver == null) {
                throw new org.apache.axis2.databinding.ADBException("Driver cannot be null!!");
            }
            elementList.add(localDriver);


            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetDriverResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                GetDriverResponse object =
                        new GetDriverResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetDriverResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetDriverResponse) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Driver").equals(reader.getName())) {

                        object.setDriver(Driver.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class GetDriversRequest
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://uber.com/Elements",
                "GetDriversRequest",
                "ns2");


        /**
         * field for Limit
         */


        protected int localLimit;


        /**
         * Auto generated getter method
         * @return int
         */
        public int getLimit() {
            return localLimit;
        }


        /**
         * Auto generated setter method
         * @param param Limit
         */
        public void setLimit(int param) {

            this.localLimit = param;


        }


        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://uber.com/Elements");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":GetDriversRequest",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GetDriversRequest",
                            xmlWriter);
                }


            }

            namespace = "";
            writeStartElement(null, namespace, "Limit", xmlWriter);

            if (localLimit == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("Limit cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLimit));
            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://uber.com/Elements")) {
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("",
                    "Limit"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLimit));


            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetDriversRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                GetDriversRequest object =
                        new GetDriversRequest();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GetDriversRequest".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetDriversRequest) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Limit").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Limit" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setLimit(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class GiveFeedbackRequest
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://uber.com/Elements",
                "GiveFeedbackRequest",
                "ns2");


        /**
         * field for Id
         */


        protected int localId;


        /**
         * Auto generated getter method
         * @return int
         */
        public int getId() {
            return localId;
        }


        /**
         * Auto generated setter method
         * @param param Id
         */
        public void setId(int param) {

            this.localId = param;


        }


        /**
         * field for Rating
         */


        protected double localRating;


        /**
         * Auto generated getter method
         * @return double
         */
        public double getRating() {
            return localRating;
        }


        /**
         * Auto generated setter method
         * @param param Rating
         */
        public void setRating(double param) {

            this.localRating = param;


        }


        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://uber.com/Elements");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":GiveFeedbackRequest",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "GiveFeedbackRequest",
                            xmlWriter);
                }


            }

            namespace = "";
            writeStartElement(null, namespace, "Id", xmlWriter);

            if (localId == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("Id cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "Rating", xmlWriter);

            if (java.lang.Double.isNaN(localRating)) {

                throw new org.apache.axis2.databinding.ADBException("Rating cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRating));
            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://uber.com/Elements")) {
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("",
                    "Id"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));

            elementList.add(new javax.xml.namespace.QName("",
                    "Rating"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRating));


            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GiveFeedbackRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                GiveFeedbackRequest object =
                        new GiveFeedbackRequest();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"GiveFeedbackRequest".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GiveFeedbackRequest) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Id").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Id" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setId(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("", "Rating").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Rating" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setRating(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    private org.apache.axiom.om.OMElement toOM(com.uber.databaseservice.DatabaseServiceStub.GetDriverRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.uber.databaseservice.DatabaseServiceStub.GetDriverRequest.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.uber.databaseservice.DatabaseServiceStub.GetDriverResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.uber.databaseservice.DatabaseServiceStub.GetDriverResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.uber.databaseservice.DatabaseServiceStub.FaultMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.uber.databaseservice.DatabaseServiceStub.FaultMessage.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.uber.databaseservice.DatabaseServiceStub.GiveFeedbackRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.uber.databaseservice.DatabaseServiceStub.GiveFeedbackRequest.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.uber.databaseservice.DatabaseServiceStub.SuccessMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.uber.databaseservice.DatabaseServiceStub.SuccessMessage.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.uber.databaseservice.DatabaseServiceStub.GetCustomersRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.uber.databaseservice.DatabaseServiceStub.GetCustomersRequest.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.uber.databaseservice.DatabaseServiceStub.GetCustomersResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.uber.databaseservice.DatabaseServiceStub.GetCustomersResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.uber.databaseservice.DatabaseServiceStub.GetCustomerRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.uber.databaseservice.DatabaseServiceStub.GetCustomerRequest.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.uber.databaseservice.DatabaseServiceStub.GetCustomerResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.uber.databaseservice.DatabaseServiceStub.GetCustomerResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.uber.databaseservice.DatabaseServiceStub.GetDriversRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.uber.databaseservice.DatabaseServiceStub.GetDriversRequest.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.uber.databaseservice.DatabaseServiceStub.GetDriversResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.uber.databaseservice.DatabaseServiceStub.GetDriversResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.uber.databaseservice.DatabaseServiceStub.GetDriverRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(com.uber.databaseservice.DatabaseServiceStub.GetDriverRequest.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.uber.databaseservice.DatabaseServiceStub.GiveFeedbackRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(com.uber.databaseservice.DatabaseServiceStub.GiveFeedbackRequest.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.uber.databaseservice.DatabaseServiceStub.GetCustomersRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(com.uber.databaseservice.DatabaseServiceStub.GetCustomersRequest.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.uber.databaseservice.DatabaseServiceStub.GetCustomerRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(com.uber.databaseservice.DatabaseServiceStub.GetCustomerRequest.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.uber.databaseservice.DatabaseServiceStub.GetDriversRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(com.uber.databaseservice.DatabaseServiceStub.GetDriversRequest.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }


    private java.lang.Object fromOM(
            org.apache.axiom.om.OMElement param,
            java.lang.Class type,
            java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {

        try {

            if (com.uber.databaseservice.DatabaseServiceStub.FaultMessage.class.equals(type)) {

                return com.uber.databaseservice.DatabaseServiceStub.FaultMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.uber.databaseservice.DatabaseServiceStub.GetCustomerRequest.class.equals(type)) {

                return com.uber.databaseservice.DatabaseServiceStub.GetCustomerRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.uber.databaseservice.DatabaseServiceStub.GetCustomerResponse.class.equals(type)) {

                return com.uber.databaseservice.DatabaseServiceStub.GetCustomerResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.uber.databaseservice.DatabaseServiceStub.GetCustomersRequest.class.equals(type)) {

                return com.uber.databaseservice.DatabaseServiceStub.GetCustomersRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.uber.databaseservice.DatabaseServiceStub.GetCustomersResponse.class.equals(type)) {

                return com.uber.databaseservice.DatabaseServiceStub.GetCustomersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.uber.databaseservice.DatabaseServiceStub.GetDriverRequest.class.equals(type)) {

                return com.uber.databaseservice.DatabaseServiceStub.GetDriverRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.uber.databaseservice.DatabaseServiceStub.GetDriverResponse.class.equals(type)) {

                return com.uber.databaseservice.DatabaseServiceStub.GetDriverResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.uber.databaseservice.DatabaseServiceStub.GetDriversRequest.class.equals(type)) {

                return com.uber.databaseservice.DatabaseServiceStub.GetDriversRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.uber.databaseservice.DatabaseServiceStub.GetDriversResponse.class.equals(type)) {

                return com.uber.databaseservice.DatabaseServiceStub.GetDriversResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.uber.databaseservice.DatabaseServiceStub.GiveFeedbackRequest.class.equals(type)) {

                return com.uber.databaseservice.DatabaseServiceStub.GiveFeedbackRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.uber.databaseservice.DatabaseServiceStub.SuccessMessage.class.equals(type)) {

                return com.uber.databaseservice.DatabaseServiceStub.SuccessMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }


}
   