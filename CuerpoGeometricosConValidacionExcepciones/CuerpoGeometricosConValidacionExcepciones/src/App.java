import java.util.Scanner;

public class App {

   static byte intentos = 1, intentosMaximos = 3;
   static double PI = 3.14;
    public static void main(String[] args) throws Exception {

        Scanner lector = new Scanner(System.in);
        

        while (intentos <= intentosMaximos) {
            mostrarMenu();
            char opc = lector.next().charAt(0);

            try {
                switch (opc) {
                    case 'A':
                    case 'a':
                        calcularPrisma(lector);
                        break;

                    case 'B':
                    case 'b':
                        calcularCilindro(lector);
                        break;

                    case 'C':
                    case 'c':
                        calcularPiramide(lector);
                        break;

                    case 'D':
                    case 'd':
                        calcularCono(lector);
                        break;

                    case 'E':
                    case 'e':
                        calcularEsfera(lector);
                        break;

                    case 'F':
                    case 'f':
                        calcularTetraedro(lector);
                        break;

                    case 'G':
                    case 'g':
                        calcularHexaedro(lector);
                        break;

                    case 'H':
                    case 'h':
                        calcularOctaedro(lector);
                        break;

                    case 'I':
                    case 'i':
                        calcularDodecaedro(lector);
                        break;

                    case 'J':
                    case 'j':
                        calcularIcosaedro(lector);
                        break;

                    case 'K':
                    case 'k':
                        calcularOrtoedro(lector);
                        break;

                    case 'L':
                    case 'l':
                        calcularTroncoPiramide(lector);
                        break;

                    case 'M':
                    case 'm':
                        calcularTroncoCono(lector);
                        break;

                    case 'N':
                    case 'n':
                        calcularHusoEsferico(lector);
                        break;

                    case 'O':
                    case 'o':
                        calcularCuñaEsferica(lector);
                        break;

                    case 'P':
                    case 'p':
                        System.out.println("Saliendo de la App");
                        intentos = intentosMaximos ++; 
                        break;

                    default:
                        System.out.println("Opcion incorrecta/no valida.");
                        System.out.println("Saliendo de la App");
                        intentos = intentosMaximos ++; 
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                intentos++;
            }

            if (intentos == intentosMaximos) {
                System.out.println("No hay mas intentos");
            }
        }

        lector.close();
    }

    private static void mostrarMenu() {
        System.out.println("Cuál cuerpo geométrico desea trabajar: ");
        System.out.println("a) Prisma ");
        System.out.println("b) Cilindro");
        System.out.println("c) Piramide ");
        System.out.println("d) Cono ");
        System.out.println("e) Esfera ");
        System.out.println("f) Tetraedro ");
        System.out.println("g) Hexaedro ");
        System.out.println("h) Octaedro ");
        System.out.println("i) Dodecaedro");
        System.out.println("j) Icosaedro ");
        System.out.println("k) Ortoedro ");
        System.out.println("l) Tronco de piramide ");
        System.out.println("m) Tronco de cono");
        System.out.println("n) Huso esferico ");
        System.out.println("o) Cuña esferica");
        System.out.println("p) salir ");     

    }

    private static void calcularPrisma(Scanner lector) throws Exception {
        while(intentos<=intentosMaximos);
               System.out.println("Digite la cantidad de lados: ");
               int cantidadLados = lector.nextInt();
               System.out.println("Digite la altura: ");
               double altura = lector.nextDouble();
               System.out.print("Longitud de los lados: ");
               double longitudLados = lector.nextDouble();
                //Procesar datos
               double perimetroBase = cantidadLados * longitudLados;
               double areaLateral = perimetroBase * altura;
               double alfa = (Math.PI/180) * (360/cantidadLados);
               double apotema = longitudLados / (2 * Math.tan((alfa)/2));
               double areaBase = (perimetroBase * apotema)/2;
               double areaTotal = areaLateral + 2 * areaBase;
               double volumen = areaBase * altura;
                  
               if( cantidadLados > 0 && altura > 0 && longitudLados > 0){
            
             }else {
                System.out.println("Los valores ingresados no son los correctos ");
                if(intentos < intentosMaximos){
                System.out.println("Intentelo nueva mente, intentos restantes: " + (intentosMaximos -  intentos));
                } 
            }
            intentos++;
        
             if(intentos==intentosMaximos){
              System.out.println("No hay mas intentos");
             }else if(intentos<intentosMaximos){
               System.out.println("Area lateral: " + areaLateral + " unidades cuadradas.");
               System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
               System.out.println("Volumen: " + volumen + " unidades cubicas.");
              }
       
    }

    private static void calcularCilindro(Scanner lector) throws Exception {
         while(intentos<=intentosMaximos);

             //Solicitar datos al usuario
             System.out.print("Digite el Radio: ");
             int radio = lector.nextInt();
             System.out.print("Altura: ");
             double altura = lector.nextDouble();
       
             //Procesar datos
             double perimetroBase = 2 * PI * radio;
             double areaLateral = perimetroBase * altura;
             double areaBase = PI * radio * radio;
             double areaTotal = areaLateral + 2 * areaBase;
             double volumen = areaBase * altura;

             if( radio > 0 && altura > 0){
        
            }else {
             System.out.println("Los valores ingresados no son los correctos ");
            if(intentos<intentosMaximos){
             System.out.println("Intentelo nueva mente, intentos restantes: " + (intentosMaximos -  intentos));
            } 
        }
        intentos++;
        
         if(intentos==intentosMaximos){
          System.out.println("No hay mas intentos");
         }else if(intentos<intentosMaximos){
          System.out.println("Area lateral: " + areaLateral + " unidades cuadradas.");
          System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
          System.out.println("Volumen: " + volumen + " unidades cubicas.");
        }
       
    }
    private static void calcularPiramide(Scanner lector) throws Exception {
         while(intentos <= intentosMaximos);

         //Solicitar datos al usuario
         System.out.print("Cantidad de lados: ");
         int cantidadLados = lector.nextInt();
         System.out.print("Altura: ");
         double altura = lector.nextDouble();
         System.out.print("Longitud de los lados: ");
         double longitudLados = lector.nextDouble();

       
         //Procesar datos
         double perimetroBase = cantidadLados * longitudLados;
         double alfa = (Math.PI/180) * (360/cantidadLados);
         double apotema = longitudLados / (2 * Math.tan((alfa)/2));
         double apotemaP = altura + apotema;
         double areaLateral = perimetroBase * apotemaP / 2;
         double areaBase = (perimetroBase * apotema)/2;
         double areaTotal = areaLateral +  areaBase;
         double volumen = areaBase * altura / 3 ;

         if( cantidadLados > 0 && altura > 0 && longitudLados > 0){
        }else {
         System.out.println("Los valores ingresados no son los correctos ");
        if(intentos<intentosMaximos){
         System.out.println("Intentelo nueva mente, intentos restantes: " + (intentosMaximos -  intentos));
           } 
        }
        intentos++;
         if(intentos==intentosMaximos){
          System.out.println("No hay mas intentos");
        }else if(intentos<intentosMaximos){
          System.out.println("Area lateral: " + areaLateral + " unidades cuadradas.");
          System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
          System.out.println("Volumen: " + volumen + " unidades cubicas.");
        } 
    }
    private static void calcularCono(Scanner lector) throws Exception {
         while(intentos<=intentosMaximos);
             //Solicitar datos al usuario
             System.out.print("Digite el Radio: ");
             int radio = lector.nextInt();
             System.out.print("Altura: ");
             double altura = lector.nextDouble();
               
             //Procesar datos
             double gravedad = altura + radio;
             double areaLateral = PI * radio * gravedad ;
             double areaBase = PI * radio * radio;
             double SGR = gravedad + radio;
             double areaTotal = PI * radio * SGR ;
             double volumen = areaBase * altura / 3;

             if( radio > 0 && altura > 0 ){
            }else {
                System.out.println("Los valores ingresados no son los correctos ");
             if(intentos<intentosMaximos){
                System.out.println("Intentelo nueva mente, intentos restantes: " + (intentosMaximos -  intentos));
                } 
            }
            intentos++;
        

             if(intentos==intentosMaximos){
               System.out.println("No hay mas intentos");
            }else if(intentos<intentosMaximos){
               System.out.println("Area lateral: " + areaLateral + " unidades cuadradas.");
               System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
               System.out.println("Volumen: " + volumen + " unidades cubicas.");
            }
       
        }
    private static void calcularEsfera(Scanner lector) throws Exception {
        while(intentos<=intentosMaximos);
             //Solicitar datos al usuario
             System.out.print("Digite el Radio: ");
             int radio = lector.nextInt();
             //Procesar datos
             double area = 4 * PI * radio * radio;
             double volumen = (4 / 3) * (PI * radio * radio * radio);

             if( radio > 0 && area > 0 ){
            }else {
             System.out.println("Los valores ingresados no son los correctos ");
            if(intentos<intentosMaximos){
             System.out.println("Intentelo nueva mente, intentos restantes: " + (intentosMaximos -  intentos));
                } 
            }
            intentos++;
        
             if(intentos==intentosMaximos){
              System.out.println("No hay mas intentos");
             }else if(intentos<intentosMaximos){
              //Mostrar los resultados
              System.out.println("Area : " + area + " unidades cuadradas.");
              System.out.println("Volumen: " + volumen + " unidades cubicas.");
                
            }
       
    }
    private static void calcularTetraedro(Scanner lector) throws Exception {
        while(intentos<=intentosMaximos);

             System.out.print("Ingrese la longitud de un lado del tetraedro: ");
             double longitudLados = lector.nextDouble();
             double area = Math.sqrt(3) * longitudLados * longitudLados;
             double volumen = (longitudLados * longitudLados * longitudLados) * ( Math.sqrt(2)/12);

            if( volumen > 0 && area > 0 && longitudLados > 0){
            }else {
             System.out.println("Los valores ingresados no son los correctos ");
            if(intentos<intentosMaximos){
             System.out.println("Intentelo nueva mente, intentos restantes: " + (intentosMaximos -  intentos));
                } 
            }
            intentos++;

            if(intentos==intentosMaximos){
              System.out.println("No hay mas intentos");
            }else if(intentos<intentosMaximos){
              //Mostrar los resultados
              System.out.println("Área del tetraedro: " + area + " unidades cuadradas.");
              System.out.println("Volumen del tetraedro: " + volumen + " unidades cubicas. ");
            
            }
    }
    private static void calcularHexaedro(Scanner lector) throws Exception {
        while(intentos<=intentosMaximos);

             System.out.print("Ingrese la longitud de un lado del hexaedro: ");
             double longitudLados = lector.nextDouble();
             double area = 6 * longitudLados * longitudLados;
             double volumen = longitudLados * longitudLados * longitudLados;

            if( volumen > 0 && area > 0 && longitudLados > 0){
            }else {
             System.out.println("Los valores ingresados no son los correctos ");
            if(intentos<intentosMaximos){
             System.out.println("Intentelo nueva mente, intentos restantes: " + (intentosMaximos -  intentos));
                } 
            }
            intentos++;
        

            if(intentos==intentosMaximos){
              System.out.println("No hay mas intentos");
            }else if(intentos<intentosMaximos){
              //Mostrar los resultados
              System.out.println("Área del hexaedro: " + area + " unidades cuadradas.");
              System.out.println("Volumen del hexaedro: " + volumen + " unidades cubicas. ");
 
            }
        
    }
    private static void calcularOctaedro(Scanner lector) throws Exception {
        while(intentos<=intentosMaximos);

             System.out.print("Ingrese la longitud de un lado del octaedro: ");
             double longitudLados = lector.nextDouble();
             double area = Math.sqrt(3) * longitudLados * longitudLados * 2;
             double volumen = (longitudLados * longitudLados * longitudLados) * ( Math.sqrt(2)/3);
            if( volumen > 0 && area > 0 && longitudLados > 0){
            }else {
             System.out.println("Los valores ingresados no son los correctos ");
            if(intentos<intentosMaximos){
             System.out.println("Intentelo nueva mente, intentos restantes: " + (intentosMaximos -  intentos));
                } 
            }
            intentos++;
            if(intentos==intentosMaximos){
              System.out.println("No hay mas intentos");
            }else if(intentos<intentosMaximos){
              //Mostrar los resultados
              System.out.println("Área del octaedro: " + area + " unidades cuadradas.");
              System.out.println("Volumen del octaedro: " + volumen + " unidades cubicas. ");
 
            }
        
    }
    private static void calcularDodecaedro(Scanner lector) throws Exception {
        while(intentos<=intentosMaximos);

             System.out.print("ingrese la longitud de un lado del dodecaedro: ");
             double longitudLados= lector.nextDouble();
             double area = 3 * longitudLados * longitudLados * Math.sqrt(25 + 10 * Math.sqrt(5));
             double volumen = (longitudLados * longitudLados * longitudLados) * 1/4 * (15 + 7* Math.sqrt(5));
            if( volumen > 0 && area > 0 && longitudLados > 0){             
            }else {
             System.out.println("Los valores ingresados no son los correctos ");
            if(intentos<intentosMaximos){
             System.out.println("Intentelo nueva mente, intentos restantes: " + (intentosMaximos -  intentos));
                } 
            }
            intentos++;
        
             if(intentos==intentosMaximos){
              System.out.println("No hay mas intentos");
             }else if(intentos<intentosMaximos){
              //Mostrar los resultados
              System.out.println("Área del dodecaedro: " + area + " unidades cuadradas.");
              System.out.println("Volumen del dodecaedro: " + volumen + " unidades cubicas. ");
 
            }
       
    }
    private static void calcularIcosaedro(Scanner lector) throws Exception {
        while(intentos<=intentosMaximos);

             System.out.print("Ingrese la longitud de un lado del ICOSAEDRO : ");
             double longitudLados = lector.nextDouble();
             double area = Math.sqrt(3) * longitudLados * longitudLados * 5;
             double volumen = 5/12 * (longitudLados * longitudLados * longitudLados) * (3 + Math.sqrt(5));
            if( volumen > 0 && area > 0 && longitudLados > 0){         
            }else {
             System.out.println("Los valores ingresados no son los correctos ");
            if(intentos<intentosMaximos){
             System.out.println("Intentelo nueva mente, intentos restantes: " + (intentosMaximos -  intentos));
                } 
            }
            intentos++;     

             if(intentos==intentosMaximos){
              System.out.println("No hay mas intentos");
             }else if(intentos<intentosMaximos){
              //Mostrar los resultados
              System.out.println("Área del icosaedro: " + area + " unidades cuadradas.");
              System.out.println("Volumen del icosaedro: " + volumen + " unidades cubicas. ");
 
            }
       
    }
    private static void calcularOrtoedro(Scanner lector) throws Exception {
        while(intentos<=intentosMaximos);

             System.out.print("Ingrese la longitud del ortoedro: ");
             double longitud = lector.nextDouble();
             System.out.print("Ingrese el ancho del ortoedro: ");
             double ancho = lector.nextDouble();
             System.out.print("Ingrese la altura del ortoedro: ");
             double altura = lector.nextDouble();
             double areaSuperficie = 2 * (longitud * ancho + longitud * altura + ancho * altura);
             double volumen = longitud * ancho * altura;
            if( volumen > 0 && altura > 0 ){               
            }else {
             System.out.println("Los valores ingresados no son los correctos ");
            if(intentos<intentosMaximos){
             System.out.println("Intentelo nueva mente, intentos restantes: " + (intentosMaximos -  intentos));
                } 
            }
            intentos++;
        
             if(intentos==intentosMaximos){
              System.out.println("No hay mas intentos");
             }else if(intentos<intentosMaximos){
              //Mostrar los resultados
              System.out.println("El área de superficie del ortoedro es: " + areaSuperficie + " unidades cuadradas. ");
              System.out.println("El volumen del ortoedro es: " + volumen + " unidades cubicas. ");
            
            }
       
    }
    private static void calcularTroncoPiramide(Scanner lector) throws Exception {
        while(intentos<=intentosMaximos);

             System.out.print("Ingrese la altura de la pirámide: ");
             double alturaPiramide = lector.nextDouble();
             System.out.print("ingrese el apotema de la piramide: ");
             double apotemaP = lector.nextDouble();
             System.out.print("Ingrese el área de la base mayor de la pirámide: ");
             double areaBaseMayor = lector.nextDouble();
             System.out.print("Ingrese el área de la base menor de la pirámide: ");
             double areaBaseMenor = lector.nextDouble();
             System.out.print("Ingrese el perimetro base mayor: ");
             double perimetroBaseMayor = lector.nextDouble();
             System.out.print("Ingrese el perimetro base menor: ");
             double perimetroBaseMenor = lector.nextDouble();
        
             double volumenTroncoPiramide = (alturaPiramide / 3) * (areaBaseMayor + areaBaseMenor + Math.sqrt(areaBaseMayor * areaBaseMenor));
             double areaLateral = (perimetroBaseMayor + perimetroBaseMenor / 2) * apotemaP ;
             double areaTotal = areaLateral * areaBaseMayor * areaBaseMenor ;
            
            if( alturaPiramide > 0 && areaBaseMayor> 0 && areaBaseMenor>0 && apotemaP >0 && perimetroBaseMayor>0 && perimetroBaseMenor >0 ){
            }else {
              System.out.println("Los valores ingresados no son los correctos ");
            if(intentos<intentosMaximos){
              System.out.println("Intentelo nueva mente, intentos restantes: " + (intentosMaximos -  intentos));
                } 
            }
            intentos++;
        
             if(intentos==intentosMaximos){
               System.out.println("No hay mas intentos");
             }else if(intentos<intentosMaximos){
               //Mostrar los resultados
               System.out.println("El área lateral del tronco de pirámide es: " + areaLateral);
               System.out.println("El área total del tronco de pirámide es: " + areaTotal);
               System.out.println("El volumen del tronco de pirámide es: " + volumenTroncoPiramide);
                  
            }
    }   
    private static void calcularTroncoCono(Scanner lector) throws Exception {
        while(intentos<=intentosMaximos);

             System.out.print("Ingrese la altura del cono: ");
             double altura = lector.nextDouble();
             System.out.print("Ingrese el radio de la base mayor del cono: ");
             double radioBaseMayor = lector.nextDouble();
             System.out.print("Ingrese el radio de la base menor del cono: ");
             double radioBaseMenor = lector.nextDouble();
             System.out.print("Ingrese la generatriz del cono: ");
             double generatriz = lector.nextDouble();
             System.out.print("Ingrese el área de la base mayor de la pirámide: ");
             double areaBaseMayor = lector.nextDouble();
             System.out.print("Ingrese el área de la base menor de la pirámide: ");
             double areaBaseMenor = lector.nextDouble();
              
             double volumenTroncoCono = (Math.PI * altura / 3) * (Math.pow(radioBaseMayor, 2) + Math.pow(radioBaseMenor, 2) + (radioBaseMayor * radioBaseMenor));
             double areaLateral = Math.PI * generatriz * (radioBaseMayor * radioBaseMenor);
             double areaTotal = areaLateral * areaBaseMayor * areaBaseMenor ;
             
             if( radioBaseMayor > 0 && areaBaseMayor> 0 && areaBaseMenor>0 && altura >0 && radioBaseMenor>0 && generatriz >0 ){
            }else {
              System.out.println("Los valores ingresados no son los correctos ");
            if(intentos<intentosMaximos){
              System.out.println("Intentelo nueva mente, intentos restantes: " + (intentosMaximos -  intentos));
                } 
            }
            intentos++;
        

             if(intentos==intentosMaximos){
               System.out.println("No hay mas intentos");
             }else if(intentos<intentosMaximos){
               //Mostrar los resultados
               System.out.println("El area lateral del tronco de cono es: " + areaLateral);
               System.out.println("El area total del tronco de cono es: " + areaTotal);
               System.out.println("El volumen del tronco de cono es: " + volumenTroncoCono);

            }
        
    }
    private static void calcularHusoEsferico(Scanner lector) throws Exception {
        while(intentos<=intentosMaximos);

             System.out.print ("Ingrese el radio: ");
             double radio = lector.nextDouble();
             System.out.print ("Ingrese el numero de grados: ");
             double ngrados = lector.nextDouble();

             double area = 4*Math.PI * radio * radio * ngrados / 360;
             if( radio > 0 && ngrados > 0 ){
            }else {
                System.out.println("Los valores ingresados no son los correctos ");
                if(intentos<intentosMaximos){
                System.out.println("Intentelo nueva mente, intentos restantes: " + (intentosMaximos -  intentos));
                } 
            }
            intentos++;
        
             if(intentos==intentosMaximos){
               System.out.println("No hay mas intentos");
             }else if(intentos<intentosMaximos){
               System.out.println("El area del huso esferico es: " + area);
            }

    }
    private static void calcularCuñaEsferica(Scanner lector) throws Exception {
        while(intentos<=intentosMaximos);

             System.out.print ("Ingrese el radio: ");
             double radio = lector.nextDouble();
             System.out.print ("Ingrese el numero de grados: ");
             double ngrados = lector.nextDouble();

             double volumen = (4/3) * (Math.PI * radio * radio * radio * ngrados / 360);
             if( radio > 0 && ngrados > 0 ){
            }else {
             System.out.println("Los valores ingresados no son los correctos ");
            if(intentos<intentosMaximos){
             System.out.println("Intentelo nueva mente, intentos restantes: " + (intentosMaximos -  intentos));
                } 
            }
            intentos++;
        
             if(intentos==intentosMaximos){
               System.out.println("No hay mas intentos");
             }else if(intentos<intentosMaximos){
               System.out.println("El volumen del cuña esferica es: " + volumen);
            }
       
    }

}
