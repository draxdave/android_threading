package ir.drax.theading;

import android.util.Log;

public class CThread extends Thread implements Thread.UncaughtExceptionHandler {

    public CThread() {
        super("Hey!");
        setUncaughtExceptionHandler(this);
    }

    @Override
    public void run() {

        try {
            Log.e("CThread","OK");
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int count = 1, row = 1; row < 20; row++, count++)
        {
            for (int i = 0; i < count; i++)
                System.out.print ('*');
            System.out.print ('\n');
        }
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {

    }
}
