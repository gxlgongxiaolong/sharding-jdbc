package com.example.demo.service;

import com.example.demo.domain.SignPdf;

import java.util.Date;
import java.util.List;

/**
 * @author gxl
 * @date 2020/7/21 14:25
 * Explain:
 */
public interface SignPdfService {
    void save(SignPdf signPdf);

    List<SignPdf> queryAll(String appName, Date startT, Date endT, Date time);
}
