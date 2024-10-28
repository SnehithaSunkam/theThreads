import java.util.*;
class sumthread extends thread{
    public void run(){
        int i,s=0;
        for(i=0;i<=10;i++){
            s=s+i;
            System.out.println("sum:"+s);
            try{
                thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println("ERROR");
            }
        }
    }
}
class productthread extends thread{
    public void run(){
        int i,p=1;
        for(i=0;i<=10;i++){
            p=p*i;
            System.out.println("product:"+p);
            try{
                thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println("ERROR");
            }
        }
    }
}
class Main{
    public static void main(String s[]){
        sumthread st = new sumthread();
        productthread pt = new productthread();
        st.start();
        pt.start();
    }
}
