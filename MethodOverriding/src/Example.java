class override{
	void print() {
			System.out.println("In Base class");
		}
	}

	class child extends override{
		void print() {
			System.out.println("In Child class");
		}
	}
	
	class Example{
		public static void main(String arg[]){
			override B = new override();
			child C = new child();
			override obj = new child();
			B.print();
			C.print();
			obj.print();
		}
	}

