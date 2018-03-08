package edu.gcccd.csis;

import java.time.Year;
import java.util.Calendar;


public class Employee
{
    String name;
    String jobTitle;
    Organization org;
    Calendar dob = Calendar.getInstance() ;


    public Employee()
    {
    }


    public Employee(String name, String jobTitle, Organization org, Calendar dob)
    {
        this.name = name;
        this.jobTitle = jobTitle;
        this.org = org;
        this.dob = dob;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getJobTitle()
    {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
    }
    public Organization getOrg()
    {
        return org;
    }

    public void setOrg(Organization org)
    {
        this.org = org;
    }

    public Calendar getDob()
    {
        return dob;
    }

    public void setDob(Calendar dob)
    {
        this.dob = dob;
    }

    public int getAge()
    {
        int today = Integer.parseInt(Year.now().toString());
        int birthYear = dob.get(Calendar.YEAR);
        int age = today - birthYear;
        return age;
    }

    @Override
    public boolean equals(Object e)
    {
        if (e instanceof Employee)
        {
            if (name.equals(((Employee) e).getName()) && org.equals(((Employee) e).getOrg()) &&  dob.equals(((Employee) e).getDob()))
            {
            return true;
            }
        }return false;
    }
}



