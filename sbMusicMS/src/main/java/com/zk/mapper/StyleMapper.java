package com.zk.mapper;

import com.zk.domain.Style;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Style)表数据库访问层
 *
 * @author makejava
 * @since 2023-06-15 21:28:29
 */
@Mapper
public interface StyleMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param styleid 主键
     * @return 实例对象
     */
    Style queryById(String styleid);

    /**
     * 查询指定行数据
     *
     * @param style 查询条件
     * @return 对象列表
     */
    List<Style> queryAll(Style style);

    /**
     * 统计总行数
     *
     * @param style 查询条件
     * @return 总行数
     */
    long count(Style style);

    /**
     * 新增数据
     *
     * @param style 实例对象
     * @return 影响行数
     */
    int insert(Style style);
    /**
     * 修改数据
     *
     * @param style 实例对象
     * @return 影响行数
     */
    int update(Style style);

    /**
     * 通过主键删除数据
     *
     * @param styleid 主键
     * @return 影响行数
     */
    int deleteById(String styleid);

    Style queryByName(String stylename);
}

