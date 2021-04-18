package SourceCodeSoloLearn.MoreOnClasses;

abstract class Abstracts {
    public int age;
    public abstract int printAge();
}

class Dog extends Abstracts {
    public int printAge(){
        return age;
    }

}
