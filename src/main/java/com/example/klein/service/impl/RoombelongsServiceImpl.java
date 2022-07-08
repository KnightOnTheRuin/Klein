package com.example.klein.service.impl;

import com.example.klein.entity.Roombelongs;
import com.example.klein.dao.RoombelongsDao;
import com.example.klein.service.RoombelongsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * (Roombelongs)表服务实现类
 *
 * @author makejava
 * @since 2022-07-08 19:09:22
 */
@Service("roombelongsService")
@Transactional
public class RoombelongsServiceImpl implements RoombelongsService {
    @Resource
    private RoombelongsDao roombelongsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param belongsid 主键
     * @return 实例对象
     */
    @Override
    public Roombelongs queryById(Long belongsid) {
        return this.roombelongsDao.queryById(belongsid);
    }

    /**
     * 分页查询
     *
     * @param roombelongs 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*@Override
    public Page<Roombelongs> queryByPage(Roombelongs roombelongs, PageRequest pageRequest) {
        long total = this.roombelongsDao.count(roombelongs);
        return new PageImpl<>(this.roombelongsDao.queryAllByLimit(roombelongs, pageRequest), pageRequest, total);
    }*/

    /**
     * 新增数据
     *
     * @param roombelongs 实例对象
     * @return 实例对象
     */
    @Override
    public Roombelongs insert(Roombelongs roombelongs) {
        this.roombelongsDao.insert(roombelongs);
        return roombelongs;
    }

    /**
     * 修改数据
     *
     * @param roombelongs 实例对象
     * @return 实例对象
     */
    @Override
    public Roombelongs update(Roombelongs roombelongs) {
        this.roombelongsDao.update(roombelongs);
        return this.queryById(roombelongs.getBelongsid());
    }

    /**
     * 通过主键删除数据
     *
     * @param belongsid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long belongsid) {
        return this.roombelongsDao.deleteById(belongsid) > 0;
    }
}
