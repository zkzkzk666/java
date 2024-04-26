package com.zk.service;

import com.zk.domain.Song;
import com.zk.util.R;

/**
 * (Song)表服务接口
 *
 * @author makejava
 * @since 2023-06-15 21:28:02
 */
public interface SongService {

    /**
     * 通过ID查询单条数据
     *
     * @param songid 主键
     * @return 实例对象
     */
    R queryById(String songid);

    /**
     * 全查询
     *
     * @param song 筛选条件
     * @return 查询结果
     */
    R queryAll(Song song);

    /**
     * 新增数据
     *
     * @param song 实例对象
     * @return 实例对象
     */
    R insert(Song song);

    /**
     * 修改数据
     *
     * @param song 实例对象
     * @return 实例对象
     */
    R update(Song song);

    /**
     * 通过主键删除数据
     *
     * @param songid 主键
     * @return 是否成功
     */
    R deleteById(String songid);

}
