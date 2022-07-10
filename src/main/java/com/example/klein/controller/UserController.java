package com.example.klein.controller;

import com.example.klein.entity.Administration;
import com.example.klein.entity.User;
import com.example.klein.service.UserService;
import com.example.klein.utils.result.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2022-07-08 19:11:03
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param userId 主键
     * @return 单条数据
     */
    @GetMapping("/queryById")
    public Result queryById(@RequestBody long userId){
        return Result.success(this.userService.queryById(userId));
    }


    //普通用户登录
    @PostMapping("/userLogin")
    public Result userLogin(@RequestBody User user) {
        User _user = this.userService.userLogin(user.getPhoneNumber(), user.getPassword());
       if(_user != null){
           return Result.success(200,"登陆成功",_user);
       }else{
           return Result.fail(402,"账号或密码错误",null);
       }
    }

    //查询数据库所有数据
    @PostMapping("/queryAll")
    public Result queryAll(){
        Result result = new Result();
        List<User> userList = this.userService.queryAll();
        if(userList != null){
            result.setData(userList);
        }else{
            result.setData(null);
        }
        return Result.success(result.getData());
    }

    /**
     * 新增数据
     *
     * @param user 实体
     * @return 新增结果
     */
    @PostMapping("/userRegister")
    public Result userRegister(@RequestBody User user){
        try{
            User _user =  this.userService.insert(user);
            return Result.success(200,"注册成功",_user);
        }catch (Exception e){
            return Result.fail(402,"注册失败",null);
        }
    }

    /**
     * 编辑数据
     *
     * @param user 实体
     * @return 编辑结果
     */
    @PutMapping("/updateUser")
    public Result updateUser(@RequestBody User user) {
        User newuser = this.userService.queryById(user.getUserid());
        User _user = this.userService.update(user);
        if(newuser != null){
            return Result.success(200,"更新成功",_user);
        }else{
            return Result.fail(400,"更新失败",newuser);
        }
    }

    /**
     * 删除数据
     *
     * @param userId 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/deleteUserById")
    public Result deleteById(@RequestBody Long userId) {
        boolean mark = this.userService.deleteById(userId);
        if(mark){
            return Result.success(200,"删除成功",null);
        }else{
            return Result.fail(400,"删除失败",null);
        }
    }

}

