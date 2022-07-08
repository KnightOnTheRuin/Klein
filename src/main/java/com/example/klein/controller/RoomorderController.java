package com.example.klein.controller;

import com.example.klein.entity.Roomorder;
import com.example.klein.service.RoomorderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Roomorder)表控制层
 *
 * @author makejava
 * @since 2022-07-08 19:09:37
 */
@RestController
@RequestMapping("roomorder")
public class RoomorderController {
    /**
     * 服务对象
     */
    @Resource
    private RoomorderService roomorderService;

    /**
     * 分页查询
     *
     * @param roomorder 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*@GetMapping
    public ResponseEntity<Page<Roomorder>> queryByPage(Roomorder roomorder, PageRequest pageRequest) {
        return ResponseEntity.ok(this.roomorderService.queryByPage(roomorder, pageRequest));
    }*/

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Roomorder> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.roomorderService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param roomorder 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Roomorder> add(Roomorder roomorder) {
        return ResponseEntity.ok(this.roomorderService.insert(roomorder));
    }

    /**
     * 编辑数据
     *
     * @param roomorder 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Roomorder> edit(Roomorder roomorder) {
        return ResponseEntity.ok(this.roomorderService.update(roomorder));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.roomorderService.deleteById(id));
    }

}

