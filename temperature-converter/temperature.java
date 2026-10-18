import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    
    
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Jaka je teplota, ve stupnich Celsia");
    double celsius = myObj.nextDouble();  
    double kelvin = celsius + 273.15;
    double farenheit = celsius * 9 / 5 + 32;

    Math.round(kelvin);
    Math.round(farenheit);
    
    String myStr = "%.2f °C = %.2f °F = %.2f K"; //.2f zkrati dany double na desetina mista
    String result = String.format(myStr, celsius, farenheit, kelvin);
    System.out.println(result); 
  }
}