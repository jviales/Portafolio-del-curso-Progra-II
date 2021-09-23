public class App {
    public static void main(String[] args) throws Exception {
        int var = 1;
        persona estudiante = new persona();
        estudiante.setId(1);
        estudiante.nombre = "John";
        estudiante.apellido = "Doe";
        estudiante.nota = 100.00d;
        estudiante.edad = 25;
        estudiante.setId(2);
        estudiante.saludar();

        persona persona = new persona();
        persona.setId(3);

        verIdpersona(persona);
        verIdpersona(estudiante);
    }

    static void verIdpersona(persona persona){

    System.out.println(persona.getId());
    }

}
