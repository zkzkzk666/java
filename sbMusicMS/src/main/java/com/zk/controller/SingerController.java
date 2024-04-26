package com.zk.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import com.zk.domain.Singer;
import com.zk.service.SingerService;
import com.zk.util.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Singer)表控制层
 *
 * @author makejava
 * @since 2023-06-15 21:25:31
 */
@Slf4j
@RestController
@RequestMapping("singer")
@Api(tags = "(Singer)表控制层")
public class SingerController {
    /**
     * 服务对象
     */
    @Resource
    private SingerService singerService;

    /**
     * 全查询
     *
     * @param singer 筛选条件
     * @return 查询结果
     */
    @ApiOperation("全查询")
    @GetMapping("/queryAll")
    public R queryAll(@ApiParam(value = "singer 筛选条件") Singer singer) {
        return this.singerService.queryAll(singer);
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
        return this.singerService.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param singer 实体
     * @return 新增结果
     */
    @ApiOperation("新增数据")
    @PostMapping("/insert")
    public R add(@ApiParam(value = "singer 实体") @RequestBody Singer singer) {
        return this.singerService.insert(singer);
    }

    /**
     * 编辑数据
     *
     * @param singer 实体
     * @return 编辑结果
     */
    @ApiOperation("编辑数据")
    @PutMapping("/update")
    public R edit(@ApiParam(value = "singer 实体") @RequestBody Singer singer) {
        return this.singerService.update(singer);
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
        return this.singerService.deleteById(id);
    }

}

