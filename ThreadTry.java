class A extends Thread{
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("From A i="+i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread{
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("From B i="+i);
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread{
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("From C i="+i);
        }
        System.out.println("Exit from C");
    }
}


class ThreadTry{
    public static void main(String[] args) {
        A objA=new A();
        B objB=new B();
        C objC=new C();
        objA.setPriority(Thread.MIN_PRIORITY);
        objB.setPriority(Thread.NORM_PRIORITY);
        objC.setPriority(Thread.MAX_PRIORITY);
        objA.start();
        objB.start();
        objC.start();
    }
}