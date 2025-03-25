public class TestAnimal {
    public static void main(String[] args) {
        // Probar los constructores
        Animal animal1 = new Animal(100.0, "Perro de servicio", 5, "Perro", true, true);
        Animal animal2 = new Animal(50.0, "Gato doméstico", 8, "Gato");
        Animal animal3 = new Animal(30.0, 10, "Conejo");

        // Crear un array con 5 animales
        Animal[] animales = new Animal[5];
        animales[0] = new Animal(200.0, "Caballo de carreras", 3, "Caballo", true, false);
        animales[1] = new Animal(10.0, "Pájaro exótico", 7, "Pájaro");
        animales[2] = new Animal(40.0, "Hámster", 12, "Roedor");
        animales[3] = new Animal(150.0, "Loro inteligente", 2, "Loro", false, true);
        animales[4] = new Animal(80.0, "Tortuga de agua", 5, "Reptil");

        // Imprimir información de los animales con un for
        for (int i = 0; i < animales.length; i++) {
            animales[i].imprimirInfo();
        }
    }
}
