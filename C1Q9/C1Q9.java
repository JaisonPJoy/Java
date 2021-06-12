import java.util.Scanner;
class CPU
{
	int cpu_price;
	CPU()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("ENTER THE PRICE FOR THE CPU: ");
		cpu_price = in.nextInt();
	}
	void cpuDisplay()
	{
		System.out.println("CPU PRICE: "+ cpu_price);
	}
	class Processor
	{
		int p_core;
		String p_manufacture;
		Processor()
		{
			Scanner in = new Scanner(System.in);
			System.out.print("ENTER THE NO. OF CORES: ");
			p_core = in.nextInt();
			System.out.print("ENTER THE MANUFACTURER NAME: ");
			p_manufacture = in.next();
		}
		void processorDisplay()
		{
			System.out.println("THE NO. OF CORES: "+ p_core);
			System.out.println("MANUFACTURER NAME: "+ p_manufacture);
		}
	}
	static class RAM 
	{
		int memory;
		String r_manufacture;
		RAM()
		{
			Scanner in = new Scanner(System.in);
			System.out.print("ENTER THE SIZE OF MEMORY: ");
			memory = in.nextInt();
			System.out.print("ENTER THE MANUFACTURER NAME: ");
			r_manufacture = in.next();

		}
		void ramDisplay()
		{
			System.out.println("MEMORY: "+ memory+" TB");
			System.out.println("THE MANUFACTURER NAME: "+ r_manufacture);
		}
	}
}
class C1Q9
{
	public static void main(String args[])
	{
		CPU c = new CPU();
		CPU.Processor p = c.new Processor();
		CPU.RAM r = new CPU.RAM();
		c.cpuDisplay();
		p.processorDisplay();
		r.ramDisplay();
	}
}