class Sync
{
    int count;
    synchronized void counter()
    {
        count++;
    }
}
class Q6{
    public static void main(String args[])
    {
        Sync s = new Sync();
        Thread t1 = new Thread(new Runnable()
        {
            public void run()
            {
                for (int i = 0; i <= 50; i++){
                    s.counter();
                }
            }
        });
        Thread t2 = new Thread(new Runnable()
        {
            public void run()
            {
                for (int i = 0; i <= 50; i++){
                    s.counter();
                }
            }
        });
        t1.start();
        t2.start();
        System.out.println(s.count);
    }
}