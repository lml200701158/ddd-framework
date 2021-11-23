package com.ddd.api.web;

import com.ddd.api.converter.AuthorizeConverter;
import com.ddd.api.model.req.AuthorizeCreateReq;
import com.ddd.api.model.req.AuthorizeUpdateReq;
import com.ddd.api.model.vo.UserAuthorizeVO;
import com.ddd.applicaiton.dto.UserRoleDTO;
import com.ddd.applicaiton.service.AuthrizeApplicationService;
import com.ddd.common.result.BaseResult;
import com.ddd.common.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户管理web接口
 *
 * @author louzai
 * @since 2021/11/22
 */
@RestController
@RequestMapping("/api/user")
public class AuthorizeController {

    @Autowired
    private AuthorizeConverter authorizeConverter;

    @Autowired
    private AuthrizeApplicationService authrizeApplicationService;

    /**
     * 测试URL：http://127.0.0.1:8087/api/user?userId=xxx
     */
    @GetMapping("/query")
    public Result<UserAuthorizeVO> query(@RequestParam("userId") Long userId){
        UserRoleDTO userRoleDTO = authrizeApplicationService.queryUserAuthorize(userId);
        Result<UserAuthorizeVO> result = new Result<>();
        result.setData(authorizeConverter.toVO(userRoleDTO));
        result.setCode(BaseResult.CODE_SUCCESS);
        return result;
    }

    /**
     * 测试URL：http://127.0.0.1:8087/api/user/delete?userId=xxx
     */
    @PostMapping("/delete")
    public Result<Object> delete(@RequestParam("userId") Long userId){
        authrizeApplicationService.deleteUserAuthorize(userId);
        return Result.ok(BaseResult.DELETE_SUCCESS);
    }

    /**
     * 测试URL：http://127.0.0.1:8087/api/user/save
     * Post Body：{"userName":"louzai","realName":"楼","phone":13123676844,"password":"***","unitId":2,"province":"湖北省","city":"鄂州市","county":"葛店开发区","roles":[{"roleId":2}]}
     */
    @PostMapping("/save")
    public Result<Object> create(@RequestBody AuthorizeCreateReq authorizeCreateReq){
        authrizeApplicationService.createUserAuthorize(authorizeConverter.toDTO(authorizeCreateReq));
        return Result.ok(BaseResult.INSERT_SUCCESS);
    }

    /**
     * 测试URL：http://127.0.0.1:8087/api/user/update
     * Post Body：{"userId":1,"userName":"louzai","realName":"louzai-realname","phone":123,"roles":[{"roleId":2}]}
     */
    @PostMapping("/update")
    public Result<Object> update(@RequestBody AuthorizeUpdateReq authorizeUpdateReq){
        authrizeApplicationService.updateUserAuthorize(authorizeConverter.toDTO(authorizeUpdateReq));
        return Result.ok(BaseResult.UPDATE_SUCCESS);
    }
}
