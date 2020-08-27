package cn.zh.java.repository;


import cn.zh.java.entity.ColumnInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ColumnInfoRepository extends JpaRepository<ColumnInfo,Long> {

    /**
     * 查询表信息
     * @param tableName 表格名
     */
    List<ColumnInfo> findByTableNameOrderByIdAsc(String tableName);
}
