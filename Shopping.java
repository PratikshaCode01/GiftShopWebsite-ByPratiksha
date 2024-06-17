package Project;

import java.util.InputMismatchException;
import java.util.Scanner;


//interface 

interface Payment
{
    public void getDetails();
}

class Cloths implements Payment
{
    String cloth_Brand;
    String cloth_Name;
    String cloth_Colour;
    double cloth_Price;
    
//Encapsulation
    
    private String cloth_Coust_Name;
    private long Coust_Mobile_Number;
    private String Coust_EmailAdd;
    private String Coust_AadharNo;
   
// here use getter seeter method to access and modify our private data in 
    public void setcloth_Coust_Name(String cloth_Coust_Name)
    {
        this.cloth_Coust_Name = cloth_Coust_Name;
    }

    public String getcloth_Coust_Name()
    {
        return cloth_Coust_Name;
    }

    public void setCoust_Mobile_Number(long Coust_Mobile_Number)
    {
        this.Coust_Mobile_Number = Coust_Mobile_Number;
    }

    public long getCoust_Mobile_Number()
    {
        return Coust_Mobile_Number;
    }

    public void setCoust_EmailAdd(String Coust_EmailAdd)
    {
        this.Coust_EmailAdd = Coust_EmailAdd;
    }

    public String getCoust_EmailAdd()
    {
        return Coust_EmailAdd;
    }

    public void setCoust_AadharNo(String Coust_AadharNo)
    {
        this.Coust_AadharNo = Coust_AadharNo;
    }

    public String getCoust_AadharNo()
    {
        return Coust_AadharNo;
    }

   
//Constructor
    
    public void Pass(String cloth_Brand, String cloth_Name, String cloth_Colour, double cloth_Price) {
        this.cloth_Brand = cloth_Brand;
        this.cloth_Name = cloth_Name;
        this.cloth_Colour = cloth_Colour;
        this.cloth_Price = cloth_Price;
    }
    
// Method Overriding For getDetails method
    
    @Override
    public void getDetails() {
    	System.out.println("-----------------------------YOUR ORDER DETAILS-----------------------------");
    	System.out.println("============================================================================");
        System.out.println("cloth fabric              :" + cloth_Brand);
        System.out.println("cloth name                :" + cloth_Name);
        System.out.println("CLoth Colour              :" + cloth_Colour);
        System.out.println("cloth Price               :" + cloth_Price);
        System.out.println("Your Name                 :" + cloth_Coust_Name);
        System.out.println("Your Mobile Number        :" + Coust_Mobile_Number);
        System.out.println("Your Shifting Address     :" + Coust_EmailAdd);
   
    }

}

class Ethnic extends Cloths {
    public void Ethnic() {
// Upcasting-Downcasting for Saree
        Cloths cloth1 = new Saree();
        Saree Sa = (Saree) cloth1;

// Upcasting-Downcasting for Kurtis
        Cloths cloth2 = new Kurtis();
        Kurtis Ku = (Kurtis) cloth2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Saree");
        System.out.println("Enter 2 for Kurtis");
        System.out.println("Enter 3 for Back");
      
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("============================================================================");
                System.out.println("You Have Choosen saree");
                System.out.println("============================================================================");
                Sa.Ethntic_saree();
                break;
            case 2:
                System.out.println("============================================================================");
                System.out.println("You Have Choosen Kurtis");
                System.out.println("============================================================================");
                Ku.Ethntic_kurtis();
                break;
            case 3:
            	System.out.println("============================================================================");
            	Ethnic();
            case 4:
            	
            default:
                System.out.println("Invaild Input ");
                this.Ethnic();
        }
    }
}

class Saree extends Ethnic {
    public void Ethntic_saree() {
// Upcasting-Downcasting for Georgette_Saree 
        Cloths cloth3 = new Georgette_Saree();
        Georgette_Saree Gs = (Georgette_Saree) cloth3;

// Upcasting-Downcasting for Chiffon_Saree 
        Cloths cloth4 = new Chiffon_Saree();
        Chiffon_Saree Cs = (Chiffon_Saree) cloth4;

// Upcasting-Downcasting for Cotton_Saree 
        Cloths cloth5 = new Cotton_Saree();
        Cotton_Saree Cos = (Cotton_Saree) cloth5;

// Upcasting-Downcasting for Net_Saree
        Cloths cloth6 = new Net_Saree();
        Net_Saree ns = (Net_Saree) cloth6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Georgette_Saree ");
        System.out.println("Enter 2 for  Chiffon_Saree");
        System.out.println("Enter 3 for Cotton_Saree");
        System.out.println("Enter 4 for Net_Saree ");
        System.out.println("Enter 5 For Back");

        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("============================================================================");
                System.out.println("You Have Choosen georgette saree");
                Gs.Geo_saree();
                break;
            case 2:
                System.out.println("============================================================================");
                System.out.println("You Have Choosen Chiffon_Saree Bikes");
                Cs.Chi_saree();
                break;
            case 3:
                System.out.println("============================================================================");
                System.out.println("You Have Choosen Cotton  Saree ");
                Cos.Cott_saree();
                break;
            case 4:
                System.out.println("============================================================================");
                System.out.println("You Have Choosen Net Saree");
                ns.Net_saree();
                break;
            case 5:
            	System.out.println("============================================================================");
            	Ethntic_saree();
            default:
            	System.out.println("============================================================================");
                System.out.println("Invaild Input ");
                this.Ethntic_saree();
        }
    }
}

//Inheritance 

