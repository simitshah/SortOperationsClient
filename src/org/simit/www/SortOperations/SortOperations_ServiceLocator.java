/**
 * SortOperations_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.simit.www.SortOperations;

public class SortOperations_ServiceLocator extends org.apache.axis.client.Service implements org.simit.www.SortOperations.SortOperations_Service {

    public SortOperations_ServiceLocator() {
    }


    public SortOperations_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SortOperations_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SortOperationsSOAP
    private java.lang.String SortOperationsSOAP_address = "http://localhost:8080/SortOperations/services/SortOperationsSOAP";

    public java.lang.String getSortOperationsSOAPAddress() {
        return SortOperationsSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SortOperationsSOAPWSDDServiceName = "SortOperationsSOAP";

    public java.lang.String getSortOperationsSOAPWSDDServiceName() {
        return SortOperationsSOAPWSDDServiceName;
    }

    public void setSortOperationsSOAPWSDDServiceName(java.lang.String name) {
        SortOperationsSOAPWSDDServiceName = name;
    }

    public org.simit.www.SortOperations.SortOperations_PortType getSortOperationsSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SortOperationsSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSortOperationsSOAP(endpoint);
    }

    public org.simit.www.SortOperations.SortOperations_PortType getSortOperationsSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.simit.www.SortOperations.SortOperationsSOAPStub _stub = new org.simit.www.SortOperations.SortOperationsSOAPStub(portAddress, this);
            _stub.setPortName(getSortOperationsSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSortOperationsSOAPEndpointAddress(java.lang.String address) {
        SortOperationsSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.simit.www.SortOperations.SortOperations_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.simit.www.SortOperations.SortOperationsSOAPStub _stub = new org.simit.www.SortOperations.SortOperationsSOAPStub(new java.net.URL(SortOperationsSOAP_address), this);
                _stub.setPortName(getSortOperationsSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SortOperationsSOAP".equals(inputPortName)) {
            return getSortOperationsSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.simit.org/SortOperations/", "SortOperations");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.simit.org/SortOperations/", "SortOperationsSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SortOperationsSOAP".equals(portName)) {
            setSortOperationsSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
