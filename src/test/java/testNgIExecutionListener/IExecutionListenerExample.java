package testNgIExecutionListener;

import org.testng.IExecutionListener;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class IExecutionListenerExample implements IExecutionListener {
    private long starTime;
    public void onExecutionStart() {
        System.out.println("TestNg is going to star");
        starTime = System.currentTimeMillis();
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("TestsNG is started at: " + timeStamp);
    }

    public void onExecutionFinish() {
        System.out.println("TestNG is finished at: " + ((System.currentTimeMillis()) - starTime) + "ms");
    }
}
