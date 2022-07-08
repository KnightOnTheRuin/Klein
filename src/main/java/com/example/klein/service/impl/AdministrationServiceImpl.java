package com.example.klein.service.impl;

import com.example.klein.entity.Administration;
import com.example.klein.dao.AdministrationDao;
import com.example.klein.service.AdministrationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;

/**
 * (Administration)表服务实现类
 *
 * @author makejava
 * @since 2022-07-08 19:05:33
 */
@Service("administrationService")
@Transactional
public class AdministrationServiceImpl implements AdministrationService {
    @Resource
    private AdministrationDao administrationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param administrationid 主键
     * @return 实例对象
     */
    @Override
    public Administration queryById(Long administrationid) {
        return this.administrationDao.queryById(administrationid);
    }

    /**
     * 分页查询
     *
     * @param administration 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*@Override
    public Page<Administration> queryByPage(Administration administration, PageRequest pageRequest) {
        long total = this.administrationDao.count(administration);
        return new PageImpl<>(this.administrationDao.queryAllByLimit(administration, pageRequest), pageRequest, total);
    }*/

    /**
     * 新增数据
     *
     * @param administration 实例对象
     * @return 实例对象
     */
    @Override
    public Administration insert(Administration administration) {
        this.administrationDao.insert(administration);
        return administration;
    }

    /**
     * 修改数据
     *
     * @param administration 实例对象
     * @return 实例对象
     */
    @Override
    public Administration update(Administration administration) {
        this.administrationDao.update(administration);
        return this.queryById(administration.getAdministrationid());
    }

    /**
     * 通过主键删除数据
     *
     * @param administrationid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long administrationid) {
        return this.administrationDao.deleteById(administrationid) > 0;
    }
}
