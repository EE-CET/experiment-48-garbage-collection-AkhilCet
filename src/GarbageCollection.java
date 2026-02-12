import java.util.*;


class GarbageDemo {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collected");
        super.finalize();
    }
}


public class GarbageCollection {
   public static void main(String[] args)
   {
      GarbageDemo obj = new GarbageDemo();
      obj = null; 
      System.gc();
   }  
}
