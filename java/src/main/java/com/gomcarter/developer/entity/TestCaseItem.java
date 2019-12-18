package com.gomcarter.developer.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.Date;

/**
 * @author gomcarter on 2019-12-18 16:34:04
 */
@Data
@Accessors(chain = true)
public class TestCaseItem {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;


    /**
     * 具体接口
     */
    private String name;
    /**
     * 结果处理器，存储javascript脚本，此脚本应该return下一个接口的参数
     */
    private String resultHandler;
    /**
     * 接口hash值
     */
    private String hash;
    /**
     * 配置
     */
    private String config;
    /**
     * 接口外键
     */
    private Long fkInterfacesId;
    /**
     * 接口用例外键
     */
    private Long fkTestCaseId;
    /**
     * 
     */
    private Date createTime;
    /**
     * 
     */
    private Date modifyTime;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 入参
     */
    private String parmConfig;

    //@NotReplaceableStart
    // 重新生成代码时，NotReplaceableStart -> NotReplaceableEnd 中间的内容不会被覆盖


    //@NotReplaceableEnd
}
