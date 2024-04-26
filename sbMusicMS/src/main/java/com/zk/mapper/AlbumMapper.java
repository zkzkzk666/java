package com.zk.mapper;

import com.zk.domain.Album;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AlbumMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param albumid 主键
     * @return 实例对象
     */
    Album queryById(String albumid);

    /**
     * 查询指定行数据
     *
     * @param album 查询条件
     * @return 对象列表
     */
    List<Album> queryAll(Album album);

    /**
     * 统计总行数
     *
     * @param album 查询条件
     * @return 总行数
     */
    long count(Album album);

    /**
     * 新增数据
     *
     * @param album 实例对象
     * @return 影响行数
     */
    int insert(Album album);


    /**
     * 修改数据
     *
     * @param album 实例对象
     * @return 影响行数
     */
    int update(Album album);

    /**
     * 通过主键删除数据
     *
     * @param albumid 主键
     * @return 影响行数
     */
    int deleteById(String albumid);

}

