package com.guanning.web.wsclient;

/**
 * 调用webservice接口
 */
public class Main {
    public  static void main(String[] args){
        CommonService_Service service_service = new CommonService_Service();
        String result = service_service.getCommonServiceImpPort().sayCXF("hello");
        System.out.print(result);
    }
}
