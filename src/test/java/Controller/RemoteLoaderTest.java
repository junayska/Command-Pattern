package Controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoteLoaderTest {

    @Test
    public void test(){
        RemoteLoader rl = new RemoteLoader();
        RemoteControl rc = rl.createController();
        rc.pushDownButton(1);
        rc.pushUpButton(2);

        assertEquals(1,1);
    }
}