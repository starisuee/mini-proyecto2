import java.util.Scanner;
import java.util.Arrays;
public class produccion {
    private int [] mensualidad = new int [5];

    public void setArray_mensualidad(int[] mensualidad){
        this.mensualidad=mensualidad;
    }

    public int[]getArray_mensualidad(){
        return mensualidad;
    }

    public int[] ingresar_datos(){ //kilogramos producidos y entregados mensualmente
        int i, producido, vendido;
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
        enero = ob.ingresar_datos();
        febrero = ob.ingresar_datos();
        marzo = ob.ingresar_datos();
        abril = ob.ingresar_datos();
        mayo = ob.ingresar_datos();
        junio = ob.ingresar_datos();
        julio = ob.ingresar_datos();
        agosto = ob.ingresar_datos();
        septiembre = ob.ingresar_datos();
        octubre = ob.ingresar_datos();
        noviembre = ob.ingresar_datos();
        diciembre = ob.ingresar_datos();
        //aqui calculare la produccion total para cada producto
        total[3] = enero[3] + febrero[3] + marzo[3] + abril[3] + mayo[3] + junio[3] + julio[3] + agosto[3] + septiembre[3] + octubre[3] + noviembre[3] + diciembre[3];
        total[0] = enero[0] + febrero[0] + marzo[0] + abril[0] + mayo[0] + junio[0] + julio[0] + agosto[0] + septiembre[0] + octubre[0] + noviembre[0] + diciembre[0]; 
        total[1] = enero[1] + febrero[1] + marzo[1] + abril[1] + mayo[1] + junio[1] + julio[1] + agosto[1] + septiembre[1] + octubre[1] + noviembre[1] + diciembre[1];
        total[2] = enero[2] + febrero[2] + marzo[2] + abril[2] + mayo[2] + junio[2] + julio[2] + agosto[2] + septiembre[2] + octubre[2] + noviembre[2] + diciembre[2];
        total[4] = enero[4] + febrero[4] + marzo[4] + abril[4] + mayo[4] + junio[4] + julio[4] + agosto[4] + septiembre[4] + octubre[4] + noviembre[4] + diciembre[4];
        return total; //devuelve un arreglo con los totales por cada producto
    }

    public int[] ganancia(){
        int[] la_produccion = new int[5];
        int[] dolartot = new int[5];
        produccion ob = new produccion();
        la_produccion = ob.contabilizador(); // aqui se iguala para tener el arreglo interno con la produccion total
        //calculo de los precios totales por cada producto en enteros
        dolartot[0] = la_produccion[0] * 5;
        dolartot[1] = la_produccion[1] * 5;
        dolartot[2] = la_produccion[2] * 6;
        dolartot[3] = la_produccion[3] * 8;
        dolartot[4] = la_produccion[4] * 7;

        return dolartot;
    }

    public String compara_ganancia(){
        int cont=0;
        String producto="";
        int[] mayor_ganancia = new int[5];
        produccion ob = new produccion();
        mayor_ganancia = ob.ganancia();
                int i;
                for(i=0;i<mayor_ganancia.length;i++)
                {
                if(mayor_ganancia[i]>350){
                    cont++;
                }
            }
            if(cont==0){
                producto = "lechuga";
            }
            else if(cont == 1){
                producto = "repollo";
            }
            else if(cont == 1){
                producto = "zanahoria";
            }
            else if(cont == 1){
                producto = "tomate";
            }
            else if(cont == 1){
                producto = "papas";
            }
                return producto;
    }

    public static void main(String[] args){
        String mayor_gan="";
        int[] tot = new int[5];
        int[] tot_dolar = new int[5];
        Scanner sc = new Scanner (System.in);
        produccion ob = new produccion();
        tot=ob.contabilizador();
        tot_dolar = ob.ganancia();
        mayor_gan = ob.compara_ganancia();
        System.out.println("¿Cuál fue el producto que más kilogramos rindió al final del año?");
        System.out.println("¿Cuál fue el producto que menos kilogramos rindió al final del año");
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
        System.out.println("el producto que mayor ganancia genero fue" + mayor_gan);
        System.out.println("¿Cuál fue el producto que menos dinero produjo al final del año?");
        System.out.println("¿Cuál fue el mes que obtuvo la venta más alta (dinero)?");
        System.out.println("¿Cuál fue el mes que obtuvo la venta más baja (dinero)?");
    }
}
