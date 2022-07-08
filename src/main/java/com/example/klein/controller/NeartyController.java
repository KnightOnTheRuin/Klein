package com.example.klein.controller;

import com.example.klein.entity.Nearty;
import com.example.klein.service.NeartyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Nearty)表控制层
 *
 * @author makejava
 * @since 2022-07-08 19:08:33
 */
@RestController
@RequestMapping("nearty")
public class NeartyController {
    /**
     * 服务对象
     */
    @Resource
    private NeartyService neartyService;

    /**
     * 分页查询
     *
     * @param nearty 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
   /* @GetMapping
    public ResponseEntity<Page<Nearty>> queryByPage(Nearty nearty, PageRequest pageRequest) {
        return ResponseEntity.ok(this.neartyService.queryByPage(nearty, pageRequest));
    }*/

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Nearty> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.neartyService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param nearty 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Nearty> add(Nearty nearty) {
        return ResponseEntity.ok(this.neartyService.insert(nearty));
    }

    /**
     * 编辑数据
     *
     * @param nearty 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Nearty> edit(Nearty nearty) {
        return ResponseEntity.ok(this.neartyService.update(nearty));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.neartyService.deleteById(id));
    }

}

