package com.example.klein.dao;

import com.example.klein.entity.Administration;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Administration)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-08 19:05:13
 */
public interface AdministrationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param administrationid 主键
     * @return 实例对象
     */
    Administration queryById(Long administrationid);

    /**
     * 查询指定行数据
     *
     * @param administration 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
   /* List<Administration> queryAllByLimit(Administration administration, @Param("pageable") Pageable pageable);*/

    /**
     * 统计总行数
     *
     * @param administration 查询条件
     * @return 总行数
     */
    long count(Administration administration);

    /**
     * 新增数据
     *
     * @param administration 实例对象
     * @return 影响行数
     */
    int insert(Administration administration);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Administration> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Administration> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Administration> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Administration> entities);

    /**
     * 修改数据
     *
     * @param administration 实例对象
     * @return 影响行数
     */
    int update(Administration administration);

    /**
     * 通过主键删除数据
     *
     * @param administrationid 主键
     * @return 影响行数
     */
    int deleteById(Long administrationid);

}

