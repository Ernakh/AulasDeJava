package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 86205
 * @author Fabrício
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try
        {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            
            if(b == 0)
            {
                throw new Exception("Nâo tente dividir por zero!");
            }
            
            int resultado = a/b;
            
            System.out.println("Resultado: " + resultado); 
        }
        catch(ArithmeticException e)
        {
            System.out.println("Não é possível dividir por 0!");
        }
        catch(NullPointerException e)
        {
            System.out.println("Erro:" + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Erro:" + e.getMessage());
        }
        finally
        {
            System.out.println("FIM");
        }
    }
}

