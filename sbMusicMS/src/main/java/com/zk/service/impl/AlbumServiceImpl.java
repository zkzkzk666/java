package com.zk.service.impl;

import lombok.extern.slf4j.Slf4j;
import com.zk.domain.Album;
import com.zk.mapper.AlbumMapper;
import com.zk.service.AlbumService;
import com.zk.util.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Album)表服务实现类
 *
 * @author makejava
 * @since 2023-06-15 21:28:59
 */
@Slf4j
@Service("albumService")
public class AlbumServiceImpl implements AlbumService {
    @Resource
    private AlbumMapper albumMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param albumid 主键
     * @return 实例对象
     */
    @Override
    public R queryById(String albumid) {
        return R.ok().setData(this.albumMapper.queryById(albumid));
    }

    /**
     * 全查询
     *
     * @param album 筛选条件
     * @return 查询结果
     */
    @Override
    public R queryAll(Album album) {
        return R.ok().setData(this.albumMapper.queryAll(album));
    }

    /**
     * 新增数据
     *
     * @param album 实例对象
     * @return 实例对象
     */
    @Override
    public R insert(Album album) {
        this.albumMapper.insert(album);
        return R.ok().setData(album);
    }

    /**
     * 修改数据
     *
     * @param album 实例对象
     * @return 实例对象
     */
    @Override
    public R update(Album album) {
        this.albumMapper.update(album);
        return R.ok().setData(this.queryById(album.getAlbumid()));
    }

    /**
     * 通过主键删除数据
     *
     * @param albumid 主键
     * @return 是否成功
     */
    @Override
    public R deleteById(String albumid) {
        boolean del = this.albumMapper.deleteById(albumid) > 0;
        return R.ok().setData(del);
    }
}
