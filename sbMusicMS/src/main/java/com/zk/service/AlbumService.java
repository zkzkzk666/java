package com.zk.service;

import com.zk.domain.Album;
import com.zk.util.R;

/**
 * (Album)表服务接口
 *
 * @author makejava
 * @since 2023-06-15 21:28:59
 */
public interface AlbumService {

    /**
     * 通过ID查询单条数据
     *
     * @param albumid 主键
     * @return 实例对象
     */
    R queryById(String albumid);

    /**
     * 全查询
     *
     * @param album 筛选条件
     * @return 查询结果
     */
    R queryAll(Album album);

    /**
     * 新增数据
     *
     * @param album 实例对象
     * @return 实例对象
     */
    R insert(Album album);

    /**
     * 修改数据
     *
     * @param album 实例对象
     * @return 实例对象
     */
    R update(Album album);

    /**
     * 通过主键删除数据
     *
     * @param albumid 主键
     * @return 是否成功
     */
    R deleteById(String albumid);

}
