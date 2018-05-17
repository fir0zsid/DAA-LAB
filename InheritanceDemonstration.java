import java.util.Scanner;

class Staff
{
	String staffid,name,phoneno,salary;
}

class Teaching extends Staff
{
	String domain;
	String noofpublication;
	void Teachingread()
	{
		System.out.println("Enter name, staffiD, phonenumber salary, domain and no.of publication");
		Scanner input = new Scanner(System.in);
		name = input.next();
		staffid = input.next();
		phoneno = input.next();
		salary = input.next();
		domain = input.next();
		noofpublication = input.next();
	}
	void Teachingdisplay()
	{
		System.out.println(name+" " +staffid+ " " +phoneno+ " " +salary+ " " +domain+ " " +noofpublication);
	}
}

class Technical extends Staff
{
	String skill;
	void Technicalread()
	{
		System.out.println("Enter name, staffiD, phonenumber salary and skills");

		Scanner input = new Scanner(System.in);
		name = input.next();
		staffid = input.next();
		phoneno = input.next();
		salary = input.next();
		skill = input.next();
	}
	void Technicaldisplay()
	{
		System.out.println(name+" " +staffid+ " " +phoneno+ " " +salary+ " " +skill);
	}
}

class Contract extends Staff
{
	String contract;
	void contractread()
	{
		System.out.println("Enter name, staffiD, phonenumber salary and contract");
		Scanner input = new Scanner(System.in);
		name = input.next();
		staffid = input.next();
		phoneno = input.next();
		salary = input.next();
		contract = input.next();
		
	}
	void contractdisplay()
	{
		System.out.println(name+" " +staffid+ " " +phoneno+ " " +salary+ " " +contract);
	}

}

public class InheritanceDemonstration
{
	public static void main(String[] args)
	{
		int choice,n,i;
		System.out.println("Please Enter the number of staff:");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		Teaching tob[] = new Teaching[n];
		Technical tcob[] = new Technical[n];
		Contract cob[] = new Contract[n];
		while(true)
		{
			System.out.println("-----------------------------------------------------------------------");
			System.out.print("Enter your choice: ");
			System.out.println("1.Teaching 2.Technical 3.Contract 4.Exit");
			System.out.println("-----------------------------------------------------------------------");
			choice = input.nextInt();
			switch(choice)
			{
			case 1:for(i=0;i<n;i++)
					{
						tob[i] = new Teaching();
						System.out.println("Enter the detail of Staff"+(i+1));
						tob[i].Teachingread();
					}
					System.out.println("Teaching Staff details are:");
					for(i=0;i<n;i++)
					{
						tob[i].Teachingdisplay();
					}
					break;
			case 2: for(i=0;i<n;i++)
					{
						tcob[i] = new Technical();
						System.out.println("Enter the detail of Staff" +(i+1));
						tcob[i].Technicalread();
					}
					System.out.println("Teaching Staff details are:");
					for(i=0;i<n;i++)
					{
						tcob[i].Technicaldisplay();
					}
					break;
			case 3: for(i=0;i<n;i++)
					{
						cob[i] = new Contract();
						System.out.println("Enter the detail of Staff" +(i+1));
						cob[i].contractread();
					}
					System.out.println("Contract Staff details are: ");
					for(i=0;i<n;i++)
					{
						cob[i].contractdisplay();
					}
					break;
			case 4: return;
			default: System.out.println("Wrong Choice!!! plz try again");
			}
		}
	}
}

