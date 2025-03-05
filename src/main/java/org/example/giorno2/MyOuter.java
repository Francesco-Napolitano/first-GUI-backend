package org.example.giorno2;

public class MyOuter {
    private int z;
    MyInner inner = new MyInner();

    public void doStuff() {
        inner.go();
    }

    class MyInner {
        void go(){
            z = 69;
        }
    }
}
