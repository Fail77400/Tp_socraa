package com.epita.socra.app;
import com.epita.socra.app.tools.*;

/**
 * Hello world!
 */
public final class App {
    private IOAdapter adapter;

    private App() {
        this(new ConsoleAdapter());
    }

    public App(IOAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App application = new App();
        application.runwhich(application);
    }

    public void runwhich(App application)
    {
        String which = adapter.read();
        if (which.equals("Roman"))
        {
            while (true)
                application.runtoint();
        }
        else if (which.equals("Arabic"))
        {
            while (true)
                application.runtoroman();
        }
    }

    public void run(){
        adapter.write("Hello, what's your name ?");
        String name = adapter.read();
        adapter.write("Nice to meet you, " + name + " !");
    }

    public void runtoroman(){
       // while (true) {
            adapter.write("enter a number to convert");
            String number = adapter.read();
            //if (number.equals("quit") || number.equals("nop"))
              //  break;
            int nb = Integer.parseInt(number);
            Roman r = new Roman();
            adapter.write(r.toRoman(nb));
        //}
    }

    public void runtoint()
    {
        adapter.write("enter a roman number to convert");
        String nb = adapter.read();
        ToInt toint = new ToInt();
        int res = toint.toint(nb);
        adapter.write(Integer.toString(res));
    }

}
