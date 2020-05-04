package ir.drax.theading;

class MyThread extends Thread {

    public void run ()
    {
        System.out.println ("Daemon is " + isDaemon ());
        while (true);
    }
}
