package com.example.klein.service.impl;

import com.example.klein.entity.Scenicarea;
import com.example.klein.dao.ScenicareaDao;
import com.example.klein.service.ScenicareaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Scenicarea)表服务实现类
 *
 * @author makejava
 * @since 2022-07-08 19:10:23
 */
@Service("scenicareaService")
@Transactional
public class ScenicareaServiceImpl implements ScenicareaService {
    @Resource
    private ScenicareaDao scenicareaDao;

    /**
     * 通过ID查询单条数据
     *
     * @param scenicareaid 主键
     * @return 实例对象
     */
    @Override
    public Scenicarea queryById(Long scenicareaid) {
        return this.scenicareaDao.queryById(scenicareaid);
    }

    /**
     * 分页查询
     *
     * @param scenicarea 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*@Override
    public Page<Scenicarea> queryByPage(Scenicarea scenicarea, PageRequest pageRequest) {
        long total = this.scenicareaDao.count(scenicarea);
        return new PageImpl<>(this.scenicareaDao.queryAllByLimit(scenicarea, pageRequest), pageRequest, total);
    }*/

    /**
     * 新增数据
     *
     * @param scenicarea 实例对象
     * @return 实例对象
     */
    @Override
    public Scenicarea insert(Scenicarea scenicarea) {
        this.scenicareaDao.insert(scenicarea);
        return scenicarea;
    }

    /**
     * 修改数据
     *
     * @param scenicarea 实例对象
     * @return 实例对象
     */
    @Override
    public Scenicarea update(Scenicarea scenicarea) {
        this.scenicareaDao.update(scenicarea);
        return this.queryById(scenicarea.getScenicAreaId());
    }

    /**
     * 通过主键删除数据
     *
     * @param scenicareaid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long scenicareaid) {
        return this.scenicareaDao.deleteById(scenicareaid) > 0;
    }

    @Override
    public List<Scenicarea> dimQueryByName(String dimName) {
        return this.scenicareaDao.dimQueryByName("%"+dimName+"%");
    }
}
