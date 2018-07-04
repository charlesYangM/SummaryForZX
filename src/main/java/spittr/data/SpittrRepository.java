package spittr.data;

import java.util.List;

/**
 * Created by CharlesYang on 2018/7/3/003.
 */
public interface SpittrRepository {
    List<Spittle> findSpittles(long max, int count);
}
