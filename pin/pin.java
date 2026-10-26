import java.util.Scanner;

class pin {
  public static void main(String[] args) {
    int attempt = 3;
    Scanner myObj = new Scanner(System.in);

    
    String heslo = "123";
    while (attempt > 0) {
      System.out.println("Zadejte pin");
      
      String heslotip = myObj.nextLine();
      if (heslo.equals(heslotip)) {
        System.out.println("Pristup povolen");
        break;
        }
      else if (heslo.equals(heslotip) == false) {
        attempt--;
        System.out.println("Spatne heslo, zkuste to znovu");

    

        
      
        
      }
        
      }
      
    if(attempt == 0)
      System.out.println("Pristup odepren");
    

    

  }
}
