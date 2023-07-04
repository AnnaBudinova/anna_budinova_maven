package homework;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.Objects;

public class TestClass {
    @DataProvider(name = "generateNumbersSum")
    public Object[] generateNumbersSum() {
        Object[][] objects = {
                {2, 3, 5},
                {5, 8, 3},
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
                {8, 8, 3},
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
                {8, 8, 3},
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
                {4, 4, 1},
                {8, 8, 3},
        };
        return objects;
    }

    @Test(dataProvider = "generateNumbersQuotient", groups = "testQuotient")
    public void testQuotient(int a, int b, int expectedResult) {
        int actualResult = a / b;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @DataProvider(name = "generateNumbersCoefficient")
    public Object[] generateNumbersCoefficient() {
        Object[][] objects = {
                {4, 2, 0},
                {8, 8, 1},
        };
        return objects;
    }

        @Test(dataProvider = "generateNumbersCoefficient", groups = "testCoefficient")
        public void testCoefficient ( int a, int b, int expectedResult){
            int actualResult = a % b;
            Assert.assertEquals(actualResult, expectedResult);
        }
    }

