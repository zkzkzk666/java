package com.zk.service.impl;

import lombok.extern.slf4j.Slf4j;
import com.zk.domain.Style;
import com.zk.mapper.StyleMapper;
import com.zk.service.StyleService;
import com.zk.util.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Style)表服务实现类
 *
 * @author makejava
 * @since 2023-06-15 21:28:29
 */
@Slf4j
@Service("styleService")
public class StyleServiceImpl implements StyleService {
    @Resource
    private StyleMapper styleMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param styleid 主键
     * @return 实例对象
     */
    @Override
    public R queryById(String styleid) {

        return R.ok().setData(this.styleMapper.queryById(styleid));
    }
    @Override
    public R queryByName(String stylename) {
        return R.ok().setData(this.styleMapper.queryByName(stylename));
    }

    /**
     * 全查询
     *
     * @param style 筛选条件
     * @return 查询结果
     */
    @Override
    public R queryAll(Style style) {
        return R.ok().setData(this.styleMapper.queryAll(style));
    }

    /**
     * 新增数据
     *
     * @param style 实例对象
     * @return 实例对象
     */
    @Override
    public R insert(Style style) {
        this.styleMapper.insert(style);
        return R.ok().setData(style);
    }

    /**
     * 修改数据
     *
     * @param style 实例对象
     * @return 实例对象
     */
    @Override
    public R update(Style style) {
        this.styleMapper.update(style);
        return R.ok().setData(this.queryById(style.getStyleid()));
    }

    /**
     * 通过主键删除数据
     *
     * @param styleid 主键
     * @return 是否成功
     */
    @Override
    public R deleteById(String styleid) {
        boolean del = this.styleMapper.deleteById(styleid) > 0;
        return R.ok().setData(del);
    }
}


