package rocks.zipcode.assessment2.objectorientation.address;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.objectorientation.Address;

/**
 * @author leon on 28/11/2018.
 */
public class SetZipCodeTest {
    @Test
    public void test1() {
        // Given
        Address address = new Address();
        String expected = "19720";

        // when
        address.setzipcode(expected);
        String actual = address.getzipcode();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // Given
        Address address = new Address();
        String expected = "18713";

        // when
        address.setzipcode(expected);
        String actual = address.getzipcode();

        // then
        Assert.assertEquals(expected, actual);
    }
}
