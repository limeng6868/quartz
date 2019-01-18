import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerException;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author limeng
 * @date 2019/1/18 17:23
 */
public class MyJob  implements Job{
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("---------------------:"+sdf.format(new Date()));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            QuartzManager.safeShutdown();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }

    }
}
