package coursemanagesystem.service.impl;

import coursemanagesystem.service.TimerService;
import org.springframework.scheduling.annotation.Scheduled;

public class TimerServiceImpl implements TimerService {
    /**
     * 讨论课结束后计算展示得分.
     * <p>对数据库直接操作<br>*条件：讨论课结束<br>
     * @author qinlingyun
     */
    @Scheduled(fixedRate = 5000)
    public void countPresentationGrade(){

    }

    /**
     * 课前将固定小组复制一份作为讨论课小组名单.
     * <p>对数据库直接操作<br>*条件：上课前<br>
     * @author qinlingyun
     */
    @Scheduled(fixedRate = 5000)
    public void fixedGroupToSeminarGroup(){

        return;
    }
}
