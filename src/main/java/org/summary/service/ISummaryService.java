package org.summary.service;

import org.summary.model.Summary;
import org.summary.model.User;

import java.util.Date;

/**
 * Created by CharlesYang on 2018/3/16.
 */
public interface ISummaryService {
    int saveSummary(Summary summary);
    Summary getUserSummaryByDate(User user,Date date);
}
