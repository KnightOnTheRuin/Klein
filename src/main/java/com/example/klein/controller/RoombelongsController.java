package com.example.klein.controller;

import com.example.klein.entity.Roombelongs;
import com.example.klein.service.RoombelongsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Roombelongs)表控制层
 *
 * @author makejava
 * @since 2022-07-08 19:09:22
 */
@RestController
@RequestMapping("roombelongs")
public class RoombelongsController {
    /**
     * 服务对象
     */
    @Resource
    private RoombelongsService roombelongsService;

    /**
     * 分页查询
     *
     * @param roombelongs 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
   /* @GetMapping
    public ResponseEntity<Page<Roombelongs>> queryByPage(Roombelongs roombelongs, PageRequest pageRequest) {
        return ResponseEntity.ok(this.roombelongsService.queryByPage(roombelongs, pageRequest));
    }*/

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Roombelongs> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.roombelongsService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param roombelongs 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Roombelongs> add(Roombelongs roombelongs) {
        return ResponseEntity.ok(this.roombelongsService.insert(roombelongs));
    }

    /**
     * 编辑数据
     *
     * @param roombelongs 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Roombelongs> edit(Roombelongs roombelongs) {
        return ResponseEntity.ok(this.roombelongsService.update(roombelongs));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.roombelongsService.deleteById(id));
    }

}

