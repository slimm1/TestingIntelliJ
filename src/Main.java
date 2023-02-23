/**
 * @author Martin Ramonda
 * @since 23/02/23
 * @version 1.0
 */
public class Main {
    String name;
    int year, age;
    public static void main(String[]Args){
            System.out.println(metodoCajaBlanca(-1,-3));

    }

    public Main(String name, int age, int year){
        this.name=name;
        this.age=age;
        this.year=year;
    }

    /**
     * @param a integer
     * @param b integer
     * @return varía segun los condicionales
     */
    public static double metodoCajaBlanca(int a, int b){

        double op = 0;

        if( (a>b) && (a>0) ){

            op = b/new Double(a);

            System.out.println("El cociente es " + op);
        }
        else if(a>5){

            op=b-a;

            System.out.println("La diferencia es " + op);
        }
        else if(b>=-2){

            System.out.println("b>=-2");

            op = a;
        }
        return op;
    }


}