class Georgette_Saree extends Saree {
    public void Geo_saree() {
// Upcasting-Downcasting for planeS Saree
        Cloths cloth1 = new planeS();
        planeS Pl = (planeS) cloth1;

// Upcasting-Downcasting for EmbrodaryS Saree
        Cloths cloth2 = new EmbrodaryS();
        EmbrodaryS Es = (EmbrodaryS) cloth2;

// Upcasting-Downcasting for lace Saree
        Cloths cloth3 = new lace();
        lace Las = (lace) cloth3;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for plane");
        System.out.println("Enter 2 for Embrodary");
        System.out.println("Enter 3 for lace");
        System.out.println("Enter 4 for Back");
        
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("============================================================================");
                System.out.println("You Have Choosen plane saree");
                Pl.Geo_price();
                break;
            case 2:
                System.out.println("============================================================================");
                System.out.println("You Have Choosen Embrodary saree");
                Es.Printed_saree();
                break;
            case 3:
                System.out.println("============================================================================");
                System.out.println("You Have Choosen less saree");
                Las.Saree_price();
                break;
            case 4:
            	System.out.println("============================================================================");
            	Geo_saree();
            default:
                System.out.println("Invaild Input ");
                Geo_saree();
        }

    }
}

class planeS extends Georgette_Saree {
    public void Geo_price() {
        Details d = new Details();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Georgette plane saree less than 300/-");
        System.out.println("Enter 2 for Georgette plane saree more than 500/-  ");
        System.out.println("Enter 3 for Georgette plane saree more than 1000/-");
        System.out.println("Enter 4 for Back");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println();
                System.out.println("============================================================================");
                System.out.println("Thank You For Choosing georgette plane saree");
                System.out.println("georgette plane saree Info");
                System.out.println("BLOUSE fabric:georgette ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.75 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹399 - ₹50 delivery Charges included. . )");
                System.out.println();
                System.out.println("============================================================================");
                d.Final_Details("georgette", "georgette plane saree", 449);
                break;
            case 2:
                System.out.println();
                System.out.println("============================================================================");
                
                System.out.println("Thank You For Choosing georgette plane saree");
                System.out.println("georgette plane saree Info");
                System.out.println("BLOUSE fabric:georgette ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.75 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹899 - ₹50 delivery Charges included. . )");
                System.out.println();
                System.out.println("============================================================================");
                d.Final_Details("Georgette", "georgette plane saree", 899);
                break;
            case 3:
                System.out.println();
                System.out.println("============================================================================");
                System.out.println("Thank You For Choosing georgette plane saree");
                System.out.println("georgette plane saree Info");
                System.out.println("BLOUSE fabric:georgette ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.75 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹1734 - ₹50 delivery Charges included. . )");
                System.out.println();
                System.out.println("============================================================================");
                d.Final_Details("Georgette", "georgette plane saree", 1734);
                break;
            case 4:
            	 System.out.println("============================================================================");
            	Geo_price();
            default:
                System.out.println("Invalid Input :");
        }
    }
}

class EmbrodaryS extends Georgette_Saree {
    public void Printed_saree() {
        Details d = new Details();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for printed  Saree less than 500/- ");
        System.out.println("Enter 2 for printed  Saree more than 500/-");
        System.out.println("Enter 3 for Back");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("============================================================================");
                System.out.println("Thank You For Choosing Georgette Printed saree");
                System.out.println("Chiffon Chiffon saree Info");
                System.out.println("BLOUSE fabric:Chiffon ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.75 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹249 - ₹50 delivery Charges included. included. )");
                System.out.println();
                System.out.println("============================================================================");
                d.Final_Details("Chiffon", "Chiffon plane saree", 249);

                break;
            case 2:
                System.out.println("============================================================================");
                System.out.println("Thank You For Choosing Chiffon Printed saree");
                System.out.println("Chiffon Chiffon saree Info");
                System.out.println("BLOUSE fabric:Chiffon ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.75 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹999 - ₹50 delivery Charges included. . )");
                System.out.println();
                System.out.println("============================================================================");
                d.Final_Details("Chiffon", "Chiffon plane saree", 999);

                break;
            case 3:
            	System.out.println("============================================================================");
            	Printed_saree();
            default:
                System.out.println("Invalid Input :");
        }
    }
}

class lace extends Georgette_Saree {
    public void Saree_price() {
        Details d = new Details();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Georgette plane saree less than 300/-");
        System.out.println("Enter 2 for Georgette plane saree more than 500/-  ");
        System.out.println("Enter 3 for Georgette plane saree more than 1000/-");
        System.out.println("enter 4 For Back");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("============================================================================");
                System.out.println("Thank You For Choosing Georgette Lace saree");
                System.out.println("Chiffon Georgette saree Info");
                System.out.println("BLOUSE fabric: Georgette ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.75 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹229 - ₹50 delivery Charges included. . )");
                System.out.println();
                System.out.println("============================================================================");
                d.Final_Details("Chiffon", "Chiffon plane saree", 229);

                break;
            case 2:
                System.out.println("============================================================================");
                System.out.println("Thank You For Choosing Georgette Lace saree");
                System.out.println("Georgette Lace  saree Info");
                System.out.println("BLOUSE fabric: Georgette ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.75 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹899 - ₹50 delivery Charges included. . )");
                System.out.println();
                System.out.println("============================================================================");
                d.Final_Details("Georgette", "Georgette plane saree", 899);

                break;
            case 3:
                System.out.println("============================================================================");
                System.out.println("Thank You For Choosing Georgette Lace saree");
                System.out.println("Chiffon Chiffon saree Info");
                System.out.println("BLOUSE fabric:Chiffon ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.75 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹1899 - ₹50 delivery Charges included. . )");
                System.out.println();
                System.out.println("============================================================================");
                d.Final_Details("Georgette", "Georgette plane saree", 1899);

                break;
            case 4:
            	System.out.println("============================================================================");
            	Saree_price();
            default:
                System.out.println("Invalid Input :");
        }
    }
}

