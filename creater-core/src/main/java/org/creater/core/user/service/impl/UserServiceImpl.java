package org.creater.core.user.service.impl;

import java.util.Objects;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcException;
import org.creater.api.sys.dto.LoginDto;
import org.creater.core.user.dao.UserDao;
import org.creater.core.user.entity.User;
import org.creater.core.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
	
	@Autowired
	private UserDao userDao;

	@Override
	public User login(LoginDto loginDto) {
		User select = new User();
		select.setUsername(loginDto.getUsername());
		User selectOne = userDao.selectOne(new QueryWrapper<>(select));
		if(Objects.isNull(selectOne)||!loginDto.getPassword().equals(selectOne.getPassword())) {
			throw new RpcException("账号或密码错误");
		}
		return selectOne;
	}
}
