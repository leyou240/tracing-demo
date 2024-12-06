package cn.test.rpc;

import cn.test.api.Api;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class MyApi implements Api {
    @Override
    public String greet(String name) {
        return "";
    }
}
