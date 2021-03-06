package com.uncleray.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@ApiModel("用户实体类")
public class User {

    @NotBlank(message = "sss")
    @ApiModelProperty("用户名称")
    private String username;
    @NotNull(message = "ppp")
    @ApiModelProperty("用户密码")
    private Integer password;

}
