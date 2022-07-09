package com.example.klein.service.impl;

import com.example.klein.entity.Entertainment;
import com.example.klein.dao.EntertainmentDao;
import com.example.klein.service.EntertainmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * (Entertainment)表服务实现类
 *
 * @author makejava
 * @since 2022-07-08 19:06:08
 */
@Service("entertainmentService")
@Transactional
public class EntertainmentServiceImpl implements EntertainmentService {
    @Resource
    private EntertainmentDao entertainmentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param entertainmentid 主键
     * @return 实例对象
     */
    @Override
    public Entertainment queryById(Long entertainmentid) {
        return this.entertainmentDao.queryById(entertainmentid);
    }

    /**
     * 分页查询
     *
     * @param entertainment 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*@Override
    public Page<Entertainment> queryByPage(Entertainment entertainment, PageRequest pageRequest) {
        long total = this.entertainmentDao.count(entertainment);
        return new PageImpl<>(this.entertainmentDao.queryAllByLimit(entertainment, pageRequest), pageRequest, total);
    }*/

    /**
     * 新增数据
     *
     * @param entertainment 实例对象
     * @return 实例对象
     */
    @Override
    public Entertainment insert(Entertainment entertainment) {
        this.entertainmentDao.insert(entertainment);
        return entertainment;
    }

    /**
     * 修改数据
     *
     * @param entertainment 实例对象
     * @return 实例对象
     */
    @Override
    public Entertainment update(Entertainment entertainment) {
        this.entertainmentDao.update(entertainment);
        return this.queryById(entertainment.getEntertainmentId());
    }

    /**
     * 通过主键删除数据
     *
     * @param entertainmentid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long entertainmentid) {
        return this.entertainmentDao.deleteById(entertainmentid) > 0;
    }
}
