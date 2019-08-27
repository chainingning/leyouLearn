package cn.chai.service.client;

import cn.chai.service.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @ClassName UserClientsFallback
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/8/27
 * @Version V1.0
 **/
@Component
public class UserClientsFallback implements UserClient {

    @Override
    public User queryUserById(Long id) {
        User user = new User();
        user.setUsername("服务器正忙，请稍后再试！");
        return user;
    }
}
