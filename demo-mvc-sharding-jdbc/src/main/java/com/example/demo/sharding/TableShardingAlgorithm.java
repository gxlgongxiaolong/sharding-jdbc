package com.example.demo.sharding;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

/**
 * @author gxl
 * @date 2020/7/20 20:37
 * Explain: 精准查询
 */
public class TableShardingAlgorithm implements PreciseShardingAlgorithm<Date> {
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Date> preciseShardingValue) {
        try {
            String tableName = preciseShardingValue.getLogicTableName().substring(0, preciseShardingValue.getLogicTableName().lastIndexOf("_"));
            String time = new SimpleDateFormat("yyyyMM").format(preciseShardingValue.getValue());
            return tableName + "_" + time;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
