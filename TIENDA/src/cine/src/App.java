import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al cine");

        Scanner sca = new Scanner(System.in);
        System.out.println("Ingrese su cedula");
        String cedula = sca.nextLine();

        System.out.println("Ingrese su nombre");
        String nombre = sca.nextLine();


        Cliente clienteUno = new Cliente();
        clienteUno.setCedula(cedula);
        clienteUno.setNombre(nombre);
        clienteUno.setId(1);
        clienteUno.generarSaludo();
        clienteUno.generarSaludo("Buenos dias");
        clienteUno.mostrarDatos();
        float costo = clienteUno.calcularCosto(8000);

        // cliente dos

        System.out.println("Cédula: " + clienteUno.getCedula() + "\nNombre: "
                            + clienteUno.getNombre() + "\nID: " + clienteUno.getId()
                            + "\nCosto tiquete: " + costo);
        
        ClientePremiun clienteDos = new ClientePremiun();
        clienteDos.setCedula("11657777");
        clienteDos.setNombre("Jose");
        clienteDos.setNumeroTarjeta(100);
        clienteDos.generarSaludo();
        clienteDos.generarSaludo("Hola qque tal");
        clienteDos.mostrarDatos();

        System.out.println();
        float costoDos = clienteDos.calcularCosto(8000);
                    
        System.out.println();
        System.out.println("Cédula: " + clienteDos.getCedula() + "\nNombre: "
                            + clienteDos.getNombre() + "\nNumero de Tarjeta: " + clienteDos.getNumeroTarjeta()
                            + "\nCosto tiquete: " + costoDos);
                    

    }
}
