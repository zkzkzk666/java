package com.zk.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import com.zk.domain.Song;
import com.zk.service.SongService;
import com.zk.util.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Song)表控制层
 *
 * @author makejava
 * @since 2023-06-15 21:28:01
 */
@Slf4j
@RestController
@RequestMapping("song")
@Api(tags = "(Song)表控制层")
public class SongController {
    /**
     * 服务对象
     */
    @Resource
    private SongService songService;

    /**
     * 全查询
     *
     * @param song 筛选条件
     * @return 查询结果
     */
    @ApiOperation("全查询")
    @GetMapping("/queryAll")
    public R queryAll(@ApiParam(value = "song 筛选条件") Song song) {
        return this.songService.queryAll(song);
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
        return this.songService.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param song 实体
     * @return 新增结果
     */
    @ApiOperation("新增数据")
    @PostMapping("/insert")
    public R add(@ApiParam(value = "song 实体") @RequestBody Song song) {
        return this.songService.insert(song);
    }

    /**
     * 编辑数据
     *
     * @param song 实体
     * @return 编辑结果
     */
    @ApiOperation("编辑数据")
    @PutMapping("/update")
    public R edit(@ApiParam(value = "song 实体") @RequestBody Song song) {

        return this.songService.update(song);
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
        return this.songService.deleteById(id);
    }

}

