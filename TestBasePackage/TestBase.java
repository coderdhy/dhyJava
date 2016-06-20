package TestBasePackage;

public abstract class TestBase{

	protected int m_protectedVar;
	public int m_publicVar;
	private int m_privateVar;
	int m_defaultVar;

	public TestBase(){
		m_protectedVar = 0;
		m_publicVar = 1;
		m_privateVar = 2;
		m_defaultVar = 3;
		System.out.println("TestBase constructor has been called!");
	}

	public abstract void printTest();
}