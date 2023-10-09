package ProgramacionPrimero.src.severo.prg.Tema3;

public class Dog {

    private String breed;
    private String name;
    private int age;

    //getters y setters
    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }



    public void setBreed(String breed) {
        if (breed.equals("pitbull")) {
            System.out.println("No se admite esta raza");
        } else {
            this.breed = breed;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }



}
