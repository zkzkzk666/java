package com.zk.service.impl;

import lombok.extern.slf4j.Slf4j;
import com.zk.domain.Song;
import com.zk.mapper.SongMapper;
import com.zk.service.SongService;
import com.zk.util.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Song)表服务实现类
 *
 * @author makejava
 * @since 2023-06-15 21:28:02
 */
@Slf4j
@Service("songService")
public class SongServiceImpl implements SongService {
    @Resource
    private SongMapper songMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param songid 主键
     * @return 实例对象
     */
    @Override
    public R queryById(String songid) {
        return R.ok().setData(this.songMapper.queryById(songid));
    }

    /**
     * 全查询
     *
     * @param song 筛选条件
     * @return 查询结果
     */
    @Override
    public R queryAll(Song song) {
        return R.ok().setData(this.songMapper.queryAll(song));
    }

    /**
     * 新增数据
     *
     * @param song 实例对象
     * @return 实例对象
     */
    @Override
    public R insert(Song song) {
        this.songMapper.insert(song);
        return R.ok().setData(song);
    }

    /**
     * 修改数据
     *
     * @param song 实例对象
     * @return 实例对象
     */
    @Override
    public R update(Song song) {
        this.songMapper.update(song);
        return R.ok().setData(this.queryById(song.getSongid()));
    }

    /**
     * 通过主键删除数据
     *
     * @param songid 主键
     * @return 是否成功
     */
    @Override
    public R deleteById(String songid) {
        boolean del = this.songMapper.deleteById(songid) > 0;
        return R.ok().setData(del);
    }
}
