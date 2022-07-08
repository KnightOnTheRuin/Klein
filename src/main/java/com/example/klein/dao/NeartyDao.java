package com.example.klein.dao;

import com.example.klein.entity.Nearty;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Nearty)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-08 19:08:33
 */
public interface NeartyDao {

    /**
     * 通过ID查询单条数据
     *
     * @param neartyid 主键
     * @return 实例对象
     */
    Nearty queryById(Long neartyid);

    /**
     * 查询指定行数据
     *
     * @param nearty 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    /*List<Nearty> queryAllByLimit(Nearty nearty, @Param("pageable") Pageable pageable);*/

    /**
     * 统计总行数
     *
     * @param nearty 查询条件
     * @return 总行数
     */
    long count(Nearty nearty);

    /**
     * 新增数据
     *
     * @param nearty 实例对象
     * @return 影响行数
     */
    int insert(Nearty nearty);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Nearty> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Nearty> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Nearty> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Nearty> entities);

    /**
     * 修改数据
     *
     * @param nearty 实例对象
     * @return 影响行数
     */
    int update(Nearty nearty);

    /**
     * 通过主键删除数据
     *
     * @param neartyid 主键
     * @return 影响行数
     */
    int deleteById(Long neartyid);

}

