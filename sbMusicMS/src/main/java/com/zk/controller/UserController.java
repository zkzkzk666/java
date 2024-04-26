package com.zk.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import com.zk.domain.User;
import com.zk.service.UserService;
import com.zk.util.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2023-06-21 00:57:45
 */
@Slf4j
@RestController
@RequestMapping("user")
@Api(tags = "(User)表控制层")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 全查询
     *
     * @param user 筛选条件
     * @return 查询结果
     */
    @ApiOperation("全查询")
    @GetMapping("/queryAll")
    public R queryAll(@ApiParam(value = "user 筛选条件") User user) {
        return this.userService.queryAll(user);
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
        return this.userService.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param user 实体
     * @return 新增结果
     */
    @ApiOperation("新增数据")
    @PostMapping("/insert")
    public R add(@ApiParam(value = "user 实体") @RequestBody User user) {
        return this.userService.insert(user);
    }

    /**
     * 编辑数据
     *
     * @param user 实体
     * @return 编辑结果
     */
    @ApiOperation("编辑数据")
    @PutMapping("/update")
    public R edit(@ApiParam(value = "user 实体") @RequestBody User user) {
        return this.userService.update(user);
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
        return this.userService.deleteById(id);
    }

}

