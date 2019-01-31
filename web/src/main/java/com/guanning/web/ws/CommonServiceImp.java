package com.guanning.web.ws;

import javax.jws.WebService;

import com.guanning.web.mapper.PidMapper;
import com.guanning.web.vo.Pid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 接口实现
 *
 * @author leftso
 *
 */
@WebService(serviceName = "CommonService", // 与接口中指定的name一致
        targetNamespace = "http://www.guanning.com/", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.guanning.web.ws.CommonService"// 接口地址
)
@Component
public class CommonServiceImp implements CommonService {

    @Autowired
    public PidMapper pidMapper;

    @Override
    public String sayHello(String name) {

        Pid pid = pidMapper.selectByPrimaryKey("hello");

        return "Hello ," + pid.getName();
    }

    @Override
    public String sayCXF(String name) {
        return "hello cxf";
    }

}
