class Demo1{
	int a;
	int b;
	Demo1()
	{
		a = 10;
		b =20;
	}
	
	Demo1(int x , int y)
	{
		a = x;
		b = y;
	}
}
class Demo2 extends Demo1{
	int c;
	int d;
	Demo2()
	{
		c = 30;
		d = 40;
	}
	
	Demo2(int p , int q , int m, int n){
		super(m,n);
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

class Launch4{
	public static void main(String []args)
	{
		Demo2 d2 =  new Demo2(100,200,300,400);
		d2.disp();
	}
}