package spittr.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by CharlesYang on 2018/7/3/003.
 */
public class SpittrRepo implements SpittrRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> spittles = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            spittles.add(new Spittle("Spittle" + i, new Date(),
                    10 + Math.random() * (20 - 10),10 + Math.random() * (20 - 10)));
        }
        return spittles;
    }
}
