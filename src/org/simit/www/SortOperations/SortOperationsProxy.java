package org.simit.www.SortOperations;

public class SortOperationsProxy implements org.simit.www.SortOperations.SortOperations_PortType {
  private String _endpoint = null;
  private org.simit.www.SortOperations.SortOperations_PortType sortOperations_PortType = null;
  
  public SortOperationsProxy() {
    _initSortOperationsProxy();
  }
  
  public SortOperationsProxy(String endpoint) {
    _endpoint = endpoint;
    _initSortOperationsProxy();
  }
  
  private void _initSortOperationsProxy() {
    try {
      sortOperations_PortType = (new org.simit.www.SortOperations.SortOperations_ServiceLocator()).getSortOperationsSOAP();
      if (sortOperations_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sortOperations_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sortOperations_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sortOperations_PortType != null)
      ((javax.xml.rpc.Stub)sortOperations_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.simit.www.SortOperations.SortOperations_PortType getSortOperations_PortType() {
    if (sortOperations_PortType == null)
      _initSortOperationsProxy();
    return sortOperations_PortType;
  }
  
  public int[] bubbleSort(int[] in) throws java.rmi.RemoteException{
    if (sortOperations_PortType == null)
      _initSortOperationsProxy();
    return sortOperations_PortType.bubbleSort(in);
  }
  
  public int[] insertionSort(int[] in) throws java.rmi.RemoteException{
    if (sortOperations_PortType == null)
      _initSortOperationsProxy();
    return sortOperations_PortType.insertionSort(in);
  }
  
  public int[] selectionSort(int[] in) throws java.rmi.RemoteException{
    if (sortOperations_PortType == null)
      _initSortOperationsProxy();
    return sortOperations_PortType.selectionSort(in);
  }
  
  public int[] quickSort(int[] in) throws java.rmi.RemoteException{
    if (sortOperations_PortType == null)
      _initSortOperationsProxy();
    return sortOperations_PortType.quickSort(in);
  }
  
  
}