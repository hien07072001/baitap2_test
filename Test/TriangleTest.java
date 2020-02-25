import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void classifyTriangles() {
        int a=3;
        int b=3;
        int c=3;
        String expected="la tam giac deu";

        String result=Triangle.classifyTriangles(a,b,c);
        assertEquals(expected,result);

    }
}