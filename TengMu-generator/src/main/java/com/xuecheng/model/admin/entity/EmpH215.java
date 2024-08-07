package com.xuecheng.model.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author mss
 * @since 2024-05-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("emp_h2_15")
@ApiModel(value="EmpH215对象", description="")
public class EmpH215 implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "员工工号")
    @TableId(value = "empid_H2_15", type = IdType.AUTO)
    private Integer empidH215;

    @ApiModelProperty(value = "员工姓名")
    private String empName;

    @ApiModelProperty(value = "职务")
    private String empOffice;

    @ApiModelProperty(value = "账号")
    private String empUsername;

    @ApiModelProperty(value = "密码")
    private String empPwd;


}