class Chiffon_Saree extends Saree
{
    public void Chi_saree()
    {
// Upcasting-Downcasting for planeS Saree
        Cloths cloth1 = new Plane_Saree();
        Plane_Saree Ps = (Plane_Saree) cloth1;

// Upcasting-Downcasting for printed_Saree Saree
        Cloths cloth2 = new printed_Saree();
        printed_Saree Prn = (printed_Saree) cloth2;

// Upcasting-Downcasting for Embrodared_Saree 2.0 Saree
        Cloths cloth3 = new Embrodared_Saree();
        Embrodared_Saree Gow = (Embrodared_Saree) cloth3;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Plane_Saree");
        System.out.println("Enter 2 for printed_Saree");
        System.out.println("Enter 3 for  Embrodared_Saree");
        System.out.println("Enter 4 for Back");
        int opt = sc.nextInt();

        switch (opt)
        {
            case 1:
            	System.out.println("============================================================================");
                System.out.println("You Have Choosen Plane Saree");
                Ps.Shine_Bike();
                break;
            case 2:
            	System.out.println("============================================================================");
                System.out.println("You Have Choosen printed  Saree");
                Prn.Print_ch_saree();
                break;
            case 3:
            	System.out.println("============================================================================");
                System.out.println("You Have Choosen Embrodared Saree");
                Gow.Er_Chi_saree();
                break;
            case 4:
            	System.out.println("============================================================================");
            	Chi_saree();
            default:
                System.out.println("Invaild Input ");
                Ethntic_saree();
        }
    }
}

class Plane_Saree extends Chiffon_Saree
{
    public void Shine_Bike()
    {
        Details d = new Details();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Chiffon_Saree less than 500/-");
        System.out.println("Enter 2 for Chiffon_Saree more than 1000/-");
        System.out.println("Enter 3 for back");
        int opt = sc.nextInt();

        switch (opt)
        {
            case 1:
                System.out.println();
                System.out.println("============================================================================");
                System.out.println("Thank You For Choosing  Chiffon plane saree");
                System.out.println("Chiffon plane saree Info");
                System.out.println("BLOUSE fabric:Chiffon ");
                System.out.println("BLOUSE Pattern:Solid ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.8 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹454 - ₹50 delivery Charges included.. )");
                System.out.println();
                System.out.println("============================================================================");
                d.Final_Details("Chiffon", "Chiffon plane saree", 454);

                break;
            case 2:
                System.out.println();
                System.out.println("============================================================================");
                System.out.println("Thank You For Choosing  Chiffon Printed saree");
                System.out.println("Chiffon plane Printed Info");
                System.out.println("BLOUSE fabric:Chiffon ");
                System.out.println("BLOUSE Pattern:Solid ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.8 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹654 - ₹50 delivery Charges included.. )");
                System.out.println();
                System.out.println("============================================================================");
                d.Final_Details("Chiffon", "Chiffon plane saree", 454);
                break;
            case 3:
            	System.out.println("============================================================================");
            	Shine_Bike();
            default:
                System.out.println("Invalid Input :");
        }
    }
}

class printed_Saree extends Chiffon_Saree
{
    public void Print_ch_saree()
    {
        Details d = new Details();
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================================");
        System.out.println("Enter 1 for printed  Saree less than 500/- ");
        System.out.println("Enter 2 for printed  Saree more than 500/-");
        System.out.println("Enter 3 for Back");
        System.out.println("============================================================================");
        int opt = sc.nextInt();

        switch (opt)
        {
            case 1:
                System.out.println();
                System.out.println("============================================================================");
                System.out.println("Thank You For Choosing Chiffon Printed saree");
                System.out.println("Chiffon Chiffon saree Info");
                System.out.println("BLOUSE fabric:Chiffon ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.75 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹399 - ₹50 delivery Charges included.. )");
                System.out.println();
                System.out.println("============================================================================");
                d.Final_Details("Chiffon", "Chiffon plane saree", 449);
                
                break;
            case 2:
                System.out.println();
                System.out.println("============================================================================");
                System.out.println("Thank You For Choosing Chiffon Printed saree");
                System.out.println("Chiffon Chiffon saree Info");
                System.out.println("BLOUSE fabric:Chiffon ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.75 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹899 - ₹50 delivery Charges included.   )");
                System.out.println();
                d.Final_Details("Chiffon", "Chiffon plane saree", 899);
                System.out.println("============================================================================");

                break;
            case 3:
            	System.out.println("============================================================================");
            	Print_ch_saree();
            default:
                System.out.println("Invalid Input :");
        }
    }
}

class Embrodared_Saree extends Chiffon_Saree
{
    public void Er_Chi_saree()
    {
        Details d = new Details();
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================================");
        System.out.println("Enter 1 for printed  Saree less than 500/- ");
        System.out.println("Enter 2 for printed  Saree more than 500/-");
        System.out.println("Enter 3 for Back");
        System.out.println("============================================================================");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("============================================================================");
                System.out.println("Thank You For Choosing Chiffon Embrodared saree");
                System.out.println("Chiffon Chiffon saree Info");
                System.out.println("BLOUSE fabric:Chiffon ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.75 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹399 - ₹50 delivery Charges included. . )");
                System.out.println();
                System.out.println("============================================================================");
                d.Final_Details("Chiffon", "Chiffon Embrodared saree", 399);

                break;
            case 2:
                System.out.println("============================================================================");
                System.out.println("Thank You For Choosing Chiffon Embrodared saree");
                System.out.println("Chiffon Chiffon saree Info");
                System.out.println("BLOUSE fabric:Chiffon ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.75 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹892 - ₹50 delivery Charges included. . )");
                System.out.println();
                System.out.println("============================================================================");
                d.Final_Details("Chiffon", "Chiffon Embrodared saree", 892);

                break;
            case 3:
            	System.out.println("============================================================================");
            	Er_Chi_saree();
            default:
                System.out.println("Invalid Input :");
        }
    }
}

