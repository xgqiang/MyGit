package coursemanagesystem.mapper;

import coursemanagesystem.entity.Event;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Mapper
@Component
public interface TimerMapper {
    /**
     * 插入
     * @param time 事件的时间
     * @param beanName 对象名
     * @param methodName 方法名
     * @param parameter 方法参数
     * @return Integer id
     */
    Integer insertEvent(@Param("time") Date time, @Param("bean_name") String beanName, @Param("method_name") String methodName, @Param("parameter")String parameter);

    /**
     * 更新
     * @param eventId 事件id
     * @param newTime 时间
     * @return Integer id
     */
    Integer updateEvent(@Param("id") BigInteger eventId, @Param("time") Date newTime);

    /**
     *
     * 查找
     * @param now 时间
     * @return 事件列表
     */
    List<Event> selectEvent(@Param("now") Timestamp now);

    /**
     *
     * 删除
     * @param id
     * @return id
     */
    Integer deleteEvent(@Param("id") BigInteger id);
}
