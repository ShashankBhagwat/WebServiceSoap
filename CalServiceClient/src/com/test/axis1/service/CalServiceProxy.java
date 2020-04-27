package com.test.axis1.service;

public class CalServiceProxy implements com.test.axis1.service.CalService {
  private String _endpoint = null;
  private com.test.axis1.service.CalService calService = null;
  
  public CalServiceProxy() {
    _initCalServiceProxy();
  }
  
  public CalServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalServiceProxy();
  }
  
  private void _initCalServiceProxy() {
    try {
      calService = (new com.test.axis1.service.CalServiceServiceLocator()).getCalService();
      if (calService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calService != null)
      ((javax.xml.rpc.Stub)calService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.test.axis1.service.CalService getCalService() {
    if (calService == null)
      _initCalServiceProxy();
    return calService;
  }
  
  public int add(int a, int b) throws java.rmi.RemoteException{
    if (calService == null)
      _initCalServiceProxy();
    return calService.add(a, b);
  }
  
  public int sub(int a, int b) throws java.rmi.RemoteException{
    if (calService == null)
      _initCalServiceProxy();
    return calService.sub(a, b);
  }
  
  
}