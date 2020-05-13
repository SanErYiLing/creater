package org.creater.core.user.service.impl;

import org.creater.core.user.entity.User;
import org.apache.dubbo.config.annotation.Service;
import org.creater.core.user.dao.UserDao;
import org.creater.core.user.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author author
 * @since 2020-05-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
