package cn.chai.service;

import org.junit.Test;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;

/**
 * @ClassName RibbonLoadBalanceTest
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/8/22
 * @Version V1.0
 **/
public class RibbonLoadBalanceTest {

    private RibbonLoadBalancerClient client;

    @Test
    public void test(){
        for (int i = 0; i < 50; i++) {
            ServiceInstance choose = this.client.choose("service-provider");
            System.out.println(choose.toString() + ":" + choose.getPort());

        }
    }
}
