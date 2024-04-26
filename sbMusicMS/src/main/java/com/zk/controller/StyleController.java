package com.zk.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import com.zk.domain.Style;
import com.zk.service.StyleService;
import com.zk.util.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Style)表控制层
 *
 * @author makejava
 * @since 2023-06-15 21:28:29
 */
@Slf4j
@RestController
@RequestMapping("style")
@Api(tags = "(Style)表控制层")
public class StyleController {
    /**
     * 服务对象
     */
    @Resource
    private StyleService styleService;

    /**
     * 全查询
     *
     * @param style 筛选条件
     * @return 查询结果
     */
    @ApiOperation("全查询")
    @GetMapping("/queryAll")
    public R queryAll(@ApiParam(value = "style 筛选条件") Style style) {
        return this.styleService.queryAll(style);
    }

    @ApiOperation("根据字段名查询数据")
    @GetMapping("/queryByName/{stylename}")
    public R queryByName(@ApiParam(value = "stylename") @PathVariable("stylename") String stylename) {
        return this.styleService.queryByName(stylename);
    }
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("通过主键查询单条数据")
    @GetMapping("/queryById/{id}")
    public R queryById(@ApiParam(value = "id 主键") @PathVariable("id") String id) {
        return this.styleService.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param style 实体
     * @return 新增结果
     */
    @ApiOperation("新增数据")
    @PostMapping("/insert")
    public R add(@ApiParam(value = "style 实体") @RequestBody Style style) {
        return this.styleService.insert(style);
    }

    /**
     * 编辑数据
     *
     * @param style 实体
     * @return 编辑结果
     */
    @ApiOperation("编辑数据")
    @PutMapping("/update")
    public R edit(@ApiParam(value = "style 实体") @RequestBody Style style) {
        return this.styleService.update(style);
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @ApiOperation("删除数据")
    @DeleteMapping("/delete/{id}")
    public R deleteById(@ApiParam(value = "id 主键") @PathVariable("id") String id) {
        return this.styleService.deleteById(id);
    }

}