class Cotton_Saree extends Saree
{
    public void Cott_saree()
    {
// Upcasting-Downcasting for Co_plane Saree
        Cloths cloth1 = new Co_plane();
        Co_plane Th = (Co_plane) cloth1;

// Upcasting-Downcasting for Co_print Saree
        Cloths cloth2 = new Co_print();
        Co_print Hi = (Co_print) cloth2;

// Upcasting-Downcasting for Co_er 350 Saree
        Cloths cloth3 = new Co_er();
        Co_er Cs = (Co_er) cloth3;

        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================================");
        System.out.println("Enter 1 for Plane Saree");
        System.out.println("Enter 2 for printed Saree");
        System.out.println("Enter 3 for  Embrodared Saree");
        System.out.println("Enter 4 for back");
        System.out.println("============================================================================");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
            	System.out.println("============================================================================");
                System.out.println("Enter 1 for Plane Saree");

                Th.Co_planeS();
                break;
            case 2:
            	System.out.println("============================================================================");
                System.out.println("Enter 2 for printed Saree");
                Hi.Co_printS();
                break;
            case 3:
            	System.out.println("============================================================================");
                System.out.println("Enter 3 for  Embrodared Saree");
                Cs.C0_embr();
                break;
            case 4:
            	System.out.println("============================================================================");
            	Cott_saree();
            default:
            	System.out.println("============================================================================");
                System.out.println("Invaild Input ");
                Ethntic_saree();
        }
    }
}

class Co_plane extends Cotton_Saree
{
    public void Co_planeS()
    {
        Details d = new Details();
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================================");
        System.out.println("Enter 1 for printed  Saree less than 500/- ");
        System.out.println("Enter 2 for printed  Saree more than 500/-");
        System.out.println("Enter 3 for Back");
        System.out.println("============================================================================");

        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("============================================================================");
                System.out.println("Thank You For Choosing Cotton plane saree");
                System.out.println("Cotton  saree Info");
                System.out.println("BLOUSE fabric:Cotton ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.75 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹299 - ₹50 delivery Charges included. . )");
                System.out.println();
                System.out.println("============================================================================");
                d.Final_Details("Cotton", "Cotton plane saree", 299);

                break;
            case 2:
                System.out.println("============================================================================");
                System.out.println("Thank You For Choosing Cotton plane saree");
                System.out.println("Cotton  saree Info");
                System.out.println("BLOUSE fabric:Cotton ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.75 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹799 - ₹50 delivery Charges included. . )");
                System.out.println();
                System.out.println("============================================================================");
                d.Final_Details("Cotton", "Cotton plane saree", 799);
                break;
            case 3:
            	System.out.println("============================================================================");
            	Co_planeS();
            default:
            	System.out.println("============================================================================");
                System.out.println("Invalid Input :");
        }
    }
}

class Co_print extends Cotton_Saree
{
    public void Co_printS()
    {
        Details d = new Details();
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================================");
        System.out.println("Enter 1 for printed  Saree less than 500/- ");
        System.out.println("Enter 2 for printed  Saree more than 500/-");
        System.out.println("Enter 3 for Back");
        System.out.println("============================================================================");

        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("============================================================================");
                System.out.println("Thank You For Choosing Cotton Printed saree");
                System.out.println("Cotton Printed  saree Info");
                System.out.println("BLOUSE fabric:Cotton ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.75 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹299 - ₹50 delivery Charges included. . )");
                System.out.println();
                System.out.println("============================================================================");
                d.Final_Details("Cotton", "Cotton Printed saree", 299);
                break;
            case 2:
                System.out.println("============================================================================");
                System.out.println("Thank You For Choosing Cotton plane saree");
                System.out.println("Cotton  saree Info");
                System.out.println("BLOUSE fabric:Cotton ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.75 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹899 - ₹50 delivery Charges included. . )");
                System.out.println();
                System.out.println("============================================================================");
                d.Final_Details("Cotton", "Cotton plane saree", 899);
                break;
            case 3:
            	 System.out.println("============================================================================");
            	 Co_printS();
            default:
                System.out.println("Invalid Input :)");
        }
    }
}

class Co_er extends Cotton_Saree
{
    public void C0_embr()
    {
        Details d = new Details();
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================================");
        System.out.println("Enter 1 for Cotton Embrodared  Saree less than 500/- ");
        System.out.println("Enter 2 for Cotton Embrodared  Saree more than 500/-");
        System.out.println("Enter 3 for Back");
        System.out.println("============================================================================");

        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("============================================================================");
                System.out.println("Thank You For Choosing Cotton Embrodared saree");
                System.out.println("Cotton Embrodared  saree Info");
                System.out.println("BLOUSE fabric:Cotton ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.75 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹299 - ₹50 delivery Charges included. . )");
                System.out.println();
                System.out.println("============================================================================");
                d.Final_Details("Cotton", "Cotton Printed saree", 299);
                break;
            case 2:
                System.out.println("============================================================================");
                System.out.println("Thank You For Choosing Cotton plane saree");
                System.out.println("Cotton  saree Info");
                System.out.println("BLOUSE fabric:Cotton ");
                System.out.println("Saree length: 5.5 meter");
                System.out.println("blouse length: 0.75 meter");
                System.out.println("size: free size");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹899 - ₹50 delivery Charges included. . )");
                System.out.println();
                System.out.println("============================================================================");
                d.Final_Details("Cotton", "Cotton plane saree", 899);
                break;
            case 3:
            	System.out.println("============================================================================");
            	C0_embr();
            default:
                System.out.println("Invalid Input :)");
        }

    }
}

