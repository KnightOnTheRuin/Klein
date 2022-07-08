package com.example.klein.service.impl;

import com.example.klein.entity.Entertainmentbelongs;
import com.example.klein.dao.EntertainmentbelongsDao;
import com.example.klein.service.EntertainmentbelongsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;

/**
 * (Entertainmentbelongs)表服务实现类
 *
 * @author makejava
 * @since 2022-07-08 19:06:36
 */
@Service("entertainmentbelongsService")
@Transactional
public class EntertainmentbelongsServiceImpl implements EntertainmentbelongsService {
    @Resource
    private EntertainmentbelongsDao entertainmentbelongsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param belongsid 主键
     * @return 实例对象
     */
    @Override
    public Entertainmentbelongs queryById(Long belongsid) {
        return this.entertainmentbelongsDao.queryById(belongsid);
    }

    /**
     * 分页查询
     *
     * @param entertainmentbelongs 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*@Override
    public Page<Entertainmentbelongs> queryByPage(Entertainmentbelongs entertainmentbelongs, PageRequest pageRequest) {
        long total = this.entertainmentbelongsDao.count(entertainmentbelongs);
        return new PageImpl<>(this.entertainmentbelongsDao.queryAllByLimit(entertainmentbelongs, pageRequest), pageRequest, total);
    }*/

    /**
     * 新增数据
     *
     * @param entertainmentbelongs 实例对象
     * @return 实例对象
     */
    @Override
    public Entertainmentbelongs insert(Entertainmentbelongs entertainmentbelongs) {
        this.entertainmentbelongsDao.insert(entertainmentbelongs);
        return entertainmentbelongs;
    }

    /**
     * 修改数据
     *
     * @param entertainmentbelongs 实例对象
     * @return 实例对象
     */
    @Override
    public Entertainmentbelongs update(Entertainmentbelongs entertainmentbelongs) {
        this.entertainmentbelongsDao.update(entertainmentbelongs);
        return this.queryById(entertainmentbelongs.getBelongsid());
    }

    /**
     * 通过主键删除数据
     *
     * @param belongsid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long belongsid) {
        return this.entertainmentbelongsDao.deleteById(belongsid) > 0;
    }
}
