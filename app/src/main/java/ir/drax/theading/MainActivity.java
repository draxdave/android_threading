package ir.drax.theading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.concurrent.ThreadPoolExecutor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (savedInstanceState != null)
            new MyThread ().start ();
        else
        {
            MyThread mt = new MyThread ();
            mt.setDaemon (true);
            mt.start ();
        }
        try
        {
            Thread.sleep (100);
        }
        catch (InterruptedException e)
        {
        }




        /*Thread [] threads = new Thread [Thread.activeCount ()];
        int n = Thread.enumerate (threads);
        System.out.println (n+"****");
        for (int i = 0; i < n; i++)
            System.out.println (threads [i].toString ());*/

        /*
        System.out.println("App started!");
        CThread myThread=new CThread();
        myThread.start();


        try {
            while (myThread.isAlive())
                myThread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        for (int i = 0; i < 50; i++)
            System.out.println ("i = " + i + ", i * i = " + i * i);*/
    }
}
