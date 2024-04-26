package com.zk.mapper;

import com.zk.domain.Singer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SingerMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param singerid 主键
     * @return 实例对象
     */
    Singer queryById(String singerid);

    /**
     * 查询指定行数据
     *
     * @param singer 查询条件
     * @return 对象列表
     */
    List<Singer> queryAll(Singer singer);

    /**
     * 统计总行数
     *
     * @param singer 查询条件
     * @return 总行数
     */
    long count(Singer singer);

    /**
     * 新增数据
     *
     * @param singer 实例对象
     * @return 影响行数
     */
    int insert(Singer singer);

    /**
     * 修改数据
     *
     * @param singer 实例对象
     * @return 影响行数
     */
    int update(Singer singer);

    /**
     * 通过主键删除数据
     *
     * @param singerid 主键
     * @return 影响行数
     */
    int deleteById(String singerid);

}

