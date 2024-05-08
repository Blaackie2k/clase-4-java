import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Casa[] Casas = new Casa[101];
        for(int i = 0; i < 101 ; i++){
            Casas[i] = null;
        }
        TablaHash Hash = new TablaHash();
        Scanner Scanner = new Scanner(System.in);
        int Op = 0;
        int I = 1;
        Integer comp;
        Casa Obj;
        String Pob;
        String Dir;
        int NH;
        double PH;
        String CC;
        int Clave;
        int Bandera = 0;
        while(Op != 5){
            System.out.println("***********Menu***********");
            if((Bandera / 101.00) > 0.5){
                System.out.println("AVISO**********************************************");
                System.out.println("El Factor de carga superó el 0.5");
            }
            System.out.println("1_Cargar nueva casa");
            System.out.println("2_Dar de baja a una casa");
            System.out.println("3_Ver casas Dadas de alta");
            System.out.println("5_Salir");
            System.out.println("Opción:");
            Op = Scanner.nextInt();

            switch (Op){
                case 1:Scanner.nextLine();
                    System.out.println("Ingrese el identificador de la casa(CampoClave):");
                    CC = Scanner.nextLine();
                    System.out.println("Ingrese la población:");
                    Pob = Scanner.nextLine();
                    System.out.println("Ingrese la dirección:");
                    Dir = Scanner.nextLine();
                    System.out.println("Ingrese el numero de habitaciónes de la casa:");
                    NH = Scanner.nextInt();
                    Scanner.nextLine();
                    System.out.



















                            println("Ingrese el precio por hora de la casa:");
                    PH = Scanner.nextDouble();
                    Obj = new Casa(Pob, Dir, NH, PH, CC);
                    Clave = Hash.FuncionHash(CC);
                    while(Casas[Clave] != null){
                    if(100 <= Clave){
                        Clave = 0;
                    }
                    Clave = Hash.Colisiones(Hash.FuncionHash(CC), I);
                    I = I+1;
                    }
                    I = 0;
                    Casas[Clave] = Obj;
                    System.out.println("Casa agregada con exito************************************************");
                    Bandera = Bandera + 1;
                    break;
                default:
                    System.out.println("Error:");
                    Pausa.run();
                    break;
                case 2:
                    Scanner.nextLine();
                    System.out.println("Ingrese el identificador de la casa:");
                    CC = Scanner.nextLine();
                    Clave = Hash.FuncionHash(CC);
                    I = 0;
                    if(Casas[Clave] != null){
                        comp = Integer.parseInt(CC);
                        while (comp != Integer.parseInt(Casas[Clave].CampoClave)) {
                            if (100 <= Clave) {
                                Clave = 0;
                            }
                            Clave = Hash.Colisiones(Clave, I);
                            I = I + 1;
                            }
                        Casas[Clave].Eliminar();
                        System.out.println("Casa Dada de baja");

                    }else {
                        System.out.println("Esta no es una Id previamente registrada");
                    }

                    break;
                case 3:
                    I = 0;
                    for(int J = 0; J < 101; J++){
                        if(Casas[J] != null){
                            if(Casas[J].EsAlta) {
                                System.out.println("Indice En la tabla: " + J);
                                System.out.println("Identificador de la casa:" + Casas[J].CampoClave);
                                System.out.println("Dirección de la casa:" + Casas[J].Direccion);
                                System.out.println("Población:" + Casas[J].Poblacion);
                                System.out.println("Numero de habitantes:" + Casas[J].NHabitaciones);
                                System.out.println("Precio por hora:" + Casas[J].PrecioHora);
                                System.out.println("*****************************************************************");
                                I=I+1;
                            }
                        }
                    }
                    if(I == 0){
                        System.out.println("No hay casas dadas de alta por ahora...");
                    }
                    break;
                case 5:
                    System.out.println("HASta la proxima");
                    break;
            }
            Pausa.run();
        }
    }
}