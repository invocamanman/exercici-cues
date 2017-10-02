package main.java;
public class Queueimpl<T> implements Queue<T>{

    private int num = 0;
    private T[] vector;
    private int max ;


    public Queueimpl(int n) {
        max = n;
        //vector= new T[n];
        vector = (T[]) new Object[n];
    }

    @Override
    public void push(T t) {
        if(num != max)
            vector[num]=t;
            num++;
    }

    @Override
    public T pop() {
        if(num == 0)
            return null;
        else{
            num--;
            return vector[num];
        }
    }

    @Override
    public int size() {
        return num;

    }
}
