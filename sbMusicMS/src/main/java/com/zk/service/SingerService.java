package com.zk.service;

import com.zk.domain.Singer;
import com.zk.util.R;

/**
 * (Singer)表服务接口
 *
 * @author makejava
 * @since 2023-06-15 21:25:32
 */
public interface SingerService {

    /**
     * 通过ID查询单条数据
     *
     * @param singerid 主键
     * @return 实例对象
     */
    R queryById(String singerid);

    /**
     * 全查询
     *
     * @param singer 筛选条件
     * @return 查询结果
     */
    R queryAll(Singer singer);

    /**
     * 新增数据
     *
     * @param singer 实例对象
     * @return 实例对象
     */
    R insert(Singer singer);

    /**
     * 修改数据
     *
     * @param singer 实例对象
     * @return 实例对象
     */
    R update(Singer singer);

    /**
     * 通过主键删除数据
     *
     * @param singerid 主键
     * @return 是否成功
     */
    R deleteById(String singerid);

}
