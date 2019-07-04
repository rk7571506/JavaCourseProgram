class Demo1
{
	int a;
	int b;
	Demo1()
	{
		a = 10;
		b = 20;
	}
	Demo1(int x , int y){
		a = x;
		b = y;
	}
}
class Demo2 extends  Demo1{
	int c;
	int d;
	
	Demo2()
	{
		c = 30;
		d = 40;
	}
	Demo2(int p,int q){
		c = p;
		d = q;
	}
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
class Launch1
{
	public static void main(String []args){
		Demo2 d2 = new Demo2();
		d2.disp();
	}
	
}