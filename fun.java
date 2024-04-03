import java.io.FileInputStream;
class fun {
   public static void main(String[] args){
    /*System.out.println("1");
    System.out.println("2");
    System.out.println("3");
    System.out.println("4");
    System.out.println(100/0);
    System.out.println("6");
    System.out.println("7");*/
    try{
        FileInputStream a= new FileInputStream("d:/xyz.txt");
    }
    catch(Exception e){
        System.out.println("Check file exists or not");
    }
   } 
}
