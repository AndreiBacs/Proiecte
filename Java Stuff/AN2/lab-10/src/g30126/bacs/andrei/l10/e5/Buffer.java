package g30126.bacs.andrei.l10.e5;

import java.util.ArrayList;

public class Buffer {
	ArrayList content = new ArrayList();
	 synchronized void push(double d)
     {
           content.add(new Double(d));
           notify();
     }
	 synchronized double get()
     {
           double d=-1;
           try
           {
                 while(content.size()==0) wait();
                 d = (((Double)content.get(0))).doubleValue();
                 content.remove(0);
           }catch(Exception e){e.printStackTrace();}
           return d;
     }
}
