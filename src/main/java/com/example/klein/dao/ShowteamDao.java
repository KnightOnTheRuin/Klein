package com.example.klein.dao;

import com.example.klein.entity.Showteam;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Showteam)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-08 19:10:43
 */
public interface ShowteamDao {

    /**
     * 通过ID查询单条数据
     *
     * @param showteamid 主键
     * @return 实例对象
     */
    Showteam queryById(Long showteamid);

    /**
     * 查询指定行数据
     *
     * @param showteam 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    /*List<Showteam> queryAllByLimit(Showteam showteam, @Param("pageable") Pageable pageable);*/

    /**
     * 统计总行数
     *
     * @param showteam 查询条件
     * @return 总行数
     */
    long count(Showteam showteam);

    /**
     * 新增数据
     *
     * @param showteam 实例对象
     * @return 影响行数
     */
    int insert(Showteam showteam);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Showteam> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Showteam> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Showteam> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Showteam> entities);

    /**
     * 修改数据
     *
     * @param showteam 实例对象
     * @return 影响行数
     */
    int update(Showteam showteam);

    /**
     * 通过主键删除数据
     *
     * @param showteamid 主键
     * @return 影响行数
     */
    int deleteById(Long showteamid);

}

