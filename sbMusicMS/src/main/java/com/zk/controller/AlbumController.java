package com.zk.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import com.zk.domain.Album;
import com.zk.service.AlbumService;
import com.zk.util.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Album)表控制层
 *
 * @author makejava
 * @since 2023-06-15 21:28:59
 */
@Slf4j
@RestController
@RequestMapping("album")
@Api(tags = "(Album)表控制层")
public class AlbumController {
    /**
     * 服务对象
     */
    @Resource
    private AlbumService albumService;

    /**
     * 全查询
     *
     * @param album 筛选条件
     * @return 查询结果
     */
    @ApiOperation("全查询")
    @GetMapping("/queryAll")
    public R queryAll(@ApiParam(value = "album 筛选条件") Album album) {
        return this.albumService.queryAll(album);
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
        return this.albumService.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param album 实体
     * @return 新增结果
     */
    @ApiOperation("新增数据")
    @PostMapping("/insert")
    public R add(@ApiParam(value = "album 实体") @RequestBody Album album) {
        return this.albumService.insert(album);
    }

    /**
     * 编辑数据
     *
     * @param album 实体
     * @return 编辑结果
     */
    @ApiOperation("编辑数据")
    @PutMapping("/update")
    public R edit(@ApiParam(value = "album 实体") @RequestBody Album album) {
        return this.albumService.update(album);
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
        return this.albumService.deleteById(id);
    }

}

