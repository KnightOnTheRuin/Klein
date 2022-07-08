package com.example.klein.dao;

import com.example.klein.entity.Entertainment;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Entertainment)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-08 19:06:08
 */
public interface EntertainmentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param entertainmentid 主键
     * @return 实例对象
     */
    Entertainment queryById(Long entertainmentid);

    /**
     * 查询指定行数据
     *
     * @param entertainment 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
   /* List<Entertainment> queryAllByLimit(Entertainment entertainment, @Param("pageable") Pageable pageable);*/

    /**
     * 统计总行数
     *
     * @param entertainment 查询条件
     * @return 总行数
     */
    long count(Entertainment entertainment);

    /**
     * 新增数据
     *
     * @param entertainment 实例对象
     * @return 影响行数
     */
    int insert(Entertainment entertainment);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Entertainment> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Entertainment> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Entertainment> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Entertainment> entities);

    /**
     * 修改数据
     *
     * @param entertainment 实例对象
     * @return 影响行数
     */
    int update(Entertainment entertainment);

    /**
     * 通过主键删除数据
     *
     * @param entertainmentid 主键
     * @return 影响行数
     */
    int deleteById(Long entertainmentid);

}

