package compilador;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        { // Arquivo test
            int i = 0; int j=0; float v=0; float x; float[] a = new float[100];
            while( true ) {
            do i = i+1; while( a[i] < v);
            do { 
                j = j-1; 
                if (j < 0) break; 
            } while( a[j] > v);
            if( i >= j ) break;
            x = a[i]; a[i] = a[j]; a[j] = x;
            }
        }
    }
}
