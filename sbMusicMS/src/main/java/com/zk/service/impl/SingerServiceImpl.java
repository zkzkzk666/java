package com.zk.service.impl;

import lombok.extern.slf4j.Slf4j;
import com.zk.domain.Singer;
import com.zk.mapper.SingerMapper;
import com.zk.service.SingerService;
import com.zk.util.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Singer)表服务实现类
 *
 * @author makejava
 * @since 2023-06-15 21:25:32
 */
@Slf4j
@Service("singerService")
public class SingerServiceImpl implements SingerService {
    @Resource
    private SingerMapper singerMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param singerid 主键
     * @return 实例对象
     */
    @Override
    public R queryById(String singerid) {
        return R.ok().setData(this.singerMapper.queryById(singerid));
    }

    /**
     * 全查询
     *
     * @param singer 筛选条件
     * @return 查询结果
     */
    @Override
    public R queryAll(Singer singer) {
        return R.ok().setData(this.singerMapper.queryAll(singer));
    }

    /**
     * 新增数据
     *
     * @param singer 实例对象
     * @return 实例对象
     */
    @Override
    public R insert(Singer singer) {
        this.singerMapper.insert(singer);
        return R.ok().setData(singer);
    }

    /**
     * 修改数据
     *
     * @param singer 实例对象
     * @return 实例对象
     */
    @Override
    public R update(Singer singer) {
        this.singerMapper.update(singer);
        return R.ok().setData(this.queryById(singer.getSingerid()));
    }

    /**
     * 通过主键删除数据
     *
     * @param singerid 主键
     * @return 是否成功
     */
    @Override
    public R deleteById(String singerid) {
        boolean del = this.singerMapper.deleteById(singerid) > 0;
        return R.ok().setData(del);
    }
}
