package g30126.bacs.andrei.l8.e1;

public class CoffeTest {
    public static int count=0;
    public static void main(String[] args) {
         CofeeMaker mk = new CofeeMaker();
         CofeeDrinker d = new CofeeDrinker();
         for(int i = 0;i<15;i++){
               Cofee c = mk.makeCofee();
             
               try {
                     d.drinkCofee(c);
               } catch (TemperatureException e) {
                     System.out.println("Exception:"+e.getMessage()+" temp="+e.getTemp());
               } catch (ConcentrationException e) {
                     System.out.println("Exception:"+e.getMessage()+" conc="+e.getConc());
               }catch (TooManyCoffeException e) {
            	   	 System.out.println("Exception:"+e.getMessage()+" nr="+e.getNr());
               }
               finally{
                     System.out.println("Throw the cofee cup.\n");
               }
         }    
   }
}//.class

class CofeeMaker {
    
   Cofee makeCofee(){
         System.out.println("Make a coffe");
         int t = (int)(Math.random()*100);
         int c = (int)(Math.random()*100);
         
         Cofee cofee = new Cofee(t,c,CoffeTest.count);
         CoffeTest.count=CoffeTest.count+1;
         return cofee;
   }

}//.class

class Cofee{
   private int temp;
   private int conc;
   private int count;
   Cofee(int t,int c,int count){temp = t;conc = c;this.count=count;}
   int getTemp(){return temp;}
   int getConc(){return conc;}
   int getCount() {return this.count;}
   public String toString(){return "[cofee temperature="+temp+":concentration="+conc+"]";}
}//.class

class CofeeDrinker{
   void drinkCofee(Cofee c) throws TemperatureException, ConcentrationException,TooManyCoffeException{
       		if(c.getCount()>4)
       			throw new TooManyCoffeException(c.getCount(),"too many coffes");
       		if(c.getTemp()>60)
               throw new TemperatureException(c.getTemp(),"Cofee is to hot!");
       		if(c.getConc()>50)
               throw new ConcentrationException(c.getConc(),"Cofee concentration to high!");        
         
             
         System.out.println("Drink cofee:"+c);
         
   }
}//.class

class TemperatureException extends Exception{
   int t;
   public TemperatureException(int t,String msg) {
         super(msg);
         this.t = t;
   }

   int getTemp(){
         return t;
   }
}//.class

class ConcentrationException extends Exception{
   int c;
   public ConcentrationException(int c,String msg) {
         super(msg);
         this.c = c;
   }

   int getConc(){
         return c;
   }
}//.class

class TooManyCoffeException extends Exception{
     int nr;//numar de cafele
     public TooManyCoffeException(int nr,String msg) {
         super(msg);
         this.nr=nr;
     }
     int getNr() {
         return nr;
     }
}

