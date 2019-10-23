public class Vehicle
{
    // data

    private String model;
    private String type;
    private int tank_size;
    private double time;
    private String name;

    // constructor

    public Vehicle(String name, String model, int tank_size, double time)
    {
        this.name = name;
        this.model = model;
        this.tank_size = tank_size;
        this.time = time;
    }

    // functions - abilities

    // getters and setters

    public String calculateMPG()
    {
        return String.valueOf((60.0 * this.time) / (this.tank_size * 0.26417205236));
    }

    public void mpgStatement(String mpg)
    {
        System.out.println("The mpg of the " + this.name + " is " + mpg);
    }

    public boolean govPassFail(String mpg)
    {
        if (this.model.equals("Sedan") && Double.valueOf(mpg) > 50)
        {
            return false;
        }

        if (this.model.equals("SUV") && Double.valueOf(mpg) > 40)
        {
            return false;
        }

        if (this.model.equals("Truck") && Double.valueOf(mpg) > 30)
        {
            return false;
        }

        return true;
    }

    public void govStatement(boolean pass)
    {
        if (!pass)
        {
            System.out.println("The " + this.name + " does not pass the governmental standerds");
        }
        if (pass)
        {
            System.out.println("The " + this.name + " does not pass the governmental standerds");
        }
    }
}