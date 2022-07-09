package com.example.klein.dao;

import com.example.klein.entity.Scenicarea;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Scenicarea)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-08 19:10:11
 */
public interface ScenicareaDao {

    /**
     * 通过ID查询单条数据
     *
     * @param scenicareaid 主键
     * @return 实例对象
     */
    Scenicarea queryById(Long scenicareaid);

    /**
     * 查询指定行数据
     *
     * @param scenicarea 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    /*List<Scenicarea> queryAllByLimit(Scenicarea scenicarea, @Param("pageable") Pageable pageable);*/

    /**
     * 统计总行数
     *
     * @param scenicarea 查询条件
     * @return 总行数
     */
    long count(Scenicarea scenicarea);

    /**
     * 新增数据
     *
     * @param scenicarea 实例对象
     * @return 影响行数
     */
    int insert(Scenicarea scenicarea);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Scenicarea> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Scenicarea> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Scenicarea> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Scenicarea> entities);

    /**
     * 修改数据
     *
     * @param scenicarea 实例对象
     * @return 影响行数
     */
    int update(Scenicarea scenicarea);

    /**
     * 通过主键删除数据
     *
     * @param scenicareaid 主键
     * @return 影响行数
     */
    int deleteById(Long scenicareaid);

    /**
     * 通过景区名称模糊查询多条数据
     *
     * @param dimName 非主键
     * @return 实例对象
     */
    //Scenicarea queryById(Long scenicareaid);
    List<Scenicarea> dimQueryByName(String dimName);

}