class Net_Saree extends Saree
{
    public void Net_saree()
    {
        Details d = new Details();
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================================");
        System.out.println("Enter 1 for Net  Plane Saree");
        System.out.println("Enter 2 for Net printed Saree");
        System.out.println("Enter 3 for Net  Embrodared Saree");
        System.out.println("Enter 4 for Back");
        System.out.println("============================================================================");
        
        int opt = sc.nextInt();

// For Ola ns
        switch (opt) {
            case 1:
                System.out.println("Enter 1 for printed  Saree less than 500/- ");
                System.out.println("Enter 2 for printed  Saree more than 500/-");
                opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("============================================================================");
                        System.out.println("Thank You For Choosing Cotton plane saree");
                        System.out.println("Net  saree Info");
                        System.out.println("BLOUSE fabric:Net ");
                        System.out.println("Saree length: 5.5 meter");
                        System.out.println("blouse length: 0.75 meter");
                        System.out.println("size: free size");
                        System.out.println("Country of origin: India");
                        System.out.println("On Price: ₹299 - ₹50 delivery Charges included.. )");
                        System.out.println();
                        System.out.println("============================================================================");
                        d.Final_Details("Net", "Net plane saree", 299);
                    case 2:
                        System.out.println("============================================================================");
                        System.out.println("Thank You For Choosing Cotton plane saree");
                        System.out.println("Cotton  saree Info");
                        System.out.println("BLOUSE fabric:Cotton ");
                        System.out.println("Saree length: 5.5 meter");
                        System.out.println("blouse length: 0.75 meter");
                        System.out.println("size: free size");
                        System.out.println("Country of origin: India");
                        System.out.println("On Price: ₹899 - ₹50 delivery Charges included... )");
                        System.out.println();
                        System.out.println("============================================================================");
                        d.Final_Details("Cotton", "Cotton plane saree", 899);
                    default:
                        System.out.println("Invaild Input ");
                        this.Net_saree();
                }
                break;

            case 3:
                System.out.println("Enter 1 for Georgette_Saree Chetak Urbane ns");
                System.out.println("Enter 2 for Georgette_Saree Chetak Premium ns");
                opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println();
                        System.out.println("============================================================================");
                        System.out.println("Thank You For Choosing Georgette_Saree Chetak Urbane ns");
                        System.out.println("Georgette_Saree Chetak Urbane ns Info");
                        System.out.println("Riding Range: 85-95 km/Charge");
                        System.out.println("Battery Charging Time: 5 Hrs");
                        System.out.println("Max speed: 70 km/h");
                        System.out.println("On Road Price: ₹1,42,297L Onwards (includes RTO & insurance costs)");
                        System.out.println();
                        System.out.println("============================================================================");
                        d.Final_Details("Georgette_Saree", "Chetak Urbane", 142297);
                        break;
                    case 2:
                        System.out.println();
                        System.out.println();
                        System.out.println("============================================================================");
                        System.out.println("Thank You For Choosing Georgette_Saree Chetak Urbane ns");
                        System.out.println("Georgette_Saree Chetak Premium Info");
                        System.out.println("Riding Range: 85-95 km/Charge");
                        System.out.println("Battery Charging Time: 5 Min");
                        System.out.println("Max speed: 70 km/h");
                        System.out.println("On Road Price: ₹1,43,708L Onwards (includes RTO & insurance costs)");
                        System.out.println();
                        System.out.println("============================================================================");
                        d.Final_Details("Georgette_Saree", "Chetak Premium ns", 143708);
                        break;
                    default:
                        System.out.println("Invaild Input ");
                        this.Net_saree();
                }
                break;
            default:
                System.out.println("Invaild Input ");
                this.Net_saree();
                break;
        }
    }
}

class Kurtis extends Ethnic {
    public void Ethntic_kurtis() {
// Upcasting-Downcasting for Chiffon_Saree Urban 25T
        Cloths cloth1 = new Anarkali_kurti();
        Anarkali_kurti Ak = (Anarkali_kurti) cloth1;

// Upcasting-Downcasting for Btwin MyBike
        Cloths cloth2 = new Stright_kurti();
        Stright_kurti Sk = (Stright_kurti) cloth2;

// Upcasting-Downcasting for Hero Octane Parkour 26T
        Cloths cloth3 = new Kurta_set();
        Kurta_set Ks = (Kurta_set) cloth3;

        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================================");
        System.out.println("Enter 1 for Anarkali Kurtis");
        System.out.println("Enter 2 for Straight Kurtis ");
        System.out.println("Enter 3 for Cotton  Kurtis");
        System.out.println("Enter 4 For Back");
        System.out.println("============================================================================");

        int opt = sc.nextInt();

        switch (opt) {
            case 1:
            	 System.out.println("============================================================================");
                System.out.println("You Have Choosen Anarkali Kurtis");
                Ak.Embrodary_Saree();
                break;
            case 2:
            	 System.out.println("============================================================================");
                System.out.println("You Have Choosen Btwin MyBike Kurtis");
                Sk.Straight_kurtis();
                break;
            case 3:
            	 System.out.println("============================================================================");
                System.out.println("You Have Choosen Cotton Kurtis");
                Ks.Kurta_set();
                break;
            case 4:
            	System.out.println("============================================================================");
            	Ethntic_kurtis();
            default:
            	 System.out.println("============================================================================");
                System.out.println("Invaild Input ");
                Ethntic_kurtis();
                break;
        }
    }
}

class Anarkali_kurti extends Kurtis {
    Details d = new Details();
    Scanner sc = new Scanner(System.in);
    public void Embrodary_Saree() {
        System.out.println("============================================================================");
        System.out.println("Thank You For Choosing Anarkali   Kurtiis");
        System.out.println("Anarkali Embroidered  Kurtis Info");
        System.out.println("Kurtas fabric:Art Silk ");
        System.out.println("Sleeve length: Three-Quarter Sleeves");
        System.out.println("Set Type : Kurta with Dupatta and Bottom Wear");
        System.out.println("size: S/M/L/Xl/XXl");
        System.out.println("Country of origin: India");
        System.out.println("On Price: ₹499 - ₹50 delivery Charges included. included. )");
        System.out.println();
        System.out.println("============================================================================");
        d.Final_Details("Embroidered", "Embroidered  Kurtis", 499);
    }
}

