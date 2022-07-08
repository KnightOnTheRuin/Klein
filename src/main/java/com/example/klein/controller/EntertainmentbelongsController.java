package com.example.klein.controller;

import com.example.klein.entity.Entertainmentbelongs;
import com.example.klein.service.EntertainmentbelongsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Entertainmentbelongs)表控制层
 *
 * @author makejava
 * @since 2022-07-08 19:06:36
 */
@RestController
@RequestMapping("entertainmentbelongs")
public class EntertainmentbelongsController {
    /**
     * 服务对象
     */
    @Resource
    private EntertainmentbelongsService entertainmentbelongsService;

    /**
     * 分页查询
     *
     * @param entertainmentbelongs 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*@GetMapping
    public ResponseEntity<Page<Entertainmentbelongs>> queryByPage(Entertainmentbelongs entertainmentbelongs, PageRequest pageRequest) {
        return ResponseEntity.ok(this.entertainmentbelongsService.queryByPage(entertainmentbelongs, pageRequest));
    }*/

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Entertainmentbelongs> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.entertainmentbelongsService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param entertainmentbelongs 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Entertainmentbelongs> add(Entertainmentbelongs entertainmentbelongs) {
        return ResponseEntity.ok(this.entertainmentbelongsService.insert(entertainmentbelongs));
    }

    /**
     * 编辑数据
     *
     * @param entertainmentbelongs 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Entertainmentbelongs> edit(Entertainmentbelongs entertainmentbelongs) {
        return ResponseEntity.ok(this.entertainmentbelongsService.update(entertainmentbelongs));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.entertainmentbelongsService.deleteById(id));
    }

}

