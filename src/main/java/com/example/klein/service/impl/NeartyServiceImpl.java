package com.example.klein.service.impl;

import com.example.klein.entity.Nearty;
import com.example.klein.dao.NeartyDao;
import com.example.klein.service.NeartyService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;

/**
 * (Nearty)表服务实现类
 *
 * @author makejava
 * @since 2022-07-08 19:08:33
 */
@Service("neartyService")
@Transactional
public class NeartyServiceImpl implements NeartyService {
    @Resource
    private NeartyDao neartyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param neartyid 主键
     * @return 实例对象
     */
    @Override
    public Nearty queryById(Long neartyid) {
        return this.neartyDao.queryById(neartyid);
    }

    /**
     * 分页查询
     *
     * @param nearty 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*@Override
    public Page<Nearty> queryByPage(Nearty nearty, PageRequest pageRequest) {
        long total = this.neartyDao.count(nearty);
        return new PageImpl<>(this.neartyDao.queryAllByLimit(nearty, pageRequest), pageRequest, total);
    }*/

    /**
     * 新增数据
     *
     * @param nearty 实例对象
     * @return 实例对象
     */
    @Override
    public Nearty insert(Nearty nearty) {
        this.neartyDao.insert(nearty);
        return nearty;
    }

    /**
     * 修改数据
     *
     * @param nearty 实例对象
     * @return 实例对象
     */
    @Override
    public Nearty update(Nearty nearty) {
        this.neartyDao.update(nearty);
        return this.queryById(nearty.getNeartyid());
    }

    /**
     * 通过主键删除数据
     *
     * @param neartyid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long neartyid) {
        return this.neartyDao.deleteById(neartyid) > 0;
    }
}
