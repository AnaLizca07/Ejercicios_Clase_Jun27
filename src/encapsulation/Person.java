package encapsulation;

public class Person {
    private String name; //Propiedad
    //los modificadores de acceso pueden ser: public, private o protected
    //cuando es publico todos pueden entrar
    //con el private no puedes acceder al objeto en otra clase
    //SI LA PRIPIEDAD ES PRIVADA, LA UNICA FORMA DE ACCESO ES POR MEDIO DE LOS METODOS (GET Y SET)
    //El modificador private encapsula el dato
    //Para hacer los metodos get y set, das click derecho en la clase, le das a generate y seleccionas getter and setter
    //a una propiedad publica tambien se puede acceder con getter and setter
    //se le pone privado para acceder directamente a la implementacion
    //Tambien existe el encapsulamiento para los metodos

    private int age; //Propiedad

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
