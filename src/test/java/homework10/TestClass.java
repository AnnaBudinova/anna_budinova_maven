package homework10;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass {
    @DataProvider(name = "generateNumbersSum")
    public Object[] generateNumbersSum() {
        Object[][] objects = {
                {2, 3, 5},
                {-1, -1, -2},
                {0, -1, -1},
                {-1, 3, 2},
                {0, 4, 4},
        };
        return objects;
    }

    @Test(dataProvider = "generateNumbersSum", groups = "testSum")
    public void testSum(int a, int b, int expectedResult) {
        int actualResult = a + b;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @DataProvider(name = "generateNumbersDeduction")
    public Object[] generateNumbersDeduction() {
        Object[][] objects = {
                {5, 3, 2},
                {-2, -2, 0},
                {-1, 0, -1},
                {-5, -1, -4},
        };
        return objects;
    }

    @Test(dataProvider = "generateNumbersDeduction", groups = "testDeduction")
    public void testDeduction(int a, int b, int expectedResult) {
        int actualResult = a - b;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @DataProvider(name = "generateNumbersMultiplication")
    public Object[] generateNumbersMultiplication() {
        Object[][] objects = {
                {1, 1, 1},
                {0, 1, 0},
                {4, 4, 16},
                {-1, -2, 2},
                {-1, 8, -8},
        };
        return objects;
    }

    @Test(dataProvider = "generateNumbersMultiplication", groups = "testMultiplication")
    public void testMultiplication(int a, int b, int expectedResult) {
        int actualResult = a * b;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @DataProvider(name = "generateNumbersQuotient")
    public Object[] generateNumbersQuotient() {
        Object[][] objects = {
                {1, 1, 1},
                {2, 1, 2},
                {0, 1, 0},
                {1, 0, 1},
                {-1, -1, 1},
                {10, 1, 10},
                {2, -1, -2},
        };
        return objects;
    }

    @Test(dataProvider = "generateNumbersQuotient", groups = "testQuotient")
    public void testQuotient(int a, int b, int expectedResult) {
            try {
                int actualResult = a / b;
                Assert.assertEquals(actualResult, expectedResult);
            } catch (ArithmeticException e) {
                Assert.assertEquals(e.getMessage(), "/ by zero");
                if (b != 0) {
                    throw e;
                }
            }
    }

    @DataProvider(name = "generateNumbersCoefficient")
    public Object[] generateNumbersCoefficient() {
        Object[][] objects = {
                {4, 2, 0},
                {1, 1, 0},
                {2, 1, 0},
                {0, 1, 0},
                {1, 0, 1},
                {-1, -1, 0},
                {10, 1, 0},
                {2, -1, 0},
                {2, -1, 0},
                {6, 2, 0},
                {7, 2, 1},
                {11, 2, 1},
        };
        return objects;
    }

        @Test(dataProvider = "generateNumbersCoefficient", groups = "testCoefficient")
        public void testCoefficient ( int a, int b, int expectedResult){
            try {
                int actualResult = a % b;
                Assert.assertEquals(actualResult, expectedResult);
            } catch (ArithmeticException e) {
                Assert.assertEquals(e.getMessage(), "/ by zero");
                if (b != 0) {
                    throw e;
                }
            }
        }
    }

