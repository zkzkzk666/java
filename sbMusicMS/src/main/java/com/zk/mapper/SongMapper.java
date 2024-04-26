package com.zk.mapper;

import com.zk.domain.Song;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Song)表数据库访问层
 *
 * @author makejava
 * @since 2023-06-15 21:28:02
 */
@Mapper
public interface SongMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param songid 主键
     * @return 实例对象
     */
    Song queryById(String songid);

    /**
     * 查询指定行数据
     *
     * @param song 查询条件
     * @return 对象列表
     */
    List<Song> queryAll(Song song);

    /**
     * 统计总行数
     *
     * @param song 查询条件
     * @return 总行数
     */
    long count(Song song);

    /**
     * 新增数据
     *
     * @param song 实例对象
     * @return 影响行数
     */
    int insert(Song song);

    /**
     * 修改数据
     *
     * @param song 实例对象
     * @return 影响行数
     */
    int update(Song song);

    /**
     * 通过主键删除数据
     *
     * @param songid 主键
     * @return 影响行数
     */
    int deleteById(String songid);

}

