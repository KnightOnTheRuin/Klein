package com.example.klein.service.impl;

import com.example.klein.entity.Performance;
import com.example.klein.dao.PerformanceDao;
import com.example.klein.service.PerformanceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * (Performance)表服务实现类
 *
 * @author makejava
 * @since 2022-07-08 19:08:51
 */
@Service("performanceService")
@Transactional
public class PerformanceServiceImpl implements PerformanceService {
    @Resource
    private PerformanceDao performanceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param performanceid 主键
     * @return 实例对象
     */
    @Override
    public Performance queryById(Long performanceid) {
        return this.performanceDao.queryById(performanceid);
    }

    /**
     * 分页查询
     *
     * @param performance 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*@Override
    public Page<Performance> queryByPage(Performance performance, PageRequest pageRequest) {
        long total = this.performanceDao.count(performance);
        return new PageImpl<>(this.performanceDao.queryAllByLimit(performance, pageRequest), pageRequest, total);
    }*/

    /**
     * 新增数据
     *
     * @param performance 实例对象
     * @return 实例对象
     */
    @Override
    public Performance insert(Performance performance) {
        this.performanceDao.insert(performance);
        return performance;
    }

    /**
     * 修改数据
     *
     * @param performance 实例对象
     * @return 实例对象
     */
    @Override
    public Performance update(Performance performance) {
        this.performanceDao.update(performance);
        return this.queryById(performance.getPerformanceId());
    }

    /**
     * 通过主键删除数据
     *
     * @param performanceid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long performanceid) {
        return this.performanceDao.deleteById(performanceid) > 0;
    }
}
