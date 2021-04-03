package MoreOnClasses;

class DownCasting {
    public void print() {
        System.out.println("A");
    }
}
class DC extends DownCasting{
    public void print() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        DownCasting object = new DC();
        DC b = (DC) object;
        b.print();
    }
}