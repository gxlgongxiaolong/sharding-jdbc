package com.example.demo.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author gxl
 * @date 2020/7/21 14:23
 * Explain:
 */
@Data
public class SignPdf implements Serializable {
    private static final long serialVersionUID = 4551086299861355255L;
    private int id;
    private String appName;
    private Date createTime;
}
