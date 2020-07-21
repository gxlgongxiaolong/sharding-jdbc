package com.example.demo.jpa.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author gxl
 * @date 2020/7/21 15:53
 * Explain:
 */
@Data
@Entity
@Table(name = "signpdf_202001")
public class SignPdf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "app_name")
    private String appName;
    @Column(name = "create_time")
    private Date createTime;
}
