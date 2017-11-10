
package sample.testng;

@Test(groups = {"class-group"})
public class TestNGGroupsTest {

    @Test(groups = {"group1", "group2"})
    public void testMethod1() {}

    @Test(groups = {"group1", "group2"})
    public void testMethod2() {}

    @Test(groups = {"group1"})
    public void testMethod3() {}

}