class Stright_kurti extends Kurtis {
    public void Straight_kurtis() {
        Details d = new Details();
        System.out.println();
        System.out.println("============================================================================");
        System.out.println("Thank You For Choosing Straight Embroidered  Kurtis");
        System.out.println("Straights Embroidered  Kurtis Info");
        System.out.println("Kurtis fabric:Cotton ");
        System.out.println("Sleeve length: Three-Quarter Sleeves");
        System.out.println("size: S/M/L/Xl/XXl");
        System.out.println("Country of origin: India");
        System.out.println("On Price: ₹499 - ₹50 delivery Charges included. included. )");
        System.out.println();
        System.out.println("============================================================================");
        d.Final_Details("Cotton", "Embroidered  Kurtis", 499);
    }
}

class Kurta_set extends Kurtis {
    public void Kurta_set() {
        Details d = new Details();
        System.out.println();
        System.out.println("============================================================================");
        System.out.println("Thank You For  Choosing Kurta Plazo Sets ");
        System.out.println(" Kurta Plazo Sets Info");
        System.out.println("Kurtis fabric:Rayon ");
        System.out.println("Sleeve length: Three-Quarter Sleeves");
        System.out.println("size: S/M/L/Xl/XXl");
        System.out.println("Set Type:Kurta With Bottomwear");
        System.out.println("Country of origin: India");
        System.out.println("On Price: ₹599 - ₹50 delivery Charges included. included. included)");
        System.out.println();
        System.out.println("============================================================================");
        d.Final_Details("Rayon", "Kurta Plazo Sets", 599);
    }
}


class western extends Cloths {
    public void Western() {
// Upcasting-Downcasting for Pertol
        Cloths cloth1 = new Top_wear();
        Top_wear Tp = (Top_wear) cloth1;

// Upcasting-Downcasting for Bottom_wear
        Cloths cloth2 = new Bottom_wear();
        Bottom_wear Dl = (Bottom_wear) cloth2;


        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================================================");
        System.out.println("Enter 1 for Top Wear ");
        System.out.println("Enter 2 for Bottom Wear ");
        System.out.println("Enter 3 for Back");
        System.out.println("===============================================================================");
        
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("==================================================================");
                System.out.println("You Have Choosen Top Wear ");
                System.out.println("==================================================================");
                Tp.Top_wear();
                break;
            case 2:
                System.out.println("==================================================================");
                System.out.println("You Have Choosen Bottom Wear ");
                System.out.println("==================================================================");
                Dl.Bottom_wear();
                break;
            case 3:
            	System.out.println("============================================================================");
            	Western();
            default:
            	System.out.println("============================================================================");
                System.out.println("Invaild Input ");
                this.Western();
        }
    }
}

class Top_wear extends western {
    public void Top_wear() {
// Upcasting-Downcasting for Tops
        Cloths cloth1 = new Tops();
        Tops Tp = (Tops) cloth1;

// Upcasting-Downcasting for Gowns
        Cloths cloth2 = new Gowns();
        Gowns Gow = (Gowns) cloth2;

// Upcasting-Downcasting for Tshirts Seltos
        Cloths cloth3 = new Tshirts();
        Tshirts Tsh = (Tshirts) cloth3;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================================");
        System.out.println("Enter 1 for Tops & Tunnis");
        System.out.println("Enter 2 for Gowns");
        System.out.println("Enter 3 for  Tshirts");
        System.out.println("Enter 4 For Back");
        System.out.println("============================================================================");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("==================================================================");
                System.out.println("You Have Choosen Tops & Tunnis");
                Tp.Top_hoodie();
                break;
            case 2:
                System.out.println("==================================================================");
                System.out.println("You Have Choosen Gowns");
                Gow.Gown_wes();
                break;
            case 3:
                System.out.println("==================================================================");
                System.out.println("You Have Choosen Tshirts");
                Tsh.Tshirt_top();
                break;
            case 4:
            	System.out.println("==================================================================");
            	Top_wear();
            default:
                System.out.println("Invaild Input ");
                Western();
        }
    }
}

class Tops extends Top_wear {
    public void Top_hoodie() {
        Details d = new Details();
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================================");
        System.out.println("Enter 1 for Skin Fitted Top ");
        System.out.println("Enter 2 for  hoodie  ");
        System.out.println("Enter 3 for Back");
        System.out.println("==================================================================");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:

                System.out.println("====================================================================");
                System.out.println("Thank You For Choosing  Skin  Fitted Top");
                System.out.println("Skin  Fitted Top Info");
                System.out.println("Top fabric:Art Silk ");
                System.out.println("Sleeve length: Three-Quarter Sleeves");
                System.out.println("size: S/M/L/Xl/XXl");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹499 - ₹50 delivery Charges included. included. )");
                System.out.println();
                d.Final_Details("Art Silk", "Skin  Fitted Top", 499);
                System.out.println("==================================================================");
                break;
            case 2:
                System.out.println("====================================================================");
                System.out.println("Thank You For Choosing Hoodie");
                System.out.println("Hoodie");
                System.out.println("Hoodie fabric: Cotton Blend ");
                System.out.println("size: 26/28/30/32/34");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹499 - ₹50 delivery Charges included. included. )");
                System.out.println();
                d.Final_Details("Lycra", "Hoodie Crop Top", 499);
                System.out.println("==================================================================");
                break;
            case 3:
            	System.out.println("==================================================================");
            	Top_hoodie();
            default:
            	System.out.println("==================================================================");
                System.out.println("Invalid Input :");
        }
    }
}

