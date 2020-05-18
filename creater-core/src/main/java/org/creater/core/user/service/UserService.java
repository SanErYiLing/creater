package org.creater.core.user.service;

import org.creater.api.sys.dto.LoginDto;
import org.creater.core.user.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author author
 * @since 2020-05-11
 */
public interface UserService extends IService<User> {

	/**
	 * 登陆
	 * @param loginDto
	 * @return
	 */
	User login(LoginDto loginDto);

}
