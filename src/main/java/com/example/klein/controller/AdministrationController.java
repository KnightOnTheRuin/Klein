package com.example.klein.controller;

import com.example.klein.entity.Administration;
import com.example.klein.entity.Hotel;
import com.example.klein.service.HotelService;
import com.example.klein.service.AdministrationService;
import com.example.klein.utils.result.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Administration)表控制层
 *
 * @author makejava
 * @since 2022-07-08 19:05:11
 */
@RestController
@RequestMapping("administration")
public class AdministrationController {
    /**
     * 服务对象
     */
    @Resource
    private AdministrationService administrationService;

    @Resource
    private HotelService hotelService;

    /**
     * 分页查询
     *
     * @param administration 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
   /* @GetMapping
    public ResponseEntity<Page<Administration>> queryByPage(Administration administration, PageRequest pageRequest) {
        return ResponseEntity.ok(this.administrationService.queryByPage(administration, pageRequest));
    }
*/
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    /*@GetMapping("{id}")
    public ResponseEntity<Administration> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.administrationService.queryById(id));
    }*/

    @GetMapping("/queryById")
    public Result queryById(@RequestBody long AdministrationId){
        return Result.success(this.administrationService.queryById(AdministrationId));
    }

    /**
     * 新增数据
     *
     * @param administration 实体
     * @return 新增结果
     */
   /* @PostMapping
    public ResponseEntity<Administration> add(Administration administration) {
        return ResponseEntity.ok(this.administrationService.insert(administration));
    }*/

    @PostMapping("/AdministrationAdd")
    public Result AdministrationAdd(@RequestBody Administration administration){

        try{
            Administration _administration=this.administrationService.insert(administration);
            //User _user =  this.userService.insert(user);
            return Result.success(200,"添加成功",_administration);
        }catch (Exception e){
            return Result.fail(402,"添加失败",administration.getAdministratorId());
            //return Result.fail(402,"注册失败",null);
        }
        /*Administration _administration=this.administrationService.insert(administration);
        //User _user =  this.userService.insert(user);
        return Result.success(200,"注册成功",_administration);*/
    }

    /**
     * 编辑数据
     *
     * @param administration 实体
     * @return 编辑结果
     */
    /*@PutMapping
    public ResponseEntity<Administration> edit(Administration administration) {
        return ResponseEntity.ok(this.administrationService.update(administration));
    }*/
    @PutMapping("/updateAdministration")
    public Result updateAdministration(@RequestBody Administration administration) {
        /*Hotel hotel=this.hotelService.queryById(administration.getHotelId());
        if(hotel==null){
            return Result.fail(400,"HotelID外键约束",null);
        }
        Administration _administration = this.administrationService.update(administration);
        if(_administration != null){
            return Result.success(200,"更新成功",_administration);
        }
        else{
            Result r=queryById(administration.getAdministrationId());
            if(r.getData()==null){
                return Result.fail(400,"数据库无此主键ID对应的列",null);
            }
            return Result.fail(400,"其他错误",null);
        }*/
        return Result.fail(400,"此表无法更新",null);
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/deleteAdministrationById")
    public Result deleteAdministrationById(@RequestBody Long AdministrationId) {
        Administration administration=this.administrationService.queryById(AdministrationId);
        if(administration==null){
            return Result.fail(400,"数据库不存在ID对应的列",null);
        }
        boolean mark = this.administrationService.deleteById(AdministrationId);
        if(mark){
            return Result.success(200,"删除成功",null);
        }else{
            return Result.fail(400,"删除失败",null);
        }
    }

}

