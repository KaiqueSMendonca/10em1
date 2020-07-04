package pkg10em1;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        
        System.out.println("Calculo do Gasto Energético Basal; 01 \n"
        + "Número por extenso: 02 \n"
        + "Múltiplos ou não: 03 \n"
        + "Ordem crescente ou decrescente: 04 \n"
        + "Prêmio ao funcionário: 05 \n"
        + "Horário de entrada e de saída: 06 \n"
        + "Média: 07 \n"
        + "Conta da lanchonete: 08 \n"
        + "Soma dos números inteiros em sequ^rncia: 09 \n"
        + "Soma de números primos: 10 \n"
        + "Sair: 00 \n");
            
                                   
        int a = 11;

        do{
            
            System.out.println("Digite o programa que deseja exwecutar");
            a = src.nextInt();
            
            switch (a)
            {
                case  1: geb();
                    break;
                case  2: npe();
                    break;
                case  3: mOuN();
                    break;
                case  4: nOCED();
                    break;
                case  5: premio();
                    break;
                case  6: hES();
                    break;
                case  7: media();
                    break;
                case  8: lanchonete();
                    break;
                case  9: sN();
                    break;
                case  10: somaPrimos();
                    break;
                case 0: System.out.println("Até Logo!!");
                    break;
                default: System.out.println("Valor inválido!");
            }            

        }while (a !=0);
    }
    public static void geb() {
        Scanner src = new Scanner(System.in);
        System.out.println("Digite 1 para calcular o Gasto "
                + "Energético Bsaal de um homem e 2 para calcular de uma mulher");
        int sx = src.nextInt();
        
        System.out.println("Digite a altura");
        double a = src.nextDouble();
        System.out.println("Digite o Peso");
        double p = src.nextDouble();
        System.out.println("Digite a idade");
        double i = src.nextDouble();
        
        if (sx == 1){
            double geb =  66.47 + (13.75*p)+(5*a)-(6.76*i);
            System.out.println("O GEB é: "+geb);
        }else{
            if (sx ==2){
                double geb =  65.51 + (9.56*p)+(1.95*a)-(4.67*i);
                System.out.println("O GEB é: "+geb);
            } else
                System.out.println("Valor inválido");
        }
        
    }
    public static void npe() {
        Scanner src = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro entre 0 e 999");
        int num = src.nextInt();        
        
        String unid = "";
        int numManip = num;
        int unidade = (int) numManip%10;
        numManip = num/10;
        int dezena = numManip%10;
        String dezen = "";
        numManip = numManip/10;
        int centena = numManip%10;
        String centen = "";
        
        
        if (num == 0)
            System.out.println("zero");
        
        if(unidade != 0 && dezena != 1){
            switch (unidade){
                case 1: unid = "um";
                break;
                case 2: unid = "dois";
                break;
                case 3: unid = "três";
                break;
                case 4: unid = "quatro";
                break;
                case 5: unid = "cinco";
                break;
                case 6: unid = "seis";
                break;
                case 7: unid = "sete";
                break;
                case 8: unid = "oito";
                break;
                case 9: unid = "novve";
                break;
             }
         } else{
                if (dezena == 1){
                    switch(unidade){
                        case 0: unid = "dez";
                        break;
                        case 1: unid = "onze";
                        break;
                        case 2: unid = "doze";
                        break;
                        case 3: unid = "treze";
                        break;
                        case 4: unid = "quatorze";
                        break;
                        case 5: unid = "quinze";
                        break;
                        case 6: unid = "dezesseis";
                        break;
                        case 7: unid = "dezessete";
                        break;
                        case 8: unid = "dezoito";
                        break;
                        case 9: unid = "dezenovve";
                        break;
                    }
                }
            }
        if (dezena != 0 && dezena !=1 && unidade ==0){
            switch (dezena){
                case 2: dezen = "vinte";
                break;
                case 3: dezen = "trinta";
                break;
                case 4: dezen = "quarenta";
                break;
                case 5: dezen = "cinquenta";
                break;
                case 6: dezen = "sessenta";
                break;
                case 7: dezen = "setenta";
                break;
                case 8: dezen = "oitenta";
                break;
                case 9: dezen = "noventa";
                break;
            }
        } else {
            if (dezena != 0 && dezena !=1 && unidade !=0){
                switch (dezena){
                    case 2: dezen = "vinte e ";
                    break;
                    case 3: dezen = "trinta e ";
                    break;
                    case 4: dezen = "quarenta e ";
                    break;
                    case 5: dezen = "cinquenta e ";
                    break;
                    case 6: dezen = "sessenta e ";
                    break;
                    case 7: dezen = "setenta e ";
                    break;
                    case 8: dezen = "oitenta e ";
                    break;
                    case 9: dezen = "noventa e ";
                    break;
                }
            }
        }
        
        if (centena != 0 && (dezena!= 0 || unidade != 0)){
            switch(centena){
                case 1: centen = "cento e ";
                break;
                case 2: centen = "duzentos e ";
                break;
                case 3: centen = "trezentos e ";
                break;
                case 4: centen = "quatrocentos e ";
                break;
                case 5: centen = "quinhentos e ";
                break;
                case 6: centen = "seicentos e ";
                break;
                case 7: centen = "setecentos e ";
                break;
                case 8: centen = "oitocentos e ";
                break;
                case 9: centen = "movecentos e ";
                break;
            }
        }else{
            if (centena!=0 && dezena==0 && unidade==0){
                switch(centena){
                    case 1: centen = "cem";
                    break;
                    case 2: centen = "duzentos";
                    break;
                    case 3: centen = "trezentos";
                    break;
                    case 4: centen = "quatrocentos";
                    break;
                    case 5: centen = "quinhentos";
                    break;
                    case 6: centen = "seicentos";
                    break;
                    case 7: centen = "setecentos";
                    break;
                    case 8: centen = "oitocentos";
                    break;
                    case 9: centen = "movecentos";
                    break;
                }
            }
        }
                
        
        if(num!=0)
            System.out.println(centen+dezen+unid);
    }
    
    public static void mOuN() {
        Scanner src = new Scanner(System.in);
        
        System.out.println("Digite o valor de a");
        double a = src.nextDouble();
        System.out.println("Digite o valor de b");
        double b = src.nextDouble();
        
        if (a%b == 0 || b%a == 0)
            System.out.println(a+" e "+b+" são múltiplos");
        else
            System.out.println(a+" e "+b+" não são múltiplos");
    }
    
    
    public static void nOCED() {
        Scanner src = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número");
        double a = src.nextDouble();
        System.out.println("Digite o segundo número");
        double b = src.nextDouble();
        System.out.println("Digite o terceiro número");
        double c = src.nextDouble();
        
        System.out.println("Digite 1 para colocá-los em ordem "
                + "crescente e 2 em ordem decrescente.");
        int i = src.nextInt();
        
        while (i!= 1 && i != 2){
            System.out.println("Valor inválido, digite outro valor");
            i = src.nextInt();
        }
        
        if(i==2){
        if (a>=b && b>=c)
            System.out.println(a+", "+b+", "+c);
        else if (a>=c && c>=b)
            System.out.println(a+", "+c+", "+b);
        else if (b>=a && a >=c)
            System.out.println(b+", "+a+", "+c);
        else if (b>=c && c>=a)
            System.out.println(b+", "+c+", "+a);
        else if (c>=a && a>=b)
            System.out.println(c+", "+a+", "+b);
        else if (c>=b && b>=a)
            System.out.println(c+", "+b+", "+a);
        } else         
            if(i==1){
            if (a>=b && b>=c)
                System.out.println(c+", "+b+", "+a);
            else if (a>=c && c>=b)
                System.out.println(b+", "+c+", "+a);
            else if (b>=a && a >=c)
                System.out.println(c+", "+a+", "+b);
            else if (b>=c && c>=a)
                System.out.println(a+", "+c+", "+b);
            else if (c>=a && a>=b)
                System.out.println(b+", "+a+", "+c);
            else if (c>=b && b>=a)
                System.out.println(a+", "+b+", "+c);
            }
    }
    public static void premio() {
        Scanner src = new Scanner(System.in);

        
        System.out.println("Digite o número de horas extras do funcionário");
        int he = src.nextInt();
        System.out.println("Digite o número de horas-falta");
        int hf = src.nextInt();
        
       float h = he*60-(2/3*(hf*60));
       
       if (h>2400)
            System.out.println("O prêmio será de R$500");
       else if (h>=1801)
            System.out.println("O prêmio será de R$400");
       else if (h>=1201)
            System.out.println("O prêmio será de R$300");
       else if (h>=600)
            System.out.println("O prêmio será de R$200");
       else 
            System.out.println("O prêmio será de R$100");
    }
    public static void hES() {
        Scanner src = new Scanner(System.in);
        
        System.out.println("Digite o horário de entrada");
        int ent = src.nextInt(); 
        
        while (ent<0 && ent>24){
            System.out.println("Valor inválido, favor digitar um valor inteiro entre 0 e 24!");
            ent = src.nextInt(); 
        }
        if (ent<=18){
            int hSaida = ent+6;
            System.out.println("O horário de saída será: "+hSaida+"h");
        }else if (ent>18){
            int hSaida = ent - 24 + 6; 
            System.out.println("O horário de saída será: "+hSaida+"h");
        }
    }
    public static void media() {
        Scanner src = new Scanner(System.in);
        
        System.out.println("Digite 4 números inteiros, caso um deles seja negativo, "
                + "será calculada a média dos outros");
        int a = src.nextInt();
        int b = src.nextInt();
        int c = src.nextInt();
        int d = src.nextInt();
        
        if(a<0){
            float media = (b+c+d)/3;
            System.out.println("Como o primeiro número é negativo, a "
                    + "média dos outros números é: "+media);
        }
        if(b<0){
            float media = (a+c+d)/3;
            System.out.println("Como o segundo número é negativo, a "
                    + "média dos outros números é: "+media);
        }
        if(c<0){
            float media = (b+a+d)/3;
            System.out.println("Como o terceiro número é negativo, a "
                    + "média dos outros números é: "+media);
        }
        if(d<0){
            float media = (b+c+a)/3;
            System.out.println("Como o quarto número é negativo, a "
                    + "média dos outros números é: "+media);
        }
            
    }
    public static void lanchonete(){
        Scanner src = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de cachorros quentes (R$2)");
        int c = src.nextInt();
        System.out.println("Digite a quantidade de refrigerantes (R$2,50)");
        int r = src.nextInt();
        System.out.println("Digite a quantidade de sobremesas (R$1,50)");
        int s = src.nextInt();
        
        float conta = (float) (2*c + 2.5*r + 1.5*s);
        System.out.println("O valor total da conta é: R$"+conta);
    }
    public static void sN(){
        Scanner src = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro para somarmos "
                + "todos os inteiros até ele");
        int num = src.nextInt();
        int soma = 0;

        
        for (int i=0; i<=num;i++){
            soma += i;
        }
        System.out.println("A soma dos números inteiros"
                + "até o que você digitou é: "+soma);
    }
    public static void somaPrimos(){
        Scanner src = new Scanner(System.in);
        
        System.out.println("Digie até que número serão somados os primos");
        int num = src.nextInt();
        int soma = 0;
        if (num>=2)
            soma+=2;
        if (num>=3)
            soma+=3;
        if (num>=5)
            soma+=5;
        if (num>=7)
            soma+=7;
        if (num>=11)
            soma+=11;
        for (int i=2; i<=num;i++){
            if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0 && i%11!=0)
                soma+=i;
        }
        System.out.println("A soma dos primos até "+num+" é: "+soma);
    }
}
