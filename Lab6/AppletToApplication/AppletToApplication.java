class AppletToApplication {
	
	int a;
	
	AppletToApplication() {
		a = 100000;
	}

	public void paint() {
		System.out.println("Value = " + a);
	}

	public static void main(String[] args) {
		AppletToApplication obj = new AppletToApplication();
		obj.paint();
	}

}