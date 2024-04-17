// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) 
  {
    System.out.println("Podaj dlugosc boku kwadratu nxn");
    Scanner scanner= new Scanner(System.in);
    int n=scanner.nextInt();
    System.out.println("Podaj znak z którego ma byc zrobiony kwadrat nxn");
    char znak = scanner.next().charAt(0);//wczytywanie znaku
    for(int i=0; i<n; i++)//pętla określajaca ilość wierszy
      {
        for(int j=0;j<n;j++)//pętla określajaca ilosc kolumn
          {
            System.out.print(znak + " " );//spacja między znakami
          }
        System.out.println();
      }
    
   
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}