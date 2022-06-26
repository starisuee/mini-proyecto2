import java.util.Scanner;
public class produccion {
    private int [] mensualidad = new int [5];

    public void setArray_mensualidad(int[] mensualidad){
        this.mensualidad=mensualidad;
    }

    public int[]getArray_mensualidad(){
        return mensualidad;
    }

    public int[] ingresar_datos(){ //kilogramos producidos y entregados mensualmente
        int i, producido;
        int [] mensualidadpro = new int [5];
        Scanner sc = new Scanner (System.in);
        for(i=0;i<=4;i++){
            System.out.println("Ingrese las ventas del mes:" + i);
            producido = sc.nextInt();
            mensualidadpro[i] = producido;
        }
        setArray_mensualidad(mensualidadpro);
        return mensualidadpro;
    }

    public int[] contabilizador(){
        int[] enero = new int [5]; int[] febrero = new int [5];
        int[] marzo = new int [5]; int[] abril = new int [5];
        int[] mayo = new int [5]; int[] junio = new int [5];
        int[] julio = new int [5]; int[] agosto = new int [5];
        int[] septiembre = new int [5]; int[] octubre = new int [5];
        int[] noviembre = new int [5]; int[] diciembre = new int [5];
        int[] total = new int [5]; 
        produccion ob = new produccion();
        System.out.println("Enero");
        enero = ob.ingresar_datos();
        System.out.println("Febrero");
        febrero = ob.ingresar_datos();
        System.out.println("Marzo");
        marzo = ob.ingresar_datos();
        System.out.println("Abril");
        abril = ob.ingresar_datos();
        System.out.println("Mayo");
        mayo = ob.ingresar_datos();
        System.out.println("Junio");
        junio = ob.ingresar_datos();
        System.out.println("Julio");
        julio = ob.ingresar_datos();
        System.out.println("Agosto");
        agosto = ob.ingresar_datos();
        System.out.println("Septiembre");
        septiembre = ob.ingresar_datos();
        System.out.println("Octubre");
        octubre = ob.ingresar_datos();
        System.out.println("Noviembre");
        noviembre = ob.ingresar_datos();
        System.out.println("Diciembre");
        diciembre = ob.ingresar_datos();
        //aqui calculare la produccion total para cada producto
        total[0] = enero[0] + febrero[0] + marzo[0] + abril[0] + mayo[0] + junio[0] + julio[0] + agosto[0] + septiembre[0] + octubre[0] + noviembre[0] + diciembre[0]; 
        total[1] = enero[1] + febrero[1] + marzo[1] + abril[1] + mayo[1] + junio[1] + julio[1] + agosto[1] + septiembre[1] + octubre[1] + noviembre[1] + diciembre[1];
        total[2] = enero[2] + febrero[2] + marzo[2] + abril[2] + mayo[2] + junio[2] + julio[2] + agosto[2] + septiembre[2] + octubre[2] + noviembre[2] + diciembre[2];
        total[3] = enero[3] + febrero[3] + marzo[3] + abril[3] + mayo[3] + junio[3] + julio[3] + agosto[3] + septiembre[3] + octubre[3] + noviembre[3] + diciembre[3];
        total[4] = enero[4] + febrero[4] + marzo[4] + abril[4] + mayo[4] + junio[4] + julio[4] + agosto[4] + septiembre[4] + octubre[4] + noviembre[4] + diciembre[4];
        return total; //devuelve un arreglo con los totales por cada producto
    }

    public int[] ganancia(int[] total){
        int[] la_produccion = new int[5];
        int[] dolartot = new int[5];
        produccion ob = new produccion();
        la_produccion = total;
        //calculo de los precios totales por cada producto en enteros 
        dolartot[0] = la_produccion[0] * 5;
        dolartot[1] = la_produccion[1] * 5;
        dolartot[2] = la_produccion[2] * 6;
        dolartot[3] = la_produccion[3] * 8;
        dolartot[4] = la_produccion[4] * 7;

        return dolartot;
    }

    public String comparador_demayor(int[] dolartot){
        int cont= 0;
        String producto="";
        int[] mayor_ganancia = new int[5];
        produccion ob = new produccion();
        mayor_ganancia = dolartot;
                int i;
                int mayor=0;
                for(i=0;i<mayor_ganancia.length;i++)
                {
                if(mayor_ganancia[i]>mayor){
                    mayor=mayor_ganancia[i];
                    cont = i;
                }
            }
            if(cont==0){
                producto = "lechuga";
            }
            else if(cont == 1){
                producto = "repollo";
            }
            else if(cont == 2){
                producto = "zanahoria";
            }
            else if(cont == 3){
                producto = "tomate";
            }
            else if(cont == 4){
                producto = "papas";
            }
                return producto;
    }

    public String comparador_demenor(int[] dolartot){
        int cont= 0;
        String producto="";
        int[] mayor_ganancia = new int[5];
        produccion ob = new produccion();
        mayor_ganancia = dolartot;
                int i;
                int mayor=0;
                for(i=0;i<mayor_ganancia.length;i++)
                {
                if(mayor_ganancia[i]<mayor){
                    mayor=mayor_ganancia[i];
                    cont = i;
                }
            }
            if(cont==0){
                producto = "lechuga";
            }
            else if(cont == 1){
                producto = "repollo";
            }
            else if(cont == 2){
                producto = "zanahoria";
            }
            else if(cont == 3){
                producto = "tomate";
            }
            else if(cont == 4){
                producto = "papas";
            }
                return producto;
    }

    public static void main(String[] args){
        String mayor_gan="";
        String mayor_pro="";
        String menor_gan="";
        String menor_pro="";
        int[] tot = new int[5];
        int[] tot_dolar = new int[5];
        Scanner sc = new Scanner (System.in);
        produccion ob = new produccion();
        tot=ob.contabilizador();
        tot_dolar = ob.ganancia(tot);
        mayor_gan = ob.comparador_demayor(tot_dolar);
        mayor_pro = ob.comparador_demayor(tot);
        menor_gan = ob.comparador_demenor(tot_dolar);
        menor_pro = ob.comparador_demenor(tot);
        System.out.println("¿Cuál fue el producto que más kilogramos rindió al final del año?"); // el que mas produjo
        System.out.println("el producto mas producido fue: "+ mayor_pro);
        System.out.println("¿Cuál fue el producto que menos kilogramos rindió al final del año");
        System.out.println("el producto menos producido fue: "+ menor_pro);
        System.out.println("¿Cuál fue la producción total en kilogramos de tomates, lechuga, repollo, zanahoria y papas?");
        System.out.println("Lechuga:" + tot[0]);
        System.out.println("Repollo:" + tot[1]);
        System.out.println("Zanahoria:" + tot[2]);
        System.out.println("Tomate:" + tot[3]);
        System.out.println("Papas:" + tot[4]);
        System.out.println("¿Cuál fue la producción total en dólares de tomates, lechuga, repollo, zanahoria y papas?");
        System.out.println("Lechuga:" + tot_dolar[0]);
        System.out.println("Repollo:" + tot_dolar[1]);
        System.out.println("Zanahoria:" + tot_dolar[2]);
        System.out.println("Tomate:" + tot_dolar[3]);
        System.out.println("Papas:" + tot_dolar[4]);
        System.out.println("¿Cuál fue el producto que más dinero produjo al final del año?");
        System.out.println("el producto que mayor ganancia genero fue: " + mayor_gan);
        System.out.println("¿Cuál fue el producto que menos dinero produjo al final del año?");
        System.out.println("el producto que menor ganancia genero fue: " + menor_gan);
    }
}
