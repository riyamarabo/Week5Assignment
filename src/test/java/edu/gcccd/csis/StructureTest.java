package edu.gcccd.csis;


import org.junit.Test;
import org.junit.Before;

import java.util.Calendar;
import java.util.GregorianCalendar;


import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;


public class StructureTest {
    Employee emp1;
    Employee emp1Same;

    Organization Google;
    Organization Google2;
    Organization Microsoft;

    @Before
    public void setUp()
    {
        Google = new Organization("Google", 4532);
        Google2 = new Organization("Google", 4532);
        Microsoft = new Organization("Microsoft", 2353);

        emp1 = new Employee("Sara", "Assistant", Google, new GregorianCalendar(1980, Calendar.JANUARY, 15));
        emp1Same = new Employee("Sara", "Assistant", Google, new GregorianCalendar(1980, Calendar.JANUARY, 15));
    }


    @Test
    public void employeeComplete() {


        assertTrue(emp1.getName() != null &&  emp1.getJobTitle() != null && emp1.getOrg() != null && emp1.getDob() != null);


        assertTrue(emp1.getAge() > 16);

    }

    @Test
    public void employeeEq() {

        assertTrue(emp1.equals(emp1Same));

        emp1Same.setOrg(Microsoft);

        assertNotEquals(emp1, emp1Same);

    }


    @Test
    public void companyEq() {

        assertTrue(Google.equals(Google2));
        Google2.setEmployeeNumber(1234);

        assertNotEquals(Google, Google2);
    }

    @Test
    public void companyComplete() {
        assertTrue(Google.getOrgName() != null &&  Google.getEmployeeNumber() != 0 );
    }
}