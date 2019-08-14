package cn.chai.user.mapper;

import cn.chai.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName UserMapper
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/8/7
 * @Version V1.0
 **/
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {
}
