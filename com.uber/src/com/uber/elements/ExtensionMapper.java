
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

        
            package com.uber.elements;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://uber.com/DataTypes".equals(namespaceURI) &&
                  "Location".equals(typeName)){
                   
                            return  com.uber.datatypes.Location.Factory.parse(reader);
                        

                  }
                  

                  if (
                  "http://uber.com/DataTypes".equals(namespaceURI) &&
                  "Person".equals(typeName)){
                   
                            return  com.uber.datatypes.Person.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://uber.com/DataTypes".equals(namespaceURI) &&
                  "Driver".equals(typeName)){
                   
                            return  com.uber.datatypes.Driver.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://uber.com/DataTypes".equals(namespaceURI) &&
                  "Customer".equals(typeName)){
                   
                            return  com.uber.datatypes.Customer.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    