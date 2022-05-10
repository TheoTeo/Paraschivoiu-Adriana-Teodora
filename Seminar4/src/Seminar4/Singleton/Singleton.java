package Seminar4.Singleton;

public class Singleton {
//    private static Singleton instanta=new Singleton();
//
//    private Singleton() {
//    }
//
//    public static Singleton getInstance(){
//        return instanta;
//    }
private static Singleton instanta=null;

    private Singleton() {
    }

    public static synchronized Singleton getInstance(){
        if(instanta==null){
            instanta=new Singleton();
        }
        return instanta;
    }
}
