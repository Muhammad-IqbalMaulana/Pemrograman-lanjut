package SourceCodeSoloLearn.MoreOnClasses;

class TheEqualsMethod {
    private int w;
    public boolean equals(Object o){
        return ((TheEqualsMethod)o).w == this.w;
    }

    public static void main(String[] args) {
        TheEqualsMethod s = new TheEqualsMethod();
        s.w = 9;
        TheEqualsMethod ss = new TheEqualsMethod();
        ss.w = 5;
        System.out.println(s.equals(ss));
    }
}
