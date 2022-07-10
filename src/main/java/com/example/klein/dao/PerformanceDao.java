package com.example.klein.dao;

import com.example.klein.entity.Performance;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * (Performance)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-08 19:08:51
 */
public interface PerformanceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param performanceid 主键
     * @return 实例对象
     */
    Performance queryById(Long performanceid);

    /**
     * 查询指定行数据
     *
     * @param performance 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    /*List<Performance> queryAllByLimit(Performance performance, @Param("pageable") Pageable pageable);*/

    /**
     * 统计总行数
     *
     * @param performance 查询条件
     * @return 总行数
     */
    long count(Performance performance);

    /**
     * 新增数据
     *
     * @param performance 实例对象
     * @return 影响行数
     */
    int insert(Performance performance);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Performance> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Performance> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Performance> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Performance> entities);

    /**
     * 修改数据
     *
     * @param performance 实例对象
     * @return 影响行数
     */
    int update(Performance performance);

    /**
     * 通过主键删除数据
     *
     * @param performanceid 主键
     * @return 影响行数
     */
    int deleteById(Long performanceid);
    /**
     * 通过景区Id查找当前景区的节目表演
     *
     * @param performanceid 主键
     * @return 实例对象
     */


}

