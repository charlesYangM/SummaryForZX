package org.summary.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.summary.dao.ISummaryDao;
import org.summary.model.Summary;
import org.summary.model.User;
import org.summary.service.ISummaryService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by CharlesYang on 2018/3/16.
 */
@Service
public class ISummaryServiceImpl implements ISummaryService {

    private static final Log logger = LogFactory.getLog(ISummaryServiceImpl.class);
    @Autowired
    private ISummaryDao summaryDao;

    @Override
    public int saveSummary(Summary summary) {
        return this.summaryDao.saveSummary(summary);
    }

    @Override
    public Summary getUserSummaryByDate(User user, Date saveDay) {
        SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd");
        String TimeString = time.format(saveDay);
        logger.info("ISummaryServiceImpl 的日期是 " + TimeString);
        return this.summaryDao.getUserSummaryByDate(user,saveDay);
    }

}
