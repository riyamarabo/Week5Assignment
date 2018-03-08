package edu.gcccd.csis;

public class Organization {

     String orgName;
    int employeeNumber;

    public Organization()
    {

    }

    public Organization(String orgName, int employeeNumber)
    {
        this.orgName = orgName;
        this.employeeNumber = employeeNumber;

    }
    public String getOrgName()
    {
        return orgName;
    }

    public void setOrgName(String orgName)
    {
        this.orgName = orgName;
    }

    public int getEmployeeNumber()
    {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o instanceof Organization)
        {
            if (orgName.equals(((Organization) o).getOrgName()) && employeeNumber ==(((Organization) o).getEmployeeNumber()))
            {
                return true;
            }
        }return false;
    }
}



