package com.yonghui.springcloud.entity;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author djl
 * @date 2019/8/5 18:31
 */
@Data
public class Dept implements Serializable {
    private Integer deptNo;
    private String dname;
    private String db_source;
}
