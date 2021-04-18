package SourceCodeSoloLearn.MoreOnClasses;

class Module5 {
    private void print(){
        System.out.println("a");
    }
    private void print(String str){
        System.out.println("b");
    }
    private void print(int m4){
        System.out.println("c");
    }

    public static void main(String[] args) {
        Module5 object = new Module5();
        object.print(12);
    }
}
