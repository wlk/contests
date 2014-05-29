import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestIlo {

    @Test
    public void test_example(){
        String input = "5\n5\n4\n12\n11\n10\n\n";
        String output = "TAK\nTAK\nNIE\nNIE\nTAK";
        ilo.main(new String[]{input});
        assertEquals(ilo.algorithm(), output);

    }
}
