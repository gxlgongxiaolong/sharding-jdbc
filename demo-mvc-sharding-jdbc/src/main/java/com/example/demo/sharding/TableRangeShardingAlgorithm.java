package com.example.demo.sharding;

import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

/**
 * @author gxl
 * @date 2020/7/20 20:39
 * Explain: 范围查询
 */
public class TableRangeShardingAlgorithm implements RangeShardingAlgorithm<Date> {
    @Override
    public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<Date> rangeShardingValue) {
        try {
            String tableName = rangeShardingValue.getLogicTableName().substring(0, rangeShardingValue.getLogicTableName().lastIndexOf("_"));
            Collection<String> result = new LinkedList<>();
            result.add(tableName + "_" + new SimpleDateFormat("yyyyMM").format(rangeShardingValue.getValueRange().lowerEndpoint()));
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
