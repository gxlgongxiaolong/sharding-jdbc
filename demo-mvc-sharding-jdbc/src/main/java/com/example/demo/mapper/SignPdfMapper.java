package com.example.demo.mapper;

import com.example.demo.domain.SignPdf;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author gxl
 * @date 2020/7/21 14:25
 * Explain:
 */
public interface SignPdfMapper {
    void save(SignPdf signPdf);

    List<SignPdf> queryAll(@Param("appName") String appName, @Param("startTime") String startTime, @Param("endTime") String endTime);
}
