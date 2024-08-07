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
@TableName("med_h2_15")
@ApiModel(value="MedH215对象", description="")
public class MedH215 implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "药品id")
    @TableId(value = "medid_H2_15", type = IdType.AUTO)
    private Integer medidH215;

    @ApiModelProperty(value = "药品名字")
    private String medName;

    @ApiModelProperty(value = "药品价格")
    private String medPrice;

    @ApiModelProperty(value = "药品数量")
    private Integer medNum;

    @ApiModelProperty(value = "保质期")
    private String medTerm;

    @ApiModelProperty(value = "采购员编号（即员工id）")
    private Integer emdidH215;


}
