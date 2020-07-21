package com.example.demo.service.impl;

import com.example.demo.domain.SignPdf;
import com.example.demo.mapper.SignPdfMapper;
import com.example.demo.service.SignPdfService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author gxl
 * @date 2020/7/21 14:25
 * Explain:
 */
@Service
public class SignPdfServiceImpl implements SignPdfService {
    @Resource
    private SignPdfMapper signPdfMapper;

    @Override
    public void save(SignPdf signPdf) {
        signPdfMapper.save(signPdf);
    }

    @Override
    public List<SignPdf> queryAll(String appName, String startTime, String endTime) {
        return signPdfMapper.queryAll(appName, startTime, endTime);
    }
}
