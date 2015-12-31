package com.navinfo.util;

import java.text.ParseException;

import org.apache.log4j.Logger;
import org.quartz.CronTrigger;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzUtil {
    private static SchedulerFactory sf = new StdSchedulerFactory();
    private static String JOB_GROUP_NAME = "group1";
    private static String TRIGGER_GROUP_NAME = "trigger1";

    private final static Logger log = Logger.getLogger(QuartzUtil.class);

    /**
     * 添加一个定时任务，使用默认的任务组名，触发器名，触发器组名
     *
     * @param jobName 任务名
     * @param job     任务
     * @param time    时间设置，参考quartz说明文档
     * @throws SchedulerException
     * @throws ParseException
     */
    public static void addJob(String jobName, Job job, String time)
            throws SchedulerException, ParseException {
        addJob(jobName, JOB_GROUP_NAME, jobName, TRIGGER_GROUP_NAME, job, time);
    }

    /**
     * 添加一个定时任务
     *
     * @param jobName          任务名
     * @param jobGroupName     任务组名
     * @param triggerName      触发器名
     * @param triggerGroupName 触发器组名
     * @param job              任务
     * @param time             时间设置，参考quartz说明文档
     * @throws SchedulerException
     * @throws ParseException
     */
    public static void addJob(String jobName, String jobGroupName,
                              String triggerName, String triggerGroupName, Job job, String time)
            throws SchedulerException, ParseException {
        Scheduler sched = sf.getScheduler();
        JobDetail jobDetail = new JobDetail(jobName, jobGroupName,
                job.getClass());// 任务名，任务组，任务执行类
        // 触发器
        CronTrigger trigger = new CronTrigger(triggerName, triggerGroupName);// 触发器名,触发器组
        trigger.setCronExpression(time);// 触发器时间设定
        sched.scheduleJob(jobDetail, trigger);
        if (!sched.isShutdown()) {
            sched.start();
            log.info(jobName + " 任务的定时器启动，时间规则：" + time);
        }
    }

    /**
     * 移除一个任务(使用默认的任务组名，触发器名，触发器组名)
     *
     * @param jobName
     * @throws SchedulerException
     */
    public static void removeJob(String jobName) throws SchedulerException {
        removeJob(jobName, JOB_GROUP_NAME, jobName, TRIGGER_GROUP_NAME);
    }

    /**
     * 移除一个任务
     *
     * @param jobName
     * @param jobGroupName
     * @param triggerName
     * @param triggerGroupName
     * @throws SchedulerException
     */
    public static void removeJob(String jobName, String jobGroupName,
                                 String triggerName, String triggerGroupName)
            throws SchedulerException {
        Scheduler sched = sf.getScheduler();
        sched.pauseTrigger(triggerName, triggerGroupName);// 停止触发器
        sched.unscheduleJob(triggerName, triggerGroupName);// 移除触发器
        sched.deleteJob(jobName, jobGroupName);// 删除任务
        log.info(jobName + " 任务的定时器已删除");
    }

    /**
     * 修改一个任务的触发时间(使用默认的任务组名，触发器名，触发器组名)     目前不可用
     *
     * @param jobName
     * @param time
     * @throws SchedulerException
     * @throws ParseException

    public static void modifyJobTime(String jobName, String time)
    throws SchedulerException, ParseException {
    Scheduler sched = sf.getScheduler();
    Trigger trigger = sched.getTrigger(jobName, TRIGGER_GROUP_NAME);
    if (trigger != null) {
    CronTrigger ct = (CronTrigger) trigger;
    ct.setCronExpression(time);
    sched.resumeTrigger(jobName, TRIGGER_GROUP_NAME);
    }
    }
     */

    /**
     * 修改一个任务的触发时间     目前不可用
     *
     * @param triggerName
     * @param triggerGroupName
     * @param time
     * @throws SchedulerException
     * @throws ParseException

    public static void modifyJobTime(String triggerName,
    String triggerGroupName, String time) throws SchedulerException,
    ParseException {
    Scheduler sched = sf.getScheduler();
    Trigger trigger = sched.getTrigger(triggerName, triggerGroupName);
    if (trigger != null) {
    CronTrigger ct = (CronTrigger) trigger;
    // 修改时间
    ct.setCronExpression(time);
    // 重启触发器
    sched.resumeTrigger(triggerName, triggerGroupName);
    }
    }
     */
}
