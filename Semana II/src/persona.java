public class persona {
    int id = 0;
    String nombre = "";
    String apellido = "";
    short edad = 0;

    void setId(int valor){
        if(id <= 0){
        id = valor;
    }
}
    int getID(){return id;}

    void saludar(){
System.out.println("Hola me llamo " + nombre
+ " y mi id es " + id);
    }

    String imprimir(){
        return "Soy " + nombre;
    }


}