class Gowns extends Top_wear {
    public void Gown_wes() {
        Details d = new Details();
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================================");
        System.out.println("Enter 1 for Shorts Gown  ");
        System.out.println("Enter 2 for Long Gown  ");
        System.out.println("==================================================================");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("====================================================================");
                System.out.println("Thank You For Choosing  Long  Gowns");
                System.out.println(" long  Gowns");
                System.out.println(" Gowns fabric: Lycra ");
                System.out.println(" Sleeve  Length: Short Sleeve ");
                System.out.println(" Gowns Pattern: ColorBlocked ");
                System.out.println("size: S/M/L/X/XXL");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹699 - ₹50 delivery Charges included. included.)");
                System.out.println();
                d.Final_Details("Lycra", "Long  Gowns", 699);
                System.out.println("====================================================================");
                break;
            case 2:
                System.out.println("====================================================================");
                System.out.println("Thank You For Choosing  Short  Gowns");
                System.out.println(" Short  Gowns");
                System.out.println(" Gowns fabric: Georgette ");
                System.out.println(" Sleeve  Length: Three-Quarter Sleeve ");
                System.out.println(" Gowns Pattern: Solid ");
                System.out.println("size: S/M/L/X/XXL");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹799 - ₹50 delivery Charges included. included.)");
                System.out.println();
                d.Final_Details("Lycra", "Short  Gowns", 799);
                System.out.println("====================================================================");
                break;
            case 3:
            	System.out.println("==================================================================");
            	Gown_wes();
            default:
                System.out.println("Invalid Input :");
        }
    }
}

class Tshirts extends Top_wear {
    public void Tshirt_top() {
        Details d = new Details();
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================================");
        System.out.println("Enter 1 for Sports T-shirts  ");
        System.out.println("Enter 2 for  Regular T-shirts");
        System.out.println("==================================================================");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
            	System.out.println("====================================================================");
                System.out.println("Thank You For Choosing  Sports Tshirts  ");
                System.out.println(" Sport Tshirts Info"); 
                System.out.println(" Gowns fabric: Silk ");
                System.out.println(" Sleeve  Length: Short Sleeve ");
                System.out.println(" Gowns Pattern: Solid ");
                System.out.println("size: S/M/L/X/XXL");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹799 - ₹50 delivery Charges included..)");
                System.out.println();
                d.Final_Details("Lycra", "Short  Gowns", 799);
                System.out.println("====================================================================");
                break;
            case 2:
            	System.out.println("====================================================================");
                System.out.println("Thank You For Choosing  Regular Tshirts");
                System.out.println(" Regular Tshirts");
                System.out.println(" Gowns fabric: Cotton Blend ");
                System.out.println(" Sleeve  Length: Short Sleeve ");
                System.out.println(" Gowns Pattern: Solid ");
                System.out.println("size: S/M/L/X/XXL");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹799 - ₹50 delivery Charges included. .)");
                System.out.println();
                d.Final_Details("Lycra", "Short  Gowns", 799);
                System.out.println("====================================================================");
                break;
            case 3:
            	System.out.println("==================================================================");
            	Tshirt_top();
            default:
                System.out.println("Invalid Input :");
        }
    }
}

class Bottom_wear extends western {
    public void Bottom_wear() {
// Upcasting-Downcasting for Jeans
        Cloths cloth1 = new Jeans();
        Jeans Je = (Jeans) cloth1;

// Upcasting-Downcasting for Shorts
        Cloths cloth2 = new Shorts();
        Shorts Sh = (Shorts) cloth2;

// Upcasting-Downcasting for Range Rover
        Cloths cloth3 = new Pants();
        Pants Rr = (Pants) cloth3;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================================");
        System.out.println("Enter 1 for Jeans & Jeggins ");
        System.out.println("Enter 2 for Shorts & Skirts ");
        System.out.println("Enter 3 for Trousers & Pants  ");
        System.out.println("==================================================================");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("====================================================================");
                System.out.println("You Have Choosen Jeans & Jeggins ");
                Je.Jeans_bot();
                break;
            case 2:
                System.out.println("====================================================================");
                System.out.println("You Have Choosen Shorts & Skirts ");
                Sh.Shorts_bot();
                break;
            case 3:
                System.out.println("====================================================================");
                System.out.println("You Have Choosen Trousers & Pants");
                Rr.Pants_bot();
                break;
            case 4:
            	System.out.println("==================================================================");
            	Bottom_wear();
            default:
                System.out.println("Invaild Input ");
                Bottom_wear();
        }
    }
}

class Jeans extends Bottom_wear {
    public void Jeans_bot() {
        Details d = new Details();
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================================");
        System.out.println("Enter 1 for Body Fit Jeans ");
        System.out.println("Enter 2 for Bottom Loose Jeans");
        System.out.println("====================================================================");

        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("====================================================================");
                System.out.println("Thank You For Choosing  Body Fit  Jeans");
                System.out.println("Bottom Loose  Jeans");
                System.out.println("Jeans fabric: Denim ");
                System.out.println("size: 26/28/30/32/34");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹899 - ₹50 delivery Charges included. included. included)");
                System.out.println();
                d.Final_Details("Lycra", "Body Fit Jeans", 499);
                System.out.println("====================================================================");
            case 2:
                System.out.println("====================================================================");
                System.out.println("Thank You For Choosing Bottom Loose Jeans  ");
                System.out.println("Bottom Loose  Jeans");
                System.out.println("Jeans fabric: Denim ");
                System.out.println("size: 26/28/30/32/34");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹699 - ₹50 delivery Charges included. included. included )");
                System.out.println();
                d.Final_Details("Lycra", "Bottom Loose  Jeans", 499);
                System.out.println("====================================================================");
                break;
            case 3:
            System.out.println("====================================================================");
            Jeans_bot();
            default:
                System.out.println("Invalid Input :");
        }
    }
}

