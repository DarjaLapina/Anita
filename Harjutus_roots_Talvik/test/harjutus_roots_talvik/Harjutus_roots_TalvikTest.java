package harjutus_roots_talvik;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import harjutus_roots_talvik.Harjutus_roots_Talvik;

public class Harjutus_roots_Talvik{ 

@Test
public void testTwoDistinctRealRoots() {
double[] expected = {2.0, -3.0};
assertArrayEquals(expected, Harjutus_roots_Talvik.findRoots(1, 1, -6), 0.001);
}

@Test
public void testSingleRoot() {
double[] expected = {-2.0};
assertArrayEquals(expected, Harjutus_roots_Talvik.findRoots(1, 4, 4), 0.001);
}

@Test
public void testNoRealRoots() {
double[] expected = {};
assertArrayEquals(expected, Harjutus_roots_Talvik.findRoots(1, 2, 3), 0.001);
}

@Test
public void testLinearEquationSolution() {
double[] expected = {-2.0};
assertArrayEquals(expected, Harjutus_roots_Talvik.findRoots(0, 2, -4), 0.001);
}

@Test
public void testZeroDiscriminant() {
double[] expected = {-1.0};
assertArrayEquals(expected, Harjutus_roots_Talvik.findRoots(1, 2, 1), 0.001);
}

@Test
public void testNegativeDiscriminant() {
double[] expected = {};
assertArrayEquals(expected, Harjutus_roots_Talvik.findRoots(1, 1, 1), 0.001);
}
}