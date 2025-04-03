// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {



        /* una empresa desea registrar la informacion de cada empleado
         * para ello un empleado debe registrar la siguiente informacion:
         * - nombre completo
         * -documento de identidad
         * -valor de la hora
         * -cantidad de horas
         * -selecciona un dia de descanso a la semana
         * El sistema le debe de mostrar al empleado:
         * -su salario neto,
         * -salario bruto,
         * -deduccion por pension,
         * -deduccion por salud,
         * -auxilio de transporte( si aplica),
         * -y bonificacion del 10% si no supera 2SMMLV ( sin incluir auxilio de transporte)
         * Toda la informacion del empleado se debe mostrar en un mensaje descripyivo
         */
        Scanner leer = new Scanner(System.in);
        String nombreEmpleado = "";
        String documentoIdentidad = "";
        String diaDescanso = "";
        String usuarioEmpleado = "";
        String usuarioContrasena = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double retencionSalud = 0;
        double retencionPension = 0;
        double valorHora = 0;
        double cantidadHoras = 0;     /* double- para calculos con valores mas grandes*/
        double bonoficacionEmpleado=0;
        double valorSalarioMin= 0;
        int auxilioTransporte = 200000;       /* int - valor entero */

        System.out.println("Ingrese su usuario ");
        usuarioEmpleado = leer.nextLine();
        System.out.println("Ingrese su contraseña ");
        usuarioContrasena= leer.nextLine();
        if (usuarioEmpleado.equals("Usuario de la base de datos")    /* el == se reemplazara por ".equals" */
                && usuarioContrasena.equals("Contraseña de base de datos")) {   /* && para añadir otra validacion*/
            System.out.println("Ha ingresa de forma correcta");
            System.out.println("Ingrese el nombre del empleado: ");
            nombreEmpleado=leer.nextLine();
            System.out.println("Ingrese su documento de identidad: ");
            documentoIdentidad=leer.nextLine();
            System.out.println("Ingrese el dia de descanso (lunes a viernes): ");
            diaDescanso=leer.nextLine();
            System.out.println("Ingrese el valor de la hora: ");
            valorHora=leer.nextDouble();
            System.out.println("Ingrese la cantidad de horas trabajadas: ");
            cantidadHoras=leer.nextDouble();
            salarioBruto=cantidadHoras*valorHora;
            System.out.println("Ingrese el valor del salario minimo para este año: ");
            valorSalarioMin= leer.nextDouble();

            if (salarioBruto>(valorSalarioMin*2)){
                bonoficacionEmpleado=0;
                auxilioTransporte=0;
            } else {
                bonoficacionEmpleado=salarioBruto*0.1;
                auxilioTransporte=200000;
            }
            salarioNeto=salarioBruto+bonoficacionEmpleado+auxilioTransporte;
            System.out.println("El salario neto es: "+ salarioNeto);
        } else {
            System.out.println("Error de credenciales");
        }



    }
}