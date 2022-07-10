package com.example.klein.controller;

import com.example.klein.entity.Administration;
import com.example.klein.entity.Entertainment;
import com.example.klein.entity.Entertainmentbelongs;
import com.example.klein.entity.Hotel;
import com.example.klein.service.EntertainmentbelongsService;
import com.example.klein.utils.result.Result;
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
    /*@GetMapping("{id}")
    public ResponseEntity<Entertainmentbelongs> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.entertainmentbelongsService.queryById(id));
    }*/
    @GetMapping("/queryById")
    public Result queryById(@RequestBody long EntertainmentbelongsID){
        return Result.success(this.entertainmentbelongsService.queryById(EntertainmentbelongsID));
    }

    /**
     * 新增数据
     *
     * @param entertainmentbelongs 实体
     * @return 新增结果
     */
    @PostMapping("/EntertainmentbelongsAdd")
    public Result EntertainmentbelongsAdd(@RequestBody Entertainmentbelongs entertainmentbelongs) {
        Entertainmentbelongs _entertainmentbelongs = this.entertainmentbelongsService.insert(entertainmentbelongs);
        try {
            return Result.success(200, "添加成功", _entertainmentbelongs);
        } catch (Exception e) {
            return Result.fail(402, "添加失败", _entertainmentbelongs.getBelongsId());
        }
    }

    /**
     * 编辑数据
     *
     * @param entertainmentbelongs 实体
     * @return 编辑结果
     */
    @PutMapping("/updateEntertainmentbelongs")
    public Result updateEntertainmentbelongs(@RequestBody Entertainmentbelongs entertainmentbelongs) {
        return Result.fail(400,"此表不能更新",null);
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

