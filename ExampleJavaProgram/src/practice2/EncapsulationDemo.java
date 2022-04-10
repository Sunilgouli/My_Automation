package practice2;
class Account {  

	private int acc_no;  
	private String name,email;  
	private float amount;
	public int  getacc_no()
	{
		return acc_no;
	}
	public void setacc_no(int acc_no)
	{
		this.acc_no=acc_no;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getemail()
	{
		return email;
	}
	public void  setemail(String email)
	{
		this.email=email;
	}
	public float getamount()
	{
		return amount;
	}
	public void setamount(float amount)
	{
		this.amount=amount;
	}
}



public class EncapsulationDemo {

	public static void main(String[] args) {
		Account a1=new Account();
		a1.setacc_no(124656);
		a1.setemail("sunigouli14@gmail.com");
		a1.setname("sunil");
		a1.setamount(1000000f);
System.out.println(a1.getacc_no()+" "+a1.getname()+"  "+a1.getemail()+"  "+a1.getamount()+"   +");


	}
}



