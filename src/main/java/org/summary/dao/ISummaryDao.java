package org.summary.dao;

import org.apache.ibatis.annotations.Param;
import org.summary.model.Summary;
import org.summary.model.User;

import java.util.Date;

/**
 * Created by CharlesYang on 2018/3/16.
 */
public interface ISummaryDao {
    int saveSummary(Summary summary);

    Summary getUserSummaryByDate(@Param("user") User user,@Param("saveDay")Date date);
}
