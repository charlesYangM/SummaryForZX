package org.summary.service.impl;

import org.springframework.stereotype.Service;
import org.summary.model.Summary;
import org.summary.model.User;
import org.summary.service.ISummaryService;

import java.util.Date;

/**
 * Created by CharlesYang on 2018/3/16.
 */
@Service("hah")
public class ISummaryServiceImpl2 implements ISummaryService {
    @Override
    public int saveSummary(Summary summary) {
        return 0;
    }

    @Override
    public Summary getUserSummaryByDate(User user, Date date) {
        return null;
    }
}
