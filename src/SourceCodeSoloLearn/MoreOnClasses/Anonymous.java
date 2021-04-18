package SourceCodeSoloLearn.MoreOnClasses;

class Anonymous{
    public void print(){
        System.out.println("A");
    }
}

class r {
    public static void main(String[] args) {
        Anonymous object = new Anonymous(){
            public void print(){
                System.out.println("Hello");
            }
        };
        object.print();
    }
}
