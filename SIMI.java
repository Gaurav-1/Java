class RectIn{
    public void RectPrint(int l,int b) {
        System.out.println("Area of rectangle = "+l*b);
    }
}

class VarIn extends RectIn{
    public void rect() {
        System.out.println("Area of rectangle using single-level inheritance");
        RectPrint(10,20);
    }
    public void VarPass(int l,int b) {
        RectPrint(l,b);
    }
}

class VarPas extends VarIn{
    public void VarPass() {
        System.out.println("Area of rectangle using multi-level inheritance");
        VarPass(10,10);
    }
}

class SIMI{
    public static void main(String[] args) {
        VarIn  obj= new VarIn();
        System.out.println("Finding area of rectangle using Inheritance");
        obj.rect();
        VarPas  objVP= new VarPas();
        objVP.VarPass();
    }
}