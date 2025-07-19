import service.ExtractService;
import service.LoadService;
import service.TransformService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in)
                .useLocale(Locale.US);
    }

    public static void menuETL(Scanner sc){
        // Receber o path dos dados ; Absorver os dados
        ExtractService extract;

        // Valida os dados ; Formata para o padrão desejado
        TransformService transform;

        // Envia os dados já tratado ; Centraliza os dados
        LoadService load;
    }
}
