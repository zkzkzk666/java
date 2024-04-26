package com.zk.service.impl;

import lombok.extern.slf4j.Slf4j;
import com.zk.domain.User;
import com.zk.mapper.UserMapper;
import com.zk.service.UserService;
import com.zk.util.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2023-06-21 00:57:46
 */
@Slf4j
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    @Override
    public R queryById(String userid) {
        return R.ok().setData(this.userMapper.queryById(userid));
    }

    /**
     * 全查询
     *
     * @param user 筛选条件
     * @return 查询结果
     */
    @Override
    public R queryAll(User user) {
        return R.ok().setData(this.userMapper.queryAll(user));
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public R insert(User user) {
        this.userMapper.insert(user);
        return R.ok().setData(user);
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public R update(User user) {
        this.userMapper.update(user);
        return R.ok().setData(this.queryById(user.getUserid()));
    }

    /**
     * 通过主键删除数据
     *
     * @param userid 主键
     * @return 是否成功
     */
    @Override
    public R deleteById(String userid) {
        boolean del = this.userMapper.deleteById(userid) > 0;
        return R.ok().setData(del);
    }
}
