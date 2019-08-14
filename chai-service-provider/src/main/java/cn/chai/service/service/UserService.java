package cn.chai.service.service;

import cn.chai.service.mapper.UserMapper;
import cn.chai.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/8/13
 * @Version V1.0
 **/
@Service
public class UserService {
    @Autowired
    public UserMapper userMapper;

    public User queryUserById(Long id){
        return this.userMapper.selectByPrimaryKey(id);
    }

}