class Shorts extends Bottom_wear {
    public void Shorts_bot() {
        Details d = new Details();
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================================");

        System.out.println("Enter 1 for Shorts ");
        System.out.println("Enter 2 for  Skirts");
        System.out.println("====================================================================");

        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("====================================================================");
                System.out.println("Thank You For Choosing Shorts");
                System.out.println("Shorts Info");
                System.out.println("Shorts fabric: Denim ");
                System.out.println("size: 26/28/30/32/34");
                System.out.println("Pattern: Solid ");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹499 - ₹50 delivery Charges included. included. )");
                System.out.println();
                d.Final_Details("Lycra", "Shorts", 499);
                System.out.println("====================================================================");
                break;
            case 2:
                System.out.println("====================================================================");
                System.out.println("Thank You For Choosing Skirts");
                System.out.println("Skirts Info");
                System.out.println("Skirts fabric: Polyster ");
                System.out.println("size: 26/28/30/32/34");
                System.out.println("Pattern: Solid ");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹699 - ₹50 delivery Charges included. included. )");
                System.out.println();
                d.Final_Details("Polyster", "Skirts", 699);
                System.out.println("====================================================================");
                break;
            case 3:
            	System.out.println("====================================================================");

            	Shorts_bot();
            default:
                System.out.println("Invalid Input :");
        }
    }
}

class Pants extends Bottom_wear
{
    public void Pants_bot()
    {
        Details d = new Details();
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================================");
        System.out.println("Enter 1 for Trousers  ");
        System.out.println("Enter 2 for Pants  ");
        System.out.println("====================================================================");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("====================================================================");
                System.out.println("Thank You For Choosing Trousers");
                System.out.println("Trousers Info");
                System.out.println("Trousers fabric: Cotton Blend ");
                System.out.println("size: 26/28/30/32/34");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹499 - ₹50 delivery Charges included. included. included");
                System.out.println();
                d.Final_Details("Cotton Blend", "Trousers", 499);
                System.out.println("====================================================================");
                break;
            case 2:
                System.out.println("====================================================================");
                System.out.println("Thank You For Choosing  Pants  ");
                System.out.println("Pants Info");
                System.out.println("Pants fabric: Georgette ");
                System.out.println("size: 26/28/30/32/34");
                System.out.println("Country of origin: India");
                System.out.println("On Price: ₹499 - ₹50 delivery Charges included. )");
                System.out.println();
                d.Final_Details("Georgette", "Pants  ", 499);
                System.out.println("====================================================================");
                break;
            case 3:
            	System.out.println("====================================================================");
            	Pants_bot();
            default:
                System.out.println("Invalid Input :");
        }

    }
}


class Details
{
    private static final String cloth = null;

    public void Final_Details(String C_Fabric, String C_Name, double C_price)
    {
        Cloths Cls = new Cloths();
        System.out.println("============================================================================");
        System.out.println("Choose Payment Option\n");
        System.out.println("============================================================================");
        System.out.println("To Buy With Cash On Delivery Press 1");
        System.out.println("To Buy With UPI(Gpay/PhonePe/Paytm) Press 1");
        System.out.println("To Buy With Debit/Credit Cards Press 3");
        System.out.println("============================================================================");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("You Have Choosen Payment buy Cash on Delivery");
                break;

            case 2:
                System.out.println("You Have Choosen Payment UPI");
                break;

            case 3:
                System.out.println("You Have Choosen Payment Debit/Credit Cards ");
                break;
            default:
                System.out.println("Invaild Input ");
                break;
        }
        System.out.println("============================================================================");
        System.out.println("Which Colour Do You Want??\n");
        sc.nextLine();
        
        
        String colour = sc.nextLine();
        System.out.println();
        System.out.println("============================================================================");
        System.out.println("Enter Your Name\n");
        String oname = sc.nextLine();
        Cls.setcloth_Coust_Name(oname);
        System.out.println();
        
        System.out.println("============================================================================");
        System.out.println("Enter Your Mobile Number\n");
        Long omobno = sc.nextLong();
        Cls.setCoust_Mobile_Number(omobno);
               

      
       System.out.println();
       System.out.println("============================================================================");
      System.out.println("Enter Your Shifting Address\n");
     sc.nextLine();
     String oemail = sc.nextLine();
      Cls.setCoust_EmailAdd(oemail);
        System.out.println();
        System.out.println("============================================================================");
        

        System.out.println("============================================================================");
      
        Cls.Pass(C_Fabric, C_Name, colour, C_price);
        Cls.getDetails();
      
        System.out.println("============================================================================");
        System.out.println("");
        System.out.println("!!!...Thank You For Purchasing a Cloths From Our Shopping center...!!!");
        System.out.println("  ----------------------***Have a great Day***--------------------- :)");
        System.out.println("");
        System.out.println("============================================================================");


    }
}

public class Shopping
{
    public static void main(String[] args)
    {
// Upcasting-Downcasting for Ethnic
        Cloths ref1 = new Ethnic();
        Ethnic ref2 = (Ethnic) ref1;
        System.out.println("Press 1 For Women Ethnic Wear");


// Upcasting-Downcasting for Western
        Cloths ref5 = new western();
        western ref6 = (western) ref5;
        System.out.println("Press 2 For Women Wastern Wear");



        Scanner sc = new Scanner(System.in);
        int a = 0;

        try {
            a = sc.nextInt();
        } catch (InputMismatchException ie)
        {
            System.out.println("The Enter The Valid Input");
            System.out.println();
        }

        switch (a) {
            case 1:
                System.out.println("============================================================================");
                System.out.println("You Have Choosen Women Ethnic ");
                ref2.Ethnic();
                break;
            case 2:
                System.out.println("You Have Choosen Women Western");
                System.out.println("============================================================================");
                ref6.Western();
                break;
            default:
                System.out.println("============================================================================");
                System.out.println("Invaild Input :)");
                System.out.println();
                main(args);
                break;
        }
    }

    static
    {
        System.out.println("============================================================================");
        System.out.println("         ***** Welcome To Our cloths shopping center <3 *****");
        System.out.println("-------------------Which cloths Should You Buy??-------------------");
        System.out.println("============================================================================");
    }
}
