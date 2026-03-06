class CPU
{
    double price=15000.0;
    class Proccesor
    {
        int cores=10;
        String manufacture="Pentium";
    }
    static class RAM
    {
        double memory=64;
        String manufacture="Intel";
    }
}
public class CPUDetails
{
    public static void main(String[] args) {
        CPU c =new CPU();
        CPU.Proccesor p=c.new Proccesor();
        CPU.RAM r=new CPU.RAM();
        System.out.println("Cpu class");
        System.out.println("--------------------------------------");
        System.out.println("CPU Price="+c.price);
        System.out.println("Proccessor inner class");
        System.out.println("------------------------------------");
        System.out.println("No.of cores="+p.cores);
        System.out.println("Manufacture="+p.manufacture);
        System.out.println("RAM static nested class");
        System.out.println("------------------------------------");
        System.out.println("Memory="+r.memory);
        System.out.println("Manufactures="+r.manufacture);
    }
    }
