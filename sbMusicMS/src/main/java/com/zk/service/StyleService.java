package com.zk.service;

import com.zk.domain.Style;
import com.zk.util.R;

/**
 * (Style)表服务接口
 *
 * @author makejava
 * @since 2023-06-15 21:28:29
 */
public interface StyleService {

    /**
     * 通过ID查询单条数据
     *
     * @param styleid 主键
     * @return 实例对象
     */
    R queryById(String styleid);

    /**
     * 全查询
     *
     * @param style 筛选条件
     * @return 查询结果
     */
    R queryAll(Style style);

    /**
     * 新增数据
     *
     * @param style 实例对象
     * @return 实例对象
     */
    R insert(Style style);

    /**
     * 修改数据
     *
     * @param style 实例对象
     * @return 实例对象
     */
    R update(Style style);

    /**
     * 通过主键删除数据
     *
     * @param styleid 主键
     * @return 是否成功
     */
    R deleteById(String styleid);

    R queryByName(String stylename);
}
