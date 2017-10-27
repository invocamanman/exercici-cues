
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class test {

    private static Queueimpl<Integer> cua;


    @Before
    public void initQueueimpl(){
        cua = new Queueimpl<Integer>(10);
        assertEquals(0, cua.size());
    }


    @Test
    public void cuaplena(){
        for(int i = 0; i < 11; i++)
        {
            cua.push(i);
        }

    }

    @Test
    public  void testPop(){
        //cua.push(3);
        //int num = cua.size();

       cua.push(20);
       cua.pop();
       cua.pop();


    }
}
