package cn.chai.user.service;

import cn.chai.user.mapper.UserMapper;
import cn.chai.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName UserService
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/8/7
 * @Version V1.0
 **/
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Long id){
        return this.userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void deleteUserById(Long id){
        this.userMapper.deleteByPrimaryKey(id);
    }

    public List<User> queryUserAll() {
        return userMapper.selectAll();
    }
}
