import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Queueimpl<T> implements Queue<T>{

    private static final Logger logger = LogManager.getLogger(Queueimpl.class.getName());
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


        if (num != max) {
            vector[num] = t;
            num++;
        }
        else {
            logger.error("cola llena");
        }
    }

    @Override
    public T pop() {
        if(num == 0) {
            logger.error("cola vacia");
            return null;
        }
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
